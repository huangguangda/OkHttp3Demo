package cn.edu.gdmec.android.okhttp3demo.mvp.View;

import cn.edu.gdmec.android.okhttp3demo.mvp.BookBean;
import cn.edu.gdmec.android.okhttp3demo.mvp.WeatherBean;

/**
 * Created by Jack on 2018/5/15.
 */

public interface IWeatherView {
    void showProgress();
    void hideProgress();
    void showWeatherData(WeatherBean weatherBean);

    void showBookData(BookBean bookBean);

    void showLoadFailMsg(Exception e);
}
