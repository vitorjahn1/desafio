package com.desafio.desafio.application.user.service;

import com.desafio.desafio.application.user.exception.GitHubApiUnvailable;
import com.desafio.desafio.application.user.exception.NotFoundUserGitHubException;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {

    public RuntimeException exception(int code, InterruptedException e){

        switch (code){
            case 404:
                 throw new NotFoundUserGitHubException(e);
            case 503:
                 throw new GitHubApiUnvailable(e);
            default:
                throw new RuntimeException(e);

        }
    }

    public RuntimeException exception(int code){

        return exception(code,new InterruptedException());
    }
}
