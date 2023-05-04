<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="gerenciamento.css">
    <link rel="icon" type="image/x-icon" href="caminhao.png">
    <title>Gerenciamento</title>
</head>
<header>
    <div class="cabecalho">
        <div class="img-cabecalho">
            <img src="caminhao.png" alt="icone">
        </div>
    </div>
</header>
<body>
    <div class="container">
        <div class="titulos">
            <h1>GERENCIAMENTO</h1>
            <h3>RELATÓRIO</h3>
        </div>
        <div class="opcao">
            <h3>CLIENTES</h3>
            <button class="toggle"></button>
            <h3>SERVIÇOS</h3>
        </div>
        <div class="dadosPesquisa">
            <label for="nomeClienteounOS">Nome do Cliente ou Nº OS:</label><br>
            <input type="text" id="nomeClienteounOS">
        </div>
        <div class="periodo">
            <label for="nomeClienteounOS">Período:</label><br>
            <input type="datetime-local" id="dataHoraInicial" placeholder="Data e Hora Inicial">
            <input type="datetime-local" id="dataHoraFinal" placeholder="Data e Hora Final">
        </div>
        <div class="gerar">
            <button>GERAR</button>
        </div>
        <div class="resultado">
            <table>
                <tr>
                    <th>Maticula</th>
                    <th>Nome</th>
                    <th>Telefone</th>
                    <th>Endere&ccedil;o</th>
                    <th>OS's</th>
                </tr>
                <c:forEach var="cliente" items="${allClientes}">
                <tr>
                    <td>${cliente.id}</td>
                    <td>${cliente.nome}</td>
                    <td>${cliente.celular01}</td>
                    <td>${cliente.endereco}</td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <script>
        const toggleBtn = document.querySelector(".toggle");

        toggleBtn.addEventListener("click", () => toggleBtn.classList.toggle("active"));
    </script>
</body>
<footer>
    <div class="rodape">
        <p>Z&eacute; Mudan&ccedil;a, empresa especializada em transportes de bens.<br>&copy; 2023 Todos os Direitos
            Reservados.</p>
    </div>
</footer>
</html>