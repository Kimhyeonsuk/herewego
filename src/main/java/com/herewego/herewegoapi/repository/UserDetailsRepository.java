package com.herewego.herewegoapi.repository;

import com.herewego.herewegoapi.common.AuthProvider;
import com.herewego.herewegoapi.model.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Long> {
    UserDetails findByEmail(String email);

    UserDetails findByEmailAndAuthProvider(String email, AuthProvider authProvider);

    @Transactional
    void deleteByEmailAndAuthProvider(String email, AuthProvider authProvider);
}
