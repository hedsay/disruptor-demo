package com.rui.common;

import lombok.Data;

@Data
public class MyEvent<T> {

    private T data;

}
