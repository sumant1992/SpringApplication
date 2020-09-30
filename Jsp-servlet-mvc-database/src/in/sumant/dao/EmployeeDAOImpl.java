package in.sumant.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import in.sumant.DBConnectionUtil.DBConnectionUtil;
import in.sumant.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO 
{

	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	
      @Override
		public List<Employee> get() {
    	  
    	 List<Employee> list = null;
  		Employee employee = null;
  		
  		try {
  			
  			list = new ArrayList<Employee>();
  			String sql = "SELECT * FROM tbl_employee";
  			connection = DBConnectionUtil.openConnection();
  			statement = connection.createStatement();
  			resultSet = statement.executeQuery(sql);
  			while(resultSet.next()) {
  				employee = new Employee();
  				employee.setName(resultSet.getString("name"));
  				employee.setDepartment(resultSet.getString("department"));
  				employee.setDob(resultSet.getString("dob"));
  				list.add(employee);
  			}
  		}catch(SQLException e) {
  			e.printStackTrace();
  		}
  		return list;
  	
		
     
  	

      }
}
	
	
	
	

