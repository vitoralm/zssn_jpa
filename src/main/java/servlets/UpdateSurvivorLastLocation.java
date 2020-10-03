package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.SurvivorController;
import model.Survivor;

/**
 * Servlet implementation class UpdateSurvivorLastLocation
 */
public class UpdateSurvivorLastLocation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSurvivorLastLocation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("idsurvivor");
		String latitude = request.getParameter("latitude");
		String longitude = request.getParameter("longitude");
		
		SurvivorController survivorController = new SurvivorController();
		PrintWriter writer = response.getWriter();
		
		try {
			survivorController.updateSurvivorLastLocationById(Integer.parseInt(id), Double.parseDouble(latitude), Double.parseDouble(longitude));
		} catch (Exception e) {
			e.getMessage();
		} finally {
			survivorController.close();
			writer.printf("<a href='index.jsp'>Voltar para o início</a>");
		}
		writer.close();
		
	}

}
