package com.desafio.desafio.infra.user;

import com.desafio.desafio.domain.user.UserGitHub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserGitHub,Integer> {


}
