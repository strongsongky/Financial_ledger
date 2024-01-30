package com.money.domain;

public class DetailDTO {
	
		private Long detail_idx;
		private Long daylog_idx;
		private Long user_idx;
		private DetailType type;
		private Long sum;
		private int category;
		private boolean isDeleted; 
	
		public enum DetailType {
			INCOME,
			EXPENSE
		}
		public Long getDetailIdx() {
			return detail_idx;
		}
		public Long getDaylogIdx() {
			return daylog_idx;
		}
		public Long getUserIdx() {
			return user_idx;
		}
		public DetailType getType() {
			return type;
		}
		public Long getSum() {
			return sum;
		}
		public int getCategory() {
			return category;
		}
		public boolean isDeleted() {
			return isDeleted;
		}
		public void setDetailIdx(Long detailIdx) {
			this.detail_idx = detailIdx;
		}
		public void setDaylogIdx(Long daylogIdx) {
			this.daylog_idx = daylogIdx;
		}
		public void setUserIdx(Long userIdx) {
			this.user_idx = userIdx;
		}
		public void setType(DetailType type) {
			this.type = type;
		}
		public void setSum(Long sum) {
			this.sum = sum;
		}
		public void setCategory(int category) {
			this.category = category;
		}
		public void setDeleted(boolean deleted) {
			this.isDeleted = deleted;
		}
	
}

