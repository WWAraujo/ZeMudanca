package br.com.zemudanca.servlet;

import br.com.zemudanca.dao.ClienteDAO;
import br.com.zemudanca.model.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-clientes")
public class ListaClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Cliente> allClientes = new ClienteDAO().findAllClientes();

        req.setAttribute("allClientes", allClientes);

        req.getRequestDispatcher("gerenciamento.jsp").forward(req, resp);

    }
}
