package com.sherfin.mapperBean;

import java.util.Date;
import javax.persistence.*;

@Table(name = "consumer_details")
public class ConsumerDetails {
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
     * 身份证照片面标识
     */
    @Column(name = "ID_CARD_PHOTO")
    private String idCardPhoto;

    /**
     * 身份证国徽面标识
     */
    @Column(name = "ID_CARD_EMBLEM")
    private String idCardEmblem;

    /**
     * 住址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 企业邮箱
     */
    @Column(name = "ENTERPRISE_MAIL")
    private String enterpriseMail;

    /**
     * 联系人关系
     */
    @Column(name = "CONTACT_RELATION")
    private String contactRelation;

    /**
     * 联系人姓名
     */
    @Column(name = "CONTACT_NAME")
    private String contactName;

    /**
     * 联系人电话
     */
    @Column(name = "CONTACT_MOBILE")
    private String contactMobile;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

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
     * 获取身份证照片面标识
     *
     * @return ID_CARD_PHOTO - 身份证照片面标识
     */
    public String getIdCardPhoto() {
        return idCardPhoto;
    }

    /**
     * 设置身份证照片面标识
     *
     * @param idCardPhoto 身份证照片面标识
     */
    public void setIdCardPhoto(String idCardPhoto) {
        this.idCardPhoto = idCardPhoto == null ? null : idCardPhoto.trim();
    }

    /**
     * 获取身份证国徽面标识
     *
     * @return ID_CARD_EMBLEM - 身份证国徽面标识
     */
    public String getIdCardEmblem() {
        return idCardEmblem;
    }

    /**
     * 设置身份证国徽面标识
     *
     * @param idCardEmblem 身份证国徽面标识
     */
    public void setIdCardEmblem(String idCardEmblem) {
        this.idCardEmblem = idCardEmblem == null ? null : idCardEmblem.trim();
    }

    /**
     * 获取住址
     *
     * @return ADDRESS - 住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置住址
     *
     * @param address 住址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取企业邮箱
     *
     * @return ENTERPRISE_MAIL - 企业邮箱
     */
    public String getEnterpriseMail() {
        return enterpriseMail;
    }

    /**
     * 设置企业邮箱
     *
     * @param enterpriseMail 企业邮箱
     */
    public void setEnterpriseMail(String enterpriseMail) {
        this.enterpriseMail = enterpriseMail == null ? null : enterpriseMail.trim();
    }

    /**
     * 获取联系人关系
     *
     * @return CONTACT_RELATION - 联系人关系
     */
    public String getContactRelation() {
        return contactRelation;
    }

    /**
     * 设置联系人关系
     *
     * @param contactRelation 联系人关系
     */
    public void setContactRelation(String contactRelation) {
        this.contactRelation = contactRelation == null ? null : contactRelation.trim();
    }

    /**
     * 获取联系人姓名
     *
     * @return CONTACT_NAME - 联系人姓名
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 设置联系人姓名
     *
     * @param contactName 联系人姓名
     */
    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    /**
     * 获取联系人电话
     *
     * @return CONTACT_MOBILE - 联系人电话
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * 设置联系人电话
     *
     * @param contactMobile 联系人电话
     */
    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile == null ? null : contactMobile.trim();
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_DATE - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}