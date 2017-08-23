package com.cbl.gankarms.mvp.model.api.service;

import com.cbl.gankarms.mvp.model.bean.CategoryListBean;
import com.cbl.gankarms.mvp.model.bean.RecommendBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HomeService {

    /**
     * @return 首页Tab列表
     */
    @GET("getCategorys.jsp")
    Observable<CategoryListBean> getCategorys();

    @GET("getVodConts.jsp")
    Observable<RecommendBean> getRecommendList(@Query("isHome") String isHome,
                                               @Query("channelCode") String channelCode,
                                               @Query("start") String start);
}
