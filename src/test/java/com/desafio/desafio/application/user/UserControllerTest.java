package com.desafio.desafio.application.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import com.desafio.desafio.application.user.exception.NotFoundUserGitHubException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.CoreMatchers.is;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("User controller test")
    void mustReturnAUser() throws Exception {


        mockMvc.perform(get("/user/vitorjahn1"))
                        .andExpect(MockMvcResultMatchers.status().is(200))
                         .andExpect(jsonPath("$.login",is("vitorjahn1")))
                .andExpect(jsonPath("$.id", is(33872565)))
                .andExpect(jsonPath("$.nodeId", is("MDQ6VXNlcjMzODcyNTY1")))
                .andExpect(jsonPath("$.url",is("https://api.github.com/users/vitorjahn1")))
                .andExpect(jsonPath("$.blog").isEmpty())
                .andExpect(jsonPath("$.company").doesNotExist())
                .andExpect(jsonPath("$.email").doesNotExist())
                .andExpect(jsonPath("$.followers",is(0)))
                .andExpect(jsonPath("$.type", is("User")))
                .andExpect(jsonPath("$.publicRepos", is(16)))
                .andExpect(jsonPath("$.publicGists",is(0)))
                .andExpect(jsonPath("$.gistsUrl",is("https://api.github.com/users/vitorjahn1/gists{/gist_id}")))
                .andExpect(jsonPath("$.location").doesNotExist())
                .andExpect(jsonPath("$.siteAdmin", is(false)))
                .andExpect(jsonPath("$.hireable").doesNotExist())
                .andExpect(jsonPath("$.name").doesNotExist())
                .andExpect(jsonPath("$.subscriptionsUrl", is("https://api.github.com/users/vitorjahn1/subscriptions")))
                .andExpect(jsonPath("$.organizationsUrl", is("https://api.github.com/users/vitorjahn1/orgs")))
                .andExpect(jsonPath("$.reposUrl", is("https://api.github.com/users/vitorjahn1/repos")))
                .andExpect(jsonPath("$.avatarUrl",is("https://avatars.githubusercontent.com/u/33872565?v=4")))
                .andExpect(jsonPath("$.eventsUrl",is("https://api.github.com/users/vitorjahn1/events{/privacy}")))
                .andExpect(jsonPath("$.created_at",is("2017-11-21T15:43:26")));
    }

    @Test
    @DisplayName("Api Get User Error Test ")
    void errorTestGetApi() throws Exception {

        MvcResult result  = mockMvc.perform(get("/user/kjlkjkl"))
                                    .andExpect(MockMvcResultMatchers.status().is(404)).andReturn();

        assertEquals(result.getResolvedException().toString(), NotFoundUserGitHubException.class.getName());


    }

}
