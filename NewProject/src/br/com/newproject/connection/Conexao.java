package br.com.newproject.connection;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.newproject.model.Categoria;
import br.com.newproject.model.Operador;
import br.com.newproject.model.Produto;
import br.com.newproject.model.Tipo;

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
	
	public static List<Tipo> listarTipo() {
		
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Tipo");
		
		List<Tipo> tipos = query.getResultList();
        return tipos;
	}
	
	public static List<Categoria> listarCateg() {
		
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Categoria");
		
		List<Categoria> categs = query.getResultList();
        return categs;
	}
	
	public static List<Operador> listarOpe() {
		
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("FROM Operador");
		
		List<Operador> opers = query.getResultList();
        return opers;
	}
}
