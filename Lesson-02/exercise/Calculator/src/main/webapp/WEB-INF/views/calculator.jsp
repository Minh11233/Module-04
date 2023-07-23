<%--
  Created by IntelliJ IDEA.
  User: Quang Minh
  Date: 10-May-23
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Máy tính căn bản</title>
</head>
<body>
<form action="calculator">
    <input type="number" name="number1" placeholder="Nhập số" step="any">
    <input type="number" name="number2" placeholder="Nhập số" step="any">
    <button name="operator" value="+">Cộng (+)</button>
    <button name="operator" value="-">Trừ (-)</button>
    <button name="operator" value="*">Nhân (*)</button>
    <button name="operator" value="-">Chia (/)</button>
</form>
<p>Kết quả: ${result}</p>
</body>
</html>
