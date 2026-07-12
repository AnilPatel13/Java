package com.whygo.springbootweb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Spring Boot";
    }

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method is called");
        return "index";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num,@RequestParam("num2") int num2, ModelAndView mv) {
        System.out.println("Add method is called");
        int sum = num + num2;
        System.out.println("Sum is: " + sum);
        mv.addObject("result", sum);
        mv.setViewName("result");
        return mv;
    }

    @RequestMapping("/addCustomer")
    public String add(Customer customer) {
        System.out.println("Customer method is called");
        System.out.println("Customer is: " + customer);
//        mv.addObject("customer", customer);
//        mv.setViewName("result");
        return "result";
    }
}
