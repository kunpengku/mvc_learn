<%--
  Created by IntelliJ IDEA.
  User: fupeng
  Date: 2017/4/28
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product Form</title>
</head>
<body>

<form action="product_save" method="post">
    <fieldset>
        <legend> Add a product</legend>
        <p>
            <label for="name">Product Name:</label>
            <input type="text" id="name" name="name" tabindex="1">
        </p>

        <p>
            <label for="description">Description</label>
            <input type="text" id="description" name="description" tabindex="2">
        </p>

    </fieldset>
</form>

</body>
</html>
