package com.xyhy.blog.items;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
	protected int offset;
	
	protected int limit;
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitlePicIsNull() {
            addCriterion("title_pic is null");
            return (Criteria) this;
        }

        public Criteria andTitlePicIsNotNull() {
            addCriterion("title_pic is not null");
            return (Criteria) this;
        }

        public Criteria andTitlePicEqualTo(String value) {
            addCriterion("title_pic =", value, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicNotEqualTo(String value) {
            addCriterion("title_pic <>", value, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicGreaterThan(String value) {
            addCriterion("title_pic >", value, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicGreaterThanOrEqualTo(String value) {
            addCriterion("title_pic >=", value, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicLessThan(String value) {
            addCriterion("title_pic <", value, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicLessThanOrEqualTo(String value) {
            addCriterion("title_pic <=", value, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicLike(String value) {
            addCriterion("title_pic like", value, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicNotLike(String value) {
            addCriterion("title_pic not like", value, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicIn(List<String> values) {
            addCriterion("title_pic in", values, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicNotIn(List<String> values) {
            addCriterion("title_pic not in", values, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicBetween(String value1, String value2) {
            addCriterion("title_pic between", value1, value2, "titlePic");
            return (Criteria) this;
        }

        public Criteria andTitlePicNotBetween(String value1, String value2) {
            addCriterion("title_pic not between", value1, value2, "titlePic");
            return (Criteria) this;
        }

        public Criteria andOrginIsNull() {
            addCriterion("orgin is null");
            return (Criteria) this;
        }

        public Criteria andOrginIsNotNull() {
            addCriterion("orgin is not null");
            return (Criteria) this;
        }

        public Criteria andOrginEqualTo(String value) {
            addCriterion("orgin =", value, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginNotEqualTo(String value) {
            addCriterion("orgin <>", value, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginGreaterThan(String value) {
            addCriterion("orgin >", value, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginGreaterThanOrEqualTo(String value) {
            addCriterion("orgin >=", value, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginLessThan(String value) {
            addCriterion("orgin <", value, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginLessThanOrEqualTo(String value) {
            addCriterion("orgin <=", value, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginLike(String value) {
            addCriterion("orgin like", value, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginNotLike(String value) {
            addCriterion("orgin not like", value, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginIn(List<String> values) {
            addCriterion("orgin in", values, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginNotIn(List<String> values) {
            addCriterion("orgin not in", values, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginBetween(String value1, String value2) {
            addCriterion("orgin between", value1, value2, "orgin");
            return (Criteria) this;
        }

        public Criteria andOrginNotBetween(String value1, String value2) {
            addCriterion("orgin not between", value1, value2, "orgin");
            return (Criteria) this;
        }

        public Criteria andAutorIsNull() {
            addCriterion("autor is null");
            return (Criteria) this;
        }

        public Criteria andAutorIsNotNull() {
            addCriterion("autor is not null");
            return (Criteria) this;
        }

        public Criteria andAutorEqualTo(String value) {
            addCriterion("autor =", value, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorNotEqualTo(String value) {
            addCriterion("autor <>", value, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorGreaterThan(String value) {
            addCriterion("autor >", value, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorGreaterThanOrEqualTo(String value) {
            addCriterion("autor >=", value, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorLessThan(String value) {
            addCriterion("autor <", value, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorLessThanOrEqualTo(String value) {
            addCriterion("autor <=", value, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorLike(String value) {
            addCriterion("autor like", value, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorNotLike(String value) {
            addCriterion("autor not like", value, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorIn(List<String> values) {
            addCriterion("autor in", values, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorNotIn(List<String> values) {
            addCriterion("autor not in", values, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorBetween(String value1, String value2) {
            addCriterion("autor between", value1, value2, "autor");
            return (Criteria) this;
        }

        public Criteria andAutorNotBetween(String value1, String value2) {
            addCriterion("autor not between", value1, value2, "autor");
            return (Criteria) this;
        }

        public Criteria andPageviewsIsNull() {
            addCriterion("pageviews is null");
            return (Criteria) this;
        }

        public Criteria andPageviewsIsNotNull() {
            addCriterion("pageviews is not null");
            return (Criteria) this;
        }

        public Criteria andPageviewsEqualTo(Integer value) {
            addCriterion("pageviews =", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotEqualTo(Integer value) {
            addCriterion("pageviews <>", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsGreaterThan(Integer value) {
            addCriterion("pageviews >", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pageviews >=", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsLessThan(Integer value) {
            addCriterion("pageviews <", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsLessThanOrEqualTo(Integer value) {
            addCriterion("pageviews <=", value, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsIn(List<Integer> values) {
            addCriterion("pageviews in", values, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotIn(List<Integer> values) {
            addCriterion("pageviews not in", values, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsBetween(Integer value1, Integer value2) {
            addCriterion("pageviews between", value1, value2, "pageviews");
            return (Criteria) this;
        }

        public Criteria andPageviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("pageviews not between", value1, value2, "pageviews");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Integer value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Integer value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Integer value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Integer value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Integer value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Integer> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Integer> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Integer value1, Integer value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Integer value1, Integer value2) {
            addCriterion("star not between", value1, value2, "star");
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