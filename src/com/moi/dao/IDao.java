/**
 * 
 */
package com.moi.dao;

import com.moi.Categorie;

/**
 * @author moi
 *
 */
public interface IDao {

	public void Store(Categorie c);
	public void delete(Long id);
	public Categorie findById(Long id);
	
	
}
