package src.demo.ftmk.utem;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DataServlet
 */
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// Get link parameter
    			int paramValue =
    			Integer.parseInt(request.getParameter("param"));
    			// Get writer
    			PrintWriter writer = response.getWriter();
    			
    			// Get current date,tomorrow and yesterday date
    			LocalDate now = LocalDate.now();
    			LocalDate tomorrow = now.plusDays(1);
    			LocalDate yesterday = now.minusDays(1);
    			
    			if(paramValue == 0) {
    				
    				//diplay today's date
    				writer.println("Today is " + now.toString());
    			}
    			else if(paramValue == 1) {
    				
    				//display tomorrow's date
    				writer.println("Tomorrow is " + tomorrow.toString());
    			}
    			else {
    				
    				//display yesterday's date
    				writer.println("Yesterday is " + yesterday.toString());
    			}
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
