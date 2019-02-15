package springboot.com.security.service;

import springboot.com.security.model.User;

public interface UserService {

    User findUserByEmail(String email);
    User save(User user);
}
