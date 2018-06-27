package cn.edu.gdmec.android.okhttp3demo.mvp.model;


import cn.edu.gdmec.android.okhttp3demo.mvp.BookBean;
import cn.edu.gdmec.android.okhttp3demo.mvp.WeatherBean;
import cn.edu.gdmec.android.okhttp3demo.mvp.utils.OkHttpUtils;

/**
 * Created by Jack on 2018/5/22.
 */

public class BookModel implements IBookModel{
    @Override
    public void  loadBook(String url,final ILoadListener loadListener){
        OkHttpUtils.ResultCallback resultCallback=new OkHttpUtils.ResultCallback() {
            @Override
            public void getBook(BookBean bookBean) {
                loadListener.onSuccess(bookBean);
            }


            @Override
            public void onFailure(Exception e) {
                loadListener.onFailure(e);
            }
        };
        OkHttpUtils.getResultCallback(url,resultCallback);
    }


}
