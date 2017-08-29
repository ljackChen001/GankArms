package com.cbl.gankarms.mvp.ui.fragment.home;

import com.cbl.gankarms.mvp.model.bean.RecommendBean;
import com.cbl.gankarms.mvp.ui.adapter.ContListAdapter;
import com.cbl.gankarms.mvp.ui.adapter.MoreContListAdapter;
import com.cbl.gankarms.mvp.ui.adapter.ShootOffActivityAdapter;
import com.cbl.gankarms.mvp.ui.adapter.TagListAdapter;
import com.cbl.gankarms.mvp.ui.adapter.helper.MyAdapter;
import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;

import io.reactivex.Observable;


public interface RecommendContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void getRecommendSuccess(RecommendBean dataList);

        void getContListSuccess();

        void setAdapter(ContListAdapter mAdapter);
        void setTagAdapter(TagListAdapter mAdapter);
        void setShootOffActivityAdapter(ShootOffActivityAdapter mAdapter);
        void setMoreContListAdapter(MoreContListAdapter mAdapter);
        void setMyAdapter(MyAdapter mAdapter);
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        //viewPager 推荐列表
        Observable<RecommendBean> getRecommendList(String isHome, String channelCode, String start);
    }
}
