package it.dstech.gestione;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/Homepage")
public class AggiungiPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Controller gestione = new Controller();
		HttpSession session = req.getSession();
		
		salvaPersona(req.getAttribute("nome"),req.getAttribute("cognome"), req.getAttribute("numero"));
		req.setAttribute("lista", gestione.getListaPersona());

		req.getRequestDispatcher("Homepage.jsp").forward(req, resp);
	}
}

