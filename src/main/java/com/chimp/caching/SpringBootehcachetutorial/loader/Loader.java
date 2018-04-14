package com.chimp.caching.SpringBootehcachetutorial.loader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chimp.caching.SpringBootehcachetutorial.model.Users;
import com.chimp.caching.SpringBootehcachetutorial.repository.UsersRepository;

@Component
public class Loader {

    @Autowired
    UsersRepository usersRepository;

    @PostConstruct
    public void load() {
        List<Users> usersList = getList();
        usersRepository.saveAll(usersList);
    }

    public List<Users> getList() {
        List<Users> usersList = new ArrayList<>();
        usersList.add(new Users("Chimp", 123L));
        usersList.add(new Users("ChimpJr", 234L));
        usersList.add(new Users("MsChimp", 345L));
        usersList.add(new Users("MrsChimp", 456L));
        return usersList;
    }
}