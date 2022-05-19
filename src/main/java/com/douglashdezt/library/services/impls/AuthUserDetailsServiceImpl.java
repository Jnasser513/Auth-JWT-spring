package com.douglashdezt.library.services.impls;

import com.douglashdezt.library.models.entities.User;
import com.douglashdezt.library.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            User userFound = userService.findOneByIdentifer(username);

            if(userFound != null) {
                return new org.springframework.security.core.userdetails.User(
                        userFound.getUsername(),
                        userFound.getPassword(),
                        new ArrayList<>()
                );
            }else {
                throw new UsernameNotFoundException("Usuario no encontrado: " + username);
            }
        } catch (Exception e) {
            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
        }
    }

}