package com.iba.YourReview.service;

public interface SecurityService {

    String findLoggedInNickName();

    void autoLogin(String nickName, String password);
}
