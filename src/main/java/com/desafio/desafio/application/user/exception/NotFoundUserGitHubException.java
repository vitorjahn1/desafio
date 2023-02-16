package com.desafio.desafio.application.user.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
@AllArgsConstructor
public class NotFoundUserGitHubException extends RuntimeException{

    private InterruptedException e;
}
