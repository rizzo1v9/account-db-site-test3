package com.accountdbsite.accountdbsite.appuser;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface AppUserRepository {

    // Using Optional class to find users by email
    Optional<AppUser> findByEmail(String email);
}
