package com.owenguo.observer;


public interface Subject {
    /**
     * 订阅
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 取消订阅
     *
     * @param observer
     */
    void remove(Observer observer);

    /**
     * 发送消息
     */
    void notifyObservers();
}
