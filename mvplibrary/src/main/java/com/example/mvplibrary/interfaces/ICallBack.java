package com.example.mvplibrary.interfaces;


public interface ICallBack<T> {
    void success(T t);
    void fail(String error);

}