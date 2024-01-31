package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.LibroBean;
import service.LibroService;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
        String autore = request.getParameter("autore");
        LibroService libroService = new LibroService();
        
        List<LibroBean> libriSecondoEs = libroService.secondQueryExam(autore);
        
        request.setAttribute("risultato", libriSecondoEs);
        
        RequestDispatcher rd = request.getRequestDispatcher("/es2.jsp");
        rd.forward(request, response);
        
        
        }
    
}
