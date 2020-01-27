/**
 * 
 */
package com.entities.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entities.Account;

/**
 * @author moi
 *
 */
public class AccountManager implements IDao<Account, Long>{

	SessionFactory sf;

	/**
	 * @return the sf
	 */
	public SessionFactory getSf() {
		return sf;
	}

	/**
	 * @param sf the sf to set
	 */
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void store(Account t) {
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(t);
		ses.getTransaction().commit();
		ses.close();
		
	}

	@Override
	public Account findById(Long k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> all() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
