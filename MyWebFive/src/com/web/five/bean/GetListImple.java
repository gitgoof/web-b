package com.web.five.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaofeng on 2017/7/19.
 */
public class GetListImple implements GetListInterface{
    public GetListImple(){}
    public List<String> getList() {
        List<String> list = new ArrayList<String>();
        for(int i = 0 ;i < 4;i++){
            list.add("数据:" + i);
        }
        return list;
    }
}
