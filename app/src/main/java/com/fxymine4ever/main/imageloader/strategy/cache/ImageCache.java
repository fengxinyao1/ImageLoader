package com.fxymine4ever.main.imageloader.strategy.cache;

import android.graphics.Bitmap;

/**
 * create by:Fxymine4ever
 * time: 2019/2/12
 * 缓存抽象接口
 */
public interface ImageCache {
    void put(String url, Bitmap bitmap);

    Bitmap get(String url,int width,int height);
}
