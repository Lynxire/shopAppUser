package terabu.shopappuser.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import terabu.shopappuser.dto.users.UserRequest;
import terabu.shopappuser.dto.users.UserResponse;
import terabu.shopappuser.dto.users.UserToken;
import terabu.shopappuser.service.user.UserService;

@RequiredArgsConstructor
@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;


    @PostMapping("/registration")
    public UserToken registration(@Valid @RequestBody UserRequest userRequest) {
        return userService.registerNewUserAccount(userRequest);
    }

    @PostMapping("/authorization")
    public UserToken authorization(@Valid @RequestBody UserRequest userRequest) {
        return userService.authorization(userRequest);
    }

    @GetMapping("/findByLogin")
    public UserResponse findByLogin(@RequestParam String login) {
        return userService.findUserByLogin(login);
    }

    @GetMapping("/findByEmail")
    public UserResponse findByEmail(@RequestParam String email) {
        return userService.findUserByEmail(email);
    }

    @GetMapping("/findById")
    public UserResponse findById(@RequestParam Long id) {
        return userService.findUserById(id);
    }


}
