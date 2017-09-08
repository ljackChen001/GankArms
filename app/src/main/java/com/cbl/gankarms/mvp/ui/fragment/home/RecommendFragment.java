package com.cbl.gankarms.mvp.ui.fragment.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cbl.gankarms.R;
import com.cbl.gankarms.di.component.DaggerRecommendComponent;
import com.cbl.gankarms.di.module.RecommendModule;
import com.cbl.gankarms.mvp.ui.adapter.helper.RecommendAdapter;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.scwang.smartrefresh.header.MaterialHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadmoreListener;

import butterknife.BindView;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

import static com.cbl.gankarms.R.id.refreshLayout;
import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * 推荐
 */
public class RecommendFragment extends BaseFragment<RecommendPresenter> implements RecommendContract.View {


    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;
    @BindView(refreshLayout)
    RefreshLayout mRefreshLayout;
    private boolean isLoadingMore;

    @Override
    public void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
    }

    public static RecommendFragment newInstance() {
        RecommendFragment fragment = new RecommendFragment();
        return fragment;
    }

    @Override
    public void setupFragmentComponent(AppComponent appComponent) {
        DaggerRecommendComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .recommendModule(new RecommendModule(this))
                .build()
                .inject(this);
    }

    @Override
    public View initView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_list_recyclerview, container, false);
    }

    @Override
    public void initData(Bundle savedInstanceState) {
        mPresenter.getRecommendList(true);
    }

    /**
     * 此方法是让外部调用使fragment做一些操作的,比如说外部的activity想让fragment对象执行一些方法,
     * 建议在有多个需要让外界调用的方法时,统一传Message,通过what字段,来区分不同的方法,在setData
     * 方法中就可以switch做不同的操作,这样就可以用统一的入口方法做不同的事
     * <p>
     * 使用此方法时请注意调用时fragment的生命周期,如果调用此setData方法时onCreate还没执行
     * setData里却调用了presenter的方法时,是会报空的,因为dagger注入是在onCreated方法中执行的,然后才创建的presenter
     * 如果要做一些初始化操作,可以不必让外部调setData,在initData中初始化就可以了
     *
     * @param data
     */

    @Override
    public void setData(Object data) {

    }


    @Override
    public void showLoading() {
        //        mSwipeRefreshLayout.setRefreshing(true);
        //        mSwipeRefreshLayout.setColorSchemeResources(
        //                android.R.color.holo_blue_bright,
        //                android.R.color.holo_green_light,
        //                android.R.color.holo_orange_light,
        //                android.R.color.holo_red_light);
    }

    @Override
    public void hideLoading() {
        mRefreshLayout.finishRefresh(true);
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {

    }

    @Override
    public void startLoadMore() {
        isLoadingMore = true;
    }

    @Override
    public void endLoadMore() {
        isLoadingMore = false;
        mRefreshLayout.finishLoadmore(true);
    }

    @Override
    public void setAdapter(RecommendAdapter mAdapter) {
        mRecyclerView.setAdapter(mAdapter);
        initRecycleView();
        //        initPaginate();
    }


    private void initRecycleView() {
        //设置 Header 为 Material风格
        mRefreshLayout.setRefreshHeader(new MaterialHeader(getActivity()).setShowBezierWave(true));
        //设置 Footer 为 球脉冲
        mRefreshLayout.setRefreshFooter(new BallPulseFooter(getActivity()).setSpinnerStyle(SpinnerStyle.Scale));
        mRefreshLayout.setOnRefreshLoadmoreListener(new OnRefreshLoadmoreListener() {
            @Override
            public void onLoadmore(RefreshLayout refreshlayout) {
                mPresenter.getRecommendList(false);
            }
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                mPresenter.getRecommendList(true);
            }
        });
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setSmoothScrollbarEnabled(true);
        layoutManager.setAutoMeasureEnabled(true);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setHasFixedSize(true);
//        ArmsUtils.configRecycleView(mRecyclerView, new LinearLayoutManager(getActivity()));
    }


}
