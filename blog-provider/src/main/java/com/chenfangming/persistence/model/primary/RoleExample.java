package com.chenfangming.persistence.model.primary;

import java.util.ArrayList;
import java.util.List;

public class RoleExample {
    /**
     * orderByClause
     */
    protected String orderByClause;

    /**
     * distinct
     */
    protected boolean distinct;

    /**
     * oredCriteria
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,blog_role
     */
    public RoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,blog_role
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,blog_role
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,blog_role
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,blog_role
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,blog_role
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,blog_role
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,blog_role
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,blog_role
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,blog_role
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,blog_role
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @author auto generator
     * GeneratedCriteria
     * 数据库表：blog_role
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameEnglishIsNull() {
            addCriterion("nameEnglish is null");
            return (Criteria) this;
        }

        public Criteria andNameEnglishIsNotNull() {
            addCriterion("nameEnglish is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnglishEqualTo(String value) {
            addCriterion("nameEnglish =", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishNotEqualTo(String value) {
            addCriterion("nameEnglish <>", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishGreaterThan(String value) {
            addCriterion("nameEnglish >", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("nameEnglish >=", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishLessThan(String value) {
            addCriterion("nameEnglish <", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishLessThanOrEqualTo(String value) {
            addCriterion("nameEnglish <=", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishLike(String value) {
            addCriterion("nameEnglish like", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishNotLike(String value) {
            addCriterion("nameEnglish not like", value, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishIn(List<String> values) {
            addCriterion("nameEnglish in", values, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishNotIn(List<String> values) {
            addCriterion("nameEnglish not in", values, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishBetween(String value1, String value2) {
            addCriterion("nameEnglish between", value1, value2, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameEnglishNotBetween(String value1, String value2) {
            addCriterion("nameEnglish not between", value1, value2, "nameEnglish");
            return (Criteria) this;
        }

        public Criteria andNameChineseIsNull() {
            addCriterion("nameChinese is null");
            return (Criteria) this;
        }

        public Criteria andNameChineseIsNotNull() {
            addCriterion("nameChinese is not null");
            return (Criteria) this;
        }

        public Criteria andNameChineseEqualTo(String value) {
            addCriterion("nameChinese =", value, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseNotEqualTo(String value) {
            addCriterion("nameChinese <>", value, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseGreaterThan(String value) {
            addCriterion("nameChinese >", value, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseGreaterThanOrEqualTo(String value) {
            addCriterion("nameChinese >=", value, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseLessThan(String value) {
            addCriterion("nameChinese <", value, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseLessThanOrEqualTo(String value) {
            addCriterion("nameChinese <=", value, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseLike(String value) {
            addCriterion("nameChinese like", value, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseNotLike(String value) {
            addCriterion("nameChinese not like", value, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseIn(List<String> values) {
            addCriterion("nameChinese in", values, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseNotIn(List<String> values) {
            addCriterion("nameChinese not in", values, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseBetween(String value1, String value2) {
            addCriterion("nameChinese between", value1, value2, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andNameChineseNotBetween(String value1, String value2) {
            addCriterion("nameChinese not between", value1, value2, "nameChinese");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("isDelete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("isDelete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("isDelete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDelete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("isDelete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("isDelete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("isDelete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("isDelete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("isDelete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDelete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    /**
     * @author auto generator
     * 数据库表：blog_role
     * Criteria
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * @author auto generator
     * Criterion
     * 数据库表：blog_role
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
}