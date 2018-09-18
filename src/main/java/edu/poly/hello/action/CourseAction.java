package edu.poly.hello.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import java.io.FileOutputStream;

public class CourseAction extends ActionSupport {
    private String courseID, name, description, message, category;
    private String categories[] = {
            "java", "C#", ".net", "ruby"
    };

    @Action(value = "/course", results = {
            @Result(name = "success", location = "/course.jsp")
    })
    public String register() {
        message = "Category: " + category + " CourseID: " + courseID + " name: " + name + " Description: " + description;
        try {
            FileOutputStream outputStream = new FileOutputStream("D:\\message.txt");

            byte b[] = message.getBytes();
            outputStream.write(b);
            outputStream.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return SUCCESS;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String[] getCategories() {
        return categories;
    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }
}
