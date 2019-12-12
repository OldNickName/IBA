package com.iba.YourReview.repository;

import com.iba.YourReview.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository("AppUserRepo")
@Repository
public interface AppUserRepo extends CrudRepository<AppUser, Long> {

    AppUser findByUsername(String userName);

}
