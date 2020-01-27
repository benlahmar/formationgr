/**
 * 
 */
package com.gr;

/**
 * @author moi
 * @param <T>
 * @param <K>
 *
 */
public interface IDao<T, K> {

	public void save(T t);
	public T finfById(K k);
	public void delete(K k);
}
