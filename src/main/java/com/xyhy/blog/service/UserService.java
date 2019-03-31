package com.xyhy.blog.service;



import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.ejb.access.EjbAccessException;
import org.springframework.stereotype.Service;

import com.xyhy.blog.exception.BlogException;
import com.xyhy.blog.items.User;
import com.xyhy.blog.items.UserExample;
import com.xyhy.blog.mybatis.mapper.UserMapper;


@Service
public class UserService {
	@Resource
	private UserMapper userMapper;
	
	//登录
	public User login( User user) throws BlogException {
		User userDao = userMapper.selectByPrimaryKey(user.getEmail());
		try {
			userDao.getPassword().equals(user.getPassword());
			return userDao;
		} catch (Exception e) {
			throw new BlogException(999,"用户名或密码错误");
		}
		
	}
	
	public User findUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	//新建用户
	public int  insertUser(User user) {
		return userMapper.insert(user);
	}
	
	//更新用户更新字段为空则不更新
	public int updataUserByPrimary(User user) {
		
		return userMapper.updateByPrimaryKeySelective(user);
		
	}
	
	/*/按传进的参数有条件查询用户
	 * int a 当前页 int b每页显示的数量 */
	public List<User> selectUserByExample(User user,int a ,int b ){
		UserExample userExample= new UserExample();
		UserExample.Criteria criteria= userExample.createCriteria();
		
		if (!StringUtils.isBlank(user.getEmail())) {
			criteria.andEmailEqualTo(user.getEmail());
		}
		if (!StringUtils.isBlank(user.getUsername())) {
			criteria.andUsernameEqualTo(user.getUsername());
		}
		if(a>0) {
		userExample.setOffset(a*b);
		}
		if(b>0) {
		userExample.setLimit(b);
		}
		return userMapper.selectByExample(userExample);
	}
	
	
}
