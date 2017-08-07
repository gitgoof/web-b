package com.web.five.action;

/**
 * Created by gaofeng on 2017/7/11.
 */
public class HelloWorldAction {

    public String execute() throws Exception{
        System.out.println("输出成功::::::***********");
        return "success";
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
