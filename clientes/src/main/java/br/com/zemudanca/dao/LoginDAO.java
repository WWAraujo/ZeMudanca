package br.com.zemudanca.dao;

public class LoginDAO {

    public void altorizarLogin() {

        String SQL = "SELECT UserId FROM LOGIN WHERE USERNAME = 'admin' and password = 'admin' ;";

    }
}
