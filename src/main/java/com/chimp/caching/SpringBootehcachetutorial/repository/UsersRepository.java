package com.chimp.caching.SpringBootehcachetutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chimp.caching.SpringBootehcachetutorial.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);
}