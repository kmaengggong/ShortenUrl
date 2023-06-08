<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <style>
        .container {
            padding-top: 10px;
            padding-bottom: 10px;
        }
        label {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<div class="container">
    <form action="/make-short">
        <label for="userurl">단축시킬 URL</label>
        <div class="row">
            <div class="col-10">
                <input type="text" class="form-control" id="userurl" name="userurl">
            </div>
            <div class="col-auto">
                <button type="submit" class="btn btn-primary">단축</button>
            </div>
        </div>
    </form>

</div>
</body>
</html>