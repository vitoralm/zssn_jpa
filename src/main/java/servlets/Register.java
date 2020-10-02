package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.LocationController;
import controller.SurvivorController;

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
		
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String sexo = request.getParameter("genero");
		String ultimaLatitude = request.getParameter("latitude");
		String ultimaLongitude = request.getParameter("longitude");

		SurvivorController survivorController = new SurvivorController();
		PrintWriter writer = response.getWriter();
		try {
			survivorController.insert(nome, Integer.parseInt(idade), sexo, Double.parseDouble(ultimaLatitude), Double.parseDouble(ultimaLongitude));
		} catch (Exception e) {
			e.getMessage();
			writer.printf("Erro ao cadastrar sobrevivente! =(");
		} finally {
			survivorController.close();
			writer.printf("Sobrevivente cadastrado com sucesso! =)");
			writer.printf("<a href='index.jsp'>Voltar para o início</a>");
		}
		writer.close();
		
	}

}
