package cn.edu.gdmec.android.okhttp3demo.mvp.presenter;

import cn.edu.gdmec.android.okhttp3demo.mvp.View.IWeatherView;
import cn.edu.gdmec.android.okhttp3demo.mvp.WeatherBean;
import cn.edu.gdmec.android.okhttp3demo.mvp.model.ILoadListener;
import cn.edu.gdmec.android.okhttp3demo.mvp.model.IWeatherModel;
import cn.edu.gdmec.android.okhttp3demo.mvp.model.WeatherModel;

public class WeatherPresenter{ /*implements IWeatherPresenter,ILoadListener {

    private String url = "https://www.sojson.com/open/api/weather/json.shtml?city=";

    private IWeatherView iWeatherView;
    private IWeatherModel iWeatherModel;

    public WeatherPresenter(IWeatherView iWeatherView) {
        this.iWeatherView = iWeatherView;
        this.iWeatherModel=new WeatherModel();
    }

    @Override
    public void loadWeather(String city) {
        iWeatherView.showProgress();
        iWeatherModel.loadWeather(url+city,this);
    }

    @Override
    public void onSuccess(WeatherBean bean) {
        iWeatherView.hideProgress();
        iWeatherView.showWeatherData(bean);
    }

    @Override
    public void onFailure(Exception e) {
        iWeatherView.hideProgress();
        iWeatherView.showLoadFailMsg(e);
    }*/
}