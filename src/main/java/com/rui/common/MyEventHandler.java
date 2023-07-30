package com.rui.common;

import com.lmax.disruptor.EventHandler;

public class MyEventHandler<T> implements EventHandler<MyEvent<T>> {
    @Override
    public void onEvent(MyEvent<T> tMyEvent, long l, boolean b) throws Exception {
        System.out.println(Thread.currentThread().getName() + "MyEventHandler消费：" + tMyEvent.getData());
    }
}
