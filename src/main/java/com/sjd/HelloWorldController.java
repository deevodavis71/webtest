package com.sjd;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/api")
public class HelloWorldController
{
    @RequestMapping (path = "/sayHello/{name}")
    public String sayHello (@PathVariable (name = "name") String name)
    {
        return "Hello, " + name + "!";
    }

    @RequestMapping (path = "/sayGoodbye/{name}")
    public String sayGoodbye (@PathVariable (name = "name") String name)
    {
        return "Goodbye " + name + ".";
    }
}
