package com.bladejava.firstapp.controller;

import com.blade.mvc.annotation.GetRoute;
import com.blade.mvc.annotation.Path;
import com.blade.mvc.annotation.PathParam;

/**
 * @author biezhi
 * @date 2017/7/30
 */
@Path
public class UserController {

    @GetRoute("/users/:name/:age")
    public void users(@PathParam String name, @PathParam Integer age){
        System.out.println("name => " + name);
        System.out.println("age => " + age);
    }

}
