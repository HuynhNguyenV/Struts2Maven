package edu.poly.hello.action;


import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

public class RegisterAction extends ActionSupport {
    private String country, message;
    private String countries[] = {
            "VietNam", "Laos","Singafore","HongKong","Japan"
    };
    @Action(value = "/register", results = {
            @Result(name = "success", location = "/register.jsp")
    })
    public String register(){
            message = "Selected country: " + country;
        return SUCCESS;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }
}
