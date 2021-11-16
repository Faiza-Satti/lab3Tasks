<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-
beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-
eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
          crossorigin="anonymous">
    <title>Hello, world!</title>
</head>
<body>
<div class="container">
    <form  method="post" action="exampleServlet" class="row g-3">

        <div class="col-md-6">
            <label >Username: </label>
            <input type="text" name="username" placeholder="Enter Username here">
        </div>

        <div class="col-md-6">
            <label>Email: </label>
            <input type="email" name="inputEmail4" placeholder="Enter Email here">
        </div>

        <div class="col-12">
            <button type="submit" class="btn btn-primary">Sign in</button>
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-
beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-
JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
        crossorigin="anonymous"></script>
</body>
</html>