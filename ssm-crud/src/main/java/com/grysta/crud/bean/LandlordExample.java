package com.grysta.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class LandlordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LandlordExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andLandlordIdIsNull() {
            addCriterion("landlord_id is null");
            return (Criteria) this;
        }

        public Criteria andLandlordIdIsNotNull() {
            addCriterion("landlord_id is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordIdEqualTo(Integer value) {
            addCriterion("landlord_id =", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotEqualTo(Integer value) {
            addCriterion("landlord_id <>", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdGreaterThan(Integer value) {
            addCriterion("landlord_id >", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("landlord_id >=", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdLessThan(Integer value) {
            addCriterion("landlord_id <", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdLessThanOrEqualTo(Integer value) {
            addCriterion("landlord_id <=", value, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdIn(List<Integer> values) {
            addCriterion("landlord_id in", values, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotIn(List<Integer> values) {
            addCriterion("landlord_id not in", values, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdBetween(Integer value1, Integer value2) {
            addCriterion("landlord_id between", value1, value2, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("landlord_id not between", value1, value2, "landlordId");
            return (Criteria) this;
        }

        public Criteria andLandlordNameIsNull() {
            addCriterion("landlord_name is null");
            return (Criteria) this;
        }

        public Criteria andLandlordNameIsNotNull() {
            addCriterion("landlord_name is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordNameEqualTo(String value) {
            addCriterion("landlord_name =", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameNotEqualTo(String value) {
            addCriterion("landlord_name <>", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameGreaterThan(String value) {
            addCriterion("landlord_name >", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_name >=", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameLessThan(String value) {
            addCriterion("landlord_name <", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameLessThanOrEqualTo(String value) {
            addCriterion("landlord_name <=", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameLike(String value) {
            addCriterion("landlord_name like", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameNotLike(String value) {
            addCriterion("landlord_name not like", value, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameIn(List<String> values) {
            addCriterion("landlord_name in", values, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameNotIn(List<String> values) {
            addCriterion("landlord_name not in", values, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameBetween(String value1, String value2) {
            addCriterion("landlord_name between", value1, value2, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordNameNotBetween(String value1, String value2) {
            addCriterion("landlord_name not between", value1, value2, "landlordName");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameIsNull() {
            addCriterion("landlord_username is null");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameIsNotNull() {
            addCriterion("landlord_username is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameEqualTo(String value) {
            addCriterion("landlord_username =", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameNotEqualTo(String value) {
            addCriterion("landlord_username <>", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameGreaterThan(String value) {
            addCriterion("landlord_username >", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_username >=", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameLessThan(String value) {
            addCriterion("landlord_username <", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameLessThanOrEqualTo(String value) {
            addCriterion("landlord_username <=", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameLike(String value) {
            addCriterion("landlord_username like", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameNotLike(String value) {
            addCriterion("landlord_username not like", value, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameIn(List<String> values) {
            addCriterion("landlord_username in", values, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameNotIn(List<String> values) {
            addCriterion("landlord_username not in", values, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameBetween(String value1, String value2) {
            addCriterion("landlord_username between", value1, value2, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordUsernameNotBetween(String value1, String value2) {
            addCriterion("landlord_username not between", value1, value2, "landlordUsername");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordIsNull() {
            addCriterion("landlord_password is null");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordIsNotNull() {
            addCriterion("landlord_password is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordEqualTo(String value) {
            addCriterion("landlord_password =", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordNotEqualTo(String value) {
            addCriterion("landlord_password <>", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordGreaterThan(String value) {
            addCriterion("landlord_password >", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_password >=", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordLessThan(String value) {
            addCriterion("landlord_password <", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordLessThanOrEqualTo(String value) {
            addCriterion("landlord_password <=", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordLike(String value) {
            addCriterion("landlord_password like", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordNotLike(String value) {
            addCriterion("landlord_password not like", value, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordIn(List<String> values) {
            addCriterion("landlord_password in", values, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordNotIn(List<String> values) {
            addCriterion("landlord_password not in", values, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordBetween(String value1, String value2) {
            addCriterion("landlord_password between", value1, value2, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordPasswordNotBetween(String value1, String value2) {
            addCriterion("landlord_password not between", value1, value2, "landlordPassword");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressIsNull() {
            addCriterion("landlord_address is null");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressIsNotNull() {
            addCriterion("landlord_address is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressEqualTo(String value) {
            addCriterion("landlord_address =", value, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressNotEqualTo(String value) {
            addCriterion("landlord_address <>", value, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressGreaterThan(String value) {
            addCriterion("landlord_address >", value, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_address >=", value, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressLessThan(String value) {
            addCriterion("landlord_address <", value, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressLessThanOrEqualTo(String value) {
            addCriterion("landlord_address <=", value, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressLike(String value) {
            addCriterion("landlord_address like", value, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressNotLike(String value) {
            addCriterion("landlord_address not like", value, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressIn(List<String> values) {
            addCriterion("landlord_address in", values, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressNotIn(List<String> values) {
            addCriterion("landlord_address not in", values, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressBetween(String value1, String value2) {
            addCriterion("landlord_address between", value1, value2, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordAddressNotBetween(String value1, String value2) {
            addCriterion("landlord_address not between", value1, value2, "landlordAddress");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneIsNull() {
            addCriterion("landlord_phone is null");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneIsNotNull() {
            addCriterion("landlord_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneEqualTo(String value) {
            addCriterion("landlord_phone =", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneNotEqualTo(String value) {
            addCriterion("landlord_phone <>", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneGreaterThan(String value) {
            addCriterion("landlord_phone >", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_phone >=", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneLessThan(String value) {
            addCriterion("landlord_phone <", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneLessThanOrEqualTo(String value) {
            addCriterion("landlord_phone <=", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneLike(String value) {
            addCriterion("landlord_phone like", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneNotLike(String value) {
            addCriterion("landlord_phone not like", value, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneIn(List<String> values) {
            addCriterion("landlord_phone in", values, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneNotIn(List<String> values) {
            addCriterion("landlord_phone not in", values, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneBetween(String value1, String value2) {
            addCriterion("landlord_phone between", value1, value2, "landlordPhone");
            return (Criteria) this;
        }

        public Criteria andLandlordPhoneNotBetween(String value1, String value2) {
            addCriterion("landlord_phone not between", value1, value2, "landlordPhone");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}