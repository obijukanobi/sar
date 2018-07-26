package org.ac.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by codecadet on 26/07/2018.
 */
@Controller
@RequestMapping("/")
public class LoginController {
/*
    @RequestMapping(method = RequestMethod.GET, path = {"/login", "/", ""})
    public String listCustomers(Model model) {
        return "redirect:/login";
    }
*/
    @RequestMapping("/")
    public String home() {
        return "login";
    }
}
