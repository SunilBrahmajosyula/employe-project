package com.adp.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

  public ResultSet getEmployeesSalary(Configuration configuration) {
    return jDBCConnection(configuration);
  }

  public ResultSet jDBCConnection(Configuration configuration) {

    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection connection = DriverManager.getConnection(configuration.getConnectionURL(), configuration.getUserName(), configuration.getPassword());
      Statement statement = connection.createStatement();
      ResultSet result = statement.executeQuery(configuration.getQuery());
      connection.close();
      return result;
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    return null;
  }

}
