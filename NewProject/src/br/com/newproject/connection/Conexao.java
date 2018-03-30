package br.com.newproject.connection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.newproject.model.Produto;

public class Conexao {
	
	public static EntityManagerFactory emf;
	
	public static void iniciarFabrica() {
		emf = Persistence.createEntityManagerFactory("teste"); 
	}
	
	public static void guardar(Object o) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(o);
		et.commit();
		em.close();
	}
	
	public static void remover(Object ob) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.remove(ob);
        et.commit();
        em.close();
	}
	
	public static List<Produto> listarProduto() {
		
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Produto");
		
		List<Produto> produtos = query.getResultList();
        return produtos;
	}
}
