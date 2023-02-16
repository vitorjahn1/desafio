package com.desafio.desafio.application.user.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE)
@AllArgsConstructor
public class GitHubApiUnvailable extends RuntimeException{

    private InterruptedException e;

}
