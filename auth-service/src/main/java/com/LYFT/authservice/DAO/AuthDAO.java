package com.LYFT.authservice.DAO;

import com.LYFT.authservice.Model.AuthModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface AuthDAO extends JpaRepository<AuthModel,Integer> {

public AuthModel findByEmail(String email);
}
