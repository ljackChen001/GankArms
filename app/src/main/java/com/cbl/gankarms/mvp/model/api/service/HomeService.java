package com.cbl.gankarms.mvp.model.api.service;

import com.cbl.gankarms.mvp.model.bean.CategoryListBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface HomeService {

    /**
     * @return 首页Tab列表
     */
    @GET("getCategorys.jsp")
    Observable<CategoryListBean> getCategorys();


}
