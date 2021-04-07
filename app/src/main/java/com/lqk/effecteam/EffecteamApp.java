package com.lqk.effecteam;

import android.app.Application;

import com.xuexiang.xui.XUI;

/**
 * Create By LiuQK on 2021/4/6
 * Describe:
 */
public class EffecteamApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        XUI.init(this); //初始化UI框架
        XUI.debug(true);  //开启UI框架调试日志

    }
}