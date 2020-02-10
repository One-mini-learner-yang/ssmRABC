<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/5 0005
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8" %>
<%--<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>--%>
<%--这样写会报错--%>
<%--<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>--%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
        table tbody tr:nth-child(odd){background:#F4F4F4;}
        table tbody td:nth-child(even){color:#C00;}
    </style>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <div><a class="navbar-brand" style="font-size:32px;" href="#">众筹平台 - 用户维护</a></div>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li style="padding-top:8px;">
                    <div class="btn-group">
                        <button type="button" class="btn btn-default btn-success dropdown-toggle" data-toggle="dropdown">
                            <i class="glyphicon glyphicon-user"></i> ${username} <span class="caret"></span>
                        </button>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="#"><i class="glyphicon glyphicon-cog"></i> 个人设置</a></li>
                            <li><a href="#"><i class="glyphicon glyphicon-comment"></i> 消息</a></li>
                            <li class="divider"></li>
                            <li><a href="server/logOut"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
                        </ul>
                    </div>
                </li>
                <li style="margin-left:10px;padding-top:8px;">
                    <button type="button" class="btn btn-default btn-danger">
                        <span class="glyphicon glyphicon-question-sign"></span> 帮助
                    </button>
                </li>
            </ul>
            <form class="navbar-form navbar-right">
                <input type="text" class="form-control" placeholder="Search...">
            </form>
        </div>
    </div>
</nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <div class="tree">
                <ul style="padding-left:0px;" class="list-group">
                    <li class="list-group-item tree-closed" >
                        <a href="main.html"><i class="glyphicon glyphicon-dashboard"></i> 控制面板</a>
                    </li>
                    <li class="list-group-item">
                        <span><i class="glyphicon glyphicon glyphicon-tasks"></i> 权限管理 <span class="badge" style="float:right">3</span></span>
                        <ul style="margin-top:10px;">
                            <li style="height:30px;">
                                <a href="user.jsp" style="color:red;"><i class="glyphicon glyphicon-user"></i> 用户维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="role.jsp"><i class="glyphicon glyphicon-king"></i> 角色维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="permission.jsp"><i class="glyphicon glyphicon-lock"></i> 许可维护</a>
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed">
                        <span><i class="glyphicon glyphicon-ok"></i> 业务审核 <span class="badge" style="float:right">3</span></span>
                        <ul style="margin-top:10px;display:none;">
                            <li style="height:30px;">
                                <a href="auth_cert.html"><i class="glyphicon glyphicon-check"></i> 实名认证审核</a>
                            </li>
                            <li style="height:30px;">
                                <a href="auth_adv.html"><i class="glyphicon glyphicon-check"></i> 广告审核</a>
                            </li>
                            <li style="height:30px;">
                                <a href="auth_project.html"><i class="glyphicon glyphicon-check"></i> 项目审核</a>
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed">
                        <span><i class="glyphicon glyphicon-th-large"></i> 业务管理 <span class="badge" style="float:right">7</span></span>
                        <ul style="margin-top:10px;display:none;">
                            <li style="height:30px;">
                                <a href="cert.html"><i class="glyphicon glyphicon-picture"></i> 资质维护</a>
                            </li>
                            <li style="height:30px;">
                                <a href="type.html"><i class="glyphicon glyphicon-equalizer"></i> 分类管理</a>
                            </li>
                            <li style="height:30px;">
                                <a href="process.html"><i class="glyphicon glyphicon-random"></i> 流程管理</a>
                            </li>
                            <li style="height:30px;">
                                <a href="advertisement.html"><i class="glyphicon glyphicon-hdd"></i> 广告管理</a>
                            </li>
                            <li style="height:30px;">
                                <a href="message.html"><i class="glyphicon glyphicon-comment"></i> 消息模板</a>
                            </li>
                            <li style="height:30px;">
                                <a href="project_type.html"><i class="glyphicon glyphicon-list"></i> 项目分类</a>
                            </li>
                            <li style="height:30px;">
                                <a href="tag.html"><i class="glyphicon glyphicon-tags"></i> 项目标签</a>
                            </li>
                        </ul>
                    </li>
                    <li class="list-group-item tree-closed" >
                        <a href="param.html"><i class="glyphicon glyphicon-list-alt"></i> 参数管理</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <form class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input class="form-control has-success" type="text" placeholder="请输入查询条件" id="inputFind">
                            </div>
                        </div>
                        <button type="button" class="btn btn-warning" onclick="fingById()"><i class="glyphicon glyphicon-search" ></i> 查询</button>
                    </form>
                    <button type="button" onclick="deleteSome()" class="btn btn-danger" style="float:right;margin-left:10px;"><i class=" glyphicon glyphicon-remove"></i> 删除</button>
                    <button type="button" class="btn btn-primary" style="float:right;" onclick="window.location.href='add.jsp'"><i class="glyphicon glyphicon-plus"></i> 新增</button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <form id="fromUser">
                            <table class="table  table-bordered">
                                    <thead>
                                    <tr >
                                        <th width="30">#</th>
                                        <th width="30"><input type="checkbox" id="allSelBox"></th>
                                        <th>账号</th>
                                        <th>名称</th>
                                        <th>邮箱地址</th>
                                        <th width="100">操作</th>
                                    </tr>
                                    </thead>
    <%--                           注释部分为同步分页前端版--%>
                                <tbody id="userBody">
    <%--                            <c:forEach items="${c_user}" var="c_user" varStatus="status">--%>
    <%--                                <tr>--%>
    <%--                                    <td>${status.count}</td>--%>
    <%--                                    <td><input type="checkbox"></td>--%>
    <%--                                    <td>${c_user.name}</td>--%>
    <%--                                    <td>${c_user.username}</td>--%>
    <%--                                    <td>${c_user.email}</td>--%>
    <%--                                    <td>--%>
    <%--                                        <button type="button" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></button>--%>
    <%--                                        <button type="button" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></button>--%>
    <%--                                        <button type="button" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></button>--%>
    <%--                                    </td>--%>
    <%--                                </tr>--%>
    <%--                            </c:forEach>--%>
                                </tbody>
                                <tfoot>
                                <tr >
                                    <td colspan="6" align="center">
                                        <ul class="pagination">
    <%--                                        <c:if test="${pageNum>1}">--%>
    <%--                                            <li><a href="#" onclick="pageChange(${pageNum-1})">上一页</a></li>--%>
    <%--                                        </c:if>--%>
    <%--                                        <c:forEach begin="1" end="${totalNum}" varStatus="status">--%>
    <%--                                            <c:if test="${pageNum==status.count}">--%>
    <%--                                                <li class="active"><a href="#" onclick="pageChange(${status.count})">${status.count} <span class="sr-only">(current)</span></a></li>--%>
    <%--                                            </c:if>--%>
    <%--                                            <c:if test="${pageNum!=status.count}">--%>
    <%--                                                <li><a href="#" onclick="pageChange(${status.count})">${status.count}</a></li>--%>
    <%--                                            </c:if>--%>
    <%--                                        </c:forEach>--%>
    <%--                                        <c:if test="${pageNum<totalNum}">--%>
    <%--                                            <li><a href="#" onclick="pageChange(${pageNum+1})">下一页</a></li>--%>
    <%--                                        </c:if>--%>
                                        </ul>
                                    </td>
                                </tr>

                                </tfoot>
                            </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${pageContext.request.contextPath}/jquery/jquery-2.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/script/docs.min.js"></script>
<script src="${pageContext.request.contextPath}/layer-v3.0.1/layer/layer.js"></script>
<script type="text/javascript">
    var fingByIdIndex;
    $(function () {
        $(".list-group-item").click(function(){
            if ( $(this).find("ul") ) {
                $(this).toggleClass("tree-closed");
                if ( $(this).hasClass("tree-closed") ) {
                    $("ul", this).hide("fast");
                } else {
                    $("ul", this).show("fast");
                }
            }
        });
        pageQuery(1);
        $("#allSelBox").click(function () {
            var flg=this.checked;
            $("#userBody :checkbox").each(function () {
                    this.checked=flg;
            })
        })
    });
    $("tbody .btn-success").click(function(){
        window.location.href = "assignRole.html";
    });
    $("tbody .btn-primary").click(function(){
        window.location.href = "edit.html";
    });
    function fingById() {
        if($("#inputFind").val()=="")
        {
            layer.msg("查询条件不可为空！",{time:1000,icon:2})
        }
        else {
           fingByIdIndex=1;
            pageQuery(1);
        }
    }
    <%--function pageChange(pageNum){--%>
    <%--    window.location.href="${pageContext.request.contextPath}/user/index?pageNum="+pageNum;--%>
    <%--}--%>
    function  pageQuery(pageNum) {
        var loadingIndex=null;
        var jsonData={"pageNum":pageNum,"pageSize":5};
        if(fingByIdIndex==1)
        {
            jsonData={"pageNum":pageNum,"pageSize":5,"findIndex":$("#inputFind").val()};
        }
        $.ajax({
            type:"POST",
           url:"${pageContext.request.contextPath}/user/index",
           data:jsonData
            ,beforeSend: function () {
                loadingIndex=layer.msg("稍等")
            },
            success:function (result) {
               layer.close(loadingIndex);
                if(result.success="true") {
                    var tableContext = "";
                    var pageContext = "";
                    var userPage = result.page;
                    var users = userPage.ts;
                    $.each(users,function (i,user) {
                        tableContext += '<tr>';
                        tableContext += '<td>' +(i+1) + '</td>';
                        tableContext += '<td><input type="checkbox"  name="id" value="'+user.id+'"></td>';
                        tableContext += '<td>' + user.name + '</td>';
                        tableContext += '<td>' + user.username + '</td>';
                        tableContext += '<td>'+user.email+'</td>';
                        tableContext += ' <td>';
                        tableContext += '<button type="button" onclick="goToAssignRole('+user.id+')" class="btn btn-success btn-xs"><i class=" glyphicon glyphicon-check"></i></button>';
                        tableContext += '<button type="button"  onclick="updateById('+user.id+')" class="btn btn-primary btn-xs"><i class=" glyphicon glyphicon-pencil"></i></button>';
                        tableContext += '<button type="button" onclick="deleteById('+user.id+')" class="btn btn-danger btn-xs"><i class=" glyphicon glyphicon-remove"></i></button>';
                        tableContext += '</td>';
                        tableContext += ' </tr>';
                    });
                    if(pageNum>1)
                        pageContext+='<li><a href="#" onclick="pageQuery('+(pageNum-1)+')">上一页</a></li>';
                    for(i=1;i<=userPage.totalNum;i++)
                    {
                        if(pageNum==i)
                            pageContext+='<li class="active"><a href="#" onclick="pageQuery('+i+')">'+i+'<span class="sr-only">(current)</span></a></li>';
                        if (pageNum!=i)
                            pageContext+='<li><a href="#" onclick="pageQuery('+i+')">'+i+'</a></li>';
                    }
                    if (pageNum<userPage.totalNum)
                        pageContext+='<li><a href="#" onclick="pageQuery('+(pageNum+1)+')">下一页</a></li>';
                    $("#userBody").html(tableContext);
                    $(".pagination").html(pageContext);
                }else{
                    layer.msg("用户分页查询失败")
                }
            }
        });
    }
    function updateById(id) {
        window.location.href="${pageContext.request.contextPath}/user/updateQuery?id="+id;
    }
    function deleteById(id) {
        layer.confirm("确定删除用户吗",{icon:3},function () {
            window.location.href="${pageContext.request.contextPath}/user/deleteById?id="+id;
        },function () {
            layer.close();
        })
    }
    function goToAssignRole(id) {
        window.location.href="${pageContext.request.contextPath}/role/assignRoleQuery?id="+id;
    }
    function deleteSome() {
        var boxesChecked=0;
        $("#userBody :checkbox").each(function () {
                if(this.checked==true)
                    boxesChecked=1;
        })
        if(boxesChecked==1)
        {
            $.ajax({
                type:"POST",
                url: "${pageContext.request.contextPath}/user/deleteSome",
                data:$("#fromUser").serialize(),
                beforeSend:function () {
                    layer.msg("稍后")
                },
                success:function () {
                    layer.msg("删除成功",{time:1000,icon:1})
                    window.location.href="${pageContext.request.contextPath}/user.jsp"
                }
            })
        }else {
            layer.msg("选择不能为空",{time:4});
            layer.close();
        }
    }
</script>
</body>
</html>

