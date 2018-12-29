
 <%@page import="com.MyRLDemo.dao.UserDao"%>
<jsp:useBean id="u" class="com.MyRLDemo.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>


<%
 int status =UserDao.save(u);
if(status>0){
	out.print("User registered Successfully");
}else{
	out.print("There is problem while registering the user");
}
%>
 





































<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" " https://106.51.2.179:8087/svn/omsaishiksha/">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OM SAI SHIKSHA HIGH TECH COACHING ACADEMY PVT LTD</title>
</head>
<body>
<%@ page import ="java.sql.*" %>
<%@ page impor="javax.sql*"%>
<%
String name=request.getParameter("name");
session.putValue("name",name);
String age=request.getParameter("age");
String Address=request.getParameter("Address");
String contact_number=request.getParameter("contact_number");
String fathers_name=request.getParameter("fathers_name");
String occupation=request.getParameter("occupation");
String tamil=request.getParameter("tamil");
String english=request.getParameter("english");
String maths=request.getParameter("maths");
String science=request.getParameter("science");
String social=request.getParameter("social");
String Academic_Qualifications=request.getParameter("Academic_Qualifications");
String Economical_Status=request.getParameter("Economical_Status");
String Previous_Government_or_Private_Exams_Appeared=request.getParameter("Previous_Government_or_Private_Exams_Appeared");
String Marks_Scored_in_the_Exams_Appeared=request.getParameter("Marks_Scored_in_the_Exams_Appeared");
String Area_of_Interest=request.getParameter("Area_of_Interest");
String Previous_Working_Experience=request.getParameter("Previous_Working_Experience");
String Last_Salary_Drawn=request.getParameter("Last_Salary_Drawn");
String Are_you_a_Physically_Challenged_Person=request.getParameter("Are_you_a_Physically_Challenged_Person");
String Are_you_an_Ex_servicemen=request.getParameter("Are_you_an_Ex_servicemen");
String Have_you_registered_your_Qualifications_in_Employment_Office=request.getParameter("Have_you_registered_your_Qualifications_in_Employment_Office");
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","root","root");
Statement st=con.createStatement();
ResultSet rs;
int i=st.executeUpdate("insert into users values('"+name+"','"+age+"','"+Address+"','"+contact_number+"','"+fathers_name+"','"+occupation+"','"+tamil+"','"+english+"','"+maths+"','"+science+"','"+social+"','"+Academic_Qualifications+"','"+Economical_Status+"','"+Previous_Government_or_Private_Exams_Appeared+"','"+Marks_Scored_in_the_Exams_Appeared+"','"+Area_of_Interest+"','"+Previous_Working_Experience+"','"+Last_Salary_Drawn+"','"+Are_you_a_Physically_Challenged_Person+"','"+Are_you_an_Ex_servicemen+"','"+Have_you_registered_your_Qualifications_in_Employment_Office+"')");
out.print("Registered");
%>
<a href="index.html">Home</a>
<a href="login.html">Login</a>
</body>
</html>






 --%>



















<%-- <%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>

<%


    Connection con=null;

    try{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","root","root");
        System.out.println("Connection successful");
        out.println("Connection successful");
    }
    catch(Exception e){
        System.out.println("Connection failed");
    }

    out.println("Loged in, connected to the DB");
%>

<a href= "index.html">Home</a>
</body>
</html> --%>






























<%-- <%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-aquiv="content-Type"content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Connection con=null;
try{
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","root","root");
			if(con!=null){
				out.print("connected successfully to database");
			}
}
			catch(Exception e){
				out.print("Not connected to database");
}
%>
</body>
</html> --%>