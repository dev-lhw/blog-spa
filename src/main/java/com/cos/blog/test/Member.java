package com.cos.blog.test;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Member {
	
	private int id;
	private String userName;
	private String password;
	private String email;
	
	@Builder
	public Member(int id, String userName, String password, String email) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
}
