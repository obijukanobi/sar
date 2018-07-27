package org.ac.hackathon.converters;

import org.ac.hackathon.User;
import org.ac.hackathon.command.UserDto;
import org.ac.hackathon.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by codecadet on 26/07/2018.
 */

@Component
public class DtotoUser implements Converter<UserDto, User>{

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Override
    public User convert(UserDto userDto) {

        User user = ((userDto.getId() != null) ? userService.getUser(userDto.getId()) : new User());

        user.setContact(userDto.getContact());
        user.setFoodPreferences(userDto.getFoodPreferences());
        user.setId(userDto.getId());
        user.setLocal(userDto.getLocal());
        user.setName(userDto.getName());
        user.setRequests(userDto.getRequests());
        user.setThemePreferences(userDto.getThemePreferences());
        user.setPassword(userDto.getPassword());

        return user;
    }
}
