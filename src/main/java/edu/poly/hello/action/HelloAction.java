package edu.poly.hello.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class HelloAction extends ActionSupport{
    @Action(value = "/hello", results = {
            @Result(name = "hello", location = "/hello.jsp")
    })
    public String hello(){
        return "hello";
    }
}
