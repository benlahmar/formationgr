/**
 * 
 */
package com.gr;

/**
 * @author moi
 *
 */
public class Personne {

	Long id;
	String nom,prenom;
	
	Filiere filiere;
	
	/**
	 * @return the filiere
	 */
	public Filiere getFiliere() {
		return filiere;
	}
	/**
	 * @param filiere the filiere to set
	 */
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public void affiche()
	{
		filiere.display();
	}
	
}
