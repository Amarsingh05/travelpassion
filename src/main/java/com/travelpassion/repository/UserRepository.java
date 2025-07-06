package com.travelpassion.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.travelpassion.model.user;

public interface UserRepository extends JpaRepository<user, Long> {
    Optional<user> findByEmail(String email);
}
