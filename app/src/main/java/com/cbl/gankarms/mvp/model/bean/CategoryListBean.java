package com.cbl.gankarms.mvp.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenbaolin on 2017/8/22.
 */

public class CategoryListBean implements Serializable {


    /**
     * resultCode : 1
     * resultMsg : success
     * reqId : 270569cc-fc29-4e55-8eef-2a9a65cdcb9e
     * systemTime : 1503381851866
     * categoryList : [{"categoryId":"4","name":"娱乐","color":"#E966AE"},{"categoryId":"1","name":"社会","color":"#F04A50"},
     * {"categoryId":"6","name":"美食","color":"#F58D4E"},{"categoryId":"7","name":"搞笑","color":"#B869AD"},
     * {"categoryId":"2","name":"世界","color":"#33B7A7"},{"categoryId":"8","name":"科技","color":"#33A7D8"},
     * {"categoryId":"9","name":"体育","color":"#FECE3E"},{"categoryId":"3","name":"财富","color":"#3276B5"},
     * {"categoryId":"31","name":"汽车","color":"#6E8490"},{"categoryId":"10","name":"新知","color":"#A2B0A0"},
     * {"categoryId":"5","name":"生活","color":"#8CD931"},{"categoryId":"17","name":"二次元","color":"#00C9E3"}]
     */

    private String resultCode;
    private String resultMsg;
    private String reqId;
    private String systemTime;
    private List<CategoryList> categoryList;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(String systemTime) {
        this.systemTime = systemTime;
    }

    public List<CategoryList> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<CategoryList> categoryList) {
        this.categoryList = categoryList;
    }

    public static class CategoryList {
        /**
         * categoryId : 4
         * name : 娱乐
         * color : #E966AE
         */

        private String categoryId;
        private String name;
        private String color;

        public String getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
}
