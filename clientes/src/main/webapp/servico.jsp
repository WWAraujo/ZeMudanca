<!DOCTYPE html>
<html lang="pt-br" xmlns="http://www.w3.org/1999/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


        <head>
            <meta charset="UTF-8">
            <title>Servi&ccedilos</title>
            <script>
                function encodeURIComponent(value) {
                    return window.encodeURIComponent(value);
                }
            </script>
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta http-equiv="Content-Language" content="pt-br">
            <link rel="stylesheet" href="css/servico.css">
            <link rel="icon" type="image/x-icon" href="img/caminhao.png">
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
                    <h1>Servi&ccedilos</h1>
                </div>
                <div class="organiza-container">
                    <div class="cadastro-servico">
                        <form method="post" action="/create-servico">
                            <div class="cadastro">
                                <div class="os">
                                    <label for="os">OS N&deg</label><br>
                                    <input type="text" id="os" name="os" value=${param.os}>
                                </div>

                                <div class="cliente">
                                    <label for="cliente">Cliente</label><br>
                                    <input type="text" id="cliente" name="cliente" required value=${param.idCliente}>
                                </div>

                                <div class="servico">
                                    <label for="servico">Servi&ccedilo</label><br>
                                    <input type="text" id="servico" name="servico" required value=${param.tipoServico}>
                                </div>
                                <div class="retirada">
                                    <label for="retirada">Endere&ccedilo de Retirada</label><br>
                                    <input type="text" id="retirada" name="retirada" required value=${param.retirada}>
                                </div>
                                <div class="entrega">
                                    <label for="entrega">Endere&ccedilo de Entrega</label><br>
                                    <input type="text" id="entrega" name="entrega" required value=${param.entrega}>
                                </div>
                                <div class="data-hora">
                                    <div class="data">
                                        <label for="data">Data da Retirada</label><br>
                                        <input type="date" id="data" name="data" required value=${param.data}>
                                    </div>

                                    <div class="hora">
                                        <label for="hora">Hora da Retirada</label><br>
                                        <input type="time" id="hora" name="hora" required value=${param.hora}>
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
                                    <td>${servico.tipoServico}</td>
                                    <td>${servico.retirada}</td>
                                    <td id="acao">

                                        <form action="/alterar-servico" method="post">
                                            <input type="hidden" id="os" name="os" value="${servico.os}">
                                            <input type="hidden" id="cliente" name="cliente" value="${servico.idCliente}">
                                            <input type="hidden" id="servico" name="servico" value="${servico.tipoServico}">
                                            <input type="hidden" id="retirada" name="retirada" value="${servico.retirada}">
                                            <input type="hidden" id="entrega" name="entrega" value="${servico.entrega}">
                                            <input type="hidden" id="data" name="data" value="${servico.data}">
                                            <input type="hidden" id="hora" name="hora" value="${servico.hora}">
                                            <button id="button-update"><a
                                                    href="servico.jsp?os=${servico.os}&amp;idCliente=${servico.idCliente}&amp;tipoServico=${servico.tipoServico}&amp;retirada=${servico.retirada}&amp;entrega=${servico.entrega}&amp;data=${servico.data}&amp;hora=${servico.hora}">Update</a></button>
                                        </form>

                                        <form action="/delete-servico" method="post">
                                            <input type="hidden" id="os" name="os" value="${servico.os}">
                                            <button id="button-delete" type="submit"> Delete </button>
                                        </form>

                                    </td>

                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
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
                <p>Z&eacute; Mudan&ccedil;a, empresa especializada em transportes de bens.<br>&copy; 2023 Todos os
                    Direitos
                    Reservados.</p>
            </div>
        </footer>

</html>