package jp.co.comnic.javalesson.dog_house.dao;

import jp.co.comnic.javalesson.dog_house.entity.Category;

public class CategoryDao extends BaseDao {

	
	public Category findById(Integer id){
		
		return super.findById(Category.class, id);	
	}
}
