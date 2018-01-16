package com.chenfangming.persistence.model.primary;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
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
     *  构造查询条件,blog_menu
     */
    public MenuExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,blog_menu
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,blog_menu
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,blog_menu
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,blog_menu
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,blog_menu
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,blog_menu
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,blog_menu
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,blog_menu
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,blog_menu
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,blog_menu
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @author auto generator
     * GeneratedCriteria
     * 数据库表：blog_menu
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("`path` is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("`path` is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("`path` =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("`path` <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("`path` >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("`path` >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("`path` <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("`path` <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("`path` like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("`path` not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("`path` in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("`path` not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("`path` between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("`path` not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andCompomentIsNull() {
            addCriterion("compoment is null");
            return (Criteria) this;
        }

        public Criteria andCompomentIsNotNull() {
            addCriterion("compoment is not null");
            return (Criteria) this;
        }

        public Criteria andCompomentEqualTo(String value) {
            addCriterion("compoment =", value, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentNotEqualTo(String value) {
            addCriterion("compoment <>", value, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentGreaterThan(String value) {
            addCriterion("compoment >", value, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentGreaterThanOrEqualTo(String value) {
            addCriterion("compoment >=", value, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentLessThan(String value) {
            addCriterion("compoment <", value, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentLessThanOrEqualTo(String value) {
            addCriterion("compoment <=", value, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentLike(String value) {
            addCriterion("compoment like", value, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentNotLike(String value) {
            addCriterion("compoment not like", value, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentIn(List<String> values) {
            addCriterion("compoment in", values, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentNotIn(List<String> values) {
            addCriterion("compoment not in", values, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentBetween(String value1, String value2) {
            addCriterion("compoment between", value1, value2, "compoment");
            return (Criteria) this;
        }

        public Criteria andCompomentNotBetween(String value1, String value2) {
            addCriterion("compoment not between", value1, value2, "compoment");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parentId is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parentId =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parentId <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parentId >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parentId >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parentId <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parentId <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parentId in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parentId not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parentId between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parentId not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("iconUrl is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("iconUrl is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("iconUrl =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("iconUrl <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("iconUrl >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("iconUrl >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("iconUrl <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("iconUrl <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("iconUrl like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("iconUrl not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("iconUrl in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("iconUrl not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("iconUrl between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("iconUrl not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andRequireAuthIsNull() {
            addCriterion("requireAuth is null");
            return (Criteria) this;
        }

        public Criteria andRequireAuthIsNotNull() {
            addCriterion("requireAuth is not null");
            return (Criteria) this;
        }

        public Criteria andRequireAuthEqualTo(Boolean value) {
            addCriterion("requireAuth =", value, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthNotEqualTo(Boolean value) {
            addCriterion("requireAuth <>", value, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthGreaterThan(Boolean value) {
            addCriterion("requireAuth >", value, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthGreaterThanOrEqualTo(Boolean value) {
            addCriterion("requireAuth >=", value, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthLessThan(Boolean value) {
            addCriterion("requireAuth <", value, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthLessThanOrEqualTo(Boolean value) {
            addCriterion("requireAuth <=", value, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthIn(List<Boolean> values) {
            addCriterion("requireAuth in", values, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthNotIn(List<Boolean> values) {
            addCriterion("requireAuth not in", values, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthBetween(Boolean value1, Boolean value2) {
            addCriterion("requireAuth between", value1, value2, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andRequireAuthNotBetween(Boolean value1, Boolean value2) {
            addCriterion("requireAuth not between", value1, value2, "requireAuth");
            return (Criteria) this;
        }

        public Criteria andKeepAliveIsNull() {
            addCriterion("keepAlive is null");
            return (Criteria) this;
        }

        public Criteria andKeepAliveIsNotNull() {
            addCriterion("keepAlive is not null");
            return (Criteria) this;
        }

        public Criteria andKeepAliveEqualTo(Boolean value) {
            addCriterion("keepAlive =", value, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveNotEqualTo(Boolean value) {
            addCriterion("keepAlive <>", value, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveGreaterThan(Boolean value) {
            addCriterion("keepAlive >", value, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("keepAlive >=", value, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveLessThan(Boolean value) {
            addCriterion("keepAlive <", value, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveLessThanOrEqualTo(Boolean value) {
            addCriterion("keepAlive <=", value, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveIn(List<Boolean> values) {
            addCriterion("keepAlive in", values, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveNotIn(List<Boolean> values) {
            addCriterion("keepAlive not in", values, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveBetween(Boolean value1, Boolean value2) {
            addCriterion("keepAlive between", value1, value2, "keepAlive");
            return (Criteria) this;
        }

        public Criteria andKeepAliveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("keepAlive not between", value1, value2, "keepAlive");
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
     * 数据库表：blog_menu
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
     * 数据库表：blog_menu
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