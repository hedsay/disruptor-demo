package com.rui.common;

import com.lmax.disruptor.EventFactory;

public class MyEventFactory<T> implements EventFactory<MyEvent<T>> {
    @Override
    public MyEvent<T> newInstance() {
        return new MyEvent<>();
    }
}
