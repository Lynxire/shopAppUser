package terabu.shopappuser.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import terabu.shopappuser.dto.users.UserRequest;
import terabu.shopappuser.dto.users.UserResponse;
import terabu.shopappuser.service.user.UserService;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;


    @PostMapping("/registration")
    public UserResponse registration(@Valid @RequestBody UserRequest userRequest) {
        return userService.registerNewUserAccount(userRequest);
    }

    @PostMapping("/authorization")
    public UserResponse authorization(@Valid @RequestBody UserRequest userRequest) {
        return userService.authorization(userRequest);
    }



}
