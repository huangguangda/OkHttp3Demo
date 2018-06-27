package cn.edu.gdmec.android.okhttp3demo.mvp.model;

/**
 * Created by Jack on 2018/5/22.
 */

public interface IBookModel {
    void loadBook(String url,ILoadListener loadListener);
}
