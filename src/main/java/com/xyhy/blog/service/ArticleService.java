package com.xyhy.blog.service;



import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xyhy.blog.items.Article;
import com.xyhy.blog.items.ArticleExample;
import com.xyhy.blog.items.ArticleWithBLOBs;
import com.xyhy.blog.items.UserExample;
import com.xyhy.blog.mybatis.mapper.ArticleMapper;

@Service
public class ArticleService {
	@Resource
	public ArticleMapper articleMapper;
	//根据条件筛选文章（不包括文章内容）
/*@param pageNumber 要查询的页码
 * @param listNumber 每页显示的记录条数
 * <=0时则不反回s
 * */
	public List<Article> selectArticleByExample(Article article,int pageNumber ){
		ArticleExample articleExample= new ArticleExample();
		ArticleExample.Criteria criteria= articleExample.createCriteria();
		
		if(article!=null) {
			if(StringUtils.isNotBlank(article.getAutor())) {
				  criteria.andAutorEqualTo("%"+article.getAutor()+"%");
			}
			if(StringUtils.isNotBlank(article.getTitle())) {
				  criteria.andTitleEqualTo(article.getTitle());
			}
			if(StringUtils.isNotBlank(article.getCreateUser())) {
				  criteria.andCreateUserLike("%"+article.getCreateUser()+"%");
			}
		}
		
		if( pageNumber>0) {
			articleExample.setOffset((pageNumber-1)*6);
		}
		
		articleExample.setLimit(6);
		
		
		return articleMapper.selectByExample(articleExample);
	}
	//通过id查询文章内容
	@Transactional
	public ArticleWithBLOBs selectArticleById(int id) {
		articleMapper.pageview(id);
		ArticleWithBLOBs articleWithBLOBs=articleMapper.selectByPrimaryKey(id);
		
		return articleWithBLOBs;
		
	}
	//通过id更新文章内容，空值不更新。
	 public int updateArticleWithBLOBs(ArticleWithBLOBs articleWithBLOBs) {
		return articleMapper.updateByPrimaryKeySelective(articleWithBLOBs);
	 }
	 
	 
	 //根据文章id删除文章
	 public int deleteArticleById(int id) {
		 return articleMapper.deleteByPrimaryKey(id);
	 }
	 
	 public void star(int id) {
		 articleMapper.star(id);
	 }
	 
//	 public List<Article> selectByIds(int[] ids){
//		 ArticleExample example= new ArticleExample();
//		 ArticleExample.Criteria criteria= example.createCriteria();
//		 
//		 
//		return  articleMapper.selectByExample(example);
//	 }
	 
	 //创建文章
	 public int insertArticle(ArticleWithBLOBs aw) {
		try {
			return articleMapper.insertSelective(aw);
		} catch (Exception e) {
			throw e;		
		}
		 
	 }
	

}
