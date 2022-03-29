package com.careerit.iplstat.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.careerit.iplstat.util.ConnectionUtil;

public class Manager {
	public static void main(String[] args) {
		//addEmployee(1001,"Rajkumar",8983252);
		//deleteEmployee(1001);
//		showEmployees();
//		updateSalary(5);
//		showEmployees();
		System.out.println(Manager.class);
	}
	private static ConnectionUtil conUtil = ConnectionUtil.obj;
	private static void updateSalary(int per) {			
			String str = "UPDATE emp SET sal = sal + (sal * ? / 100)";
			Connection con = null;			
			PreparedStatement pst = null;
			try {
				con = conUtil.getConnection();
				pst = con.prepareStatement(str);
				pst.setFloat(1,per);
				int count = pst.executeUpdate();
				System.out.println(count + " record(s) updated");
			} catch (SQLException e) {
				System.out.println("While connecting with db: " + e);
			} finally {
				conUtil.close(pst, con);
			}
		
	}
	
	private static void deleteEmployee(int empno) {
			
			//Just change the SQL statement
			String str = "DELETE FROM emp WHERE empno=?";
			Connection con = null;
			
			PreparedStatement pst = null;
			try {
				con = conUtil.getConnection();
				pst = con.prepareStatement(str);
				pst.setInt(1, empno);	
				int count = pst.executeUpdate();
				System.out.println(count + " record(s) updated");
			} catch (SQLException e) {
				System.out.println("While connecting with db: " + e);
				// e.printStackTrace();
			} finally {
				conUtil.close(pst, con);
			}
		
	}
	private static void showEmployees() {
			String str = "SELECT empno, ename, sal from emp";
			Connection con = null;
			Statement statement = null;
			ResultSet rs = null;
			try {
				con = conUtil.getConnection();
				statement = con.createStatement();				
				rs = statement.executeQuery(str);
				while(rs.next()) {
					int empno = rs.getInt("empno");
					String name = rs.getString("ename");
					float sal = rs.getFloat("sal");
					System.out.println(empno + " " + name + " " + sal);
				}
			} catch (SQLException e) {
				System.out.println("While connecting with db: " + e);
				// e.printStackTrace();
			} finally {
				conUtil.close(rs, statement,con);
			
		}
	}
	
	private static void addEmployee(int empno, String name, float sal) {
			String str = "INSERT INTO emp(empno, ename, sal) VALUES (?,?,?)";
			Connection con = null;
			Statement statement = null;
			PreparedStatement pst = null;
			try {
				con = conUtil.getConnection();
				pst = con.prepareStatement(str);
				pst.setInt(1, empno);
				pst.setString(2, name);
				pst.setFloat(3, sal);
				int count = pst.executeUpdate();
				System.out.println(count + " record(s) updated");
			} catch (SQLException e) {
				System.out.println("While connecting with db: " + e);
				// e.printStackTrace();
			} finally {
				conUtil.close(pst, con);;
			}
		}
	

	private static void createTable() {
			String str = "create table emp(empno INT, ename VARCHAR(100), sal FLOAT);";
			Connection con = null;
			Statement statement = null;
			try {
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-video","root","dbuser");
//		Statement statement = connection.createStatement();
//		ResultSet resultSet = statement.executeQuery("select * from people");
//		while(resultSet.next()) {
//			System.out.println(resultSet.getString("firstname"));
//		}		

				// NEED DriverManager to conenct to database
				//con = DriverManager.getConnection(url, username, password);
			con = conUtil.getConnection();
				statement = con.createStatement();

//		ResultSet rs = statement.executeQuery("SELECT * FROM player");
//		statement.execute(str);
//		while(rs.next()) {
//			System.out.println(rs.getInt("pid") + " " + rs.getString("name") + rs.getString("role") + " " + rs.getDouble("price"));
//		}
				// rs.close();
				//
				boolean res = statement.execute(str);
				//con.close();
				System.out.println("Table creation status: " + res);
			} catch (SQLException e) {
				System.out.println("While connecting with db: " + e);
				// e.printStackTrace();
			} finally {
				conUtil.close(statement, con);
			}
		}
	
}

//import lombok.Builder;
//import lombok.Getter;
//import lombok.Setter;
//
//@Builder
//@Getter
//@Setter
//class Appointment{
//	private int id;
//	private String pname;
//	private String dname;
//	private String lname;
//	private String pmobile;
//	private String email;
//
//	/*
//	 * private Appointment(AppointmentBuilder appointmentBuilder) { this.id =
//	 * appointmentBuilder.id; this.pname = appointmentBuilder.pname; this.email =
//	 * appointmentBuilder.email; this.pname = appointmentBuilder.pname; this.dname =
//	 * appointmentBuilder.dname; this.lname = appointmentBuilder.lname; }
//	 * 
//	 * public static AppointmentBuilder builder() { return new AppointmentBuilder();
//	 * }
//	 * 
//	 * static class AppointmentBuilder{ private int id; private String pname;
//	 * private String dname; private String lname; private String pmobile; private
//	 * String email;
//	 * 
//	 * 
//	 * public AppointmentBuilder id(int id) { this.id = id; return this; } public
//	 * AppointmentBuilder pname(String pname) { this.pname = pname; return this; }
//	 * public AppointmentBuilder dname(String dname) { this.dname = dname; return
//	 * this; } public AppointmentBuilder lname(String lname) { this.lname = lname;
//	 * return this; } public AppointmentBuilder pmobile(String pmobile) {
//	 * this.pmobile = pmobile; return this; } public AppointmentBuilder email(String
//	 * email) { this.email = email; return this; } public Appointment build() {
//	 * return new Appointment(this); } }
//	 */
//
//
//}
//public class Manager {
//	public static void main(String[] args) {
//		Appointment app =  Appointment.builder()
//												.id(1001)
//												.pname("ABC")
//												.dname("XYZ")
//												.pmobile("999999")
//												.build();
//	}
//}
