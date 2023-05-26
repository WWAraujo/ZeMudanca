package br.com.zemudanca.dao;

import br.com.zemudanca.model.Servico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServicoDAO {

    public void salvarServico(Servico servico){

        String SQL = "INSERT INTO servico (os_serv,id_cliente_serv,tipo_serv,retirada_serv,entrega_serv,data_serv,hora_serv) VALUES (?,?,?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("Sucesso na conexão");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, servico.getOs());
            preparedStatement.setString(2, servico.getIdCliente());
            preparedStatement.setString(3, servico.getTipoServico());
            preparedStatement.setString(4, servico.getRetirada());
            preparedStatement.setString(5, servico.getEntrega());
            preparedStatement.setString(6, servico.getHora());
            preparedStatement.setString(7, servico.getHora());

            preparedStatement.execute();
            connection.close();

            System.out.println("Gravação feita com sucesso da Ordem de Serviço " + servico.getOs()+". ");
        } catch (Exception exception){
            System.out.println("Erro na conexão");
        }
    }

    public List<Servico> findAllServicos() {
        String SQL = "SELECT * FROM SERVICO";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection FIND ALL SERVICOS");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Servico> servicos = new ArrayList<>();

            while (resultSet.next()) {

                String os = resultSet.getString("OS_SERV");
                String idCliente = resultSet.getString("id_cliente_serv");
                String tipoServico = resultSet.getString("tipo_serv");
                String retirada = resultSet.getString("retirada_serv");
                String entrega = resultSet.getString("entrega_serv");
                String data = resultSet.getString("data_serv");
                String hora = resultSet.getString("hora_serv");

                Servico servico = new Servico(os,idCliente,tipoServico,retirada,entrega,data,hora);

                servicos.add(servico);
            }

            System.out.println("sucesso na busca de * clientes");
            connection.close();
            return servicos;

        } catch (Exception e){
            System.out.println("falha na conexão");
            return Collections.emptyList();
        }
    }

    public void deleteServicoById(String os) {

        String SQL = "DELETE SERVICO WHERE OS_SERV = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");
            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, os);
            preparedStatement.execute();

            System.out.println("success on delete servico with os: " + os);
            connection.close();

        } catch (Exception e) {
            System.out.println("fail in database connection");
        }
    }
}
