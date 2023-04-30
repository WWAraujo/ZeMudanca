package br.com.zemudanca.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-cliente")
public class Cliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nomeCli = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String celularl01 = req.getParameter("telefone-1");
        String celularl02 = req.getParameter("telefone-2");
        String email = req.getParameter("email");
        String endereco = req.getParameter("endereco");

        br.com.zemudanca.model.Cliente cliente = new br.com.zemudanca.model.Cliente();
        cliente.setNome(nomeCli);
        cliente.setCpf(cpf);
        cliente.setCelular01(celularl01);
        cliente.setCelular02(celularl02);
        cliente.setEmail(email);
        cliente.setEndereco(endereco);


        new br.com.zemudanca.dao.Cliente().salvarCliente(cliente);
        System.out.println("Seu nome é "+ cliente.getNome());
        System.out.println("Seu cpf é "+ cliente.getCpf());
        System.out.println("Seu celular 1 "+ cliente.getCelular01());
        System.out.println("Seu celular 2 "+ cliente.getCelular02());
        System.out.println("Seu email  "+ cliente.getEmail());
        System.out.println("Seu endereco "+ cliente.getEndereco());

        req.getRequestDispatcher("index.html").forward(req, resp);
    }
}
