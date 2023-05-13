package br.com.zemudanca.dao;

import br.com.zemudanca.model.Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    public Login altorizarLogin(Login login) {

        String SQL = "SELECT UserId FROM LOGIN WHERE USERNAME = '"
                + login.getUserName()+"' and password = '"+login.getUserPassword()+"' ;";

        boolean resposta = false;

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet != null){
                login.setUserId(resultSet.getString("UserId"));
                login.setVerificado(1);
            }

            return login;

        } catch (Exception e){

            System.out.println("Acesso negado!");
            return login;
        }
    }
}
