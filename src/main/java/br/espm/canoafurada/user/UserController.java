package br.espm.canoafurada.user;

import br.espm.canoafurada.user.interfaces.IUserController;

import java.util.List;
import java.util.UUID;

public class UserController implements IUserController {
    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public UserDto getUserById(UUID id) {
        return null;
    }

    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }
}
