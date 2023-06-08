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
        form {
            margin-bottom: 10px;
        }
        label {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <form action="/make-short" method="POST">
            <label for="originUrl">단축시킬 URL</label>
            <div class="row">
                <div class="col-10">
                    <input type="text" class="form-control" id="originUrl" name="originUrl">
                </div>
                <div class="col-auto">
                    <button type="submit" class="btn btn-primary">단축</button>
                </div>
            </div>
        </form>
        <p>입력된 URL : <a href="${originUrl}">${originUrl}</a></p>
        <p>단축된 URL : <a id="shortLink" href="/short/${shortUrl}">localhost:8080/${shortUrl}</a></p>
        <p>단축된 URL 카운트 : ${visitCount}</p>
        <div class="row">
            <div class="col-auto">
                <button class="btn btn-primary" onclick="location.href='/'">
                    홈으로
                </button>
            </div>
        </div>
    </div>
</body>
</html>