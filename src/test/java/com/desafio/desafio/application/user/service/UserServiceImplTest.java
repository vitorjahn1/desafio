package com.desafio.desafio.application.user.service;

import com.desafio.desafio.application.user.UserGetDto;
import com.desafio.desafio.domain.user.UserGitHub;
import com.desafio.desafio.infra.user.UserRepository;
import com.desafio.desafio.util.factory.UserGitHubFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    UserRepository userRepository;
    @Test
    @DisplayName("Create User Test")
    void createUserTest(){

        UserGitHub userGitHub = UserGitHubFactory.userGitHub();

        userService.createUser(userGitHub);

        UserGitHub userFromBd =  userRepository.findById(userGitHub.getId()).get();

        assertThat(userFromBd.getLogin()).isEqualTo(userGitHub.getLogin());
        assertThat(userFromBd.getId()).isEqualTo(userGitHub.getId());
        assertThat(userFromBd.getNodeId()).isEqualTo(userGitHub.getNodeId());
        assertThat(userFromBd.getBio()).isEqualTo(userGitHub.getBio());
        assertThat(userFromBd.getEmail()).isEqualTo(userGitHub.getEmail());
        assertThat(userFromBd.getCreatedAt()).isEqualTo(userGitHub.getCreatedAt());
        assertThat(userFromBd.getName()).isEqualTo(userGitHub.getName());
        assertThat(userFromBd.getUrl()).isEqualTo(userGitHub.getUrl());
        assertThat(userFromBd.getFollowing()).isEqualTo(userFromBd.getFollowing());
        assertThat(userFromBd.getSubscriptionsUrl()).isEqualTo(userGitHub.getSubscriptionsUrl());
        assertThat(userFromBd.getPublicRepos()).isEqualTo(userGitHub.getPublicRepos());
        assertThat(userFromBd.getUpdatedAt()).isEqualTo(userGitHub.getUpdatedAt());
        assertThat(userFromBd.getGistsUrl()).isEqualTo(userGitHub.getGistsUrl());
        assertThat(userFromBd.getHtmlUrl()).isEqualTo(userGitHub.getHtmlUrl());
        assertThat(userFromBd.getHireable()).isEqualTo(userGitHub.getHireable());
        assertThat(userFromBd.getEventsUrl()).isEqualTo(userGitHub.getEventsUrl());
        assertThat(userFromBd.getPublicGists()).isEqualTo(userGitHub.getPublicGists());
        assertThat(userFromBd.getLocation()).isEqualTo(userGitHub.getLocation());
        assertThat(userFromBd.getOrganizationsUrl()).isEqualTo(userGitHub.getOrganizationsUrl());
        assertThat(userFromBd.getBlog()).isEqualTo(userGitHub.getBlog());
        assertThat(userFromBd.getCompany()).isEqualTo(userGitHub.getCompany());
        assertThat(userFromBd.getTwitterUsername()).isEqualTo(userGitHub.getTwitterUsername());
    }

    @Test
    @DisplayName("FindByName test")
    void findByNameTest(){

        String name = "vitorjahn1";

        UserGetDto userGetDto = userService.findUserFromApi(name);

        assertThat(userGetDto.getLogin()).isEqualTo("vitorjahn1");
        assertThat(userGetDto.getId()).isEqualTo(33872565);
        assertThat(userGetDto.getNodeId()).isEqualTo("MDQ6VXNlcjMzODcyNTY1");
        assertThat(userGetDto.getType()).isEqualTo("User");
        assertThat(userGetDto.getGravatarId()).isEqualTo("");
        assertThat(userGetDto.getBio()).isEqualTo(null);
        assertThat(userGetDto.getEmail()).isEqualTo(null);
        assertThat(userGetDto.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2017-11-21T15:43:26Z").toLocalDateTime());
        assertThat(userGetDto.getName()).isEqualTo(null);
        assertThat(userGetDto.getUrl()).isEqualTo("https://api.github.com/users/vitorjahn1");
        assertThat(userGetDto.getFollowing()).isEqualTo(0);
        assertThat(userGetDto.getSubscriptionsUrl()).isEqualTo("https://api.github.com/users/vitorjahn1/subscriptions");
        assertThat(userGetDto.getPublicRepos()).isEqualTo(16);
        assertThat(userGetDto.getUpdatedAt()).isEqualTo(ZonedDateTime.parse("2023-02-14T10:01:03Z").toLocalDateTime());
        assertThat(userGetDto.getGistsUrl()).isEqualTo("https://api.github.com/users/vitorjahn1/gists{/gist_id}");
        assertThat(userGetDto.getHtmlUrl()).isEqualTo("https://github.com/vitorjahn1");
        assertThat(userGetDto.getHireable()).isEqualTo("testeHireable");
        assertThat(userGetDto.getEventsUrl()).isEqualTo("https://api.github.com/users/vitorjahn1/events{/privacy}");
        assertThat(userGetDto.getPublicGists()).isEqualTo(0);
        assertThat(userGetDto.getLocation()).isEqualTo("testeLocation");
        assertThat(userGetDto.getOrganizationsUrl()).isEqualTo("https://api.github.com/users/vitorjahn1/orgs");
        assertThat(userGetDto.getBlog()).isEqualTo("");
        assertThat(userGetDto.getCompany()).isEqualTo(null);
        assertThat(userGetDto.getTwitterUsername()).isEqualTo(null);
    }


}
