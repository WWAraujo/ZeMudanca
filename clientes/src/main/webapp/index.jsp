<!DOCTYPE html>
<html lang="pt-br" xmlns="http://www.w3.org/1999/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <head>
        <meta charset="UTF-8">
        <title>Clientes</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Language" content="pt-br">
        <link rel="stylesheet" href="css/index.css">
        <link rel="icon" type="image/x-icon" href="img/caminhao.png">
    </head>
    <header>
        <div class="cabecalho">
            <div class="img-cabecalho">
                <img src="img/caminhao.png" alt="icone">
            </div>
        </div>
    </header>

    <body>
        <div class="container">
            <div class="menu">
                <a href="servico.jsp">Servi&ccedilos</a>
                <a href="pageUser.jsp">Site</a>
                <a href="gerenciamento.jsp">Relat&oacuterios</a>
            </div>
            <div class="titulo">
                <h1>Clientes</h1>
            </div>
            <div class="organizacontainer">
                <div class="formulariodecadastro">
                    <form method="post" action="/create-cliente" class="form">
                        <div class="cadastro">

                            <div class="os">
                                <label for="id">ID</label><br>
                                <input readonly type="text" id="os" name="os" value=${param.id} >
                            </div>

                            <div class="cdt-nome">
                                <label for="nome">Nome</label><br>
                                <input type="text" id="nome" name="nome" value=${param.name}>
                            </div>

                            <div class="cpf-data">
                                <div class="ctd-cpf">
                                    <label for="cpf">CPF</label><br>
                                    <input type="text" id="cpf" name="cpf" value=${param.cpf}>
                                </div>

                                <div class="ctd-data">
                                    <label for="dataNascimento">Data de Nascimento</label><br>
                                    <input type="date" id="dataNascimento" name="dataNascimento"
                                        value=${param.nacimento}>
                                </div>
                            </div>

                            <div class="telefones">
                                <div class="ctd-telf1">
                                    <label for="telefone-1">Telefone 1</label><br>
                                    <input type="text" id="telefone-1" name="telefone-1" value=${param.celular01}>
                                </div>
                                <div class="ctd-telf2">
                                    <label for="telefone-2">Telefone 2</label><br>
                                    <input type="text" id="telefone-2" name="telefone-2" value=${param.celular02}>
                                </div>
                            </div>
                            <div class="ctd-part3">
                                <div class="telf1">
                                    <label for="email">E-mail</label><br>
                                    <input type="text" id="email" name="email" value=${param.email}>
                                </div>
                                <div class="telf2">
                                    <label for="endereco">Endere&ccedil;o</label><br>
                                    <input type="text" id="endereco" name="endereco" value=${param.endereco}>
                                </div>
                            </div>
                            <div class="salvar">
                                <input type="submit" value="SALVAR">
                            </div>
                        </div>
                    </form>
                </div>

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
                                <td id="acao">

                                    <form action="/delete-cliente" method="post">
                                        <input type="hidden" id="id" name="id" value="${cliente.id}">
                                        <input type="hidden" id="nome" name="nome" value="${cliente.nome}">
                                        <input type="hidden" id="cpf" name="cpf" value="${cliente.cpf}">
                                        <input type="hidden" id="data-nascimento" name="data-nascimento"
                                            value="${cliente.celular01}">
                                        <input type="hidden" id="endereco" name="endereco" value="${cliente.celular02}">
                                        <input type="hidden" id="endereco" name="endereco" value="${cliente.endereco}">
                                        <input type="hidden" id="endereco" name="endereco" value="${cliente.email}">
                                        <button id="button-update"><a class="update"
                                                href="index.jsp?id=${cliente.id}&amp;name=${cliente.nome}&amp;cpf=${cliente.cpf}&amp;nacimento=${cliente.cpf}&amp;celular01=${cliente.celular01}&amp;celular02=${cliente.celular02}&amp;endereco${cliente.endereco}&amp;email${cliente.email}">Alterar</a></button>

                                    </form>

                                    <form action="/delete-cliente" method="post">
                                        <input type="hidden" id="id" name="id" value="${cliente.id}">
                                        <button id="button-delete" type="submit">Apagar</button>
                                    </form>

                                </td>

                            </tr>
                        </c:forEach>
                    </table>
                </div>
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