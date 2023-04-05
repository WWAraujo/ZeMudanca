package br.com.zemudanca.servlet;

import br.com.zemudanca.clienteDao.ClienteDao;
import br.com.zemudanca.model.ClienteModel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/create-cliente")
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nomeCli = req.getParameter("nome");
        String cpf = req.getParameter("cpf");
        String celularl01 = req.getParameter("telefone-1");
        String celularl02 = req.getParameter("telefone-2");
        String email = req.getParameter("email");
        String endereco = req.getParameter("endereco");

        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNome(nomeCli);
        clienteModel.setCpf(cpf);
        clienteModel.setCelular01(celularl01);
        clienteModel.setCelular02(celularl02);
        clienteModel.setEmail(email);
        clienteModel.setEndereco(endereco);


        new ClienteDao().salvarCliente(clienteModel);
        System.out.println("Seu nome é "+clienteModel.getNome());
        System.out.println("Seu cpf é "+clienteModel.getCpf());
        System.out.println("Seu celular 1 "+clienteModel.getCelular01());
        System.out.println("Seu celular 2 "+clienteModel.getCelular02());
        System.out.println("Seu email  "+clienteModel.getEmail());
        System.out.println("Seu endereco "+clienteModel.getEndereco());

        req.getRequestDispatcher("index.jsp");
    }
}
