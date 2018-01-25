package com.adp.assignment;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateEmploye {
  public static void main(String args[]) {
    String sql = "update emp_profile set designation='Senior'";
    Configuration configuration = new Configuration();
    configuration.setQuery(sql);
    configuration.setConnectionURL("jdbc:mysql://localhost:8082");
    configuration.setUserName("adp");
    configuration.setPassword("india");
    JDBCConnection jDBCConnection=new JDBCConnection();
    ResultSet result=jDBCConnection.getEmployeesSalary(configuration);
    try {
      while (result.next()) {
        System.out.println(result.getInt(1) + " " + result.getString("1") );
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
