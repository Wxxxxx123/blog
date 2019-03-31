package com.xyhy.blog.commons;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.Subject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.xyhy.blog.items.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
@Component
public class JwtUtil {
	private static long EXPIRE_MILLIS;
	private static String SECRIT_CODE;
	
	//从配置文件里读取token有效时长和token秘钥
	@Value("${jwt.expire_millis}")
	public  void setEXPIRE_MILLIS(long exprimllis) {
		this.EXPIRE_MILLIS = exprimllis;
	}
	@Value("${jwt.secrit_code}")
	public  void setSECRIT_CODE(String sECRIT_CODE) {
		this.SECRIT_CODE = sECRIT_CODE;
	}
	
	
	
	public static String createJwt(User user) {
		SignatureAlgorithm algorithm = SignatureAlgorithm.HS256;
		
		Map<String,Object> claims =new HashMap<String, Object>();
		claims.put("id", user.getEmail());
		claims.put("username", user.getUsername());
		long nowMillis=System.currentTimeMillis();
		Date now = new Date(nowMillis);
		JwtBuilder builder = Jwts.builder()
				.setClaims(claims)
				.setIssuedAt(now)
				.signWith(algorithm, SECRIT_CODE)
				.setExpiration(new java.util.Date(nowMillis+EXPIRE_MILLIS));
		return builder.compact();
	}
	
	public static  Claims parseToken(String token) {
		
		try {
			Claims claims= (Claims) Jwts.parser()
				.setSigningKey(SECRIT_CODE)
				.parseClaimsJws(token)
				.getBody();
			return claims;
		}catch (RuntimeException e) {
			throw e;
		}
	}
	
	
	
	
	


}
