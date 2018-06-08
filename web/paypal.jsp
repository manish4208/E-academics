<%
//For accessing paypal:
//username:rajat.971@rediffmail.com
//password:rajat_10

//paypal personal account:rajat.971@rediffmail.com
//paypal personal account password:rajat_10



String s=(request.getParameter("courseprice").trim());
int totalamount=Integer.parseInt(s);
System.out.println(totalamount);
String coursename=request.getParameter("coursename");
String cmd="_xclick";
String business="rajat.971@rediffmail.com";
String Receiver_email="rajat.971-faacilitator@rediffmail.com";
String item_name=coursename;
String URL="https://www.sandbox.paypal.com/cgi-bin/webscr";

       double handling = 0;
      double  shipping = 0;
      String no_shipping="1";
      String return_url = "http://localhost:8084/Learning/paypal2.jsp";
      
    
      String cancel_url="http://localhost:8084/Learning/profile.jsp";
      String currency_code="INR";
      
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head >
    <title>Paypal payment</title>
</head> 
<body>
<%-- 10002--%>
<form name="paypalform" id="paypalform" action="<%= URL%>">
    <input type="hidden" name="cmd" value="<%= cmd%>"/>
    <input type="hidden" name="add" value="0"/>
   <%-- <input type="hidden" name="item_number" value="<%=Request.QueryString("orderid")%>"/>--%>
   <input type="hidden" name="receiver_email" value="<%= Receiver_email%>"/>
    <input type="hidden" name="business" value="<%=business%>"/>
    <input type="hidden" name="item_name" value="<%=item_name%> "/>
   <%-- <input type="hidden" name="shipping" value="<%=shipping %>" /> --%>
    <input type="hidden" name="handling" value="<%=handling %>" />
    <input type="hidden" name="add" value="0"/>  
    <input type="hidden" name="amount" value="<%= totalamount%>"/>
    <input type="hidden" name="shopping_url"  value="" />
   <input type="hidden" name="no_shipping" value="<%=no_shipping%>"/>
<%-- <input type="hidden" name="bn" value="PP-ShopCartBF:x-click-but22.gif:NonHosted">--%>
    <input type="hidden" name="return" value="<%= return_url%>"/>
    
  
    
    <input type="hidden" name="cancel_return" value="<%=cancel_url%>"/>
    <input type="hidden" name="currency_code" value="<%= currency_code%>"/>
    
 <input type="hidden" name="first_name" value="Rajat"/> 
 <input type="hidden" name="last_name" value="Pal"/> 
 <input type="hidden" name="address1" value="Vill-Dholra"/> 
 <input type="hidden" name="address2" value="Post-Budina Kalan"/>  
 <input type="hidden" name="city" value="Titavi    "/>
 <input type="hidden" name="state" value="Muzaffarnagar"/> 
 <input type="hidden" name="zip" value="251301"/> 
 <input type="hidden" name="night_phone_a" value="610"/>  
 <input type="hidden" name="night_phone_b" value="555"/> 
 <input type="hidden" name="night_phone_c" value="1234"/>
 <input type="hidden" name="email" value="rajat.971@rediffmail.com"/> 
  
    <script language="javascript">document.forms['paypalform'].submit();</script>
</form>
</body>
</html>
