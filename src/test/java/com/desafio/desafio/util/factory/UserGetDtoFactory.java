package com.desafio.desafio.util.factory;

import com.desafio.desafio.application.user.UserGetDto;

import java.time.LocalDateTime;

public class UserGetDtoFactory {

    public static UserGetDto userGetDto(){

        return UserGetDto.builder()
                        .bio("testebio")
                        .avatarUrl("testeavatat")
                        .blog("testeblog")
                        .company("testecompany")
                        .eventsUrl("testeeventsurl")
                        .createdAt(LocalDateTime.MAX)
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
                        .updatedAt(LocalDateTime.MAX)
                        .followingUrl("testefollwing")
                        .gravatarId("testegravatar")
                        .hireable("testehireable")
                        .location("testelocation")
                        .organizationsUrl("testeorganization")
                        .publicGists(5)
                        .type("user")
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
