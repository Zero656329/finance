package com.sunny.finance.base;

import java.math.BigDecimal;

public interface BaseService<T> {
    T getObjectById(BigDecimal id);
    Boolean delete(String  ids);
    Boolean update(T t);
    Boolean add(T t) ;
}
