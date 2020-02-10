1.登录系统（bookstrap）
   实现：非空校验：选择器获取值，若值为空字符串（此处不为null值）提示并停止提交
        密码校验：校验成功跳转下一个页面，失败跳转回去并传递错误信息
   登录页面出现的问题：1.弹出页面为浏览器自带(体验不好)，使用layui插件解决
                     2.由于提交数据产生的闪烁/白页面现象（不可避免），使用ajax解决
   主页面：将用户名放入session中，进行读取
   退出时进行session中的删除
   权限问题：权限一般为多对多关系(双向的一对多),在表上的处理，在建立关系表
   RBAC级别：RBAC0：用户，角色，许可，场景
                   用户与角色多对多，用户和许可多对多
                   一个用户的许可是该用户的许可集合
            RBAC1：对角色进行分层（存在上下级关系，许可细化）
            RBAC2：对角色分配进行约束（对互斥约束的控制，角色数量的约束，角色获取的前提条件）
            RBAC3：将RBAC0,1,2进行整合
   用户维护：查询，添加，删除，批量删除
   路径问题：以/开头为特殊相对路径，分为前台路径和后台路径
            前台路径：服务器根路径+所写路径
            后台路径：服务器根路径+web应用路径+所写路径（获得web应用应动态获取，不要写死，用el表达式${pageContext.request.contextPath}或者使用监听器，对应类实现ServletContextListener,将web应用路径存入application中，再用el表达式取出）
   分页查询：sql语句：select * from 表名 limit ?,?(第一个为起始值，第二个为数据行数)
            前台传递的为页码和数据行数，起始值为（页码-1）*数据行数
   表现层出现的问题：第一次并不传入参数，传入参数空指针异常
   解决：使用@RequestParm注解配置（配置require以及defaultValue）
   页码显示问题：只有第一页是没有上一页的，同样只有最后一页是没有下一页的，在当前页是有样式的
   改进版：将同步分页变为异步分页（同步分页是只有查询到才会进行下一步操作，等待时间较长，故而使用异步分页）


树状数据显示：zTree插件
        实现zTree的异步加载
        jsp处： <div class="panel-body">
                    <ul id="treeDemo" class="ztree"></ul>
                </div>
        <script>处：var setting={
                                  async: {
                                              enable: true,
                                              url:"${pageContext.request.contextPath}/permission/index",
                                              autoParam:["id", "name=n", "level=lv"]
                                          }
                                };
                    $.fn.zTree.init($("#treeDemo"), setting);
        zTree的属性：open(true为将树状结构展开)
                    checked(true为将复选框定为已选)
        zTree的方法：var treeObj=$.fn.zTree.getZTreeObj("所选中的zTree<ul>标签的id")
                    var nodes=treeObj.getCheckedNodes(true)//获取选中的信息


项目分析：登录之后，转入后台，在session域中返回用户信息（user对象），权限信息（permission对象），转到主页面，将随权限变化的jsp抽取出来作为公共jsp内容
         拦截：登录和权限（先登录后权限）(拦截器在springMvc中配置即可)
               登录查询session中的是否有user对象
               权限查询：先查询该页面是否需要权限，在通过登陆后在session域中所存的权限判断


错误分析：1.int类型不能为空 解决：使用Integer代替
         2.Content type 'application/x-www-form-urlencoded;charset=UTF-8' not supported 解决：在前端ajax处定义好contentType: "application/json;charset=UTF-8"
