package com.desafio.desafio.application.user.service;

import com.desafio.desafio.application.user.UserGetDto;
import com.desafio.desafio.application.user.mapper.UserGetDtoMapper;
import com.desafio.desafio.domain.user.UserGitHub;
import com.desafio.desafio.domain.user.service.UserService;
import com.desafio.desafio.infra.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class UserServiceImpl implements UserService {

    private static String GIT_HUB_API = "https://api.github.com/users/";

    @Autowired
    UserGetDtoMapper mapper;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ErrorService errorService;
    @Override
    public void createUser(UserGitHub userGitHub) {
        userRepository.save(userGitHub);

    }

    @Override
    public UserGetDto findUserFromApi(String name) {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create(GIT_HUB_API + name)).GET().build();
        String body = "";
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            body = response.body();

            System.out.println(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {


            throw new RuntimeException(e);
        }

        UserGetDto dto = new UserGetDto();
        if(response.statusCode() == 200) {
             dto = mapper.toUserGetDto(body);
             createUser(mapper.toUser(dto));
        }else{
            errorService.exception(response.statusCode());
        }

        return dto;
    }
}
