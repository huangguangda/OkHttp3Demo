package cn.edu.gdmec.android.okhttp3demo.mvp.model;

import cn.edu.gdmec.android.okhttp3demo.mvp.WeatherBean;
import cn.edu.gdmec.android.okhttp3demo.mvp.utils.OkHttpUtils;

/**
 * Created by Jack on 2018/5/15.
 */

public class WeatherModel implements IWeatherModel {
    @Override
    public void loadWeather(String url, final ILoadListener loadListener) {
        OkHttpUtils.ResultCallback resultCallback=new OkHttpUtils.ResultCallback() {
            @Override
            public void getWeather(WeatherBean weatherBean) {
                loadListener.onSuccess(weatherBean);
            }

            @Override
            public void onFailure(Exception e) {
                loadListener.onFailure(e);
            }
        };
        OkHttpUtils.getResultCallback(url,resultCallback);
    }
}