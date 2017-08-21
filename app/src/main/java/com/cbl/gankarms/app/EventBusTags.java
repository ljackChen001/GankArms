package com.cbl.gankarms.app;

/**
 * Created by chenbaolin on 2017/8/21.
 * 存放 EventBus 常量
 */

public interface EventBusTags {
    String AROUTER_PATH_MAIN = "/Main/Main";
    String AROUTER_PATH_TEST = "/Main/Test";

    String ACTIVITY_FRAGMENT_REPLACE = "ActivityFragmentReplace";

    int MAIN_FRAGMENT_HOME = 11;
    int MAIN_FRAGMENT_DASHBOARD = 12;
    int MAIN_FRAGMENT_NOTIFICATIONS = 13;

    int SETTING_FRAGMENT_HOME = 101;
    int SETTING_FRAGMENT_DASHBOARD = 201;
    int SETTING_FRAGMENT_NOTIFICATIONS = 301;
}
