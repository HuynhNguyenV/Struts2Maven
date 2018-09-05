package edu.poly.hello.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

public class SayHelloAction extends ActionSupport{
    private String name, message;



    @Action(value = "/say", results = {
            @Result(name = "say", location = "/say.jsp")
    }, interceptorRefs = {
            @InterceptorRef(value = "logStack")
    })

    public String sayHello(){

        message = "Hello " + name;
        return "say";
    }
}
