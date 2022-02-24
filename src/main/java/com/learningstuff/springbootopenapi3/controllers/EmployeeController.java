package com.learningstuff.springbootopenapi3.controllers;

import com.learningstuff.springbootopenapi3.models.Employee;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ২৪/২/২২
 * Time: ১০:৫১ AM
 * Email: mdshamim723@gmail.com
 */

@RestController
@RequestMapping(value = "/employees")
@SecurityRequirement(name = "Basic Security")
@SecurityRequirement(name = "Bearer Security")
public class EmployeeController {

    @GetMapping(value = "")
    public List<Employee> getEmployees() {
        return new ArrayList<>();
    }

    @DeleteMapping(value = "/delete/{id}")
    public Employee delete(@PathVariable("id") int id) {
        return null;
    }

    @PostMapping(value = "/create")
    public Employee create(@RequestBody Employee user) {
        return user;
    }

}
