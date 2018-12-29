package com.MyRLDemo.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.MyRLDemo.bean.*;
public class UserDao {
public static Connection getConnection() {
	Connection con = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tbleuser","root","root");
	}
	catch(Exception e) {
		System.out.print(e);
	}
	return con;
}
public static int save(User u) {
	int status=0;
	try {
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("	insert into tableuser(Name,Age,Address,Contact_Number,Fathers_Name,Occupation,Tamil,English,Maths,Science,Social,Marks_Scored_in_HSC,Academic_Qualifications,Economical_Status,Social_Status,Previous_Government_or_Private_Exams_Appeared,Marks_Scored_in_the_Exams_Appeared,Areas_of_Interest,Previous_Working_Experience,Last_Salary_Drawn,Are_you_a_Physically_Challenged_Person, Are_you_a_Widow_or_Divorced_Person,Are_you_an_Ex_servicemen,Have_you_registered_your_Qualifications_in_Employment_Office)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	ps.setString(1, u.getName());
	ps.setInt(2, u.getAge());
	ps.setString(3, u.getAddress());
	ps.setInt(4, u.getContact_Number());
	ps.setString(5, u.getFathers_Name());
	ps.setString(6, u.getOccupation());
	ps.setInt(7, u.getTamil());
	ps.setInt(8, u.getEnglish());
	ps.setInt(9, u.getMaths());
	ps.setInt(10, u.getScience());
	ps.setInt(11, u.getSocial());
	ps.setInt(12, u.getMarks_Scored_in_HSC());
	ps.setString(13, u.getAcademic_Qualifications());
	ps.setString(14, u.getEconomical_Status());
	ps.setString(15, u.getSocial_Status());
	ps.setString(16, u.getPrevious_Government_or_Private_Exams_Appeared());
	ps.setString(17, u.getMarks_Scored_in_the_Exams_Appeared());
	ps.setString(18, u.getAreas_of_Interest());
	ps.setString(19, u.getPrevious_Working_Experience());
	ps.setString(20, u.getLast_Salary_Drawn());
	ps.setString(21, u.getAre_you_a_Physically_Challenged_Person());
	ps.setString(22, u.getAre_you_a_Widow_or_Divorced_Person());
	ps.setString(23, u.getAre_you_an_Ex_servicemen());
	ps.setString(24, u.getHave_you_registered_your_Qualifications_in_Employment_Office());
	


status=ps.executeUpdate();

con.close();
	}
	catch(Exception e) {
		System.out.print(e);
	}
	return status;
}
}
/*public static boolean isAutheticate(User u) {
	boolean isValid=false;
	try {
		Connection con =getConnection();
	}
		catch(Exception e) {
			System.out.print(e);
		}
	return isValid;
	}
}
//isAutheticate(User u)
 
*/