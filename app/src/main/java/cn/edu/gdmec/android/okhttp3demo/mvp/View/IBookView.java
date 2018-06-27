package cn.edu.gdmec.android.okhttp3demo.mvp.View;

import cn.edu.gdmec.android.okhttp3demo.mvp.BookBean;

/**
 * Created by Jack on 2018/5/22.
 */

public interface IBookView {
    void showProgress();
    void hideProgress();
    void showBookData(BookBean bookBean);
    void showLoadFailMsg(Exception e);
}
