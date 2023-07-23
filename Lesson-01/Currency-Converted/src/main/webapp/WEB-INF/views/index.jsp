<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chuyển đổi tiền tệ</title>
</head>
<body>
<form action="/convert">
    <input type="number" name="exchangeRate" placeholder="Nhập tỷ giá đi con lợn"><br>
    <input type="number" name="USD" placeholder="Nhập USD"><br>
    <button>Chuyển đổi</button>
    <br>
    <p>${result}</p>
</form>
</body>
</html>