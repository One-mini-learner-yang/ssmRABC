/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-07 17:00:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class assignRole_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/font-awesome.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/doc.min.css\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .tree li {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            cursor:pointer;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <div><a class=\"navbar-brand\" style=\"font-size:32px;\" href=\"user.html\">众筹平台 - 用户维护</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                <li style=\"padding-top:8px;\">\r\n");
      out.write("                    <div class=\"btn-group\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default btn-success dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <i class=\"glyphicon glyphicon-user\"></i> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"caret\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"glyphicon glyphicon-cog\"></i> 个人设置</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"glyphicon glyphicon-comment\"></i> 消息</a></li>\r\n");
      out.write("                            <li class=\"divider\"></li>\r\n");
      out.write("                            <li><a href=\"server/logOut\"><i class=\"glyphicon glyphicon-off\"></i> 退出系统</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li style=\"margin-left:10px;padding-top:8px;\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-default btn-danger\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-question-sign\"></span> 帮助\r\n");
      out.write("                    </button>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <form class=\"navbar-form navbar-right\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("            <div class=\"tree\">\r\n");
      out.write("                <ul style=\"padding-left:0px;\" class=\"list-group\">\r\n");
      out.write("                    <li class=\"list-group-item tree-closed\" >\r\n");
      out.write("                        <a href=\"main.html\"><i class=\"glyphicon glyphicon-dashboard\"></i> 控制面板</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"list-group-item\">\r\n");
      out.write("                        <span><i class=\"glyphicon glyphicon glyphicon-tasks\"></i> 权限管理 <span class=\"badge\" style=\"float:right\">3</span></span>\r\n");
      out.write("                        <ul style=\"margin-top:10px;\">\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"user.jsp\" style=\"color:red;\"><i class=\"glyphicon glyphicon-user\"></i> 用户维护</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"role.jsp\"><i class=\"glyphicon glyphicon-certificate\"></i> 角色维护</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"permission.html\"><i class=\"glyphicon glyphicon-lock\"></i> 许可维护</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"list-group-item tree-closed\">\r\n");
      out.write("                        <span><i class=\"glyphicon glyphicon-ok\"></i> 业务审核 <span class=\"badge\" style=\"float:right\">3</span></span>\r\n");
      out.write("                        <ul style=\"margin-top:10px;display:none;\">\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"auth_cert.html\"><i class=\"glyphicon glyphicon-check\"></i> 实名认证审核</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"auth_adv.html\"><i class=\"glyphicon glyphicon-check\"></i> 广告审核</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"auth_project.html\"><i class=\"glyphicon glyphicon-check\"></i> 项目审核</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"list-group-item tree-closed\">\r\n");
      out.write("                        <span><i class=\"glyphicon glyphicon-th-large\"></i> 业务管理 <span class=\"badge\" style=\"float:right\">7</span></span>\r\n");
      out.write("                        <ul style=\"margin-top:10px;display:none;\">\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"cert.html\"><i class=\"glyphicon glyphicon-picture\"></i> 资质维护</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"type.html\"><i class=\"glyphicon glyphicon-equalizer\"></i> 分类管理</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"process.html\"><i class=\"glyphicon glyphicon-random\"></i> 流程管理</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"advertisement.html\"><i class=\"glyphicon glyphicon-hdd\"></i> 广告管理</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"message.html\"><i class=\"glyphicon glyphicon-comment\"></i> 消息模板</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"project_type.html\"><i class=\"glyphicon glyphicon-list\"></i> 项目分类</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li style=\"height:30px;\">\r\n");
      out.write("                                <a href=\"tag.html\"><i class=\"glyphicon glyphicon-tags\"></i> 项目标签</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"list-group-item tree-closed\" >\r\n");
      out.write("                        <a href=\"param.html\"><i class=\"glyphicon glyphicon-list-alt\"></i> 参数管理</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("            <ol class=\"breadcrumb\">\r\n");
      out.write("                <li><a href=\"#\">首页</a></li>\r\n");
      out.write("                <li><a href=\"#\">数据列表</a></li>\r\n");
      out.write("                <li class=\"active\">分配角色</li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <div class=\"panel panel-default\">\r\n");
      out.write("                <div class=\"panel-body\">\r\n");
      out.write("                    <form role=\"form\" class=\"form-inline\" id=\"RoleForm\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                            <label>未分配角色列表</label><br>\r\n");
      out.write("                            <select name=\"unAssignRoleIds\" id=\"unAssignRoleSelect\" class=\"form-control\" multiple size=\"10\" style=\"width:200px;overflow-y:auto;\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                <li class=\"btn btn-default glyphicon glyphicon-chevron-right\" onclick=\"rightButtonClick()\"></li>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <li class=\"btn btn-default glyphicon glyphicon-chevron-left\" style=\"margin-top:20px;\" onclick=\"leftButtonClick()\"></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\" style=\"margin-left:40px;\">\r\n");
      out.write("                            <label>已分配角色列表</label><br>\r\n");
      out.write("                            <select name=\"assignRoleIds\" id=\"assignRoleSelect\" class=\"form-control\" multiple size=\"10\" style=\"width:200px;overflow-y:auto;\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\"><span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span></button>\r\n");
      out.write("                <h4 class=\"modal-title\" id=\"myModalLabel\">帮助</h4>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"bs-callout bs-callout-info\">\r\n");
      out.write("                    <h4>测试标题1</h4>\r\n");
      out.write("                    <p>测试内容1，测试内容1，测试内容1，测试内容1，测试内容1，测试内容1</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"bs-callout bs-callout-info\">\r\n");
      out.write("                    <h4>测试标题2</h4>\r\n");
      out.write("                    <p>测试内容2，测试内容2，测试内容2，测试内容2，测试内容2，测试内容2</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jquery/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/script/docs.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/layer-v3.0.1/layer/layer.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $(\".list-group-item\").click(function(){\r\n");
      out.write("            if ( $(this).find(\"ul\") ) {\r\n");
      out.write("                $(this).toggleClass(\"tree-closed\");\r\n");
      out.write("                if ( $(this).hasClass(\"tree-closed\") ) {\r\n");
      out.write("                    $(\"ul\", this).hide(\"fast\");\r\n");
      out.write("                } else {\r\n");
      out.write("                    $(\"ul\", this).show(\"fast\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("    function rightButtonClick() {\r\n");
      out.write("        var leftSelect=$(\"#unAssignRoleSelect :selected\")\r\n");
      out.write("        if(leftSelect.length==0)\r\n");
      out.write("        {\r\n");
      out.write("            layer.msg(\"选择项不能为空\",{time:3});\r\n");
      out.write("        }else{\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"POST\",\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/role/assignRole\",\r\n");
      out.write("                data:$(\"#RoleForm\").serialize(),\r\n");
      out.write("                success:function () {\r\n");
      out.write("                    layer.msg(\"分配成功\")\r\n");
      out.write("                    $(\"#assignRoleSelect\").append(leftSelect);\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("    function leftButtonClick() {\r\n");
      out.write("        var rightSelect=$(\"#assignRoleSelect :selected\")\r\n");
      out.write("        if(rightSelect.length==0)\r\n");
      out.write("        {\r\n");
      out.write("            layer.msg(\"选择项不能为空\",{time:3});\r\n");
      out.write("        }else{\r\n");
      out.write("            $(\"#unAssignRoleSelect\").append(rightSelect);\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"POST\",\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/role/unAssignRole\",\r\n");
      out.write("                data:$(\"#RoleForm\").serialize(),\r\n");
      out.write("                success:function () {\r\n");
      out.write("                    layer.msg(\"取消分配成功\")\r\n");
      out.write("                    $(\"#unAssignRoleSelect\").append(rightSelect);\r\n");
      out.write("                }\r\n");
      out.write("            })\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
    // /assignRole.jsp(141,32) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unAssignRoles}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /assignRole.jsp(141,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("unAssignRole");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unAssignRole.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unAssignRole.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                                ");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /assignRole.jsp(156,32) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${assignRoles}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    // /assignRole.jsp(156,32) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("assignRole");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${assignRole.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${assignRole.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}