package com.playmatecat.modules.login.vo;

import com.playmatecat.modules.login.dto.UserDTO;

public class LoginVO {
	private UserDTO userDTO;
	
	/** 跳转的子项目登录地址 **/
	private String service;

	/** 请求跳转过来的地址,也就是登录成功后最终跳转的地址 **/
	private String url;

	public UserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
