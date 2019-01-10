package com.wuyazhou.learn.pagermodel.showlogview;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author wuyzh
 * 存储需要展示的信息
 * */
public class ShowLogUtil {
    public static final String CLEAN_LOG = "clean_all_clean_all";
    private static PriorityBlockingQueue<String> mPriorityBlockingQueue = null;

    public static void addLog(String string){
        mPriorityBlockingQueue.add(string);
    }

    public static void clean(){
        mPriorityBlockingQueue.add(CLEAN_LOG);
    }

    public static PriorityBlockingQueue getLogQueue(){
        if (mPriorityBlockingQueue == null){
            mPriorityBlockingQueue = new PriorityBlockingQueue<String>();
        }
        return mPriorityBlockingQueue;
    }

    public static void release(){
        mPriorityBlockingQueue = null;
    }
}
