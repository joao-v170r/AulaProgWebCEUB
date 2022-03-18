package br.projetos.classe;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDataHora
 */
@WebServlet("/ServletDataHora")
public class ServletDataHora extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDataHora() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	log("A servlet iniciou em: "+ format.format(new Date()));
    	super.init();
    	
    }
    
    //Identifica se tem que chamar o doGet doPost
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(req, resp);
    }		

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter saida = resp.getWriter();
		
		saida.write("<html><h1>Olá</h1><p>A data é hora atual é" + format.format(new Date()) + "</p><html>");
		
		saida.close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	
}
