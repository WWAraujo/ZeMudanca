package br.com.zemudanca.servlet.servico;

import br.com.zemudanca.dao.ServicoDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-servico")
public class ServicoServletDeletar extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String servicoOs = req.getParameter("os");

        new ServicoDAO().deleteServicoById(servicoOs);
        System.out.println("Serviço Alterado");

        resp.sendRedirect("/create-servico");
    }
}
