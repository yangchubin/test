package cn.ycb.ssm.services;

import java.util.List;

import cn.ycb.ssm.pojo.User;

public interface UserService {
	
	public User selectByPrimaryKey(Integer id);

	public List<User> selectList();

	public int insert(User user);

	public int updateByPrimaryKey(User user);

	public int deleteByPrimaryKey(Integer id);
	
}
