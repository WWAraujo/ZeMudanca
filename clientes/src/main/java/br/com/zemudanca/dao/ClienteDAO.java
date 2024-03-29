package br.com.zemudanca.dao;

import br.com.zemudanca.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClienteDAO {

    public void salvarCliente(Cliente cliente){

        String SQL = "INSERT INTO cliente (cod_cli,nome_cli,cpf_cli,celular1_cli,celular2_cli,email_cli,endereco_cli) VALUES (?,?,?,?,?,?,?)";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("Sucesso na conexão");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, cliente.getId().toUpperCase());
            preparedStatement.setString(2, cliente.getNome().toUpperCase());
            preparedStatement.setString(3, cliente.getCpf().toUpperCase());
            preparedStatement.setString(4, cliente.getCelular01().toUpperCase());
            preparedStatement.setString(5, cliente.getCelular02().toUpperCase());
            preparedStatement.setString(6, cliente.getEmail().toUpperCase());
            preparedStatement.setString(7, cliente.getEndereco().toUpperCase());

            preparedStatement.execute();
            connection.close();

            System.out.println("Gravação feita com sucesso de " + cliente.getNome()+". ");
        }catch (Exception exception){
            System.out.println("Erro na conexão");
        }
    }

    public List<Cliente> findAllClientes() {
        String SQL =  "SELECT * FROM CLIENTE";

        try {

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Cliente> clientes = new ArrayList<>();

            while (resultSet.next()) {

                String idCli = resultSet.getString("cod_cli");
                String clienteNome = resultSet.getString("nome_cli");
                String cpfCli = resultSet.getString("cpf_cli");
                String celular1Cli = resultSet.getString("celular1_cli");
                String celular2Cli = resultSet.getString("celular2_cli");
                String enderecoCli = resultSet.getString("endereco_cli");
                String emailCli = resultSet.getString("email_cli");
                String dataNascimento = resultSet.getString("data_nascimento_cli");

                Cliente cliente = new Cliente(idCli, clienteNome, cpfCli, celular1Cli, celular2Cli,enderecoCli, emailCli, dataNascimento);

                clientes.add(cliente);

            }

            System.out.println("sucesso na busca de * clientes");
            connection.close();
            return clientes;

        } catch (Exception e){
            System.out.println("falha na conexão");
            return Collections.emptyList();
        }
    }

    public void deleteClienteById(String idCliente) {

        String SQL = "DELETE CLIENTE WHERE COD_CLI = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, idCliente);
            preparedStatement.execute();

            System.out.println("success on delete cliente with id: " + idCliente);
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
        }
    }
}
