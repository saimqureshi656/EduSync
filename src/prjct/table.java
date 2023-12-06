
package prjct;

import java.sql.*;
import javax.swing.JOptionPane;

public class table {
public static void main(String[] args){

Connection con=null;
Statement st=null;
try
{
con=ConnectionProvider.getcon();
st=con.createStatement();
//st.executeUpdate("create table users(name varchar(200),email varchar(200),password varchar(200),securityquestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
//st.executeUpdate("create table courses((Course_Name varchar(200),Course_Category varchar(200),Course_Description varchar(500),Course_Duration varchar(100),Course_Link varchar(200))");

//st.executeUpdate("create table student(StudentID int(200),CourseID int(200),Course_Name varchar(200),First_name varchar(200),Last_name varchar(200),Stud_Email varchar(200), Gender varchar (200),Quailification varchar(200))");
st.executeUpdate("create table courses(CourseID int(100),Course_Name varchar(200) ,Course_Category varchar(200),Course_Description varchar(500),Course_Duration varchar(100),Course_Link varchar(200))");

//st.executeUpdate("create table product(ID int AUTO_INCREMENT primary Key,Name varchar(200),Category varchar(200),Price varchar(200))");
//st.executeUpdate("create table room(roomno varchar(200),roomtype varchar(200),bed varchar(100),Price varchar(200),status varchar(50))");

JOptionPane.showMessageDialog(null, "table created sucessfully");

}
catch(Exception e)      
{
    JOptionPane.showMessageDialog(null, e);
}


finally
{
try
{
    con.close();
    st.close();
}
catch(Exception e)      
{}

}

}    
}
