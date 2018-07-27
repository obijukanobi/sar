package org.ac.hackathon.controller;

import org.ac.hackathon.persistence.model.User;
import org.ac.hackathon.command.UserDto;
import org.ac.hackathon.converters.DtotoUser;
import org.ac.hackathon.converters.UserToDto;
import org.ac.hackathon.services.RequestService;
import org.ac.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;

/**
 * Created by codecadet on 26/07/2018.
 */
@Controller
@RequestMapping("")
public class LoginController {

    private UserService userService;
    private RequestService requestService;
    private UserToDto userToDto;
    private DtotoUser dtotoUser;


    /*
        @RequestMapping(method = RequestMethod.GET, path = {"/login", "/", ""})
        public String listCustomers(Model model) {
            return "redirect:/login";
        }
    */

    @RequestMapping("/")
    public String home(Model model) {

        UserDto userDto = new UserDto();

        model.addAttribute("user", userDto);


        return "login";
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/profile"}, params = "action=login")
    public String checkCredentials(@ModelAttribute("user") UserDto userDto, BindingResult
            bindingResult, RedirectAttributes redirectAttributes, Model model) {


        List<User> users = userService.findAll();

        for (User user : users) {

            if (user != null && user.getContact().equals(userDto.getContact())) {

                model.addAttribute("user", userToDto.convert(user));

                return "profile";
            }
        }

        /*if (bindingResult.hasErrors()) {
            return "customer/add-update";
        }*/

        return "login";
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showCustomer(@PathVariable Integer id, Model model) {
        User user = userService.getUser(id);

        model.addAttribute("user", userToDto.convert(user));

        return "profile";
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

    public UserService getUserService() {
        return userService;
    }

    public RequestService getRequestService() {
        return requestService;
    }
    @Autowired
    public void setRequestService(RequestService requestService) {
        this.requestService = requestService;
    }

    public UserToDto getUserToDto() {
        return userToDto;
    }

    public DtotoUser getDtotoUser() {
        return dtotoUser;
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/profile"}, params = "action=register")
    public String regist() {

        return "redirect:register";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/user/null"})
    public String backLogin() {

        return "redirect:/";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/match"}, params = "action=search")
    public String search(Model model) {

        User user = new User();
        user.setContact("Lisboa");
        user.setFoodPreferences("Sushi");
        user.setId(7);
        user.setName("Marta");
        user.setPhoto("94534");

        model.addAttribute("user", userToDto.convert(user));


        return "matchtoinvite";
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/matchAccept"}, params = "action=matchtoinvite")
    public String match(Model model) {

        UserDto userDto = new UserDto();
        userDto.setContact("Lisboa");
        userDto.setPhoto("94534");


        model.addAttribute("user", dtotoUser.convert(userDto));


        return "connectedcontact";
    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String acceptInvite(@PathVariable Integer id, Model model) {


        User user = userService.getUser(id);

        model.addAttribute("user", userToDto.convert(user));

        return "profile";
    }


}
