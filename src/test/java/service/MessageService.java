package service;

import buisness_logica.Util;
import dao.MessageDao;
import entity.AuthorBooks;
import entity.Message;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageService extends Util implements MessageDao {
    Connection connection = getConnection();

    @Override
    public void update(Message message) {
        PreparedStatement preparedStatement = null;

        String sql = "UPDATE message SET  text=?, `Date`=?,`author nick name`=? WHERE `Date`=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, message.getText());
            preparedStatement.setDate(2, (java.sql.Date) message.getWrittenDay());
            preparedStatement.setString(3, message.getAuthorNickName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void remove(Message message) {
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM message WHERE `Date`=?";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setDate(1,(java.sql.Date)  message.getWrittenDay());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(Message message) {
        PreparedStatement preparedStatement = null;
        String sqlQuerry = "insert into message (text, `Date`, `author nick name`) " +
                "values (?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(sqlQuerry);
            preparedStatement.setString(1, message.getText());
            preparedStatement.setDate(2, (java.sql.Date) message.getWrittenDay());
            preparedStatement.setString(3, message.getAuthorNickName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException w) {
            w.printStackTrace();
        }
    }

    @Override
    public List<Message> getMessage() {
        List<Message> messageList = new ArrayList<Message>();
        String sql = "select text, `Date`, `author nick name` from message";
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Message message1 = new Message();
                message1.setText(resultSet.getString("text"));
                message1.setWrittenDay(resultSet.getDate("Date"));
                message1.setAuthorNickName(resultSet.getString("author nick name"));
                messageList.add(message1);
                statement.close();
                connection.close();
            }
        }
        catch (SQLException d) {
            d.printStackTrace();
        }
        return messageList;
    }

    @Override
    public Message getFromDate(Date date) {
        PreparedStatement preparedStatement = null;
        String sql = "select text,`Date`,`author nick name` from message where `Date`=?";
Message message = new Message();
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDate(1, (java.sql.Date) date);
            ResultSet resultSet = preparedStatement.executeQuery();
            message.setText(resultSet.getString("text"));
            message.setWrittenDay(resultSet.getDate("Date"));
            message.setAuthorNickName(resultSet.getString("nick name"));
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            // connection.close();
        } catch (SQLException d) {
            d.printStackTrace();
        }
        return message;
    }
}
