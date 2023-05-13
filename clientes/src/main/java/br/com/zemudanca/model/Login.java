package br.com.zemudanca.model;

public class Login {

    private String userName, userId, userPassword;

    /**
     *  0 - false
     *  1 true
     */

    int verificado;

    public Login(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
    }

    public Login(String userName, String userId, String userPassword, int verificado) {
        this.userName = userName;
        this.userId = userId;
        this.userPassword = userPassword;
        this.verificado = verificado;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getVerificado() {
        return verificado;
    }

    public void setVerificado(int verificado) {
        this.verificado = verificado;
    }
}
