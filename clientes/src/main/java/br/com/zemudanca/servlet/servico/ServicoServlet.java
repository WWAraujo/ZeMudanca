package br.com.zemudanca.servlet.servico;

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
public class ServicoServlet extends HttpServlet {

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

        Servico servico = null;
        if (os.isEmpty()){
           servico = new Servico(iud, idCliente, tipoServico, retirada, entrega, data, hora);
        } else {
            new ServicoDAO().deleteServicoById(os);
            servico = new Servico(os, idCliente, tipoServico, retirada, entrega, data, hora);
            System.out.println("Serviço atualizado");
        }

        new ServicoDAO().salvarServico(servico);

        resp.sendRedirect("/find-all-servico");
    }
}
