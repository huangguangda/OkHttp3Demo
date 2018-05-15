package cn.edu.gdmec.android.okhttp3demo.mvp.utils;
import com.google.gson.Gson;
import cn.edu.gdmec.android.okhttp3demo.mvp.WeatherBean;

public class JsonUtils {

    public static WeatherBean getWeather(String res) {
        Gson gson = new Gson();
        WeatherBean weatherBean = gson.fromJson(res, WeatherBean.class);
        return weatherBean;
    }
}
