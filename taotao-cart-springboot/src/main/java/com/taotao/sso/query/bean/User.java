/**
 * 
 */
package com.taotao.sso.query.bean;

import org.springframework.stereotype.Component;

/**
 <p>Title: User</p>
 <p>Description: </p>
 <p>Company: </p>
 @author gaozhe
 @date 2019-4-13-上午9:34:22
 */
@Component
public class User {
	
	private String username;
	
	private String password;
	
	private Integer age;
	
	private Long id;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
    }
	
	public String getPassword() {
		return password;
    }
	
	public void setPassword(String password) {
		this.password = password;
    }
	
	public Integer getAge() {
		return age;
    }
	
	public void setAge(Integer age) {
		this.age = age;
    }
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
}
