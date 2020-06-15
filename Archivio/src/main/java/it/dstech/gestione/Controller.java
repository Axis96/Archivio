package it.dstech.gestione;

import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import it.dstech.modelli.Persona;


public class Controller {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("emf");
	private static EntityManager em = emf.createEntityManager();

	public void close() {
		em.close();
	}
	
	public void salvaPersona(Persona p) throws IOException {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

	}
	
	
	public List<Persona> getListaPersona(Persona p) {
		TypedQuery<Persona> query = em.createQuery("select p from archivio p", Persona.class);
		return query.getResultList();
	}
}
