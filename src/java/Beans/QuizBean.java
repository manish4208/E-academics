
package Beans;


public class QuizBean {
    
       String question,rightanswer,wrongansw1,wrongansw2,wrongansw3;
         int courseid,quesid;

    public int getQuesid() {
        return quesid;
    }

    public void setQuesid(int quesid) {
        this.quesid = quesid;
    }
                     
    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getRightanswer() {
        return rightanswer;
    }

    public void setRightanswer(String rightanswer) {
        this.rightanswer = rightanswer;
    }

    public String getWrongansw1() {
        return wrongansw1;
    }

    public void setWrongansw1(String wrongansw1) {
        this.wrongansw1 = wrongansw1;
    }

    public String getWrongansw2() {
        return wrongansw2;
    }

    public void setWrongansw2(String wrongansw2) {
        this.wrongansw2 = wrongansw2;
    }

    public String getWrongansw3() {
        return wrongansw3;
    }

    public void setWrongansw3(String wrongansw3) {
        this.wrongansw3 = wrongansw3;
    }
    
}
