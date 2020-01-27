package com.moi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.moi.Categorie;
import com.util.HibernateUtil;

public class CategorieManager implements IDao{

	SessionFactory sf;
	
	
	/**
	 * @param sf the sf to set
	 */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
	

	public CategorieManager() {
		sf=HibernateUtil.getSessionFactory();
	}



	@Override
	public void Store(Categorie c) {
		Session session = sf.openSession();
		Transaction tx = session.getTransaction();
		try {
		tx.begin();
		session.saveOrUpdate(c);
		tx.commit();
		} catch (RuntimeException e) {
		tx.rollback();
		throw e;
		} finally {
		session.close();
		}

		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Categorie findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
