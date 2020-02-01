package cn.ycb.ssm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ycb.ssm.mapper.UserMapper;
import cn.ycb.ssm.pojo.User;
import cn.ycb.ssm.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectList() {
		return userMapper.selectList();
	}

	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int updateByPrimaryKey(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

}
