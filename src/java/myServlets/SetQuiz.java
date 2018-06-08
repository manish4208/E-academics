
package myServlets;

import Beans.QuizBean;
import DbConnection.QuizOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SetQuiz", urlPatterns = {"/SetQuiz"})
public class SetQuiz extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
               String question=request.getParameter("question");
                   String rightanswer=request.getParameter("canswer");
                      String wronganswer1=request.getParameter("wanswer1");
                         String wronganswer2=request.getParameter("wanswer2");
                            String wronganswer3=request.getParameter("wanswer3");
                               String coursecode=request.getParameter("courseid");
                                 int courseid=Integer.parseInt(coursecode);
                                        QuizBean quizb=new QuizBean();
                                         QuizOperation quizop=new QuizOperation();
                                           int quesid=quizop.getQuesid();
                                            quizb.setQuestion(question);
                                              quizb.setRightanswer(rightanswer);
                                                quizb.setWrongansw1(wronganswer1);
                                                  quizb.setWrongansw2(wronganswer2);
                                                    quizb.setWrongansw3(wronganswer3);
                                                       quizb.setCourseid(courseid);
                                                          quizb.setQuesid(quesid);
                                                         boolean status=quizop.SetQuiz(quizb);
                                                    if(status){
                                                        response.sendRedirect("addquiz.jsp");
                                                    }
                                                    else{
                                                        response.sendRedirect("Error.jsp.jsp");
                                                    }
                                                   
                                         
                                         
                                         
                                         
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
