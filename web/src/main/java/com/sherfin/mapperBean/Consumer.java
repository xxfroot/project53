package com.sherfin.mapperBean;

import javax.persistence.*;

public class Consumer {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 用户名
     */
    @Column(name = "USERNAME")
    private String username;

    /**
     * 真实姓名
     */
    @Column(name = "FULLNAME")
    private String fullname;

    /**
     * 身份证号
     */
    @Column(name = "ID_NUMBER")
    private String idNumber;

    /**
     * 用户编码,生成唯一,用户在存管系统标识
     */
    @Column(name = "USER_NO")
    private String userNo;

    /**
     * 平台预留手机号
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 用户类型,个人or企业，预留
     */
    @Column(name = "USER_TYPE")
    private String userType;

    /**
     * 用户角色.B借款人or I投资人
     */
    @Column(name = "ROLE")
    private String role;

    /**
     * 存管授权列表
     */
    @Column(name = "AUTH_LIST")
    private String authList;

    /**
     * 是否已绑定银行卡
     */
    @Column(name = "IS_BIND_CARD")
    private Boolean isBindCard;

    @Column(name = "LOAN_AMOUNT")
    private Long loanAmount;

    /**
     * 可用状态
     */
    @Column(name = "STATUS")
    private Boolean status;

    /**
     * 请求流水号
     */
    @Column(name = "REQUEST_NO")
    private String requestNo;

    /**
     * 获取主键
     *
     * @return ID - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return USERNAME - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取真实姓名
     *
     * @return FULLNAME - 真实姓名
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * 设置真实姓名
     *
     * @param fullname 真实姓名
     */
    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    /**
     * 获取身份证号
     *
     * @return ID_NUMBER - 身份证号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置身份证号
     *
     * @param idNumber 身份证号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 获取用户编码,生成唯一,用户在存管系统标识
     *
     * @return USER_NO - 用户编码,生成唯一,用户在存管系统标识
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 设置用户编码,生成唯一,用户在存管系统标识
     *
     * @param userNo 用户编码,生成唯一,用户在存管系统标识
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * 获取平台预留手机号
     *
     * @return MOBILE - 平台预留手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置平台预留手机号
     *
     * @param mobile 平台预留手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取用户类型,个人or企业，预留
     *
     * @return USER_TYPE - 用户类型,个人or企业，预留
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置用户类型,个人or企业，预留
     *
     * @param userType 用户类型,个人or企业，预留
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * 获取用户角色.B借款人or I投资人
     *
     * @return ROLE - 用户角色.B借款人or I投资人
     */
    public String getRole() {
        return role;
    }

    /**
     * 设置用户角色.B借款人or I投资人
     *
     * @param role 用户角色.B借款人or I投资人
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * 获取存管授权列表
     *
     * @return AUTH_LIST - 存管授权列表
     */
    public String getAuthList() {
        return authList;
    }

    /**
     * 设置存管授权列表
     *
     * @param authList 存管授权列表
     */
    public void setAuthList(String authList) {
        this.authList = authList == null ? null : authList.trim();
    }

    /**
     * 获取是否已绑定银行卡
     *
     * @return IS_BIND_CARD - 是否已绑定银行卡
     */
    public Boolean getIsBindCard() {
        return isBindCard;
    }

    /**
     * 设置是否已绑定银行卡
     *
     * @param isBindCard 是否已绑定银行卡
     */
    public void setIsBindCard(Boolean isBindCard) {
        this.isBindCard = isBindCard;
    }

    /**
     * @return LOAN_AMOUNT
     */
    public Long getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount
     */
    public void setLoanAmount(Long loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * 获取可用状态
     *
     * @return STATUS - 可用状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置可用状态
     *
     * @param status 可用状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取请求流水号
     *
     * @return REQUEST_NO - 请求流水号
     */
    public String getRequestNo() {
        return requestNo;
    }

    /**
     * 设置请求流水号
     *
     * @param requestNo 请求流水号
     */
    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }
}