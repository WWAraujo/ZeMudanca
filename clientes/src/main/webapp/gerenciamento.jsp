<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/gerenciamento.css">
    <link rel="icon" type="image/x-icon" href="img/caminhao.png">
    <title>Gerenciamento</title>
</head>
<header>
    <div class="cabecalho">
        <div class="ordena-menu">
            <div class="img-cabecalho">
                <img src="img/caminhao.png" alt="icone">
            </div>
            <a href="#menu" id="toggle"><span></span></a>
            <div id="menu">
                <ul>
                    <li><a href="clientes.jsp">Clientes</a></li>
                    <li><a href="servico.jsp">Servi&ccedilos</a></li>
                    <li><a href="gerenciamento.jsp">Ordens de Servi&ccedilo</a></li>
                    <li><a href="index.jsp">Sair</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>
<body>
    <div class="container">
        <div class="titulo">
            <h1>ORDENS DE SERVI&CcedilOS</h1>
        </div>
        
        <div class="dadosPesquisa">
            <label for="nomeClienteounOS">Nome do Cliente ou N&deg OS:</label><br>
            <input type="text" id="nomeClienteounOS">
        </div>
        <div class="periodo">
            <label for="nomeClienteounOS">Per&iacuteodo:</label><br>
            <input type="datetime-local" id="dataHoraInicial" placeholder="Data e Hora Inicial">
            <input type="datetime-local" id="dataHoraFinal" placeholder="Data e Hora Final">
        </div>
        <div class="gerar">
            <button>PESQUISAR</button>
        </div>
        <div class="resultado">
            <table>
                <tr>
                    <th>Maticula</th>
                    <th>Nome</th>
                    <th>Tipo</th>
                    <th>Retirada</th>
                    <th>Deletar</th>

                    <th>OS</th>
                </tr>
                <c:forEach var="servico" items="${allServicos}">
                    <tr>
                        <td>${servico.os}</td>
                        <td>${servico.idCliente}</td>
                        <td>${servico.tipoServico}</td>
                        <td>${servico.retirada}</td>
                        <td id="acao">

                            <a href="index.jsp?id=${servico.os}&name=${servico.idCliente}&retirada=${cliente.retirada}&entrega=${cliente.entrega}">Update</a>

                            <form action="/delete-cliente" method="post">
                                <input type="hidden" id="id" name="id" value="${servico.os}">
                                <button type="submit"> Delete </button>
                            </form>
                        </td>

                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <script>
        const toggleBtn = document.querySelector(".toggle");

        toggleBtn.addEventListener("click", () => toggleBtn.classList.toggle("active"));
    </script>
    <script>
        var theToggle = document.getElementById('toggle');

        function hasClass(elem, className) {
            return new RegExp(' ' + className + ' ').test(' ' + elem.className + ' ');
        }

        function addClass(elem, className) {
            if (!hasClass(elem, className)) {
                elem.className += ' ' + className;
            }
        }

        function removeClass(elem, className) {
            var newClass = ' ' + elem.className.replace(/[\t\r\n]/g, ' ') + ' ';
            if (hasClass(elem, className)) {
                while (newClass.indexOf(' ' + className + ' ') >= 0) {
                    newClass = newClass.replace(' ' + className + ' ', ' ');
                }
                elem.className = newClass.replace(/^\s+|\s+$/g, '');
            }
        }

        function toggleClass(elem, className) {
            var newClass = ' ' + elem.className.replace(/[\t\r\n]/g, " ") + ' ';
            if (hasClass(elem, className)) {
                while (newClass.indexOf(" " + className + " ") >= 0) {
                    newClass = newClass.replace(" " + className + " ", " ");
                }
                elem.className = newClass.replace(/^\s+|\s+$/g, '');
            } else {
                elem.className += ' ' + className;
            }
        }

        theToggle.onclick = function () {
            toggleClass(this, 'on');
            return false;
        }
    </script>
</body>
<footer>
    <div class="rodape">
        <p>Z&eacute; Mudan&ccedil;a, empresa especializada em transportes de bens.<br>&copy; 2023 Todos os Direitos
            Reservados.</p>
    </div>
</footer>
</html>