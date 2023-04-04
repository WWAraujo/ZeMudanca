package br.com.zemudanca.clienteDao;

import br.com.zemudanca.model.ClienteModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClienteDao {

    public void salvarCliente(ClienteModel clienteModel){

        String SQL = "INSERT INTO cliente (nome_cli) VALUES (?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("Sucesso na conexão");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, clienteModel.getNome());

            preparedStatement.execute();
            connection.close();

        }catch (Exception exception){
            System.out.println("Erro na conexão");
        }
    }
}
