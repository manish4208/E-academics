
<%@include file="header.jspf" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Login Page</title>        
    </head>
    <body>
        <fieldset  style="color: green; border: 2;">
           <div class='view-school'>
      <div class="gray-layout">
  <div class="container on-a-school-layout">
    <div class="row">
      <div class="col-lg-6 col-lg-offset-3 col-sm-8 col-sm-offset-2 text-center">
        <div class="content-box">
            <h1 class="text-center">
    Log In Programming Hub
  </h1>

          <div class="row">
  <div class="col-sm-10 col-sm-offset-1">
    <form class="new_user" id="new_user" action="LoginServlet" accept-charset="UTF-8" method="post"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="CCbekl7BHEd9BaX4DNGIHmHc1fZ3QNNbKMJgjZFIimvIO4DFAHcJJrntNrZcAsSleTqT+zXhCfsHQePJrXBgTw==" />
      <input value="1086" type="hidden" name="user[school_id]" id="user_school_id" />
      <div class="form-group">
          <label class="control-label" for="user_email" style="text-decoration: blink;color: green;">Email Address</label>
        <div class="control-input">
          <input autofocus="autofocus" class="form-control input-hg" type="email" value="" name="email" id="user_email" />
        </div>
      </div>
      <div class="form-group">
        <label class="control-label" for="user_password">Password</label>
        <div class="control-input">
          <input autocomplete="off" class="form-control input-hg" type="password" name="password" id="user_password" />
        </div>
      </div>
      <br>
      <div class="form-group text-center">
        <input type="submit" name="commit" value="Log In" class="btn btn-primary btn-md login-button" />
      </div>
      <br>
      <center>
        <a class="link-below-button" href="/secure/1086/users/password/new">Forgot Password?</a>
      </center>
</form>  </div>
</div>

  <div class="box-footer">
    <a class="box-half" href="signup.jsp"><img src="https://www.filepicker.io/api/file/jHidvPDcRTWcZZjmxJvc" alt="Jhidvpdcrtwczzjmxjvc" />Sign Up</a>
    <a class="box-half teachable-branded" href="/secure/teachable_accounts/sign_in?flow_school_id=1086"><img src="https://d2oz8i5n9se8ej.cloudfront.net/assets/teachable-icon-green-915a054a0b8a7fe8981bcbbf1a3d7d177e8b016502cb0e2dbfacd39ed75845cf.svg" alt="Teachable icon green" />Log In with myTeachable</a>
  </div>

        </div>
      </div>
    </div>
  </div>
</div>
        </fieldset>
    </body>
<%@include file="footer.jspf" %>
