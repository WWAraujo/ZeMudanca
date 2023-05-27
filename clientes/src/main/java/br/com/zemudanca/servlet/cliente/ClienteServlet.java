package br.com.zemudanca.servlet.cliente;

import br.com.zemudanca.dao.ClienteDAO;
import br.com.zemudanca.model.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/create-cliente")
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uid = UUID.randomUUID().toString().replace("-", "");
        String idCliente = req.getParameter("id");
        String nomeCli = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String celularl01 = req.getParameter("telefone-1");
        String celularl02 = req.getParameter("telefone-2");
        String email = req.getParameter("email");
        String endereco = req.getParameter("endereco");

        Cliente cliente = null;
        if (idCliente == null) {
           cliente = new Cliente(uid, nomeCli, cpf, celularl01, celularl02, endereco, email);
        } else {
            new ClienteDAO().deleteClienteById(idCliente);
            cliente = new Cliente(idCliente, nomeCli, cpf, celularl01, celularl02, endereco, email);
            System.out.println("Cliente atualizado");
        }

        new ClienteDAO().salvarCliente(cliente);

        resp.sendRedirect("/find-all-clientes");
    }
}
