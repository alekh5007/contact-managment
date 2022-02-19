
<%@page import="com.learn.entities.Message"%>
<% 
 Message msg=(Message)session.getAttribute("msg");

if(msg !=null){
%>

<div class="alert text-center alert-<%=msg.getMessageType() %>" role="alert">
<%=msg.getMessageContent() %>
</div>
<% 
session.removeAttribute("msg");
}
%>