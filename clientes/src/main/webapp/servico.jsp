<!DOCTYPE html>
<html lang="pt-br" xmlns="http://www.w3.org/1999/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <title>Servi&ccedilos</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Language" content="pt-br">
    <link rel="stylesheet" href="servico.css">
    <link rel="icon" type="image/x-icon" href="caminhao.png">
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
          <a href="index.jsp">Clientes</a>
          <a href="pageUser.jsp">Site</a>
          <a href="gerenciamento.jsp">Relat&oacuterios</a>
    </div>
    <div class="container">
        <div class="titulo">
            <h1>SERVI&CcedilOS</h1>
        </div>
        <form method="post" action="/create-servico">
            <div class="cadastro">

                <div class="os">
                    <label for="os">OS N&deg:</label><br>
                    <input type="text" id="os" name="os" value=${param.os}>
                </div>

                <div class="cliente">
                    <label for="cliente">Cliente:</label><br>
                    <input type="text" id="cliente" name="cliente" value=${param.endereco}>
                </div>

                <div class="servico">
                    <label for="servico">Servi&ccedilo:</label><br>
                    <input type="text" id="servico" name="servico">
                </div>
                <div class="retirada">
                    <label for="retirada">Endere&ccedilo de Retirada:</label><br>
                    <input type="text" id="retirada" name="retirada">
                </div>
                <div class="entrega">
                    <label for="entrega">Endere&ccedilo de Entrega:</label><br>
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
                    <th>idCliente</th>
                    <th>Tipo Servico</th>
                    <th>Retirada</th>
                    <th>A&ccedil&atildeo</th>
                </tr>
                <c:forEach var="servico" items="${allServicos}">
                    <tr>

                        <td>${servico.os}</td>
                        <td>${servico.idCliente}</td>
                        <td>${servico.tipoServiço}</td>
                        <td>${servico.retirada}</td>
                        <td>
                            <a href="servico.jsp?os=${servico.os}&endereco=${servico.retirada}">Update</a>

                            <form action="/delete-servico" method="post">
                                <input type="hidden" id="os" name="os" value="${servico.os}">
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