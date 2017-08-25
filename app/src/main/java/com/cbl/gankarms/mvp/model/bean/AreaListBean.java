package com.cbl.gankarms.mvp.model.bean;

import java.io.Serializable;

/**
 * Created by chenbaolin on 2017/8/24.
 */

public class AreaListBean implements Serializable {

    /**
     * area_id : 103001
     * expInfo : {"algorighm_exp_id":"2001","front_exp_id":"0",
     * "s_value":"c980be69-d4f6-4980-a10d-7263d6e1bd1e_13571132554348919"}
     */

    private String area_id;
    private ExpInfoBean expInfo;

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public ExpInfoBean getExpInfo() {
        return expInfo;
    }

    public void setExpInfo(ExpInfoBean expInfo) {
        this.expInfo = expInfo;
    }

    public static class ExpInfoBean {
        /**
         * algorighm_exp_id : 2001
         * front_exp_id : 0
         * s_value : c980be69-d4f6-4980-a10d-7263d6e1bd1e_13571132554348919
         */

        private String algorighm_exp_id;
        private String front_exp_id;
        private String s_value;

        public String getAlgorighm_exp_id() {
            return algorighm_exp_id;
        }

        public void setAlgorighm_exp_id(String algorighm_exp_id) {
            this.algorighm_exp_id = algorighm_exp_id;
        }

        public String getFront_exp_id() {
            return front_exp_id;
        }

        public void setFront_exp_id(String front_exp_id) {
            this.front_exp_id = front_exp_id;
        }

        public String getS_value() {
            return s_value;
        }

        public void setS_value(String s_value) {
            this.s_value = s_value;
        }
    }


}
