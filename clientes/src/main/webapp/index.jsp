<!DOCTYPE html>
<html lang="pt-br" xmlns="http://www.w3.org/1999/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Language" content="pt-br">
    <link rel="stylesheet" href="index.css">
    <link rel="icon" type="image/x-icon" href="caminhao.png">
    <title>Clientes</title>
</head>
<header>
    <div class="cabecalho">
        <div class="img-cabecalho">
            <img src="caminhao.png" alt="icone">
        </div>
    </div>
</header>
<body>
    <div class="menu">
          <a href="servicos.jsp">Servi&ccedilos</a>
          <a href="pageUser.jsp">Site</a>
          <a href="gerenciamento.jsp">Relat&oacuterios</a>
    </div>
    <div class="container">
        <div class="titulo">
            <h1>CLIENTES</h1>
        </div>
        <form method="post" action="/create-cliente">
            <div class="cadastro">

                <div class="cdt-nome">
                    <label for="nome">Nome</label><br>
                    <input type="text" id="nome" name="nome" value=${param.name}>
                </div>

                <div class="cpf-data">
                    <div class="ctd-cpf">
                        <label for="cpf">CPF</label><br>
                        <input type="text" id="cpf" name="cpf">
                    </div>

                    <div class="ctd-data">
                        <label for="data-nascimento">Data de Nascimento</label><br>
                        <input type="text" id="data-nascimento" name="data-nascimento">
                    </div>
                </div>

                <div class="telefones">
                    <div class="ctd-telf1">
                        <label for="telefone-1">Telefone 1</label><br>
                        <input type="text" id="telefone-1" name="telefone-1">
                    </div>
                    <div class="ctd-telf2">
                        <label for="telefone-2">Telefone 2</label><br>
                        <input type="text" id="telefone-2" name="telefone-2">
                    </div>
                </div>
                <div class="ctd-part3">
                    <div class="telf1">
                        <label for="email">E-mail</label><br>
                        <input type="text" id="email" name="email">
                    </div>
                    <div class="telf2">
                        <label for="endereco">Endere&ccedil;o</label><br>
                        <input type="text" id="endereco" name="endereco">
                    </div>
                </div>
                <div class="salvar">
                    <input type="submit" value="SALVAR">
                </div>
            </div>
        </form>
        <div class="tabela">
            <table>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Endere&ccedil;o</th>
                    <th>A&ccedil&atildeo</th>
                </tr>
                <c:forEach var="cliente" items="${allClientes}">
                    <tr>

                        <td>${cliente.id}</td>
                        <td>${cliente.nome}</td>
                        <td>${cliente.celular01}</td>
                        <td>${cliente.endereco}</td>
                        <td>
                            <a href="index.jsp?id=${cliente.id}&name=${cliente.nome}">Update</a>

                            <form action="/delete-cliente" method="post">
                                <input type="hidden" id="id" name="id" value="${cliente.id}">
                                <button type="submit"> Delete </button>
                            </form>
                        </td>

                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</body>
<footer>
    <div class="rodape">
        <p>Z&eacute; Mudan&ccedil;a, empresa especializada em transportes de bens.<br>&copy; 2023 Todos os Direitos
            Reservados.</p>
    </div>
</footer>
</html>