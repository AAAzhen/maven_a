package service;


import pojo.User;

public interface UserService {
	
	public void registUser(User user) throws Exception;

	public User selectUserByUsername(String username);

	public void updateUser(User user) throws Exception;

}
