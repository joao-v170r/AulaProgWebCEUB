package br.projetos.classe;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletGetPost
 */
@WebServlet("/ServletGetPost")
public class ServletGetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletGetPost() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		
		saida.write("<html><h1>Ola</h1><p> Resposta metodo Get</p>");
		saida.write("<h1>");
		saida.write("Seu nome: " + request.getParameter("nome"));
		saida.write("</h1>");
		saida.write("<html>");
		saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		
		saida.write("<html><h1>Ol�</h1><p> Resposta metodo Post</p><html>");
		
		saida.close();
	}

}
