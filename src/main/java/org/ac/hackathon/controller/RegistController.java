package org.ac.hackathon.controller;

import org.ac.hackathon.command.UserDto;
import org.ac.hackathon.persistence.model.User;
import org.ac.hackathon.converters.DtotoUser;
import org.ac.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/register")
public class RegistController {

    private UserService userService;
    private DtotoUser dtotoUser;


    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String showRegist(Model model) {

        UserDto userDto = new UserDto();

        userDto.setId(99);

       /* userDto.setName("Joao");
        userDto.setLocal("Lisboa");
        userDto.setPassword("123");
        userDto.setContact("kjkjkjk@gmail.com");
        */
        model.addAttribute("user", userDto);


        return "register";
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/profile"}, params = "action=save")
    public String checkCredentials(@ModelAttribute("user") UserDto userDto, BindingResult
            bindingResult, RedirectAttributes redirectAttributes, Model model) {


        User user = dtotoUser.convert(userDto);

        userService.save(user);

        model.addAttribute("user", userDto);

        return "profile";


        /*if (bindingResult.hasErrors()) {
            return "customer/add-update";
        }*/

    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Autowired
    public void setDtotoUser(DtotoUser dtotoUser) {
        this.dtotoUser = dtotoUser;
    }

}
