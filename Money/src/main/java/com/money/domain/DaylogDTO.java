package com.money.domain;

import java.sql.Date;

public class DaylogDTO {

		private Long daylog_idx;
		private Long user_idx;
		private Date date;
		private int income;
		private int expense;
		
		public Long getDaylog_idx() {
			return daylog_idx;
		}
		public void setDaylog_idx(Long daylog_idx) {
			this.daylog_idx = daylog_idx;
		}
		public Long getUser_idx() {
			return user_idx;
		}
		public void setUser_idx(Long user_idx) {
			this.user_idx = user_idx;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public int getIncome() {
			return income;
		}
		public void setIncome(int income) {
			this.income = income;
		}
		public int getExpense() {
			return expense;
		}
		public void setExpense(int expense) {
			this.expense = expense;
		}
	
}
