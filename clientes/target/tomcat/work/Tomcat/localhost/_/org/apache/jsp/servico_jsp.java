/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-06-01 05:44:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class servico_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<html lang=\"pt-br\" xmlns=\"http://www.w3.org/1999/html\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <head>\r\n");
      out.write("            <meta charset=\"UTF-8\">\r\n");
      out.write("            <title>Servi&ccedilos</title>\r\n");
      out.write("            <script>\r\n");
      out.write("                function encodeURIComponent(value) {\r\n");
      out.write("                    return window.encodeURIComponent(value);\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("            <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("            <meta http-equiv=\"Content-Language\" content=\"pt-br\">\r\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/servico.css\">\r\n");
      out.write("            <link rel=\"icon\" type=\"image/x-icon\" href=\"img/caminhao.png\">\r\n");
      out.write("        </head>\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"cabecalho\">\r\n");
      out.write("                <div class=\"ordena-menu\">\r\n");
      out.write("                    <div class=\"img-cabecalho\">\r\n");
      out.write("                        <img src=\"img/caminhao.png\" alt=\"icone\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#menu\" id=\"toggle\"><span></span></a>\r\n");
      out.write("                    <div id=\"menu\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"clientes.jsp\">Clientes</a></li>\r\n");
      out.write("                            <li><a href=\"servico.jsp\">Servi&ccedilos</a></li>\r\n");
      out.write("                            <li><a href=\"gerenciamento.jsp\">Ordens de Servi&ccedilo</a></li>\r\n");
      out.write("                            <li><a href=\"index.jsp\">Sair</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("        <body>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"titulo\">\r\n");
      out.write("                    <h1>Servi&ccedilos</h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"organiza-container\">\r\n");
      out.write("                    <div class=\"cadastro-servico\">\r\n");
      out.write("                        <form method=\"post\" action=\"/create-servico\">\r\n");
      out.write("                            <div class=\"cadastro\">\r\n");
      out.write("                                <div class=\"os\">\r\n");
      out.write("                                    <label for=\"os\">OS N&deg</label><br>\r\n");
      out.write("                                    <input type=\"text\" id=\"os\" name=\"os\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.os}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"cliente\">\r\n");
      out.write("                                    <label for=\"cliente\">Cliente</label><br>\r\n");
      out.write("                                    <input type=\"text\" id=\"cliente\" name=\"cliente\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.idCliente}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"servico\">\r\n");
      out.write("                                    <label for=\"servico\">Servi&ccedilo</label><br>\r\n");
      out.write("                                    <input type=\"text\" id=\"servico\" name=\"servico\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.tipoServico}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"retirada\">\r\n");
      out.write("                                    <label for=\"retirada\">Endere&ccedilo de Retirada</label><br>\r\n");
      out.write("                                    <input type=\"text\" id=\"retirada\" name=\"retirada\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.retirada}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"entrega\">\r\n");
      out.write("                                    <label for=\"entrega\">Endere&ccedilo de Entrega</label><br>\r\n");
      out.write("                                    <input type=\"text\" id=\"entrega\" name=\"entrega\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.entrega}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"data-hora\">\r\n");
      out.write("                                    <div class=\"data\">\r\n");
      out.write("                                        <label for=\"data\">Data da Retirada</label><br>\r\n");
      out.write("                                        <input type=\"date\" id=\"data\" name=\"data\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.data}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"hora\">\r\n");
      out.write("                                        <label for=\"hora\">Hora da Retirada</label><br>\r\n");
      out.write("                                        <input type=\"time\" id=\"hora\" name=\"hora\" required value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.hora}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"salvar\">\r\n");
      out.write("                                    <input type=\"submit\" value=\"SALVAR\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"tabela\">\r\n");
      out.write("                        <table>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>OS</th>\r\n");
      out.write("                                <th>idCliente</th>\r\n");
      out.write("                                <th>Tipo Servico</th>\r\n");
      out.write("                                <th>Retirada</th>\r\n");
      out.write("                                <th>A&ccedil&atildeo</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </table>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <script>\r\n");
      out.write("        var theToggle = document.getElementById('toggle');\r\n");
      out.write("\r\n");
      out.write("        function hasClass(elem, className) {\r\n");
      out.write("            return new RegExp(' ' + className + ' ').test(' ' + elem.className + ' ');\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function addClass(elem, className) {\r\n");
      out.write("            if (!hasClass(elem, className)) {\r\n");
      out.write("                elem.className += ' ' + className;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function removeClass(elem, className) {\r\n");
      out.write("            var newClass = ' ' + elem.className.replace(/[\\t\\r\\n]/g, ' ') + ' ';\r\n");
      out.write("            if (hasClass(elem, className)) {\r\n");
      out.write("                while (newClass.indexOf(' ' + className + ' ') >= 0) {\r\n");
      out.write("                    newClass = newClass.replace(' ' + className + ' ', ' ');\r\n");
      out.write("                }\r\n");
      out.write("                elem.className = newClass.replace(/^\\s+|\\s+$/g, '');\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function toggleClass(elem, className) {\r\n");
      out.write("            var newClass = ' ' + elem.className.replace(/[\\t\\r\\n]/g, \" \") + ' ';\r\n");
      out.write("            if (hasClass(elem, className)) {\r\n");
      out.write("                while (newClass.indexOf(\" \" + className + \" \") >= 0) {\r\n");
      out.write("                    newClass = newClass.replace(\" \" + className + \" \", \" \");\r\n");
      out.write("                }\r\n");
      out.write("                elem.className = newClass.replace(/^\\s+|\\s+$/g, '');\r\n");
      out.write("            } else {\r\n");
      out.write("                elem.className += ' ' + className;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        theToggle.onclick = function () {\r\n");
      out.write("            toggleClass(this, 'on');\r\n");
      out.write("            return false;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("        </body>\r\n");
      out.write("        <footer>\r\n");
      out.write("            <div class=\"rodape\">\r\n");
      out.write("                <p>Z&eacute; Mudan&ccedil;a, empresa especializada em transportes de bens.<br>&copy; 2023 Todos os\r\n");
      out.write("                    Direitos\r\n");
      out.write("                    Reservados.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /servico.jsp(97,28) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("servico");
    // /servico.jsp(97,28) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/servico.jsp(97,28) '${allServicos}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${allServicos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.os}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.idCliente}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.tipoServico}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.retirada}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                                    <td id=\"acao\">\r\n");
          out.write("\r\n");
          out.write("                                        <form action=\"/alterar-servico\" method=\"post\">\r\n");
          out.write("                                            <input type=\"hidden\" id=\"os\" name=\"os\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.os}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                            <input type=\"hidden\" id=\"cliente\" name=\"cliente\"\r\n");
          out.write("                                                value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.idCliente}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                            <input type=\"hidden\" id=\"servico\" name=\"servico\"\r\n");
          out.write("                                                value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.tipoServico}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                            <input type=\"hidden\" id=\"retirada\" name=\"retirada\"\r\n");
          out.write("                                                value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.retirada}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                            <input type=\"hidden\" id=\"entrega\" name=\"entrega\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.entrega}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                            <input type=\"hidden\" id=\"data\" name=\"data\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.data}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                            <input type=\"hidden\" id=\"hora\" name=\"hora\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.hora}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                            <button id=\"button-update\"><a\r\n");
          out.write("                                                    href=\"servico.jsp?os=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.os}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&amp;idCliente=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.idCliente}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&amp;tipoServico=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.tipoServico}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&amp;retirada=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.retirada}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&amp;entrega=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.entrega}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&amp;data=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.data}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&amp;hora=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.hora}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">Update</a></button>\r\n");
          out.write("                                        </form>\r\n");
          out.write("\r\n");
          out.write("                                        <form action=\"/delete-servico\" method=\"post\">\r\n");
          out.write("                                            <input type=\"hidden\" id=\"os\" name=\"os\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${servico.os}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\">\r\n");
          out.write("                                            <button id=\"button-delete\" type=\"submit\"> Delete </button>\r\n");
          out.write("                                        </form>\r\n");
          out.write("\r\n");
          out.write("                                    </td>\r\n");
          out.write("\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
