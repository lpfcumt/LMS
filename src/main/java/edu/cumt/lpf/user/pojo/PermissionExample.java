package edu.cumt.lpf.user.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andRowidIsNull() {
            addCriterion("ROWID is null");
            return (Criteria) this;
        }

        public Criteria andRowidIsNotNull() {
            addCriterion("ROWID is not null");
            return (Criteria) this;
        }

        public Criteria andRowidEqualTo(Integer value) {
            addCriterion("ROWID =", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidNotEqualTo(Integer value) {
            addCriterion("ROWID <>", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidGreaterThan(Integer value) {
            addCriterion("ROWID >", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROWID >=", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidLessThan(Integer value) {
            addCriterion("ROWID <", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidLessThanOrEqualTo(Integer value) {
            addCriterion("ROWID <=", value, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidIn(List<Integer> values) {
            addCriterion("ROWID in", values, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidNotIn(List<Integer> values) {
            addCriterion("ROWID not in", values, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidBetween(Integer value1, Integer value2) {
            addCriterion("ROWID between", value1, value2, "rowid");
            return (Criteria) this;
        }

        public Criteria andRowidNotBetween(Integer value1, Integer value2) {
            addCriterion("ROWID not between", value1, value2, "rowid");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNull() {
            addCriterion("PERMISSION_ID is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("PERMISSION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(String value) {
            addCriterion("PERMISSION_ID =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(String value) {
            addCriterion("PERMISSION_ID <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(String value) {
            addCriterion("PERMISSION_ID >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_ID >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(String value) {
            addCriterion("PERMISSION_ID <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_ID <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLike(String value) {
            addCriterion("PERMISSION_ID like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotLike(String value) {
            addCriterion("PERMISSION_ID not like", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<String> values) {
            addCriterion("PERMISSION_ID in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<String> values) {
            addCriterion("PERMISSION_ID not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(String value1, String value2) {
            addCriterion("PERMISSION_ID between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_ID not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIsNull() {
            addCriterion("PERMISSION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIsNotNull() {
            addCriterion("PERMISSION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeEqualTo(String value) {
            addCriterion("PERMISSION_CODE =", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotEqualTo(String value) {
            addCriterion("PERMISSION_CODE <>", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeGreaterThan(String value) {
            addCriterion("PERMISSION_CODE >", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_CODE >=", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLessThan(String value) {
            addCriterion("PERMISSION_CODE <", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_CODE <=", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLike(String value) {
            addCriterion("PERMISSION_CODE like", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotLike(String value) {
            addCriterion("PERMISSION_CODE not like", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIn(List<String> values) {
            addCriterion("PERMISSION_CODE in", values, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotIn(List<String> values) {
            addCriterion("PERMISSION_CODE not in", values, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeBetween(String value1, String value2) {
            addCriterion("PERMISSION_CODE between", value1, value2, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_CODE not between", value1, value2, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("RESOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("RESOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(String value) {
            addCriterion("RESOURCE_TYPE =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("RESOURCE_TYPE >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(String value) {
            addCriterion("RESOURCE_TYPE <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLike(String value) {
            addCriterion("RESOURCE_TYPE like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotLike(String value) {
            addCriterion("RESOURCE_TYPE not like", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<String> values) {
            addCriterion("RESOURCE_TYPE in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("RESOURCE_TYPE not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIsNull() {
            addCriterion("RESOURCE_URL is null");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIsNotNull() {
            addCriterion("RESOURCE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andResourceUrlEqualTo(String value) {
            addCriterion("RESOURCE_URL =", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotEqualTo(String value) {
            addCriterion("RESOURCE_URL <>", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlGreaterThan(String value) {
            addCriterion("RESOURCE_URL >", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_URL >=", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLessThan(String value) {
            addCriterion("RESOURCE_URL <", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_URL <=", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLike(String value) {
            addCriterion("RESOURCE_URL like", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotLike(String value) {
            addCriterion("RESOURCE_URL not like", value, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlIn(List<String> values) {
            addCriterion("RESOURCE_URL in", values, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotIn(List<String> values) {
            addCriterion("RESOURCE_URL not in", values, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlBetween(String value1, String value2) {
            addCriterion("RESOURCE_URL between", value1, value2, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andResourceUrlNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_URL not between", value1, value2, "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionIsNull() {
            addCriterion("PERMISSION_PERMISSION is null");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionIsNotNull() {
            addCriterion("PERMISSION_PERMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionEqualTo(String value) {
            addCriterion("PERMISSION_PERMISSION =", value, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionNotEqualTo(String value) {
            addCriterion("PERMISSION_PERMISSION <>", value, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionGreaterThan(String value) {
            addCriterion("PERMISSION_PERMISSION >", value, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("PERMISSION_PERMISSION >=", value, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionLessThan(String value) {
            addCriterion("PERMISSION_PERMISSION <", value, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionLessThanOrEqualTo(String value) {
            addCriterion("PERMISSION_PERMISSION <=", value, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionLike(String value) {
            addCriterion("PERMISSION_PERMISSION like", value, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionNotLike(String value) {
            addCriterion("PERMISSION_PERMISSION not like", value, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionIn(List<String> values) {
            addCriterion("PERMISSION_PERMISSION in", values, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionNotIn(List<String> values) {
            addCriterion("PERMISSION_PERMISSION not in", values, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionBetween(String value1, String value2) {
            addCriterion("PERMISSION_PERMISSION between", value1, value2, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionNotBetween(String value1, String value2) {
            addCriterion("PERMISSION_PERMISSION not between", value1, value2, "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPearentCodeIsNull() {
            addCriterion("PEARENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPearentCodeIsNotNull() {
            addCriterion("PEARENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPearentCodeEqualTo(String value) {
            addCriterion("PEARENT_CODE =", value, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeNotEqualTo(String value) {
            addCriterion("PEARENT_CODE <>", value, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeGreaterThan(String value) {
            addCriterion("PEARENT_CODE >", value, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PEARENT_CODE >=", value, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeLessThan(String value) {
            addCriterion("PEARENT_CODE <", value, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeLessThanOrEqualTo(String value) {
            addCriterion("PEARENT_CODE <=", value, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeLike(String value) {
            addCriterion("PEARENT_CODE like", value, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeNotLike(String value) {
            addCriterion("PEARENT_CODE not like", value, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeIn(List<String> values) {
            addCriterion("PEARENT_CODE in", values, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeNotIn(List<String> values) {
            addCriterion("PEARENT_CODE not in", values, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeBetween(String value1, String value2) {
            addCriterion("PEARENT_CODE between", value1, value2, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPearentCodeNotBetween(String value1, String value2) {
            addCriterion("PEARENT_CODE not between", value1, value2, "pearentCode");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusIsNull() {
            addCriterion("PERMISSION_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusIsNotNull() {
            addCriterion("PERMISSION_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusEqualTo(Integer value) {
            addCriterion("PERMISSION_STATUS =", value, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusNotEqualTo(Integer value) {
            addCriterion("PERMISSION_STATUS <>", value, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusGreaterThan(Integer value) {
            addCriterion("PERMISSION_STATUS >", value, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERMISSION_STATUS >=", value, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusLessThan(Integer value) {
            addCriterion("PERMISSION_STATUS <", value, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("PERMISSION_STATUS <=", value, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusIn(List<Integer> values) {
            addCriterion("PERMISSION_STATUS in", values, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusNotIn(List<Integer> values) {
            addCriterion("PERMISSION_STATUS not in", values, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSION_STATUS between", value1, value2, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andPermissionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("PERMISSION_STATUS not between", value1, value2, "permissionStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("LAST_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("LAST_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("LAST_UPDATE_TIME >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("LAST_UPDATE_TIME <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPDATE_TIME <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("LAST_UPDATE_TIME not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPDATE_TIME not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("MARK like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("MARK not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("MARK not between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLikeInsensitive(String value) {
            addCriterion("upper(PERMISSION_ID) like", value.toUpperCase(), "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLikeInsensitive(String value) {
            addCriterion("upper(PERMISSION_CODE) like", value.toUpperCase(), "permissionCode");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLikeInsensitive(String value) {
            addCriterion("upper(RESOURCE_TYPE) like", value.toUpperCase(), "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceUrlLikeInsensitive(String value) {
            addCriterion("upper(RESOURCE_URL) like", value.toUpperCase(), "resourceUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionPermissionLikeInsensitive(String value) {
            addCriterion("upper(PERMISSION_PERMISSION) like", value.toUpperCase(), "permissionPermission");
            return (Criteria) this;
        }

        public Criteria andPearentCodeLikeInsensitive(String value) {
            addCriterion("upper(PEARENT_CODE) like", value.toUpperCase(), "pearentCode");
            return (Criteria) this;
        }

        public Criteria andMarkLikeInsensitive(String value) {
            addCriterion("upper(MARK) like", value.toUpperCase(), "mark");
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