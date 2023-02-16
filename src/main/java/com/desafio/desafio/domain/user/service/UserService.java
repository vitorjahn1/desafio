package com.desafio.desafio.domain.user.service;

import com.desafio.desafio.application.user.UserGetDto;
import com.desafio.desafio.domain.user.UserGitHub;

public interface UserService {

    void createUser(UserGitHub userGitHub);

    UserGetDto findUserFromApi(String name);
}
