package com.dzy.hj.entity;


import java.util.List;

/**
 * Created by dengzhiyuan on 2017/3/14.
 */


public class CategoryResponse extends BaseResponse {

    private int categoryId;

    private String categoryName;

    private int parentId;

    private Boolean isActive;

    private Boolean isHide;

    private Boolean isHighLight;

    //这个单词拼写错误，为了兼容以前返回的接口，不改动
    private int bussinessId;

    private List<CategoryResponse> childNodeList;

    private String url;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getHide() {
        return isHide;
    }

    public void setHide(Boolean hide) {
        isHide = hide;
    }

    public Boolean getHighLight() {
        return isHighLight;
    }

    public void setHighLight(Boolean highLight) {
        isHighLight = highLight;
    }

    public int getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(int bussinessId) {
        this.bussinessId = bussinessId;
    }

    public List<CategoryResponse> getChildNodeList() {
        return childNodeList;
    }

    public void setChildNodeList(List<CategoryResponse> childNodeList) {
        this.childNodeList = childNodeList;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
