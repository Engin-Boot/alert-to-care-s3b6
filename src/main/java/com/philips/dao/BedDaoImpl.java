package com.philips.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.philips.entity.Bed;

@Repository
@Transactional
public class BedDaoImpl implements IBedDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean addBed(Bed bed) {
		em.persist(bed);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bed> viewBed() {
		String jpql = "from Bed";
		Query qry = em.createQuery(jpql);
		return qry.getResultList();
	}

	@Override
	public Bed viewBed(int bid) {
		Bed bed = em.find(Bed.class, bid);
		return bed;
	}

	@Override
	public boolean editBed(Bed bed) {
		em.merge(bed);
		return true;
	}

	@Override
	public boolean removeBed(Bed bed) {
		em.remove(bed);
		return true;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Bed> alertBeds(){
		String jpql = "from Bed where alertStatus=:status";
		Query qry = em.createQuery(jpql);
		qry.setParameter("status", true);
		return qry.getResultList();
	}

}
