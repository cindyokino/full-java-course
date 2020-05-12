package aplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {
	
	public static void main(String[] args) {
		
		Person p1 = new Person(null, "Carlos Silva", "carlos@gmail.com"); //id � null, pois o banco de dados vai gerar um
		Person p2 = new Person(null, "Ana Torres", "ana@gmail.com");
		Person p3 = new Person(null, "Maria Flores", "maria@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemple-jpa"); //instanciar EntityManagerFactory para criar EntityManager 
		EntityManager em = emf.createEntityManager(); //automaticamente obtem conexao com banco de dados e persistencia de dados implementada
		
		em.getTransaction().begin(); //para iniciar transacao com o banco de dados
		em.persist(p1); //pega o objeto (p1) e salva no banco de dados
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit(); //para confirmar as transacoes que eu fiz
	
		System.out.println("Ready!");
	}
}
