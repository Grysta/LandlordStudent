package com.grysta.crud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MeetingDateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingDateExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDateIdIsNull() {
            addCriterion("date_id is null");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNotNull() {
            addCriterion("date_id is not null");
            return (Criteria) this;
        }

        public Criteria andDateIdEqualTo(Integer value) {
            addCriterion("date_id =", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotEqualTo(Integer value) {
            addCriterion("date_id <>", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThan(Integer value) {
            addCriterion("date_id >", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_id >=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThan(Integer value) {
            addCriterion("date_id <", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThanOrEqualTo(Integer value) {
            addCriterion("date_id <=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdIn(List<Integer> values) {
            addCriterion("date_id in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotIn(List<Integer> values) {
            addCriterion("date_id not in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdBetween(Integer value1, Integer value2) {
            addCriterion("date_id between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("date_id not between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdIsNull() {
            addCriterion("date_landlord_id is null");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdIsNotNull() {
            addCriterion("date_landlord_id is not null");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdEqualTo(Integer value) {
            addCriterion("date_landlord_id =", value, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdNotEqualTo(Integer value) {
            addCriterion("date_landlord_id <>", value, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdGreaterThan(Integer value) {
            addCriterion("date_landlord_id >", value, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_landlord_id >=", value, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdLessThan(Integer value) {
            addCriterion("date_landlord_id <", value, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdLessThanOrEqualTo(Integer value) {
            addCriterion("date_landlord_id <=", value, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdIn(List<Integer> values) {
            addCriterion("date_landlord_id in", values, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdNotIn(List<Integer> values) {
            addCriterion("date_landlord_id not in", values, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdBetween(Integer value1, Integer value2) {
            addCriterion("date_landlord_id between", value1, value2, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateLandlordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("date_landlord_id not between", value1, value2, "dateLandlordId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdIsNull() {
            addCriterion("date_student_id is null");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdIsNotNull() {
            addCriterion("date_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdEqualTo(Integer value) {
            addCriterion("date_student_id =", value, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdNotEqualTo(Integer value) {
            addCriterion("date_student_id <>", value, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdGreaterThan(Integer value) {
            addCriterion("date_student_id >", value, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_student_id >=", value, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdLessThan(Integer value) {
            addCriterion("date_student_id <", value, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("date_student_id <=", value, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdIn(List<Integer> values) {
            addCriterion("date_student_id in", values, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdNotIn(List<Integer> values) {
            addCriterion("date_student_id not in", values, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("date_student_id between", value1, value2, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("date_student_id not between", value1, value2, "dateStudentId");
            return (Criteria) this;
        }

        public Criteria andDateDateIsNull() {
            addCriterion("date_date is null");
            return (Criteria) this;
        }

        public Criteria andDateDateIsNotNull() {
            addCriterion("date_date is not null");
            return (Criteria) this;
        }

        public Criteria andDateDateEqualTo(Date value) {
            addCriterionForJDBCDate("date_date =", value, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date_date <>", value, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date_date >", value, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_date >=", value, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateLessThan(Date value) {
            addCriterionForJDBCDate("date_date <", value, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date_date <=", value, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateIn(List<Date> values) {
            addCriterionForJDBCDate("date_date in", values, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date_date not in", values, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_date between", value1, value2, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date_date not between", value1, value2, "dateDate");
            return (Criteria) this;
        }

        public Criteria andDateAddressIsNull() {
            addCriterion("date_address is null");
            return (Criteria) this;
        }

        public Criteria andDateAddressIsNotNull() {
            addCriterion("date_address is not null");
            return (Criteria) this;
        }

        public Criteria andDateAddressEqualTo(String value) {
            addCriterion("date_address =", value, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressNotEqualTo(String value) {
            addCriterion("date_address <>", value, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressGreaterThan(String value) {
            addCriterion("date_address >", value, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressGreaterThanOrEqualTo(String value) {
            addCriterion("date_address >=", value, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressLessThan(String value) {
            addCriterion("date_address <", value, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressLessThanOrEqualTo(String value) {
            addCriterion("date_address <=", value, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressLike(String value) {
            addCriterion("date_address like", value, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressNotLike(String value) {
            addCriterion("date_address not like", value, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressIn(List<String> values) {
            addCriterion("date_address in", values, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressNotIn(List<String> values) {
            addCriterion("date_address not in", values, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressBetween(String value1, String value2) {
            addCriterion("date_address between", value1, value2, "dateAddress");
            return (Criteria) this;
        }

        public Criteria andDateAddressNotBetween(String value1, String value2) {
            addCriterion("date_address not between", value1, value2, "dateAddress");
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