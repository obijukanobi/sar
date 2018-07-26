package org.ac.hackathon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by codecadet on 26/07/2018.
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {

    /*@RequestMapping(method = RequestMethod.POST, path = {"/", ""}, params = "action=login")
    public String saveCustomer(@ModelAttribute("customer") CustomerDto customerDto, RedirectAttributes redirectAttributes) {
        Customer savedCustomer = customerService.save(customerDtoToCustomer.convert(customerDto));
        redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedCustomer.getFirstName() + " " + savedCustomer.getLastName());
        return "redirect:/customer/" + savedCustomer.getId();
    }*/
}

