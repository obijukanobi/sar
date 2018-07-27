package org.ac.hackathon.converters;

import org.ac.hackathon.User;
import org.ac.hackathon.command.UserDto;
import org.springframework.stereotype.Component;

/**
 * Created by codecadet on 26/07/2018.
 */
@Component
public class UserToDto extends  AbstractConverter<User, UserDto>{

    @Override
    public UserDto convert(User user) {

        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setContact((user.getContact()));
        userDto.setLocal(user.getLocal());
        userDto.setName(user.getName());
        userDto.setFoodPreferences(user.getFoodPreferences());
        userDto.setThemePreferences(user.getThemePreferences());
        userDto.setRequests(user.getRequests());
        userDto.setPassword(user.getPassword());

        return userDto;
    }
}
