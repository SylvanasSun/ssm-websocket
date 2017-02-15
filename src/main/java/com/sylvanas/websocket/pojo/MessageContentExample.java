package com.sylvanas.websocket.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageContentExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMContentIsNull() {
            addCriterion("m_content is null");
            return (Criteria) this;
        }

        public Criteria andMContentIsNotNull() {
            addCriterion("m_content is not null");
            return (Criteria) this;
        }

        public Criteria andMContentEqualTo(String value) {
            addCriterion("m_content =", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotEqualTo(String value) {
            addCriterion("m_content <>", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentGreaterThan(String value) {
            addCriterion("m_content >", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentGreaterThanOrEqualTo(String value) {
            addCriterion("m_content >=", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLessThan(String value) {
            addCriterion("m_content <", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLessThanOrEqualTo(String value) {
            addCriterion("m_content <=", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentLike(String value) {
            addCriterion("m_content like", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotLike(String value) {
            addCriterion("m_content not like", value, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentIn(List<String> values) {
            addCriterion("m_content in", values, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotIn(List<String> values) {
            addCriterion("m_content not in", values, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentBetween(String value1, String value2) {
            addCriterion("m_content between", value1, value2, "mContent");
            return (Criteria) this;
        }

        public Criteria andMContentNotBetween(String value1, String value2) {
            addCriterion("m_content not between", value1, value2, "mContent");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeIsNull() {
            addCriterion("m_createdtime is null");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeIsNotNull() {
            addCriterion("m_createdtime is not null");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeEqualTo(Date value) {
            addCriterion("m_createdtime =", value, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeNotEqualTo(Date value) {
            addCriterion("m_createdtime <>", value, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeGreaterThan(Date value) {
            addCriterion("m_createdtime >", value, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m_createdtime >=", value, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeLessThan(Date value) {
            addCriterion("m_createdtime <", value, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("m_createdtime <=", value, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeIn(List<Date> values) {
            addCriterion("m_createdtime in", values, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeNotIn(List<Date> values) {
            addCriterion("m_createdtime not in", values, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("m_createdtime between", value1, value2, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("m_createdtime not between", value1, value2, "mCreatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeIsNull() {
            addCriterion("m_updatedtime is null");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeIsNotNull() {
            addCriterion("m_updatedtime is not null");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeEqualTo(Date value) {
            addCriterion("m_updatedtime =", value, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeNotEqualTo(Date value) {
            addCriterion("m_updatedtime <>", value, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeGreaterThan(Date value) {
            addCriterion("m_updatedtime >", value, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m_updatedtime >=", value, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeLessThan(Date value) {
            addCriterion("m_updatedtime <", value, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("m_updatedtime <=", value, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeIn(List<Date> values) {
            addCriterion("m_updatedtime in", values, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeNotIn(List<Date> values) {
            addCriterion("m_updatedtime not in", values, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeBetween(Date value1, Date value2) {
            addCriterion("m_updatedtime between", value1, value2, "mUpdatedtime");
            return (Criteria) this;
        }

        public Criteria andMUpdatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("m_updatedtime not between", value1, value2, "mUpdatedtime");
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