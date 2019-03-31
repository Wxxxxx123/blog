package com.xyhy.blog.admin.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.print.attribute.HashAttributeSet;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResultUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.xyhy.blog.exception.BlogException;
import com.xyhy.blog.items.ArticleWithBLOBs;
import com.xyhy.blog.service.ArticleService;

@RestController
@RequestMapping("/u")
public class ArticleController {
	@Resource
	private ArticleService articleService;
	@Value("${filePath}")
	private String FILE_PATH;

	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public int createArticle(@RequestBody @Validated ArticleWithBLOBs articleWithBLOBs, HttpServletResponse response) {
		if (StringUtils.isBlank(articleWithBLOBs.getTitlePic())) {
			articleWithBLOBs.setTitlePic("default");
		}
		int statu = articleService.insertArticle(articleWithBLOBs);
		return statu;
	}

	// 更新文章
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String editArticle(@RequestBody ArticleWithBLOBs articleWithBLOBs, HttpServletResponse response) {
		if (StringUtils.isNotBlank(articleWithBLOBs.getContent())
				&& StringUtils.isNotBlank(articleWithBLOBs.getContentMk())) {
			articleService.updateArticleWithBLOBs(articleWithBLOBs);
			response.setStatus(200);
			return "修改成功";
		} else {
			response.setStatus(600);
			return "文章内容为空";
		}
	}

	// 删除文件
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public int deleteArticle(int id) {
		return articleService.deleteArticleById(id);

	}

	// 图片上传
	@RequestMapping(value = "/uploaded")
	public Map<String, Object> upLoaded(MultipartFile pictureFile) throws BlogException {
		Map<String, Object> map=new HashMap<String, Object>();
		if (pictureFile == null) {
			throw new BlogException(999,"图片不存在");
		}
		try {
			String originalName = pictureFile.getOriginalFilename();
			String fileName = UUID.randomUUID().toString() + originalName.substring(originalName.lastIndexOf("."));
			String picFullNaem = FILE_PATH + fileName;
			File diskFile = new File(picFullNaem);
			pictureFile.transferTo(diskFile);
			map.put("pictureName", fileName);
			return map;

		} catch (Exception e) {
			throw new BlogException(999,"未知错误，图片上传失败，请重试");
		}
	}
	
	
	

}
