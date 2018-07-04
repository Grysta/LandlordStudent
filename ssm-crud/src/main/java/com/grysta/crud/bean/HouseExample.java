package com.grysta.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseExample() {
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

        public Criteria andHouseIdIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseIdIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseIdEqualTo(Integer value) {
            addCriterion("house_id =", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThan(Integer value) {
            addCriterion("house_id >", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThan(Integer value) {
            addCriterion("house_id <", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdIn(List<Integer> values) {
            addCriterion("house_id in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "houseId");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNull() {
            addCriterion("house_address is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNotNull() {
            addCriterion("house_address is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressEqualTo(String value) {
            addCriterion("house_address =", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotEqualTo(String value) {
            addCriterion("house_address <>", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThan(String value) {
            addCriterion("house_address >", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("house_address >=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThan(String value) {
            addCriterion("house_address <", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("house_address <=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLike(String value) {
            addCriterion("house_address like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotLike(String value) {
            addCriterion("house_address not like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIn(List<String> values) {
            addCriterion("house_address in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotIn(List<String> values) {
            addCriterion("house_address not in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressBetween(String value1, String value2) {
            addCriterion("house_address between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotBetween(String value1, String value2) {
            addCriterion("house_address not between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNull() {
            addCriterion("house_type is null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIsNotNull() {
            addCriterion("house_type is not null");
            return (Criteria) this;
        }

        public Criteria andHouseTypeEqualTo(String value) {
            addCriterion("house_type =", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotEqualTo(String value) {
            addCriterion("house_type <>", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThan(String value) {
            addCriterion("house_type >", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("house_type >=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThan(String value) {
            addCriterion("house_type <", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("house_type <=", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeLike(String value) {
            addCriterion("house_type like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotLike(String value) {
            addCriterion("house_type not like", value, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeIn(List<String> values) {
            addCriterion("house_type in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotIn(List<String> values) {
            addCriterion("house_type not in", values, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeBetween(String value1, String value2) {
            addCriterion("house_type between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHouseTypeNotBetween(String value1, String value2) {
            addCriterion("house_type not between", value1, value2, "houseType");
            return (Criteria) this;
        }

        public Criteria andHousePeopleIsNull() {
            addCriterion("house_people is null");
            return (Criteria) this;
        }

        public Criteria andHousePeopleIsNotNull() {
            addCriterion("house_people is not null");
            return (Criteria) this;
        }

        public Criteria andHousePeopleEqualTo(Integer value) {
            addCriterion("house_people =", value, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleNotEqualTo(Integer value) {
            addCriterion("house_people <>", value, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleGreaterThan(Integer value) {
            addCriterion("house_people >", value, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_people >=", value, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleLessThan(Integer value) {
            addCriterion("house_people <", value, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleLessThanOrEqualTo(Integer value) {
            addCriterion("house_people <=", value, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleIn(List<Integer> values) {
            addCriterion("house_people in", values, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleNotIn(List<Integer> values) {
            addCriterion("house_people not in", values, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleBetween(Integer value1, Integer value2) {
            addCriterion("house_people between", value1, value2, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("house_people not between", value1, value2, "housePeople");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNull() {
            addCriterion("house_price is null");
            return (Criteria) this;
        }

        public Criteria andHousePriceIsNotNull() {
            addCriterion("house_price is not null");
            return (Criteria) this;
        }

        public Criteria andHousePriceEqualTo(Integer value) {
            addCriterion("house_price =", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotEqualTo(Integer value) {
            addCriterion("house_price <>", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThan(Integer value) {
            addCriterion("house_price >", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_price >=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThan(Integer value) {
            addCriterion("house_price <", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceLessThanOrEqualTo(Integer value) {
            addCriterion("house_price <=", value, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceIn(List<Integer> values) {
            addCriterion("house_price in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotIn(List<Integer> values) {
            addCriterion("house_price not in", values, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceBetween(Integer value1, Integer value2) {
            addCriterion("house_price between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHousePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("house_price not between", value1, value2, "housePrice");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdIsNull() {
            addCriterion("house_landlord_id is null");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdIsNotNull() {
            addCriterion("house_landlord_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdEqualTo(Integer value) {
            addCriterion("house_landlord_id =", value, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdNotEqualTo(Integer value) {
            addCriterion("house_landlord_id <>", value, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdGreaterThan(Integer value) {
            addCriterion("house_landlord_id >", value, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_landlord_id >=", value, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdLessThan(Integer value) {
            addCriterion("house_landlord_id <", value, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdLessThanOrEqualTo(Integer value) {
            addCriterion("house_landlord_id <=", value, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdIn(List<Integer> values) {
            addCriterion("house_landlord_id in", values, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdNotIn(List<Integer> values) {
            addCriterion("house_landlord_id not in", values, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdBetween(Integer value1, Integer value2) {
            addCriterion("house_landlord_id between", value1, value2, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseLandlordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("house_landlord_id not between", value1, value2, "houseLandlordId");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveIsNull() {
            addCriterion("house_canlive is null");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveIsNotNull() {
            addCriterion("house_canlive is not null");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveEqualTo(String value) {
            addCriterion("house_canlive =", value, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveNotEqualTo(String value) {
            addCriterion("house_canlive <>", value, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveGreaterThan(String value) {
            addCriterion("house_canlive >", value, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveGreaterThanOrEqualTo(String value) {
            addCriterion("house_canlive >=", value, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveLessThan(String value) {
            addCriterion("house_canlive <", value, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveLessThanOrEqualTo(String value) {
            addCriterion("house_canlive <=", value, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveLike(String value) {
            addCriterion("house_canlive like", value, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveNotLike(String value) {
            addCriterion("house_canlive not like", value, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveIn(List<String> values) {
            addCriterion("house_canlive in", values, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveNotIn(List<String> values) {
            addCriterion("house_canlive not in", values, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveBetween(String value1, String value2) {
            addCriterion("house_canlive between", value1, value2, "houseCanlive");
            return (Criteria) this;
        }

        public Criteria andHouseCanliveNotBetween(String value1, String value2) {
            addCriterion("house_canlive not between", value1, value2, "houseCanlive");
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