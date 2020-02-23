package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import pojo.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public void registUser(User user) throws Exception {
		// TODO Auto-generated method stub
		
		userDao.registUser(user);

	}

	@Override
	public User selectUserByUsername(String username) {
		User user = userDao.selectUserByUsername(username);
		return user;
	}

	@Override
	public void updateUser(User user) throws Exception {
		userDao.updateUser(user);
	}

}
