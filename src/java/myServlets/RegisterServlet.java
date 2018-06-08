/*h
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myServlets;

import Beans.RegisterBean;
import DbConnection.DbOperation;
import Email.Mailer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.io.*;
import java.util.Properties; 


/**
 *
 * @author Rajat
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
public class RegisterServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, MessagingException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           String FirstName,LastName,email,mobno,password;
              FirstName=request.getParameter("firstname");
                  LastName=request.getParameter("lastname");
                    email=request.getParameter("email");
                       mobno=request.getParameter("mobno");
                         password=request.getParameter("Password");
                     RegisterBean rgb=new RegisterBean();
                       DbOperation dbo=new DbOperation();
                         rgb.setFirstname(FirstName);
                           rgb.setLastname(LastName);
                             rgb.setEmail(email);
                               rgb.setMobno(mobno);
                                rgb.setPassword(password);
                                  int row=dbo.register(rgb);
                                    if(row>0){
                                        out.println("Registration Sucessfull");
                                          String msg="You are Successfully Registered";
                                            String subject="sign Up";
                                    Email.Mailer.send(email, subject, msg);
                                           
                                        
                                    }
                                    else{
                                        out.println("you are not registerd");
                                    }
                
           
           
        } 
        
        finally{
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
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (MessagingException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
