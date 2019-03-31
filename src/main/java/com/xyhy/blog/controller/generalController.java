package com.xyhy.blog.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyhy.blog.items.Article;
import com.xyhy.blog.items.ArticleWithBLOBs;
import com.xyhy.blog.service.ArticleService;

@RestController
@RequestMapping("/p")
public class generalController {
	@Resource
	private ArticleService articleService;
	
	
	//文章目录按页数排列
	@RequestMapping(value="/{page}",method=RequestMethod.GET)
	public Map<String, Object> selectArtics(@PathVariable int page) {
		List<Article> list=  articleService.selectArticleByExample(null, page);
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("data", list);
		return map;
		
	}
	
	//浏览文章
	@RequestMapping("/article/{id}")
	public Map<String, Object> selectArticsById(@PathVariable int id) {
		ArticleWithBLOBs aw=  articleService.selectArticleById(id);
		Map<String, Object> map= new HashMap<String, Object>();
		map.put("data", aw);
		return map;
	}
	//点赞
	@RequestMapping("/{a}/{id}")
	public void like(@PathVariable int id) {
		
		  articleService.star(id);
		
	}
	
	//按分类查询文章（待实现）
//	@RequestMapping("/tag/{id}")
//	public List<Article> selectByTag(@PathVariable int id) {
//		
//		return null;
//		
//	}
	
	
}
