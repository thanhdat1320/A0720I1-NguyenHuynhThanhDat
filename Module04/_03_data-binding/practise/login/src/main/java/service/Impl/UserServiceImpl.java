package service.Impl;

import model.Login;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.IUserRepository;
import service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public User checkLogin(Login login) {
        return this.iUserRepository.checkLogin(login);
    }
}
