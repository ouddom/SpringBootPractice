package org.ouddom.practicespringboot.service;

import org.ouddom.practicespringboot.model.dto.LoginUserDto;
import org.ouddom.practicespringboot.model.dto.RegisterUserDto;
import org.ouddom.practicespringboot.model.entity.User;

public interface AuthenticationService {
    User signup(RegisterUserDto input);
    User authenticate(LoginUserDto input);
}
