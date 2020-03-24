package service;

import buisness_logica.Util;
import dao.AuthorBooksDao;
import entity.AuthorBooks;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class AuthorBooksService extends Util implements AuthorBooksDao {

    Connection connection = getConnection();

    public void update(AuthorBooks authorBooks) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE author_books SET `name`=?, Surname=?, `language`=? WHERE idauthor_book=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, authorBooks.getName());
            preparedStatement.setString(2, authorBooks.getSurname());
            preparedStatement.setString(3, authorBooks.getLanguage());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remove(AuthorBooks authorBooks) {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM author_books WHERE ID=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, authorBooks.getId());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(AuthorBooks authorBooks) {
        PreparedStatement preparedStatement = null;
        String sqlQuerry = "insert into author_books (name, Surname, language) " +
                "values (?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sqlQuerry);
            preparedStatement.setString(1, authorBooks.getName());
            preparedStatement.setString(2, authorBooks.getSurname());
            preparedStatement.setString(3, authorBooks.getLanguage());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException w) {
            w.printStackTrace();
        }
    }

        @Override
        public List<AuthorBooks> getAuthor() {
            List<AuthorBooks> authorBooksList = new ArrayList<AuthorBooks>();
            String sql = "select idauthor_books, name, Surname, language from author_books";
            Statement statement = null;
            try {
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    AuthorBooks authorBooks = new AuthorBooks();
                    authorBooks.setId(resultSet.getInt("idauthor_books"));
                    authorBooks.setName(resultSet.getString("name"));
                    authorBooks.setName(resultSet.getString("Surname"));
                    authorBooks.setLanguage(resultSet.getString("language"));
                    authorBooksList.add(authorBooks);
                    statement.close();
                    connection.close();
                }
            }
            catch (SQLException d) {
                d.printStackTrace();
            }
            return authorBooksList;
        }

    @Override
    public AuthorBooks getFromId(int idauthor_books) {
        PreparedStatement preparedStatement = null;
        String sql = "select idauthor_books, name, Surname, language from author_books where idauthor_books=?";
        AuthorBooks authorBooks = new AuthorBooks();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idauthor_books);
            ResultSet resultSet = preparedStatement.executeQuery();
            authorBooks.setId(resultSet.getInt("idauthor_books"));
            authorBooks.setName(resultSet.getString("name"));
            authorBooks.setName(resultSet.getString("Surname"));
            authorBooks.setLanguage(resultSet.getString("language"));
            preparedStatement.executeUpdate();
preparedStatement.close();
connection.close();
            // connection.close();
        } catch (SQLException d) {
            d.printStackTrace();
        }
        return authorBooks;
    }
}



