package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entities.Vol;

public class VolDao {
	
	public static void creationDeVol(Vol vol) {		
		DatabaseHelper.createCommitClose(vol);
	}
	
	public static List<Vol> listeDesVols() {
		EntityManager em = DatabaseHelper.createEntityManager();
		
		List<Vol> vols = new ArrayList<Vol>();
		TypedQuery<Vol> query = em.createQuery("select v from Vol v", Vol.class);
		vols = query.getResultList();
		return vols;
	}
	
	public static Vol rechercherUnAvion(String num) {
		EntityManager em = DatabaseHelper.createEntityManager();
		TypedQuery<Vol> query = em.createQuery("select v from Vol v where u.num = :id", Vol.class);
		query.setParameter("id", num);
		return query.getSingleResult();
	}

}
