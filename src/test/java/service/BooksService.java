package service;

import buisness_logica.Util;
import dao.BooksDao;
import entity.AuthorBooks;
import entity.Books;
import sun.util.calendar.BaseCalendar;
import sun.util.calendar.LocalGregorianCalendar;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BooksService extends Util implements BooksDao {
    Connection connection = getConnection();

    public void update(Books books) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE books SET `title`=?, `Date`=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, books.getTitle());
            preparedStatement.setDate(2, (Date) books.getYearPublished());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remove(Books books) {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM books WHERE idbooks=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, books.getId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Books books) {
        PreparedStatement preparedStatement = null;
        String sqlQuerry = "insert into books (title, `Date`) " +
                "values (?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sqlQuerry);
            preparedStatement.setString(1, books.getTitle());
            preparedStatement.setString(2, String.valueOf((Date)books.getYearPublished()));

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException w) {
            w.printStackTrace();
        }
    }

    @Override
    public List<Books> getBook() {
        List<Books> booksList = new ArrayList<Books>();
        String sql = "select idbooks, title, `Date` from author_books";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Books books = new Books();
                books.setId(resultSet.getInt("idbooks"));
                books.setTitle(resultSet.getString("title"));
                books.setYearPublished(resultSet.getDate("Date"));
                statement.close();
                connection.close();
            }
        } catch (SQLException d) {
            d.printStackTrace();
        }
        return booksList;
    }


    @Override
    public Books getFromId(int idbooks) {
        PreparedStatement preparedStatement = null;
        String sql = "select idbooks, title, `Date` from books where idbooks=?";
        Books books = new Books();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idbooks);
            ResultSet resultSet = preparedStatement.executeQuery();
            books.setId(resultSet.getInt("idbooks"));
            books.setTitle(resultSet.getString("title"));
            books.setYearPublished(resultSet.getDate("Date"));
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException d) {
            d.printStackTrace();
        }
        return books;
    }
}

