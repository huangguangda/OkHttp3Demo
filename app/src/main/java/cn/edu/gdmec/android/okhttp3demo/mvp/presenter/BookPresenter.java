package cn.edu.gdmec.android.okhttp3demo.mvp.presenter;

import cn.edu.gdmec.android.okhttp3demo.mvp.BookBean;
import cn.edu.gdmec.android.okhttp3demo.mvp.View.IBookView;
import cn.edu.gdmec.android.okhttp3demo.mvp.model.BookModel;
import cn.edu.gdmec.android.okhttp3demo.mvp.model.IBookModel;
import cn.edu.gdmec.android.okhttp3demo.mvp.model.ILoadListener;

/**
 * Created by Jack on 2018/5/22.
 */

public class BookPresenter implements IBookPresenter,ILoadListener {
    private String url = "https://api.douban.com/v2/book/search?q=%E9%87%91%E7%93%B6%E6%A2%85&tag=&start=0&count=1";

    private IBookView iBookView;
    private IBookModel iBookModel;

    public BookPresenter(IBookView iBookView){
        this.iBookView = iBookView;
        this.iBookModel = new BookModel();
    }

    @Override
    public void loadBook(){
        iBookView.showProgress();
        iBookModel.loadBook(url,this);
    }

    @Override
    public void onSuccess(BookBean bean){
        iBookView.hideProgress();
        iBookView.showBookData(bean);
    }

    @Override
    public void onFailure(Exception e) {
        iBookView.hideProgress();
        iBookView.showLoadFailMsg(e);
    }
}
