package com.sherfin.mapperBean;

import javax.persistence.*;

@Table(name = "bank_card")
public class BankCard {
    /**
     * 主键
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 用户标识
     */
    @Column(name = "CONSUMER_ID")
    private Long consumerId;

    /**
     * 银行编码
     */
    @Column(name = "BANK_CODE")
    private String bankCode;

    /**
     * 银行名称
     */
    @Column(name = "BANK_NAME")
    private String bankName;

    /**
     * 银行卡号
     */
    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    /**
     * 银行预留手机号
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 可用状态
     */
    @Column(name = "STATUS")
    private Boolean status;

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
     * 获取银行编码
     *
     * @return BANK_CODE - 银行编码
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置银行编码
     *
     * @param bankCode 银行编码
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    /**
     * 获取银行名称
     *
     * @return BANK_NAME - 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     *
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 获取银行卡号
     *
     * @return CARD_NUMBER - 银行卡号
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置银行卡号
     *
     * @param cardNumber 银行卡号
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    /**
     * 获取银行预留手机号
     *
     * @return MOBILE - 银行预留手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置银行预留手机号
     *
     * @param mobile 银行预留手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
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
}