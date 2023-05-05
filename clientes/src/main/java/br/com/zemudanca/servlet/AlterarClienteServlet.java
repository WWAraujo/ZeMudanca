package br.com.zemudanca.servlet;

import br.com.zemudanca.dao.ClienteDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/alterar-cliente")
public class AlterarClienteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cleinteId = req.getParameter("id");

        new ClienteDAO().deleteClienteById(cleinteId);
        System.out.println("cliente alterado");

        resp.sendRedirect("/create-cliente");
    }
}
