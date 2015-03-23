package com.vaannila.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.vaannila.domain.User;

public class UserDAOImpl implements UserDAO {

	private static SessionFactory factory; 
	@SessionTarget
	Session session; //= factory.openSession()
	@TransactionTarget
	Transaction transaction;

	@SuppressWarnings("unchecked")
	public List<User> listUser() {	
		List<User> courses = null;
		try {
			courses = session.createQuery("from User").list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return courses;
	}

	public void saveUser(User user) {
		try {
			System.out.println("Update successful..");
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} 
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List searchUser(String username) {
		Query qry=session.createQuery("from User ");
		transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		Criterion idCriterion = Restrictions.eq("username", username);
		criteria.add(idCriterion);
		List<User> users = (List) criteria.list();
		
	    //List<User> users=(List<User>) qry.list();
	    session.getTransaction().commit();
	    
	    System.out.println(users);
	    
	    List<User> result = new ArrayList<User>();
	    
	    for(User u : users) {
	    	if((u.getUsername()).equalsIgnoreCase(username)) {
	    		result.add(u);
	    	}
	    }
	    		
	   
	    System.out.println("Results :" + result.size());
	    
//	    session.close();
	    return result;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public boolean isAuthentic(String username, String password) {
		boolean isAuthentic = false;
		Query qry=session.createQuery("from User ");
		transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(User.class);
		Criterion nameCriterion = Restrictions.eq("username", username);
		Criterion pwdCriterion = Restrictions.eq("password", password);
		LogicalExpression expAnd = Restrictions.and(nameCriterion, pwdCriterion);
		criteria.add(expAnd);
		
		List<User> users = criteria.list();
		
		if (users != null && users.size() > 0) {
			isAuthentic = true;
		}
		
		System.out.println(username + " : " + password + " is authentic ==> " + isAuthentic);
		return isAuthentic;
	} 
}

