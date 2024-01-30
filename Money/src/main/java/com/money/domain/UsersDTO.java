package com.money.domain;

public class UsersDTO {

		private Long user_idx;
		private String email;
		private String  password;
		private String username;
		
		public Long getUser_idx() {
			return user_idx;
		}
		public void setUser_idx(Long user_idx) {
			this.user_idx = user_idx;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
	
}
