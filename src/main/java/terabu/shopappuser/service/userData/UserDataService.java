package terabu.shopappuser.service.userData;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import terabu.shopappuser.dto.data.UserDataRequest;
import terabu.shopappuser.dto.data.UserDataResponse;
import terabu.shopappuser.entity.User;
import terabu.shopappuser.entity.UserData;
import terabu.shopappuser.mapper.UserDataMapper;
import terabu.shopappuser.repository.UserDataRepository;
import terabu.shopappuser.repository.UserRepositorySpringData;


@RequiredArgsConstructor
@Service
@Slf4j
public class UserDataService {
    private final UserDataRepository userDataRepository;
    private final UserRepositorySpringData userRepository;
    private final UserDataMapper userDataMapper;
    public UserDataResponse update(UserDataRequest userDataRequest) {
        User user = userRepository.findById(userDataRequest.getUserId()).orElseThrow(() -> new UsernameNotFoundException("Пользователь не найден"));
        if(userDataRequest.getLogin() != null){
            user.setLogin(userDataRequest.getLogin());
        }
        if(userDataRequest.getPassword() != null){
            user.setPassword(userDataRequest.getPassword());
        }
        if(userDataRequest.getEmail() != null){
            user.setEmail(userDataRequest.getEmail());
        }
        userRepository.save(user);
        UserData userData = userDataRepository.findDataByUserId(userDataRequest.getUserId()).orElseGet
                (() -> {
                    UserData newData = new UserData();
                    newData.setUser(user);
                    newData.setName(userDataRequest.getName());
                    newData.setSurname(userDataRequest.getSurname());
                    return userDataRepository.save(newData);
                });

        userData.setUser(user);
        userData.setName(userDataRequest.getName());
        userData.setSurname(userDataRequest.getSurname());
        userDataRepository.save(userData);
        log.info("UserData successfully updated");
        return userDataMapper.toResponse(userData);

    }


}
