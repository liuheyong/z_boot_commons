package com.boot.commons.dto;

import java.io.Serializable;

public class ECooperateMer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cooperateMerSeq;

    private String agentMerSeq;

    private String merName;

    private String imageLink;

    private String merLink;

    private String isShow;

    private Integer eOrder;

    public String getCooperateMerSeq() {
        return cooperateMerSeq;
    }

    public void setCooperateMerSeq(String cooperateMerSeq) {
        this.cooperateMerSeq = cooperateMerSeq;
    }

    public String getAgentMerSeq() {
        return agentMerSeq;
    }

    public void setAgentMerSeq(String agentMerSeq) {
        this.agentMerSeq = agentMerSeq;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getMerLink() {
        return merLink;
    }

    public void setMerLink(String merLink) {
        this.merLink = merLink;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public Integer geteOrder() {
        return eOrder;
    }

    public void seteOrder(Integer eOrder) {
        this.eOrder = eOrder;
    }
}