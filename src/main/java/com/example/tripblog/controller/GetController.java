package com.example.tripblog.controller;

import com.example.tripblog.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Localhost:8080/api
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") // Localhost:8080/api/getMethod
    public String getRequest() {
        return "Hi getMethod";
    }

    @GetMapping("/getParameter") // Localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
        String password = "asd";
        System.out.println("id : " + id);
        System.out.println("password : " + pwd);
        return id + pwd;
    }


    // json
    // Localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // { "account" : "", "email" : "", "page" : 0}
        return searchParam;
    }

//    // Localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
//    @GetMapping("/getMultiParameter")
//    public String getMultiParameter(SearchParam searchParam) {
//        System.out.println(searchParam.getAccount());
//        System.out.println(searchParam.getEmail());
//        System.out.println(searchParam.getPage());
//
//        // { "account" : "", "email" : "", "page" : 0}
//        return "OK";
//    }
}
