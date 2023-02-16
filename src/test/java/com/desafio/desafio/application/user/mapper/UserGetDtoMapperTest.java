package com.desafio.desafio.application.user.mapper;

import com.desafio.desafio.application.user.UserGetDto;
import com.desafio.desafio.domain.user.UserGitHub;
import com.desafio.desafio.util.factory.UserGetDtoFactory;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest
public class UserGetDtoMapperTest{

    @Autowired
    private UserGetDtoMapper userGetDtoMapper;

    @Test
    @DisplayName("Mapper UserGetDtoTest (User to UserGetDto)")
    void toUserGetDto(){

        UserGetDto userGetDto = userGetDtoMapper.toUserGetDto("{\"login\":\"vitorjahn1\"," +
                "\"id\":33872565,\"node_id\":\"MDQ6VXNlcjMzODcyNTY1\"," +
                "\"avatar_url\":\"testeAvatar\"" +
                ",\"gravatar_id\":\"testeGravatar\",\"url\":\"https://api.github.com/users/vitorjahn1\"" +
                ",\"html_url\":\"https://github.com/vitorjahn1\"," +
                "\"followers_url\":\"https://api.github.com/users/vitorjahn1/followers\"" +
                ",\"following_url\":\"https://api.github.com/users/vitorjahn1/following{/other_user}\"" +
                ",\"gists_url\":\"https://api.github.com/users/vitorjahn1/gists{/gist_id}\"" +
                ",\"starred_url\":\"https://api.github.com/users/vitorjahn1/starred{/owner}{/repo}\"," +
                "\"subscriptions_url\":\"https://api.github.com/users/vitorjahn1/subscriptions\"," +
                "\"organizations_url\":\"https://api.github.com/users/vitorjahn1/orgs\"," +
                "\"repos_url\":\"https://api.github.com/users/vitorjahn1/repos\"," +
                "\"events_url\":\"https://api.github.com/users/vitorjahn1/events{/privacy}\"," +
                "\"received_events_url\":\"https://api.github.com/users/vitorjahn1/received_events\"," +
                "\"type\":\"User\",\"site_admin\":false,\"name\":\"testeName\",\"company\":\"testeCompany\",\"blog\":\"testeBlog\"," +
                "\"location\":\"testeLocation\",\"email\":\"testeEmail\",\"hireable\":\"testeHireable\",\"bio\":\"testeBio\",\"" +
                "twitter_username\":\"testeTwitter\",\"public_repos\":16,\"public_gists\":0,\"followers\"" +
                ":0,\"following\":0,\"created_at\":\"2017-11-21T15:43:26Z\",\"updated_at\"" +
                ":\"2023-02-14T10:01:03Z\"}");

        assertThat(userGetDto.getLogin()).isEqualTo("vitorjahn1");
        assertThat(userGetDto.getId()).isEqualTo(33872565);
        assertThat(userGetDto.getNodeId()).isEqualTo("MDQ6VXNlcjMzODcyNTY1");
        assertThat(userGetDto.getType()).isEqualTo("User");
        assertThat(userGetDto.getGravatarId()).isEqualTo("testeGravatar");
        assertThat(userGetDto.getBio()).isEqualTo("testeBio");
        assertThat(userGetDto.getEmail()).isEqualTo("testeEmail");
        assertThat(userGetDto.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2017-11-21T15:43:26Z").toLocalDateTime());
        assertThat(userGetDto.getName()).isEqualTo("testeName");
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
        assertThat(userGetDto.getBlog()).isEqualTo("testeBlog");
        assertThat(userGetDto.getCompany()).isEqualTo("testeCompany");
        assertThat(userGetDto.getTwitterUsername()).isEqualTo("testeTwitter");
    }

    @Test
    @DisplayName("Mapper TO UserGitHub Test ")
    void toUserGitHubTest(){

        UserGetDto userGetDto = UserGetDtoFactory.userGetDto();

        UserGitHub userGitHub = userGetDtoMapper.toUser(userGetDto);

        assertThat(userGetDto.getLogin()).isEqualTo(userGitHub.getLogin());
        assertThat(userGetDto.getId()).isEqualTo(userGitHub.getId());
        assertThat(userGetDto.getNodeId()).isEqualTo(userGitHub.getNodeId());
        assertThat(userGetDto.getBio()).isEqualTo(userGitHub.getBio());
        assertThat(userGetDto.getEmail()).isEqualTo(userGitHub.getEmail());
        assertThat(userGetDto.getCreatedAt()).isEqualTo(userGitHub.getCreatedAt());
        assertThat(userGetDto.getName()).isEqualTo(userGitHub.getName());
        assertThat(userGetDto.getUrl()).isEqualTo(userGitHub.getUrl());
        assertThat(userGetDto.getFollowing()).isEqualTo(userGetDto.getFollowing());
        assertThat(userGetDto.getSubscriptionsUrl()).isEqualTo(userGitHub.getSubscriptionsUrl());
        assertThat(userGetDto.getPublicRepos()).isEqualTo(userGitHub.getPublicRepos());
        assertThat(userGetDto.getUpdatedAt()).isEqualTo(userGitHub.getUpdatedAt());
        assertThat(userGetDto.getGistsUrl()).isEqualTo(userGitHub.getGistsUrl());
        assertThat(userGetDto.getHtmlUrl()).isEqualTo(userGitHub.getHtmlUrl());
        assertThat(userGetDto.getHireable()).isEqualTo(userGitHub.getHireable());
        assertThat(userGetDto.getEventsUrl()).isEqualTo(userGitHub.getEventsUrl());
        assertThat(userGetDto.getPublicGists()).isEqualTo(userGitHub.getPublicGists());
        assertThat(userGetDto.getLocation()).isEqualTo(userGitHub.getLocation());
        assertThat(userGetDto.getOrganizationsUrl()).isEqualTo(userGitHub.getOrganizationsUrl());
        assertThat(userGetDto.getBlog()).isEqualTo(userGitHub.getBlog());
        assertThat(userGetDto.getCompany()).isEqualTo(userGitHub.getCompany());
        assertThat(userGetDto.getTwitterUsername()).isEqualTo(userGitHub.getTwitterUsername());
    }
}
