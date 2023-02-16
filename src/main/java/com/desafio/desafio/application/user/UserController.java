package com.desafio.desafio.application.user;

import com.desafio.desafio.application.user.exception.NotFoundUserGitHubException;
import com.desafio.desafio.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{name}")
    @ExceptionHandler({NotFoundUserGitHubException.class,NotFoundUserGitHubException.class})
    public ResponseEntity<UserGetDto> findByName(@PathVariable String name){
        return ResponseEntity.ok(userService.findUserFromApi(name));
    }
}
