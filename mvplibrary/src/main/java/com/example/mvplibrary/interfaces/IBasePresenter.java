package com.example.mvplibrary.interfaces;

public interface IBasePresenter<V extends IBaseView> {
    void attachView(V view);
    void unAttachView();

}
