package com.web.five.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import javax.swing.plaf.TextUI;
import java.applet.AppletContext;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaofeng on 2017/7/11.
 */
public class ActionTwo extends ActionSupport {
    @Override
    public String execute() throws Exception {
        if(null == name || name.length()==0){
            return "error";
        }
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","张三");
        map.put("key","索引");
        valueStack.push(map);

        name = "这是在Action中赋值的名称";
        System.out.println("获取的数据为:" + name);
        return "success";
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String staticname;

    public String getStaticname() {
        return staticname;
    }

    public void setStaticname(String staticname) {
        this.staticname = staticname;
    }
}
