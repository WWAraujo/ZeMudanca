package br.com.zemudanca.servlet.cliente;

import br.com.zemudanca.dao.ClienteDAO;

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
        String nomeCli = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String celularl01 = req.getParameter("telefone-1");
        String celularl02 = req.getParameter("telefone-2");
        String email = req.getParameter("email");
        String endereco = req.getParameter("endereco");

        br.com.zemudanca.model.Cliente cliente = new br.com.zemudanca.model.Cliente(uid,nomeCli,cpf,celularl01,celularl02,endereco,email);

        new ClienteDAO().salvarCliente(cliente);
        System.out.println("Seu nome é "+ cliente.getNome());
        System.out.println("Seu cpf é "+ cliente.getCpf());
        System.out.println("Seu celular 1 "+ cliente.getCelular01());
        System.out.println("Seu celular 2 "+ cliente.getCelular02());
        System.out.println("Seu email  "+ cliente.getEmail());
        System.out.println("Seu endereco "+ cliente.getEndereco());

        resp.sendRedirect("/find-all-clientes");
    }
}
