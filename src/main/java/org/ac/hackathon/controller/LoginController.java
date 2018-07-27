package org.ac.hackathon.controller;

import org.ac.hackathon.User;
import org.ac.hackathon.converters.DtotoUser;
import org.ac.hackathon.converters.UserToDto;
import org.ac.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by codecadet on 26/07/2018.
 */
@Controller
@RequestMapping("/user")
public class LoginController {
    private UserService userService;

    private UserToDto userToDto;
    private DtotoUser dtotoUser;


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

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showCustomer(@PathVariable Integer id, Model model) {
        User user = userService.getUser(id);

        model.addAttribute("user", userToDto.convert(user));

        return "matching/profile";
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserToDto(UserToDto userToDto) {
        this.userToDto = userToDto;
    }

    @Autowired
    public void setDtotoUser(DtotoUser dtotoUser) {
        this.dtotoUser = dtotoUser;
    }
}
