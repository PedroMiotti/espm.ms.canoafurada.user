package br.espm.canoafurada.user;

import br.espm.canoafurada.exceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDto> getAllUsers() {
        return StreamSupport
                .stream(userRepository.findAll().spliterator(), false)
                .collect(Collectors.toList())
                .stream().map(UserEntity::toDto)
                .collect(Collectors.toList());
    }

    public UserDto getUserById(UUID id) {
        Optional<UserEntity> user = Optional.ofNullable(userRepository.findById(id)).orElseThrow();

        if(user == null) throw new RecordNotFoundException(id.toString());

        return user.get().toDto();
    }

    public UserDto createUser(UserDto user) {
        return userRepository.save(new UserEntity(user)).toDto();
    }

}
