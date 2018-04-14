package com.chimp.caching.SpringBootehcachetutorial.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chimp.caching.SpringBootehcachetutorial.cache.UsersCache;
import com.chimp.caching.SpringBootehcachetutorial.model.Users;

@RestController
@RequestMapping("/rest/users/")
public class UserResource {
	
	@Autowired
    UsersCache usersCache;
	
	@GetMapping
	public String defaultLoading() {
		return "This is User Resource";
	}
	
    @GetMapping(value = "/{name}")
    public Users getUser(@PathVariable final String name) {
        return usersCache.getUser(name);
    }

}
