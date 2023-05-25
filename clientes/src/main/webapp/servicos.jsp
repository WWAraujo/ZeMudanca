<!DOCTYPE html>
<html lang="pt-br" xmlns="http://www.w3.org/1999/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Serviços</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Language" content="pt-br">
    <link rel="stylesheet" href="servicos.css">
    <link rel="icon" type="image/x-icon" href="caminhao.png">
</head>
<header>
    <div class="cabecalho">
        <div class="img-cabecalho">
            <img src="caminhao.png" alt="icone">
        </div>
    </div>
    <div class="menu">
          <a href="index.jsp">Clientes</a>
          <a href="pageUser.jsp">Site</a>
          <a href="gerenciamento.jsp">Relatórios</a>
      </div>
</header>

<body>
    <div class="container">
        <div class="titulo">
            <h1>SERVIÇOS</h1>
        </div>
        <form method="post" action="/create-servico">
            <div class="cadastro">

                <div class="os">
                    <label for="os">OS Nº:</label><br>
                    <input type="text" id="os" name="os">
                </div>

                <div class="cliente">
                    <label for="cliente">Cliente:</label><br>
                    <input type="text" id="cliente" name="cliente">
                </div>

                <div class="servico">
                    <label for="servico">Serviço:</label><br>
                    <input type="text" id="servico" name="servico">
                </div>
                <div class="retirada">
                    <label for="retirada">Endereço de Retirada:</label><br>
                    <input type="text" id="retirada" name="retirada">
                </div>
                <div class="entrega">
                    <label for="entrega">Endereço de Entrega:</label><br>
                    <input type="text" id="entrega" name="entrega">
                </div>
                <div class="data-hora">
                    <div class="data">
                        <label for="data">Data da Retirada</label><br>
                        <input type="date" id="data" name="data">
                    </div>

                    <div class="hora">
                        <label for="hora">Hora da Retirada:</label><br>
                        <input type="time" id="hora" name="hora">
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
                    <th>OS</th>
                    <th>Tipo serviço</th>
                    <th>Retirada</th>
                    <th>Entrega</th>
                    <th>Açoes</th>
                </tr>
                <c:forEach var="servico" items="${allServicos}">
                    <tr>

                        <td>${servico.os}</td>
                        <td>${servico.tipoServico}</td>
                        <td>${servico.retirada}</td>
                        <td>${servico.entrega}</td>
                        <td>
                            <a href="servicos.jsp?id=${servico.id}&name=${servico.tipoServico}">Update</a>

                            <form action="/delete-servico" method="post">
                                <input type="hidden" id="os" name="os" value="${servico.id}">
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