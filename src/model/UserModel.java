package model;

import entity.Feedback;
import entity.User;

import java.sql.*;
import java.util.ArrayList;

public class UserModel {

    public static Connection connection;

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getUserByUsernameAndPassword(String username, String password) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username = ? and password = ?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User();
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setFullname(rs.getString(4));
            }
            return user;
        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public void insert(User user) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users (username, password, fullname,email) values (?,?,?,?)");
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFullname());
            preparedStatement.setString(4,user.getEmail());
            preparedStatement.execute();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean insert(Feedback feedback){
        try {
            PreparedStatement statement = connection.prepareStatement("insert into feedback (fullname, email, feedback) values (?,?,?)");
            statement.setString(1,feedback.getUsername());
            statement.setString(2,feedback.getEmail());
            statement.setString(3,feedback.getFeedback());
            statement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public ArrayList<Feedback> readAllfeedback(){
        ArrayList<Feedback> listFeedback = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from feedback");
            ResultSet rS = statement.executeQuery();
            while (rS.next()){
                Feedback feedback = new Feedback();
                feedback.setUsername(rS.getString(2));
                feedback.setEmail(rS.getString(3));
                feedback.setFeedback(rS.getString(4));
                listFeedback.add(feedback);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listFeedback;
    }
}
