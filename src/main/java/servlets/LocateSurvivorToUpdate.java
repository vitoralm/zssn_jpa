package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.SurvivorController;
import model.Survivor;

/**
 * Servlet implementation class LocateSurvivorToUpdate
 */
public class LocateSurvivorToUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocateSurvivorToUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		SurvivorController survivorController = new SurvivorController();
		
		Survivor survivor = survivorController.getSurvivorById(id);
		
		String resourceRedirect = buildResourceRedirect("registerSurvivor.jsp", survivor);
		response.sendRedirect(resourceRedirect);
		
	}
	
	private String buildResourceRedirect(String resourceFileName, Survivor survivor) {
		
		StringBuilder resourceRedirect = new StringBuilder();
		resourceRedirect.append(resourceFileName)
						.append("?id=")
		                .append(survivor.getId())
		                .append("&name=")
		                .append(survivor.getName())
		                .append("&age=")
		                .append(survivor.getAge())
		                .append("&gender=")
		                .append(survivor.getGender())
		                .append("&lat=")
		                .append(survivor.getLastLocation().getLatitude())
		                .append("&long=")
		                .append(survivor.getLastLocation().getLongitude());
		
		return resourceRedirect.toString();
		
	}

}
