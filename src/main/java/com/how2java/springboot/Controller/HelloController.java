package com.how2java.springboot.Controller;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import com.how2java.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloController {



    @RequestMapping("/hello")
    public String hello(Model m){ //throws Exception  {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
//        if(true){
//            throw new Exception("some exception");
//        }
        return "hello";
    }
    //endregion
    //</editor-fold>

    @RequestMapping("/getUser")
    public User getUser(){
        User user=new User();
        user.setUserName("小明");
        user.setPassWord("xxxxxx");

        return user;
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "Success!";
    }

}