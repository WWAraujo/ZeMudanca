package br.com.zemudanca.servlet;

import br.com.zemudanca.clienteDao.ClienteDao;
import br.com.zemudanca.model.ClienteModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-cliente")
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nomeCli = req.getParameter("nome");

        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNome(nomeCli);

        new ClienteDao().salvarCliente(clienteModel);
        System.out.println("Seu nome é "+clienteModel.getNome());

        req.getRequestDispatcher("index.jsp");
    }
}
