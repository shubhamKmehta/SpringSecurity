package com.mine.service;

import com.mine.model.UserPrinciple;
import com.mine.model.Users;
import com.mine.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users users1 = userRepo.findByUsername(username);
        if(users1 == null){
            System.out.println("user not found");
            throw new UsernameNotFoundException("User not found in databases");
        }
        return new UserPrinciple(users1);
    }
}
