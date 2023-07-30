package com.rui.common;

import com.lmax.disruptor.ExceptionHandler;

public class MyExceptionHandler<T> implements ExceptionHandler<MyEvent<T>> {
    @Override
    public void handleEventException(Throwable throwable, long l, MyEvent<T> tMyEvent) {
        System.out.println("handleEventException");
    }

    @Override
    public void handleOnStartException(Throwable throwable) {
        System.out.println("handleOnStartException");
    }

    @Override
    public void handleOnShutdownException(Throwable throwable) {
        System.out.println("handleOnShutdownException");
    }
}
