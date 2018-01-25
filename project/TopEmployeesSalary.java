package com.adp.assignment;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TopEmployeesSalary {
  public static void main(String args[]) {
    Configuration configuration = new Configuration();
    configuration.setQuery("select salary from employees order by SALARY desc limit" + args[0]);
    configuration.setConnectionURL("jdbc:mysql://localhost:8082");
    configuration.setUserName("adp");
    configuration.setPassword("india");
    JDBCConnection jDBCConnection = new JDBCConnection();
    ResultSet result = jDBCConnection.getEmployeesSalary(configuration);
    try {
      while (result.next()) {
        System.out.println(result.getInt(1) + " " + result.getString("1") + "" + result.getInt(1));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
