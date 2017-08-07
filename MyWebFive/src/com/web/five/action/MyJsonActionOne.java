package com.web.five.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.web.five.bean.ErrorBean;
import com.web.five.bean.GetListInterface;
import com.web.five.bean.SuccessBean;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONInterceptor;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContextException;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by gaofeng on 2017/7/11.
 */
public class MyJsonActionOne extends ActionSupport {

    private GetListInterface getListInterface;

    @Override
    public String execute() throws Exception {
        password = name;
        successBean = new SuccessBean();
        successBean.setMessage("已经成功");
        successBean.setResult("success");
//        HttpServletRequest httpServletRequest = ServletActionContext.getRequest();
        HttpServletRequest httpServletRequest = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
        JSONInterceptor jsonInterceptor = null;
        if(httpServletRequest!=null){
            String method = httpServletRequest.getMethod();
            System.out.println(">>>method:" + method);
            System.out.println(">>>parameterMap:" + httpServletRequest.getParameterMap().get("name").toString());
            System.out.println(">>>headerNames:" + httpServletRequest.getHeaderNames());
            System.out.println(">>>path info:" + httpServletRequest.getPathInfo());
            System.out.println(">>>request URI:" + httpServletRequest.getRequestURI());

            InputStream inputStream = httpServletRequest.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
            StringBuffer stringBuffer = new StringBuffer();
            String strLine;
            System.out.println(">>>开始循环获取");
            while((strLine=bufferedReader.readLine())!=null){
                System.out.println(">>>循环获取:strLine =" + strLine);
                stringBuffer.append(strLine);
            }
            bufferedReader.close();
            inputStream.close();
            System.out.println(">>>request Stream:" + stringBuffer.toString());
        } else {
            System.out.println(">>>httpServletRequest == null");
        }

        if(getListInterface!=null){
            List list = getListInterface.getList();
            for(Object s:list){
                System.out.println("getList：" + s);
            }
        } else {
            System.out.println("没有注入Action中的Bean");
        }

//        this.response;


        if(name==null){
            errorBean = new ErrorBean();
            errorBean.setMessage("name == null 为空");
            errorBean.setResult("error");
            return "error";
        }
        if(name.length()==0){
            errorBean = new ErrorBean();
            errorBean.setMessage("name == null 为空");
            errorBean.setResult("error");
            return "error";
        }
        if(name.equals("aaa")){
            errorBean = new ErrorBean();
            errorBean.setResult("error");
            errorBean.setMessage("name == aaa 不是空");
            return "error";
        }
        return super.execute();
    }
    private SuccessBean successBean;
    private ErrorBean errorBean;
    private String age;
    private String name;
    private String sex;
    private String password;

    public ErrorBean getErrorBean() {
        return errorBean;
    }

    public SuccessBean getSuccessBean() {
        return successBean;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGetListInterface(GetListInterface getListInterface) {
        this.getListInterface = getListInterface;
    }

}
