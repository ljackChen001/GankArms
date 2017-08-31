package com.cbl.gankarms.mvp.ui.fragment.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cbl.gankarms.R;
import com.cbl.gankarms.di.component.DaggerRecommendComponent;
import com.cbl.gankarms.di.module.RecommendModule;
import com.cbl.gankarms.mvp.model.bean.RecommendBean;
import com.cbl.gankarms.mvp.ui.adapter.ContListAdapter;
import com.cbl.gankarms.mvp.ui.adapter.MoreContListAdapter;
import com.cbl.gankarms.mvp.ui.adapter.ShootOffActivityAdapter;
import com.cbl.gankarms.mvp.ui.adapter.TagListAdapter;
import com.cbl.gankarms.mvp.ui.adapter.helper.RecommendAdapter;
import com.jess.arms.base.BaseFragment;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

import butterknife.BindView;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * 推荐
 */
public class RecommendFragment extends BaseFragment<RecommendPresenter> implements RecommendContract.View {


    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;

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
        tv.setOnClickListener(v -> mPresenter.getRecommendList("1", "0"));

    }

    @Override
    public void onPause() {
        super.onPause();
        JCVideoPlayer.releaseAllVideos();
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

    }

    @Override
    public void hideLoading() {

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
    public void getRecommendSuccess(RecommendBean dataList) {
    }


    @Override
    public void getContListSuccess() {

    }

    @Override
    public void setAdapter(ContListAdapter mAdapter) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void setTagAdapter(TagListAdapter mAdapter) {
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 6, GridLayoutManager.VERTICAL, false);

        //        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager();
        //        flexboxLayoutManager.setFlexWrap(FlexWrap.WRAP);
        //        flexboxLayoutManager.setFlexDirection(FlexDirection.ROW);
        //        flexboxLayoutManager.setAlignItems(AlignItems.STRETCH);
        //        flexboxLayoutManager.setJustifyContent(JustifyContent.FLEX_START);
        //        mRecyclerView.setLayoutManager(flexboxLayoutManager);
        manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return manager.getSpanCount();
            }
        });
        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void setShootOffActivityAdapter(ShootOffActivityAdapter mAdapter) {
        //设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void setMoreContListAdapter(MoreContListAdapter mAdapter) {
        //设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void setMyAdapter(RecommendAdapter mAdapter) {
//        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager();
//        flexboxLayoutManager.setFlexWrap(FlexWrap.WRAP_REVERSE);
//        flexboxLayoutManager.setFlexDirection(FlexDirection.ROW);
//        flexboxLayoutManager.setAlignItems(AlignItems.STRETCH);
//        flexboxLayoutManager.setJustifyContent(JustifyContent.FLEX_START);
//        mRecyclerView.setLayoutManager(flexboxLayoutManager);
        //设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        //        initRecyclerView();
        //        mRecyclerView.setAdapter(mAdapter);
        //        mAdapter.notifyDataSetChanged();
        //        mAdapter.setMultiTypeDelegate(new MultiTypeDelegate<MutiTypeTitleEntity>() {
        //            @Override
        //            protected int getItemType(MutiTypeTitleEntity mutiTypeTitleEntity) {
        //                if (mutiTypeTitleEntity.getItemType() == 13) {
        //                    LogUtils.debugInfo("----------------------");
        //                    LinearLayoutManager manager = new LinearLayoutManager(getActivity(),
        //                            LinearLayoutManager.HORIZONTAL, false);
        //                    mRecyclerView.setLayoutManager(manager);
        //                    mRecyclerView.setAdapter(mAdapter);
        //                }
        //                return 13;
        //            }
        //        });
    }


}
