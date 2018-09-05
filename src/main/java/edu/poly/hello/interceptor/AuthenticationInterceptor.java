package edu.poly.hello.interceptor;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import java.util.Map;

public class AuthenticationInterceptor implements Interceptor {

    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation ai) throws Exception {
        System.out.println("inside auth interceptor");
        Map<String, Object> sessionAttributes = ai.getInvocationContext().getSession();
        String user = (String)sessionAttributes.get("USER");

        if(user == null){
            return "login";
        }else{
            Action action = (Action) ai.getAction();
            return ai.invoke();
        }
    }
}
