package com.xyhy.blog.mybatis.mapper;

import com.xyhy.blog.items.TagWithArticle;
import com.xyhy.blog.items.TagWithArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagWithArticleMapper {
    int countByExample(TagWithArticleExample example);

    int deleteByExample(TagWithArticleExample example);

    int insert(TagWithArticle record);

    int insertSelective(TagWithArticle record);

    List<TagWithArticle> selectByExample(TagWithArticleExample example);

    int updateByExampleSelective(@Param("record") TagWithArticle record, @Param("example") TagWithArticleExample example);

    int updateByExample(@Param("record") TagWithArticle record, @Param("example") TagWithArticleExample example);
}