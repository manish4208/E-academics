<%@include file="dheader.jspf" %>
   <section class="success" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Add Course </h2>
                    <hr class="star-light">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <form action="AddCourse" method="post" enctype="multipart/form-data" >
                        <div class="form-group">
                            <label class="text">Course Name</label>
                            <input type="text" class="form-control" name="coursename" id="name" placeholder="Enter Course Name" required>
                        </div>
    <div class="form-group">
      <label for="email">Course Description</label>
      <input type="text" class="form-control" id="email" placeholder="Course Description" name="coursedescription" required>
    </div>
                <div class="form-group">
                           <label class="text">Course Image</label>
                           <input type="file" class="form-control" id="phone" name="courseimage" placeholder="Upload Image."required size="5000">
                        </div>
    <div class="form-group">
      <label for="pwd">Course Price</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter Course Price" name="courseprice" required>
    </div>
                          <div class="form-group">
      <label for="pwd">Course Duration</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter Course duration" name="courseduration" required>
    </div>
                           <div class="form-group">
      <label for="pwd">Course Id</label>
      <input type="number" class="form-control" id="pwd" placeholder="Enter course Id" name="courseid" required>
    </div>      
                           <div class="form-group">
      <label for="pwd">Category</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter Course category" name="coursecategory" required>
    </div>
    
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <button type="submit" class="btn btn-primary">
                        <i class="fa fa-circle-o-notch fa-spin fa-3x fa-fw"></i>
<span class="sr-only">Loading...</span> AddCourse Detail
                    </button>
                </div>
            </div>
</form>
        </div>
    </section>
<%@include file="footer.jspf" %>