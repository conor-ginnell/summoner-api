package com.staxrt.summoner.repository;

import com.staxrt.summoner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{}
