package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.objects.User;

@Transactional
@Repository
public class UserDAO implements IUserDAO {
    
	@PersistenceContext	
	private EntityManager entityManager;	
	
	@Override
	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql = "FROM User as usr ORDER BY usr.id";
		return (List<User>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
		
	}

	@Override
	public void updateUser(User user) {
		User usr = getUserById(user.getId());
		usr.setFrist_name(user.getFrist_name());
		usr.setLast_name(user.getLast_name());
		entityManager.flush();
	}

	@Override
	public void deleteUser(int id) {
		entityManager.remove(getUserById(id));	
	}

	@Override
	public boolean userExists(String frist_name, String last_name, String email_id) {
		String hql = "FROM User as usr WHERE usr.frist_name = ? and usr.last_name = ? and usr.email_id = ?";
		int count = entityManager.createQuery(hql).setParameter(1, frist_name).setParameter(2, last_name).setParameter(3, email_id).getResultList().size();
	return count > 0 ? true : false;
	}

}