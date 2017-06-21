package jp.co.comnic.javalesson.dog_house.dao;

import javax.persistence.NoResultException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import jp.co.comnic.javalesson.dog_house.entity.ACCOUNT;

public class AccountDao extends BaseDao {

	public AccountDao() throws DaoException{}
	private CriteriaQuery<ACCOUNT> query = builder.createQuery(ACCOUNT.class);
	private Root<ACCOUNT> root = query.from(ACCOUNT.class);
	
	public java.util.List<ACCOUNT> findAll(){
		return super.findAll(query, root);	
	}
	
	public ACCOUNT loginAuthenticate(String email, String password){
		
		ACCOUNT account = null;
		
		try {
			query.select(root)
				 .where(builder.equal(root.get("email"),email),
						 builder.equal(root.get("password"), password));
			
			account = em.createQuery(query).getSingleResult();
			
		} catch (NoResultException e) {
			// TODO: handle exception
		}
		
		return account;
		
	}
}
