package service;

import model.Login;
import model.User;

public interface IUserService {
    User checkLogin(Login login);

}
