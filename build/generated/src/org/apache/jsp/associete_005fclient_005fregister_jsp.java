package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class associete_005fclient_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> Registro de Sócio</title>\n");
      out.write("        <meta charset=\"utf-8\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        Cadastro\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"associate_client_register\">Cliente</a></li>\n");
      out.write("            <li><a href=\"lease_register.jsp\">Locação</a></li>\n");
      out.write("            <li><a href=\"title_register.jsp\">Título</a></li>\n");
      out.write("            <li><a href=\"actor_register.jsp\">Atores</a></li>\n");
      out.write("            <li><a href=\"director_register.jsp\">Diretor</a></li>\n");
      out.write("            <li><a href=\"class_register.jsp\">Classe</a></li>\n");
      out.write("            <li><a href=\"item_register.jsp\">Item</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        Consulta\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"#\">Cliente</a></li>\n");
      out.write("            <li><a href=\"#\">Locação</a></li>\n");
      out.write("            <li><a href=\"#\">Título</a></li>\n");
      out.write("            <li><a href=\"#\">Atores</a></li>\n");
      out.write("            <li><a href=\"#\">Diretor</a></li>\n");
      out.write("            <li><a href=\"#\">Classe</a></li>\n");
      out.write("            <li><a href=\"#\">Item</a></li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section id=\"main\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("               \n");
      out.write("                    <form>\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend> Dados Pessoais </legend>\t\t\n");
      out.write("                            <label for=\"name\">Nome</label>\n");
      out.write("                            <input type=\"text\" name=\"name\" />\n");
      out.write("\n");
      out.write("                         \n");
      out.write("                                    <label for=\"birthDate\">Data de Nascimento</label>\n");
      out.write("                                    <input type=\"date\" name=\"birthDate\"/>\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                                                               \n");
      out.write("                                    <label for=\"gender\">Sexo</label>\n");
      out.write("                                    <select name=\"gender\" id=\"gender\" >\n");
      out.write("                                        <option value=\"true\">Feminino</option>\n");
      out.write("                                        <option value=\"false\">Masculino</option>\n");
      out.write("                                    </select>\n");
      out.write("                               \n");
      out.write("                       \n");
      out.write("                              \n");
      out.write("                                    <label for=\"cpf\">CPF</label>\n");
      out.write("                                    <input type=\"number\" name=\"cpf\" placeholder=\"xxx.xxx.xxx-xx\" ></input>\n");
      out.write("                          \n");
      out.write("\n");
      out.write("                               \n");
      out.write("                                    <label for=\"phone\">Telefone</label>\n");
      out.write("                                    <input type=\"number\" name=\"phone\" placeholder=\"(xxx) xxxxxxxxx\" ></input>\n");
      out.write("                               \n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend> Informações Técnicas </legend>\n");
      out.write("                            \n");
      out.write("                                \n");
      out.write("                                    <label for=\"numberInscription\">Nº de incrição (usar um random aqui)</label>\n");
      out.write("                                    <input type=\"number\" name=\"numberInscription\" placeholder=\"1234\" autofocus />\n");
      out.write("                                \n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                    <label for=\"status\">Status</label>\n");
      out.write("                                    <select name=\"status\" id=\"status\"  disabled=\"true\">\n");
      out.write("                                        <option value=\"true\">Ativo</option>\n");
      out.write("                                        <option value=\"false\">Inativo</option>\n");
      out.write("                                    </select>\n");
      out.write("                               \n");
      out.write("                         \n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                    <form>\n");
      out.write("                        <fieldset>\n");
      out.write("                            <legend> Endereço </legend>\n");
      out.write("                            <label for=\"city\">Cidade</label>\n");
      out.write("                            <input type=\"text\" name=\"city\"/>\n");
      out.write("\n");
      out.write("                            <label for=\"neighborhood\">Bairro</label>\n");
      out.write("                            <input type=\"text\" name=\"neighborhood\" />\n");
      out.write("\n");
      out.write("                            <label for=\"street\">Rua</label>\n");
      out.write("                            <input type=\"text\" name=\"street\" />\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                                    <label for=\"addressNumber\">Número</label>\n");
      out.write("                                    <input type=\"number\" name=\"addressNumber\" />\n");
      out.write("                              \n");
      out.write("\n");
      out.write("                            <label for=\"complement\">Complemento</label>\n");
      out.write("                            <textarea name=\"complement\"></textarea>\n");
      out.write("\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\t\n");
      out.write("    \n");
      out.write("           \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("           \t\n");
      out.write("                    <button type=\"submit\" > \n");
      out.write("                        Confirmar registro\n");
      out.write("                    </button>\n");
      out.write("               \n");
      out.write("\n");
      out.write("                \t\n");
      out.write("                    <button type=\"submit\" > \n");
      out.write("                        Excluir\n");
      out.write("                    </button>\n");
      out.write("             \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("        numero de inscrição\n");
      out.write("        nome\n");
      out.write("        data de nascimento\n");
      out.write("        sexo\n");
      out.write("        status\n");
      out.write("        cpf \n");
      out.write("        endereço: cidade, bairro, rua, num, complemento\n");
      out.write("        telefone\n");
      out.write("-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
