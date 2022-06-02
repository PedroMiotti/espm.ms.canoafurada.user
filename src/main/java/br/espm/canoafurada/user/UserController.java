package br.espm.canoafurada.user;

import br.espm.canoafurada.user.interfaces.IUserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController implements IUserController {

    @Autowired
    private UserService userService;

    @Override
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @Override
    public UserDto getUserById(UUID id) {
        return userService.getUserById(id);
    }

    @Override
    public UserDto createUser(UserDto user) {
        return userService.createUser(user);
    }
}
