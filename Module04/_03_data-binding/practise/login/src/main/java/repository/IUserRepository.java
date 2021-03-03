package repository;

import model.Login;
import model.User;

public interface IUserRepository {
    User checkLogin(Login login);
}
