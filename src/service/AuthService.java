package service;

import been.User;

public interface AuthService {

    void Register(User username, User password);

    void Login(String username, String password);

    void Logout();
}
