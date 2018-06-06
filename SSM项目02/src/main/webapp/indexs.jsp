
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #fazi {
            margin-left: 300px;
            margin-top: 220px;
        }
    </style>
    <script src="static/js/jquery-1.8.3.js"></script>
</head>
<body>
<div id="fazi">
    <h1>帖子列表</h1>
    <div>
        <span>帖子标题：<input type="text"><input type="submit" value="搜索"></span>
        <table border="8" id="tab">
        </table>
    </div>
    <div  class="pagination" id="pagination"></div>
</div>

<script type="text/javascript" src="static/js/jquery.pagination.js"></script>
<script type="text/javascript">
    $(function () {
        load(0);

    });
</script>
<script type="text/javascript">
    function load(pageNum) {
        $.ajax({
            url: "/findAlls/all",
            type: "post",
            data: {
                pageNum: pageNum
            },
            success: function (data) {
                $("#tab").html("");
                $("#tab").append(" <tr>\n" +
                    "                    <th>标题</th>\n" +
                    "                    <th>内容摘要</th>\n" +
                    "                    <th>作者</th>\n" +
                    "                    <th>发布时间</th>\n" +
                    "                    <th>操作</th>\n" +
                    "                </tr>");
                var data = $.parseJSON(data);
                $.each(data, function (i, find) {
                    $("#tab").append(" <tr>\n" +
                        "                    <td>" + find.title + "</td>\n" +
                        "                    <td>" + find.summary + "</td>\n" +
                        "                    <td>" + find.author + "</td>\n" +
                        "                    <td>" + find.createdate + "</td>\n" +
                        "                    <td><a href='#'>查看回复</a> || <a href='#'>删除</a></td>\n" +
                        "                </tr>");
                });
//渲染分页  总记录数  当前页码  每页数据量
                $('#pagination').pagination(data.total, {
                    current_page:pageNum,//当前第几页
                    items_per_page: data.pageSize,
                    callback: load,  //回调函数
                    num_edge_entries: 2,
                    load_first_page: true,
                    prev_show_always:false,
                    next_show_always:false,
                    prevCls:'prev',		//上一页class
                    nextCls:'next',		//下一页class
                    prev_text: '上一页',
                    next_text: '下一页'
                });
            }
        });
    }
</script>
</body>
</html>
