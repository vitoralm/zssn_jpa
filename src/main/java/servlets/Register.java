package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.LocationController;
import controller.SurvivorController;
import model.Survivor;

/**
 * Servlet implementation class Cadastrar
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String lastLatitude = request.getParameter("latitude");
		String lastLongitude = request.getParameter("longitude");

		SurvivorController survivorController = new SurvivorController();
		PrintWriter writer = response.getWriter();
		
		if (id == "" || id == null) {
			
			try {
				survivorController.insert(name, Integer.parseInt(age), gender, Double.parseDouble(lastLatitude), Double.parseDouble(lastLongitude));
			} catch (Exception e) {
				e.getMessage();
				writer.printf("Erro ao cadastrar sobrevivente! =(");
			} finally {
				survivorController.close();
				writer.printf("<a href='index.jsp'>Voltar para o início</a>");
			}
			
		} else {
			Survivor survivor = survivorController.getSurvivorById(Integer.parseInt(id));
			survivor.setName(name);
			survivor.setAge(Integer.parseInt(age));
			survivor.setGender(gender);
			
			try {
				survivorController.mergeSurvivor(survivor);
				survivorController.updateSurvivorLastLocationById(survivor.getId(), Double.parseDouble(lastLatitude), Double.parseDouble(lastLongitude));
			} catch (Exception e) {
				e.getMessage();
				writer.printf("Erro ao atualizar sobrevivente! =(");
			} finally {
				survivorController.close();
				writer.printf("<a href='index.jsp'>Voltar para o início</a>");
			}
			
		}
		
		writer.close();
		
	}

}
