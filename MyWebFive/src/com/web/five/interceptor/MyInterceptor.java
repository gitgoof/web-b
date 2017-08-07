package com.web.five.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 自定义拦截器。
 * Created by gaofeng on 2017/7/11.
 */
public class MyInterceptor extends AbstractInterceptor {
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        // TODO 在执行期进行操作
        System.out.println("拦截器执行前");
        String invoke = actionInvocation.invoke();
        // TODO 在执行后进行操作
        System.out.println("拦截器执行后");
        return invoke;
    }
}
