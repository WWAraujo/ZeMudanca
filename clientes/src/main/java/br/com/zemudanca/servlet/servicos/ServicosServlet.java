package br.com.zemudanca.servlet.servicos;

import br.com.zemudanca.dao.ServicoDAO;
import br.com.zemudanca.model.Servico;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/create-servico")
public class ServicosServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String iud = UUID.randomUUID().toString().replace("-", "");
        String os = req.getParameter("os");
        String idCliente = req.getParameter("cliente");
        String tipoServico = req.getParameter("servico");
        String retirada = req.getParameter("retirada");
        String entrega = req.getParameter("entrega");
        String data = req.getParameter("data");
        String hora = req.getParameter("hora");

        Servico servico = new Servico(iud, idCliente, tipoServico, retirada, entrega, data, hora);

        new ServicoDAO().salvarServico(servico);

        resp.sendRedirect("/find-all-servicos");
    }
}
