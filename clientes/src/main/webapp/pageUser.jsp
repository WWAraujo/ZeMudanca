<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/pageUser.css">
    <link rel="icon" type="image/x-icon" href="img/caminhao.png">
    <title>Z&eacute Mudan&ccedila</title>
</head>
<header>
    <div class="cabecalho">
        <div class="img-cabecalho">
            <img src="img/caminhao.png" alt="icone">
        </div>
    </div>
</header>
<body>
<div class="menu">
          <a href="index.jsp">Clientes</a>
          <a href="servico.jsp">Servi&ccedilos</a>
          <a href="gerenciamento.jsp">Relat&oacuterios</a>
      </div>
    <div class="introduction">
        <h2>FA&CcedilA A MUDAN&CcedilA MAIS F&AacuteCIL E AGIL QUE VOCE UM DIA JAMAIS OUSOU REALIZAR,<br> SOMOS REFERENCIA EM
            TRANSPORTE
            DE BENS, CONOSCO O SEU BEM SER&Aacute<br> PROTEGIDO DO INICIO AO FIM DO SERVI&CcedilO, MANTENDO TODA INTEGRIDADE E
            <br>PROTE&Ccedil&AtildeO.
        </h2>
        <img id="entregadores" src="img/entregadores.png">
        <img id="botaowpp" src="img/whatsapp.png">
    </div>
    <div class="quemsomos">
        <h1>QUEM SOMOS</h1>
        <h3>Somos uma empresa, criada para facilitar a vida dos<br>auton&ocircmos que trabalham na area de de
            carreto/<br>mudan&ccedilas/ frete, etc.<br><br>Fruto da ideia de amigos, estudantes de programa&ccedil&atildeo,<br>tendo
            como
            objetivo intermediar o contato do motorista<br>com seu cliente.<br><br>Atendemos as necessidades de
            nossos
            clientes com<br>muito respeito, efici&ecircncia e carinho pelos seus<br>pertences. Mantendo a pontualidade e
            honrando os<br>prazos estabelecidos.</h3>
        <img src="img/Rectangle 50.png">
    </div>
    <div class="servicos">
        <h2>CONHE&CcedilA NOSSOS SERVI&CcedilOS</h2>
        <img src="img/Rectangle 54.png">
    </div>
    <div class="formulario">
        <h3>GOSTARIA DE CONTRATAR NOSSOS SERVI&CcedilOS?<br>PREENCHA ESSE PR&Eacute-FORMUL&AacuteRIO, QUE LOGO ENTRAREMOS EM CONTATO.
        </h3>
        <form>
            <div class="precadastro">
                <input type="text" id="nome" name="nome" placeholder="Nome">
                <input type="text" id="sobrenome" name="sobrenome" placeholder="Sobrenome">
                <input type="text" id="telefone" name="telefone" placeholder="Telefone">
                <input type="text" id="celular" name="celular" placeholder="Celular">
                <input type="text" id="email" name="email" placeholder="Email">
            </div>
        </form>
        <button onClick="servico()">SOLICITAR SERVI&CcedilO<img src="img/caminhao.png"></button>
        <script>

        function servico(){
        var teste = document.querySelector("#nome");
        var input = teste.value;
        if(input != null){
        alert("tst");
        }
        }
        </script>
    </div>
    <div class="faleconosco">
        <div class="contatos">
            <h4>Fale Conosco</h4>
            <p>Tel: (11) 99999-9999 (Regi&otildees Metropolitanas)</p>
            <p>Sac: 0800 123 2000 (Demais Localidades)</p>
            <p>E-mail: mudanca@zemudanca.com.br</p>
        </div>
        <div class="redessociais">
            <p>Acesse nossas redes sociais</p>
            <img id="instagram" src="img/instagram.png">
            <img id="twitter" src="img/twitter.png">
            <img id="youtube" src="img/youtube.png">
            <img id="whatsapp" src="img/whatsapp.png">
        </div>
        <img id="faleconoscoimg" src="img/FaleConosco 1.png">
    </div>
</body>
<footer>
    <div class="rodape">
        <p>Z&eacute; Mudan&ccedil;a, empresa especializada em transportes de bens.<br>&copy; 2023 Todos os Direitos
            Reservados.</p>
    </div>
</footer>

</html>