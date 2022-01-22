package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_005f_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/includes/css.jsp");
    _jspx_dependants.add("/includes/sidebar.jsp");
    _jspx_dependants.add("/includes/js.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"");
      out.print( request.getContextPath());
      out.write(" template/img/apple-icon.png\">\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"");
      out.print( request.getContextPath());
      out.write(" template/img/favicon.png\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"https://use.fontawesome.com/releases/v5.0.6/css/all.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Nucleo Icons -->\n");
      out.write("<link href=\"");
      out.print( request.getContextPath());
      out.write(" template/css/nucleo-icons.css\" rel=\"stylesheet\" />\n");
      out.write("<!-- CSS Files -->\n");
      out.write("<link href=\"");
      out.print( request.getContextPath());
      out.write(" template/css/black-dashboard.css?v=1.0.0\" rel=\"stylesheet\" />\n");
      out.write("<!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("<link href=\"");
      out.print( request.getContextPath());
      out.write(" template/demo/demo.css\" rel=\"stylesheet\" />");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<div class=\"sidebar\">\n");
      out.write("    <!--Tip 1: You can change the color of the sidebar using: data-color=\"blue | green | orange | red\"-->\n");
      out.write("    <div class=\"sidebar-wrapper\">\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"simple-text logo-mini\">GM</a>\n");
      out.write("            <a href=\"javascript:void(0)\" class=\"simple-text logo-normal\">Gestion Machines</a>\n");
      out.write("        </div>\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("            <li class=\"active \">\n");
      out.write("                <a href=\"./dashboard.html\"><i class=\"tim-icons icon-chart-pie-36\"></i><p>Dashboard</p></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./icons.html\"><i class=\"tim-icons icon-atom\"></i><p>Marques</p></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./map.html\"><i class=\"tim-icons icon-pin\"></i><p>Machines</p></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./notifications.html\"><i class=\"tim-icons icon-bell-55\"></i><p>Ajouter une marque</p></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./user.html\"><i class=\"tim-icons icon-single-02\"></i><p>Ajouter une machine</p></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./tables.html\"><i class=\"tim-icons icon-puzzle-10\"></i><p>Machines Par Marque</p></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./typography.html\"><i class=\"tim-icons icon-align-center\"></i><p>Machines Par Date</p></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("                <a href=\"./rtl.html\"><i class=\"tim-icons icon-world\"></i><p>RTL Support</p></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"active-pro\">\n");
      out.write("                <a href=\"./upgrade.html\"><i class=\"tim-icons icon-spaceship\"></i><p>Upgrade to PRO</p></a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>id</th>\n");
      out.write("                        <th>reference</th>\n");
      out.write("                        <th>date d'Achat</th>\n");
      out.write("                        <th>marque</th>\n");
      out.write("                        <th>prix</th>\n");
      out.write("                        <th>action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tfoot>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>id</th>\n");
      out.write("                        <th>reference</th>\n");
      out.write("                        <th>date d'Achat</th>\n");
      out.write("                        <th>marque</th>\n");
      out.write("                        <th>prix</th>\n");
      out.write("                        <th>action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </tfoot>\n");
      out.write("                <tbody id=\"contentmachine\" >\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>id</th>\n");
      out.write("                        <th>code</th>\n");
      out.write("                        <th>libelle</th>\n");
      out.write("                        <th>action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tfoot>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>id</th>\n");
      out.write("                        <th>code</th>\n");
      out.write("                        <th>libelle</th>\n");
      out.write("                        <th>action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </tfoot>\n");
      out.write("                <tbody id=\"contentmarque\" >\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" scripte/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" scripte/jquery-3.5.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" scripte/machine.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" scripte/marque.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" scripte/user.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" scripte/statique.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" template/js/core/jquery.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" template/js/core/popper.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" template/js/core/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" template/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("<!--  Google Maps Plugin    -->\n");
      out.write("<!-- Place this tag in your head or just before your close body tag. -->\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("<!-- Chart JS -->\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" template/js/plugins/chartjs.min.js\"></script>\n");
      out.write("<!--  Notifications Plugin    -->\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" template/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("<!-- Control Center for Black Dashboard: parallax effects, scripts for the example pages etc -->\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" template/js/black-dashboard.min.js?v=1.0.0\"></script><!-- Black Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("<script src=\"");
      out.print( request.getContextPath());
      out.write(" template/demo/demo.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $().ready(function () {\n");
      out.write("            $sidebar = $('.sidebar');\n");
      out.write("            $navbar = $('.navbar');\n");
      out.write("            $main_panel = $('.main-panel');\n");
      out.write("\n");
      out.write("            $full_page = $('.full-page');\n");
      out.write("\n");
      out.write("            $sidebar_responsive = $('body > .navbar-collapse');\n");
      out.write("            sidebar_mini_active = true;\n");
      out.write("            white_color = false;\n");
      out.write("\n");
      out.write("            window_width = $(window).width();\n");
      out.write("\n");
      out.write("            fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            $('.fixed-plugin a').click(function (event) {\n");
      out.write("                if ($(this).hasClass('switch-trigger')) {\n");
      out.write("                    if (event.stopPropagation) {\n");
      out.write("                        event.stopPropagation();\n");
      out.write("                    } else if (window.event) {\n");
      out.write("                        window.event.cancelBubble = true;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.fixed-plugin .background-color span').click(function () {\n");
      out.write("                $(this).siblings().removeClass('active');\n");
      out.write("                $(this).addClass('active');\n");
      out.write("\n");
      out.write("                var new_color = $(this).data('color');\n");
      out.write("\n");
      out.write("                if ($sidebar.length != 0) {\n");
      out.write("                    $sidebar.attr('data', new_color);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ($main_panel.length != 0) {\n");
      out.write("                    $main_panel.attr('data', new_color);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ($full_page.length != 0) {\n");
      out.write("                    $full_page.attr('filter-color', new_color);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ($sidebar_responsive.length != 0) {\n");
      out.write("                    $sidebar_responsive.attr('data', new_color);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.switch-sidebar-mini input').on(\"switchChange.bootstrapSwitch\", function () {\n");
      out.write("                var $btn = $(this);\n");
      out.write("\n");
      out.write("                if (sidebar_mini_active == true) {\n");
      out.write("                    $('body').removeClass('sidebar-mini');\n");
      out.write("                    sidebar_mini_active = false;\n");
      out.write("                    blackDashboard.showSidebarMessage('Sidebar mini deactivated...');\n");
      out.write("                } else {\n");
      out.write("                    $('body').addClass('sidebar-mini');\n");
      out.write("                    sidebar_mini_active = true;\n");
      out.write("                    blackDashboard.showSidebarMessage('Sidebar mini activated...');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // we simulate the window Resize so the charts will get updated in realtime.\n");
      out.write("                var simulateWindowResize = setInterval(function () {\n");
      out.write("                    window.dispatchEvent(new Event('resize'));\n");
      out.write("                }, 180);\n");
      out.write("\n");
      out.write("                // we stop the simulation of Window Resize after the animations are completed\n");
      out.write("                setTimeout(function () {\n");
      out.write("                    clearInterval(simulateWindowResize);\n");
      out.write("                }, 1000);\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.switch-change-color input').on(\"switchChange.bootstrapSwitch\", function () {\n");
      out.write("                var $btn = $(this);\n");
      out.write("\n");
      out.write("                if (white_color == true) {\n");
      out.write("\n");
      out.write("                    $('body').addClass('change-background');\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        $('body').removeClass('change-background');\n");
      out.write("                        $('body').removeClass('white-content');\n");
      out.write("                    }, 900);\n");
      out.write("                    white_color = false;\n");
      out.write("                } else {\n");
      out.write("\n");
      out.write("                    $('body').addClass('change-background');\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        $('body').removeClass('change-background');\n");
      out.write("                        $('body').addClass('white-content');\n");
      out.write("                    }, 900);\n");
      out.write("\n");
      out.write("                    white_color = true;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.light-badge').click(function () {\n");
      out.write("                $('body').addClass('white-content');\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.dark-badge').click(function () {\n");
      out.write("                $('body').removeClass('white-content');\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("        demo.initDashboardPageCharts();\n");
      out.write("\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script src=\"https://cdn.trackjs.com/agent/v3/latest/t.js\"></script>\n");
      out.write("<script>\n");
      out.write("    window.TrackJS &&\n");
      out.write("            TrackJS.install({\n");
      out.write("                token: \"ee6fab19c5a04ac1a32a645abde4613a\",\n");
      out.write("                application: \"black-dashboard-free\"\n");
      out.write("            });\n");
      out.write("</script>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
