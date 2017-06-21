package jp.co.comnic.javalesson.dog_house.dao;

import jp.co.comnic.javalesson.dog_house.entity.Book;

public class BookDao extends BaseDao {
	
	
	public Book  findById(Integer id){
		return super.findById(Book.class, id);
		
	} 
	
}
