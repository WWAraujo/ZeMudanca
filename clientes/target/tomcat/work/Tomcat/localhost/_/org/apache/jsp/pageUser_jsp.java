/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-05-24 23:38:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pageUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"pageUser.css\">\r\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"caminhao.png\">\r\n");
      out.write("    <title>Z&eacute Mudan&ccedila</title>\r\n");
      out.write("</head>\r\n");
      out.write("<header>\r\n");
      out.write("    <div class=\"cabecalho\">\r\n");
      out.write("        <div class=\"img-cabecalho\">\r\n");
      out.write("            <img src=\"caminhao.png\" alt=\"icone\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"menu\">\r\n");
      out.write("          <a href=\"index.jsp\">Clientes</a>\r\n");
      out.write("          <a href=\"servicos.jsp\">Servi&ccedilos</a>\r\n");
      out.write("          <a href=\"gerenciamento.jsp\">Relat&oacuterios</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    <div class=\"introduction\">\r\n");
      out.write("        <h2>FA&CcedilA A MUDAN&CcedilA MAIS F&AacuteCIL E AGIL QUE VOCE UM DIA JAMAIS OUSOU REALIZAR,<br> SOMOS REFERENCIA EM\r\n");
      out.write("            TRANSPORTE\r\n");
      out.write("            DE BENS, CONOSCO O SEU BEM SER&Aacute<br> PROTEGIDO DO INICIO AO FIM DO SERVI&CcedilO, MANTENDO TODA INTEGRIDADE E\r\n");
      out.write("            <br>PROTE&Ccedil&AtildeO.\r\n");
      out.write("        </h2>\r\n");
      out.write("        <img id=\"entregadores\" src=\"entregadores.png\">\r\n");
      out.write("        <img id=\"botaowpp\" src=\"whatsapp.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"quemsomos\">\r\n");
      out.write("        <h1>QUEM SOMOS</h1>\r\n");
      out.write("        <h3>Somos uma empresa, criada para facilitar a vida dos<br>auton&ocircmos que trabalham na area de de\r\n");
      out.write("            carreto/<br>mudan&ccedilas/ frete, etc.<br><br>Fruto da ideia de amigos, estudantes de programa&ccedil&atildeo,<br>tendo\r\n");
      out.write("            como\r\n");
      out.write("            objetivo intermediar o contato do motorista<br>com seu cliente.<br><br>Atendemos as necessidades de\r\n");
      out.write("            nossos\r\n");
      out.write("            clientes com<br>muito respeito, efici&ecircncia e carinho pelos seus<br>pertences. Mantendo a pontualidade e\r\n");
      out.write("            honrando os<br>prazos estabelecidos.</h3>\r\n");
      out.write("        <img src=\"Rectangle 50.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"servicos\">\r\n");
      out.write("        <h2>CONHE&CcedilA NOSSOS SERVI&CcedilOS</h2>\r\n");
      out.write("        <img src=\"Rectangle 54.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"formulario\">\r\n");
      out.write("        <h3>GOSTARIA DE CONTRATAR NOSSOS SERVI&CcedilOS?<br>PREENCHA ESSE PR&Eacute-FORMUL&AacuteRIO, QUE LOGO ENTRAREMOS EM CONTATO.\r\n");
      out.write("        </h3>\r\n");
      out.write("        <form>\r\n");
      out.write("            <div class=\"precadastro\">\r\n");
      out.write("                <input type=\"text\" id=\"nome\" name=\"nome\" placeholder=\"Nome\">\r\n");
      out.write("                <input type=\"text\" id=\"sobrenome\" name=\"sobrenome\" placeholder=\"Sobrenome\">\r\n");
      out.write("                <input type=\"text\" id=\"telefone\" name=\"telefone\" placeholder=\"Telefone\">\r\n");
      out.write("                <input type=\"text\" id=\"celular\" name=\"celular\" placeholder=\"Celular\">\r\n");
      out.write("                <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <button>SOLICITAR SERVI&CcedilO<img src=\"caminhao.png\"></button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"faleconosco\">\r\n");
      out.write("        <div class=\"contatos\">\r\n");
      out.write("            <h4>Fale Conosco</h4>\r\n");
      out.write("            <p>Tel: (11) 99999-9999 (Regi&otildees Metropolitanas)</p>\r\n");
      out.write("            <p>Sac: 0800 123 2000 (Demais Localidades)</p>\r\n");
      out.write("            <p>E-mail: mudanca@zemudanca.com.br</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"redessociais\">\r\n");
      out.write("            <p>Acesse nossas redes sociais</p>\r\n");
      out.write("            <img id=\"instagram\" src=\"instagram.png\">\r\n");
      out.write("            <img id=\"twitter\" src=\"twitter.png\">\r\n");
      out.write("            <img id=\"youtube\" src=\"youtube.png\">\r\n");
      out.write("            <img id=\"whatsapp\" src=\"whatsapp.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <img id=\"faleconoscoimg\" src=\"FaleConosco 1.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("<footer>\r\n");
      out.write("    <div class=\"rodape\">\r\n");
      out.write("        <p>Z&eacute; Mudan&ccedil;a, empresa especializada em transportes de bens.<br>&copy; 2023 Todos os Direitos\r\n");
      out.write("            Reservados.</p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
