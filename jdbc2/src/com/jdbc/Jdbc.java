package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="root@123";
		Connection con=null;
		PreparedStatement ps=null;
		Statement st=null;
			try {
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter ID");
				int id=sc.nextInt();
				Class.forName("com.mysql.cj.jdbc.Driver");
				 con = DriverManager.getConnection(url,username,password);
				 st= con.createStatement();
				 String query="ALTER TABLE student ADD email VARCHAR(100)";
				 try {
					 st.executeUpdate(query);
					 System.out.println("email added ");
					 }catch(SQLException e){
						 System.out.println("email already exist added");
					 }
		            String query2 ="INSERT INTO student (id,name,age,email) VALUES"+" (101,'Sonal',21,'sonal123')";
		            st.executeUpdate(query2);
				 ps=con.prepareStatement("SELECT * FROM STUDENT WHERE ID=?");
				 ps.setInt(1, id);
				 ResultSet rs=ps.executeQuery();
				 while(rs.next()) {
					 System.out.println(
							 rs.getInt("id") + " " +
				             rs.getString("name") + " " +
				             rs.getInt("age") +" "+
				             rs.getString("email"));
				 
			}}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		// TODO Auto-generated method stub

	}
}
