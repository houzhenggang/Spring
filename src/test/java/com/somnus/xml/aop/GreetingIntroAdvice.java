package com.somnus.xml.aop;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.stereotype.Component;

/** 
 * @Title: GreetingIntroAdvice.java 
 * @Package com.somnus.xml.aop 
 * @Description: TODO
 * @author Somnus
 * @date 2015年6月1日 下午2:06:56 
 * @version V1.0 
 */
@Component
public class GreetingIntroAdvice extends DelegatingIntroductionInterceptor implements Apology {
 
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        return super.invoke(invocation);
    }
 
    @Override
    public void saySorry(String name) {
        System.out.println("Sorry! " + name);
    }
}