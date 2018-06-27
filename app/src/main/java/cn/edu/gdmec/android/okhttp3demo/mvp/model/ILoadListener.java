package cn.edu.gdmec.android.okhttp3demo.mvp.model;


import cn.edu.gdmec.android.okhttp3demo.mvp.BookBean;
import cn.edu.gdmec.android.okhttp3demo.mvp.WeatherBean;

/**
 * Created by Jack on 2018/5/15.
 */

public interface ILoadListener {
    /*void onSuccess(WeatherBean bean);
    void onFailure(Exception e);
*/
    void onSuccess(BookBean bean);
    void onFailure(Exception e);
}
