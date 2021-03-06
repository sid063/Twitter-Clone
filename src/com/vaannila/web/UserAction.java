package com.vaannila.web;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vaannila.dao.UserDAO;
import com.vaannila.dao.UserDAOImpl;
import com.vaannila.domain.User;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = -6659925652584240539L;

	private User user = new User();
	private List<User> userList = new ArrayList<User>();
	private UserDAO userDAO = new UserDAOImpl();
	private boolean isAuthentic = false;
	
	public User getModel() {
		return user;
	}

	public String add()
	{
		userDAO.saveUser(user);
		return SUCCESS;
	}

	public String list()
	{
		userList = userDAO.listUser();
		return SUCCESS;
	}
	
	public String search()
	{
		userList = userDAO.searchUser(user.getUsername());
		return SUCCESS;
	}
	
	public String isAuthentic() {
		
		System.out.println("Inside isAuthentic of UserAction: "+user.getUsername());
		isAuthentic = userDAO.isAuthentic(user.getUsername(), user.getPassword());
		return (isAuthentic?"success":"failure");
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
}
