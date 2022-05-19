package com.douglashdezt.library.repositories;

import com.douglashdezt.library.models.entities.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

}