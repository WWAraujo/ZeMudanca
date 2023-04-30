package br.com.zemudanca.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Cliente {

    public void salvarCliente(br.com.zemudanca.model.Cliente cliente){

        String SQL = "INSERT INTO cliente (nome_cli,cpf_cli,celular1_cli,celular2_cli,email_cli,endereco_cli) VALUES (?,?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("Sucesso na conexão");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getCelular01());
            preparedStatement.setString(4, cliente.getCelular02());
            preparedStatement.setString(5, cliente.getEmail());
            preparedStatement.setString(6, cliente.getEndereco());

            preparedStatement.execute();
            connection.close();

            System.out.println("Gravação feita com sucesso de " + cliente.getNome()+". ");
        }catch (Exception exception){
            System.out.println("Erro na conexão");
        }
    }
}