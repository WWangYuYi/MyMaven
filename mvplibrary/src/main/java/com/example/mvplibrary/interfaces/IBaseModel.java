package com.example.mvplibrary.interfaces;

import io.reactivex.disposables.Disposable;

public interface IBaseModel {
    void addDisposible(Disposable disposable);
    void clear();
}