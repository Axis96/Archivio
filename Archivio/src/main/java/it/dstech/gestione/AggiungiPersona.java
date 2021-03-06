package it.dstech.gestione;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.dstech.modelli.Persona;

@WebServlet(urlPatterns = "/Homepage")
public class AggiungiPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Controller gestione = new Controller();
		HttpSession session = req.getSession();
		
		String nome= (String) req.getAttribute("nome");
		String cognome= (String) req.getAttribute("cognome");
		String numero= (String) req.getAttribute("numero");
		Persona persona = new Persona( nome, cognome, numero);
		
		gestione.salvaPersona(persona);
		req.setAttribute("lista", gestione.getListaPersona(persona));

		req.getRequestDispatcher("Homepage.jsp").forward(req, resp);
	}
}

