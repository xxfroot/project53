package com.sherfin.mapperBean;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "balance_record_view")
public class BalanceRecordView {
    /**
     * 用户标识
     */
    @Column(name = "CONSUMER_ID")
    private Long consumerId;

    /**
     * 用户编码,生成唯一,用户在存管系统标识
     */
    @Column(name = "USER_NO")
    private String userNo;

    /**
     * 金额
     */
    @Column(name = "AMOUNT")
    private BigDecimal amount;

    /**
     * 触发时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 回调状态
     */
    @Column(name = "CALLBACK_STATUS")
    private Boolean callbackStatus;

    /**
     * 获取用户标识
     *
     * @return CONSUMER_ID - 用户标识
     */
    public Long getConsumerId() {
        return consumerId;
    }

    /**
     * 设置用户标识
     *
     * @param consumerId 用户标识
     */
    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
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
     * 获取金额
     *
     * @return AMOUNT - 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置金额
     *
     * @param amount 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取触发时间
     *
     * @return CREATE_DATE - 触发时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置触发时间
     *
     * @param createDate 触发时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取回调状态
     *
     * @return CALLBACK_STATUS - 回调状态
     */
    public Boolean getCallbackStatus() {
        return callbackStatus;
    }

    /**
     * 设置回调状态
     *
     * @param callbackStatus 回调状态
     */
    public void setCallbackStatus(Boolean callbackStatus) {
        this.callbackStatus = callbackStatus;
    }
}