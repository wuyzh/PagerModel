package com.wuyazhou.learn.pagermodel.showlogview;
/**
 * @author wuyzh
 * @fuction 显示log的回调
 * */
public interface ShowLogViewContract {
    /**
     * 显示log
     * @param key
     * @param value
     * */
    void showLog(String key,String value);
}
