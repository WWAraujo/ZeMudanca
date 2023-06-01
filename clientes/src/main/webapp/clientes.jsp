<!DOCTYPE html>
<html lang="pt-br" xmlns="http://www.w3.org/1999/html">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <head>
        <meta charset="UTF-8">
        <title>Clientes</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Language" content="pt-br">
        <link rel="stylesheet" href="css/clientes.css">
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
                                    <input type="text" id="cpf" name="cpf" oninput="adicionarMascaraCPF(this)" maxlength="11"  value=${param.cpf}>            
                                </div>
                                <div class="ctd-data">
                                    <label for="dataNascimento">Data de Nascimento</label><br>
                                    <input type="date" id="dataNascimento" name="dataNascimento" value=${param.nacimento}>
                                </div>
                            </div>

                            <div class="telefones">
                                <div class="ctd-telf1">
                                    <label for="telefone-1">Telefone 1</label><br>
                                    <input type="text" id="telefone-1" name="telefone-1" maxlength="11" value=${param.celular01}>
                                </div>
                                <div class="ctd-telf2">
                                    <label for="telefone-2">Telefone 2 (Opcional)</label><br>
                                    <input type="text" id="telefone-2" name="telefone-2" maxlength="11" value=${param.celular02}>
                                </div>
                            </div>
                            <div class="ctd-part3">
                                <div class="email">
                                    <label for="email">E-mail</label><br>
                                    <input type="text" id="email" name="email" value=${param.email}>
                                </div>
                                <div class="endereco">
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
                                        <input type="hidden" id="data-nascimento" name="data-nascimento" value="${cliente.dataNascimento}">
                                        <input type="hidden" id="celular01" name="celular01" value="${cliente.celular01}">
                                        <input type="hidden" id="celular02" name="celular02" value="${cliente.celular02}">
                                        <input type="hidden" id="endereco" name="endereco" value="${cliente.endereco}">
                                        <input type="hidden" id="email" name="email" value="${cliente.email}">
                                        <button id="button-update"><a class="update"
                                                href="clientes.jsp?id=${cliente.id}&amp;name=${cliente.nome}&amp;cpf=${cliente.cpf}&amp;nacimento=${cliente.dataNascimento}&amp;celular01=${cliente.celular01}&amp;celular02=${cliente.celular02}&amp;endereco=${cliente.endereco}&amp;email=${cliente.email}">Alterar</a></button>

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
        <script>
            // Chamar a função adicionarMascaraCPF após renderizar o valor do parâmetro JSP
            window.addEventListener('DOMContentLoaded', function() {
              const cpf = document.getElementById('cpf');
              adicionarMascaraCPF(cpf);
            });

            function validarCPF(cpf) {
            cpf = cpf.replace(/\D/g, "");

            if (cpf.length !== 11 || /^[0-9]{11}$/.test(cpf) === false) {
                alert("CPF inválido!");
            } else {
                let sum = 0;
                let remainder;

                for (let i = 1; i <= 9; i++) {
                    sum += parseInt(cpf.substring(i - 1, i)) * (11 - i);
                }

                remainder = (sum * 10) % 11;

                if (remainder === 10 || remainder === 11) {
                    remainder = 0;
                }

                if (remainder !== parseInt(cpf.substring(9, 10))) {
                    alert("CPF inválido!");
                    return;
                }

                sum = 0;
                for (let i = 1; i <= 10; i++) {
                    sum += parseInt(cpf.substring(i - 1, i)) * (12 - i);
                }

                remainder = (sum * 10) % 11;

                if (remainder === 10 || remainder === 11) {
                    remainder = 0;
                }

                if (remainder !== parseInt(cpf.substring(10, 11))) {
                    alert("CPF inválido!");
                    return;
                }

                alert("CPF válido!");
            }
        }
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