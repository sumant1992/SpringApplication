package in.sumant.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.sumant.dao.EmployeeDAO;
import in.sumant.dao.EmployeeDAOImpl;
import in.sumant.model.Employee;

public class EmployeeController extends HttpServlet {
		
		private static final long serialVersionUID = 1L;
		
		RequestDispatcher dispatcher = null;
		EmployeeDAO employeeDAO = null;
		
		public EmployeeController() {
			employeeDAO = new EmployeeDAOImpl();
		}
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			
		// call dao method to get list of employee
			List<Employee> list = employeeDAO.get();
			
		// add the employee to the list object
			request.setAttribute("list",list);
		//get the dispatcher servlet
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/employee-list.jsp");
		//forward the request
	    dispatcher.forward(request, response);
			
			

			
}
}
