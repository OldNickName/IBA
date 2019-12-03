package com.iba.YourReview.repository;

import com.iba.YourReview.entity.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepo extends CrudRepository<AppUser, Long> {

    AppUser findByNick(String nickName);

}
