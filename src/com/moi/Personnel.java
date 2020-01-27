package com.moi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Personnel {

	IFiliere ifiliere;
	
	

	@Autowired
	public Personnel(IFiliere ifiliere) {
		super();
		this.ifiliere = ifiliere;
	}

	/**
	 * @return the ifiliere
	 */
	public IFiliere getIfiliere() {
		return ifiliere;
	}

	/**
	 * @param ifiliere the ifiliere to set
	 */
	public void setIfiliere(IFiliere ifiliere) {
		this.ifiliere = ifiliere;
	}
	
	public void affiche()
	{
		System.out.println( ifiliere.display());
	}
}
