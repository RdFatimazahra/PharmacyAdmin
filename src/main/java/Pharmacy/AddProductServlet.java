package Pharmacy;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AddProductServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
}


/*
* protected void doPost(HttpServletRequest request, HttpServletResponse
* response) throws ServletException, IOException { // TODO Auto-generated
* method stub doGet(request, response); }
*/

}
