package com.learningstuff.springbootopenapi3.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ২৪/২/২২
 * Time: ১০:৫১ AM
 * Email: mdshamim723@gmail.com
 */

@RestController
@RequestMapping(value = "")
public class BasicController {

    @SecurityRequirement(name = "Basic Security")
    @GetMapping(value = "/basic")
    public String basic() {
        return "Basic Security";
    }

    @GetMapping(value = "/bearer")
    @SecurityRequirement(name = "Bearer Security")
    public String bearer() {
        return "Bearer Security";
    }

}
