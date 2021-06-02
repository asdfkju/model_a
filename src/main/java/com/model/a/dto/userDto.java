package com.model.a.dto;

import lombok.Data;

@Data
public class userDto {
	private String id;
	private String password; 
	private String email_id;
	private String email_addr; 
	private String nick_name;
	private String profile_img;
	private String kind; 
	private String is_reported;
}
