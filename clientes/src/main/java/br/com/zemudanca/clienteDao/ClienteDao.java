package br.com.zemudanca.clienteDao;

import br.com.zemudanca.model.ClienteModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClienteDao {

    public void salvarCliente(ClienteModel clienteModel){

        String SQL = "INSERT INTO cliente (nome_cli,cpf_cli,celular1_cli,celular2_cli,email_cli,endereco_cli) VALUES (?,?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("Sucesso na conexão");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, clienteModel.getNome());
            preparedStatement.setString(2, clienteModel.getCpf());
            preparedStatement.setString(3, clienteModel.getCelular01());
            preparedStatement.setString(4, clienteModel.getCelular02());
            preparedStatement.setString(5, clienteModel.getEmail());
            preparedStatement.setString(6, clienteModel.getEndereco());

            preparedStatement.execute();
            connection.close();

            System.out.println("Gravação feita com sucesso de "+clienteModel.getNome()+". ");

        }catch (Exception exception){
            System.out.println("Erro na conexão");
        }
    }
}
