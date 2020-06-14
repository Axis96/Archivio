package it.dstech.gestione;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.List;

import javax.persistence.TypedQuery;

import it.dstech.modelli.Persona;
import it.dstech.modelli.Utente;

public class Controller {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("emf");
	private static EntityManager em = emf.createEntityManager();

	public void close() {
		em.close();
	}
	
	public void salvaPersona(String nome, String cognome, String numero) throws IOException {
		
		Persona persona = new Persona( nome, cognome, numero);
		em.getTransaction().begin();
		em.persist(persona);
		em.getTransaction().commit();

	}
	
	
	public List<Persona> getListaPersona() {
		TypedQuery<Persona> query = em.createQuery("select u from archivio u", Persona.class);
		return query.getResultList();
	}

}
