package cn.ycb.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.ycb.ssm.pojo.User;

public interface UserMapper {
	
	@Select("select * from t_user where user_id = #{id}")
	public User selectByPrimaryKey(Integer id);
	
	@Select("select * from t_user")
	public List<User> selectList();
	
	@Insert("insert into t_user(username,gender,telephone_number)values(#{userName},#{gender},#{telephoneNumber})")
	public int insert(User user);
	
	@Update("update t_user set username = #{username},gender=#{gender},telephone_number=#{telephoneNumber} where user_id = #{userId}")
	public int updateByPrimaryKey(User user);
	
	@Delete("delete from t_user where user_id = #{userId}")
	public int deleteByPrimaryKey(Integer id);
}
