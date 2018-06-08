
package Beans;


public class UploadBean {
    String coursename,videoupload,pdfupload,videodescription,pdfdescription,url;
      int pdfid,videoid;

    public int getVideoid() {
        return videoid;
    }

    public void setVideoid(int videoid) {
        this.videoid = videoid;
    }

    public int getPdfid() {
        return pdfid;
    }

    public void setPdfid(int pdfid) {
        this.pdfid = pdfid;
    }
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getPdfdescription() {
        return pdfdescription;
    }

    public void setPdfdescription(String pdfdescription) {
        this.pdfdescription = pdfdescription;
    }

    public String getPdfupload() {
        return pdfupload;
    }

    public void setPdfupload(String pdfupload) {
        this.pdfupload = pdfupload;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVideodescription() {
        return videodescription;
    }

    public void setVideodescription(String videodescription) {
        this.videodescription = videodescription;
    }

    public String getVideoupload() {
        return videoupload;
    }

    public void setVideoupload(String videoupload) {
        this.videoupload = videoupload;
    }
     int courseid;
}
