
<%@include file="header.jspf" %>
 <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Sign Up</h2>
                    <hr class="star-light">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <form action="RegisterServlet" method="post">
                        <div class="form-group">
                            <label class="text">Frist Nmae</label>
                            <input type="text" class="form-control" name="firstname" id="name" placeholder="Enter First Nmae here" required>
                        </div>
                        <div class="form-group">
                           <label class="text">Last Nmae</label>
                           <input type="text" class="form-control" name="lastname" id="name" placeholder="Enter Last Nmae here" required>
                        </div>
                            
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
    </div>
                <div class="form-group">
                           <label class="text">Mobno.</label>
                           <input type="text" class="form-control" id="phone" name="mobno" placeholder="Enter Mobno." required>
                        </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pwd" required>
    </div>
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
                
                </div>
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <button type="submit" class="btn btn-primary">
                        <i class="fa fa-bolt fa-spin fa-3x fa-fw"></i>
<span class="sr-only">Loading...</span> SignUp
                    </button>
                    <div class="col-lg-4 col-lg-offset-2" >
                       <h4>Already have an Account Click on Sign</h4>
                       <a href="index.jsp">Login</a>
                    </div>
                </div>
            </div>
</form>
    </div>
    </section>

    

<%@include file="footer.jspf" %>