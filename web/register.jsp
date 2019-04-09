<%--
  Created by IntelliJ IDEA.
  User: HOANG SON
  Date: 3/22/2019
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>Register</title>
</head>
<body>
<form action="/register" method="post">
<div class="container register-form">
    <div class="form" >
        <div class="note">
            <p>Register</p>
        </div>

        <div class="form-content">
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <input type="text" class="form-control"  name="username" placeholder="Username" value=""/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="fullname" placeholder="FullName" value=""/>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <input type="password" class="form-control" name="password" placeholder="Your Password *" value=""/>
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" name="email" placeholder="Email: *" value=""/>
                    </div>
                </div>
            </div>
            <button type="submit" class="btnSubmit">Submit</button>
        </div>
    </div>
</div>
</form>
</body>
</html>
