package com.desafio.desafio.util.factory;

import com.desafio.desafio.application.user.UserGetDto;
import com.desafio.desafio.domain.user.Type;
import com.desafio.desafio.domain.user.UserGitHub;

import java.time.LocalDateTime;

public class UserGitHubFactory {

    public static UserGitHub userGitHub(){

        return UserGitHub.builder()
                        .bio("testebio")
                        .avatarUrl("testeavatat")
                        .blog("testeblog")
                        .company("testecompany")
                        .eventsUrl("testeeventsurl")
                        .createdAt(LocalDateTime.parse("2018-12-30T19:34:50.63"))
                        .email("testeemail")
                        .id(1)
                        .gistsUrl("testegistsurl")
                        .login("testelogin")
                        .twitterUsername("testetwitter")
                        .followersUrl("testefollweresurl")
                        .name("testename")
                        .followers(0)
                        .htmlUrl("testehtml")
                        .nodeId("testenode")
                        .following(0)
                        .updatedAt(LocalDateTime.parse("2018-12-30T19:34:50.63"))
                        .followingUrl("testefollwing")
                        .gravatarId("testegravatar")
                        .hireable("testehireable")
                        .location("testelocation")
                        .organizationsUrl("testeorganization")
                        .publicGists(5)
                        .type(Type.USER)
                        .url("testeurl")
                        .publicRepos(16)
                        .receivedEventsUrl("testeeventsurl")
                        .reposUrl("testereposurl")
                        .siteAdmin(false)
                        .starredUrl("testestarredurl")
                        .subscriptionsUrl("testesibscription")
                        .build();
    }
}
