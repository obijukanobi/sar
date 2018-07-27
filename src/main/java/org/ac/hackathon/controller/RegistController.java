package org.ac.hackathon.controller;

import org.ac.hackathon.persistence.model.User;
import org.ac.hackathon.converters.DtotoUser;
import org.ac.hackathon.converters.UserToDto;
import org.ac.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class RegistController {

    private UserService userService;
    private UserToDto userToDto;
    private DtotoUser dtotoUser;

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String showRegist(Model model) {
        User user = new User();

        model.addAttribute("user", userToDto.convert(user));

        return "register";
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
