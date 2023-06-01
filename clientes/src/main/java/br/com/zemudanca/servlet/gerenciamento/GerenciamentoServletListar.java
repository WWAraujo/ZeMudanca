package br.com.zemudanca.servlet.gerenciamento;

import br.com.zemudanca.dao.ServicoDAO;
import br.com.zemudanca.model.Servico;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-gerenciamento")
public class GerenciamentoServletListar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Servico> allServicos = new ServicoDAO().findAllServicos();

        req.setAttribute("allServicos", allServicos);

        req.getRequestDispatcher("gerenciamento.jsp").forward(req, resp);
    }
}
