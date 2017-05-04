package com.JamesHumbey.ci346;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by James1
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
