
package Email;



import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class Mailer {
  \
      public static void send(String to,String subject,String msg) throws MessagingException {
        final String user="rajatkokila96@gmail.com";
         final String pass="57578352";
          String host="localhost";
            Properties prop=new Properties();
              prop.setProperty("mail.smtp.host",host);
              prop.put("mail.smtp.host","smtp.gmail.com");
                  prop.put("mail.smtp.socketFactory.port", "465"); 
                        prop.put("mail.smtp.socketFactory.class",    
                   "javax.net.ssl.SSLSocketFactory"); 
                        
                prop.put("mail.smtp.auth","true");
                 prop.put("mail.smtp.port", "465");
                  Session ses=Session.getDefaultInstance(prop,new javax.mail.Authenticator() {
            @Override
                      protected PasswordAuthentication getPasswordAuthentication(){
                          return new PasswordAuthentication(user, pass);
                      }
});
                    try{
                   MimeMessage message=new MimeMessage(ses);
                     message.setFrom(new InternetAddress(user));
                       message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                         message.setSubject(subject);
                           message.setText(msg);
                             Transport.send(message);
                             System.out.println("Send sucessfully");
                    }
                      catch(MessagingException e){
                          throw new RuntimeException(e);
                          
                      }
                           
                     
        
        
    }
}

