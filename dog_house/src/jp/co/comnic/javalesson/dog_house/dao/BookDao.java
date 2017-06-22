package jp.co.comnic.javalesson.dog_house.dao;


import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import jp.co.comnic.javalesson.dog_house.entity.Book;

public class BookDao extends BaseDao  {
	
	CriteriaQuery<Book> queryForBook =  builder.createQuery(Book.class);
	Root<Book> bookroot = queryForBook.from(Book.class);
	Integer categoryId;
	private Book book;
	
	
	public Book  findById(Integer id){
		return super.findById(Book.class, id);
	} 
	
	public  Book findByCategoryId(Integer id){
		

//		queryForBook.select(bookroot).where(categoryId = id);
		
		
		book = em.createQuery(queryForBook.select(bookroot))
				.getSingleResult();

		
	
				
		
		return book;
		
		
		
	}
	
}
