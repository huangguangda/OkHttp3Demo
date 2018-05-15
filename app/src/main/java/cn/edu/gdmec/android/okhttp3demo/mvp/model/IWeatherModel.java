package cn.edu.gdmec.android.okhttp3demo.mvp.model;

/**
 * Created by Jack on 2018/5/15.
 */

public interface IWeatherModel {
    void loadWeather(String url,ILoadListener loadListener);
}