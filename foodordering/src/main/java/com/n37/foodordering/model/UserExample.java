package com.n37.foodordering.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    
	protected String orderByClause;
	
	protected boolean distinct;
	
	protected List<Criteria> oredCriteria;

	
	public UserExample() {
		oredCriteria = new ArrayList<>();
	}

	
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	
	public String getOrderByClause() {
		return orderByClause;
	}

	
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	
	public boolean isDistinct() {
		return distinct;
	}

	
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andFullNameIsNull() {
			addCriterion("full_name is null");
			return (Criteria) this;
		}

		public Criteria andFullNameIsNotNull() {
			addCriterion("full_name is not null");
			return (Criteria) this;
		}

		public Criteria andFullNameEqualTo(String value) {
			addCriterion("full_name =", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameNotEqualTo(String value) {
			addCriterion("full_name <>", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameGreaterThan(String value) {
			addCriterion("full_name >", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameGreaterThanOrEqualTo(String value) {
			addCriterion("full_name >=", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameLessThan(String value) {
			addCriterion("full_name <", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameLessThanOrEqualTo(String value) {
			addCriterion("full_name <=", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameLike(String value) {
			addCriterion("full_name like", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameNotLike(String value) {
			addCriterion("full_name not like", value, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameIn(List<String> values) {
			addCriterion("full_name in", values, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameNotIn(List<String> values) {
			addCriterion("full_name not in", values, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameBetween(String value1, String value2) {
			addCriterion("full_name between", value1, value2, "fullName");
			return (Criteria) this;
		}

		public Criteria andFullNameNotBetween(String value1, String value2) {
			addCriterion("full_name not between", value1, value2, "fullName");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIsNull() {
			addCriterion("user_password is null");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIsNotNull() {
			addCriterion("user_password is not null");
			return (Criteria) this;
		}

		public Criteria andUserPasswordEqualTo(String value) {
			addCriterion("user_password =", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotEqualTo(String value) {
			addCriterion("user_password <>", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordGreaterThan(String value) {
			addCriterion("user_password >", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("user_password >=", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLessThan(String value) {
			addCriterion("user_password <", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLessThanOrEqualTo(String value) {
			addCriterion("user_password <=", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordLike(String value) {
			addCriterion("user_password like", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotLike(String value) {
			addCriterion("user_password not like", value, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordIn(List<String> values) {
			addCriterion("user_password in", values, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotIn(List<String> values) {
			addCriterion("user_password not in", values, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordBetween(String value1, String value2) {
			addCriterion("user_password between", value1, value2, "userPassword");
			return (Criteria) this;
		}

		public Criteria andUserPasswordNotBetween(String value1, String value2) {
			addCriterion("user_password not between", value1, value2, "userPassword");
			return (Criteria) this;
		}

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNull() {
			addCriterion("phone is null");
			return (Criteria) this;
		}

		public Criteria andPhoneIsNotNull() {
			addCriterion("phone is not null");
			return (Criteria) this;
		}

		public Criteria andPhoneEqualTo(String value) {
			addCriterion("phone =", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotEqualTo(String value) {
			addCriterion("phone <>", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThan(String value) {
			addCriterion("phone >", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("phone >=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThan(String value) {
			addCriterion("phone <", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLessThanOrEqualTo(String value) {
			addCriterion("phone <=", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneLike(String value) {
			addCriterion("phone like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotLike(String value) {
			addCriterion("phone not like", value, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneIn(List<String> values) {
			addCriterion("phone in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotIn(List<String> values) {
			addCriterion("phone not in", values, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneBetween(String value1, String value2) {
			addCriterion("phone between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andPhoneNotBetween(String value1, String value2) {
			addCriterion("phone not between", value1, value2, "phone");
			return (Criteria) this;
		}

		public Criteria andUserRoleIsNull() {
			addCriterion("user_role is null");
			return (Criteria) this;
		}

		public Criteria andUserRoleIsNotNull() {
			addCriterion("user_role is not null");
			return (Criteria) this;
		}

		public Criteria andUserRoleEqualTo(String value) {
			addCriterion("user_role =", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleNotEqualTo(String value) {
			addCriterion("user_role <>", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleGreaterThan(String value) {
			addCriterion("user_role >", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
			addCriterion("user_role >=", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleLessThan(String value) {
			addCriterion("user_role <", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleLessThanOrEqualTo(String value) {
			addCriterion("user_role <=", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleLike(String value) {
			addCriterion("user_role like", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleNotLike(String value) {
			addCriterion("user_role not like", value, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleIn(List<String> values) {
			addCriterion("user_role in", values, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleNotIn(List<String> values) {
			addCriterion("user_role not in", values, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleBetween(String value1, String value2) {
			addCriterion("user_role between", value1, value2, "userRole");
			return (Criteria) this;
		}

		public Criteria andUserRoleNotBetween(String value1, String value2) {
			addCriterion("user_role not between", value1, value2, "userRole");
			return (Criteria) this;
		}

		public Criteria andAvatarIsNull() {
			addCriterion("avatar is null");
			return (Criteria) this;
		}

		public Criteria andAvatarIsNotNull() {
			addCriterion("avatar is not null");
			return (Criteria) this;
		}

		public Criteria andAvatarEqualTo(String value) {
			addCriterion("avatar =", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarNotEqualTo(String value) {
			addCriterion("avatar <>", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarGreaterThan(String value) {
			addCriterion("avatar >", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarGreaterThanOrEqualTo(String value) {
			addCriterion("avatar >=", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarLessThan(String value) {
			addCriterion("avatar <", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarLessThanOrEqualTo(String value) {
			addCriterion("avatar <=", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarLike(String value) {
			addCriterion("avatar like", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarNotLike(String value) {
			addCriterion("avatar not like", value, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarIn(List<String> values) {
			addCriterion("avatar in", values, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarNotIn(List<String> values) {
			addCriterion("avatar not in", values, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarBetween(String value1, String value2) {
			addCriterion("avatar between", value1, value2, "avatar");
			return (Criteria) this;
		}

		public Criteria andAvatarNotBetween(String value1, String value2) {
			addCriterion("avatar not between", value1, value2, "avatar");
			return (Criteria) this;
		}

		public Criteria andIsActiveIsNull() {
			addCriterion("is_active is null");
			return (Criteria) this;
		}

		public Criteria andIsActiveIsNotNull() {
			addCriterion("is_active is not null");
			return (Criteria) this;
		}

		public Criteria andIsActiveEqualTo(Boolean value) {
			addCriterion("is_active =", value, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveNotEqualTo(Boolean value) {
			addCriterion("is_active <>", value, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveGreaterThan(Boolean value) {
			addCriterion("is_active >", value, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_active >=", value, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveLessThan(Boolean value) {
			addCriterion("is_active <", value, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
			addCriterion("is_active <=", value, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveIn(List<Boolean> values) {
			addCriterion("is_active in", values, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveNotIn(List<Boolean> values) {
			addCriterion("is_active not in", values, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
			addCriterion("is_active between", value1, value2, "isActive");
			return (Criteria) this;
		}

		public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_active not between", value1, value2, "isActive");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table user
	 * @mbg.generated  Thu Sep 01 09:03:08 ICT 2022
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}