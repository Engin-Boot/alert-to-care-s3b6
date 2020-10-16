package com.philips.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.philips.entity.Patient;

@Repository
@Transactional
public class PatientDao implements IPatientDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean addPatient(Patient patient) {
		em.persist(patient);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> viewPatient() {
		String jpql = "from Patient";
		Query qry = em.createQuery(jpql);
		return qry.getResultList();
	}

	@Override
	public Patient viewPatient(int pid) {
		Patient p=em.find(Patient.class,pid);
		return p;
	}

	@Override
	public boolean editPatient(Patient patient) {
		em.merge(patient);
		return true;
	}

	@Override
	public boolean removePatient(Patient patient) {
		em.remove(patient);
		return true;
	}

}
