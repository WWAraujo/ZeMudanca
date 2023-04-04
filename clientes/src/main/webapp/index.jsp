<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="index.css">
    <title>Document</title>
</head>
<body>
<header>
    <div class="cabecalho">
        <div class="img-cabecalho">
            <img src="../src/resources/image/icons8-em-trânsito-50.png" alt="icone">
        </div>
    </div>
</header>
<div class="conteudo">
    <div class="titulo">
        <h1>Clientes</h1>
    </div>
    <div class="cadastro">

        <form method="post" action="/create-cliente">

            <label for="nome">Nome</label><br>
            <input type="text" id="nome" name="nome">
            <button type="submit">Salvar</button>

<%--            <div class="cdt-nome">--%>
<%--                <form action="#">--%>
<%--                    <label for="nome">Nome</label><br>--%>
<%--                    <input type="text" id="nome" name="nome">--%>
<%--                </form>--%>
<%--            </div>--%>
<%--            <div class="cpf-data">--%>
<%--                <div class="ctd-cpf">--%>
<%--                    <form action="#">--%>
<%--                        <label for="cpf">CPF</label><br>--%>
<%--                        <input type="text" id="cpf" name="cpf">--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--                <div class="ctd-data">--%>
<%--                    <form action="#">--%>
<%--                        <label for="data-nascimento">Data de Nascimento</label><br>--%>
<%--                        <input type="text" id="data-nascimento" name="data-nascimento">--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="telefones">--%>
<%--                <div class="ctd-telf1">--%>
<%--                    <form action="#">--%>
<%--                        <label for="telefone-1">Telefone 1</label><br>--%>
<%--                        <input type="text" id="telefone-1" name="telefone-1">--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--                <div class="ctd-telf2">--%>
<%--                    <form action="#">--%>
<%--                        <label for="telefone-2">Telefone 2</label><br>--%>
<%--                        <input type="text" id="telefone-2" name="telefone-2">--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="ctd-part3">--%>
<%--                <div class="telf1">--%>
<%--                    <form action="#">--%>
<%--                        <label for="email">E-mail</label><br>--%>
<%--                        <input type="text" id="email" name="email">--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--                <div class="telf2">--%>
<%--                    <form action="#">--%>
<%--                        <label for="endereco">Endereço</label><br>--%>
<%--                        <input type="text" id="endereco" name="endereco">--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="salvar">--%>
<%--                &lt;%&ndash;                <input type="button" value="salvar">  &ndash;%&gt;--%>
<%--                <button type="submit">Salvar</button>--%>
<%--            </div>--%>
        </form>
    </div>
</div>
<div class="rodape">
    <p>Zé Mudança Empresa Especializada em Transportes de bens.<br>© 2023 Todos os Direitos Reservados.</p>
</div>
</body>
</html>