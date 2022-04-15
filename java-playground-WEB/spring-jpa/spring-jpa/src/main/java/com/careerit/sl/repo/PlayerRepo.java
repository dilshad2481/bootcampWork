package com.careerit.sl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.careerit.sl.domain.Player;

public interface PlayerRepo extends JpaRepository<Player, Long> {
//Provide domain name and id type to use JPA CRUD methods
//You can add custom methods if its not there in your repository
//To do that
}
