package dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import pojo.User;

@Mapper
@Repository
public interface UserDao {

	public void registUser(User user) throws Exception;

	public User selectUserByUsername(String username);

	public void updateUser(User user) throws Exception;
}
