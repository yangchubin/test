package cn.ycb.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ycb.ssm.pojo.User;
import cn.ycb.ssm.services.UserService;

@Controller
//模块名
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//查询列表，将数据返还页面
	@RequestMapping("/list")
	private String list(Model m) {
		
		List<User> users = userService.selectList();
		
		m.addAttribute("users", users);
		//配置视图解析器后，无需写地址前缀和后缀
		return "userList";
	}
	
	//删除业务
	@RequestMapping("/delete")
	public String delete(Integer userId) {
		
		int deleteByPrimaryKey = userService.deleteByPrimaryKey(userId);
		
		//返回查询页面:注意：此处需用重定向redirect,不能用请求转发forward
		//此处进行重定向的时候/不能少
		return "redirect:/user/list.do";
	}

	
}
