package com.chen.making.wheel.framework.spring.aop.advice;

import java.lang.reflect.Method;

/**
 * 后置返回通知
 * @author 陈添明
 * @date 2019/6/2
 */
public class AfterReturningAdvice extends AbstractAdvice {

    public AfterReturningAdvice(Object aspectObject, Method aspectMethod) {
        super(aspectObject, aspectMethod);
    }


    @Override
    public void afterReturning(Object retVal, Method method, Object[] arguments, Object target) throws Throwable {
        aspectMethod.invoke(aspectObject, null);
    }


    @Override
    public boolean isBeforeAdvice() {
        return false;
    }

    @Override
    public boolean isAfterAdvice() {
        return false;
    }
}
