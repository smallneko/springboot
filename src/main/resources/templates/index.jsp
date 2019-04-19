<html>
    <head>
        <title>jsp测试</title>
        <script type="text/javascript" src="../static/jquery-3.4.0.js"></script>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>ClientName</th>
                    <th>Tel</th>
                </tr>
            </thead>
            <tbody>
                <tr th:each="client:${clientList}">
                    <td th:text="${client.clientName}">name</td>
                    <td th:text="${client.tel}">tel</td>
                </tr>
            </tbody>
        </table>
    </body>
    <script th:inline="javascript">
        $(function () {
            var data = [[${clientList}]];
            $.each(data,function (index, data) {
                console.log(data.clientName);
            });

        })
    </script>
</html>