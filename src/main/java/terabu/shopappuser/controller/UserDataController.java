package terabu.shopappuser.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import terabu.shopappuser.dto.data.UserDataRequest;
import terabu.shopappuser.dto.data.UserDataResponse;
import terabu.shopappuser.dto.users.UserResponse;
import terabu.shopappuser.entity.UserData;
import terabu.shopappuser.service.userData.UserDataService;

@RestController
@RequiredArgsConstructor
@RequestMapping("data")

public class UserDataController {
    private final UserDataService userDataService;


    @PostMapping("/update")
    public UserDataResponse updateData(@RequestBody @Valid UserDataRequest userDataRequest){
        return userDataService.update(userDataRequest);
    }

    @GetMapping("/findByUserId")
    public UserDataResponse findById(@RequestParam Long userId) {
        return userDataService.findByUserId(userId);
    }

    @PostMapping("/save")
    public UserDataResponse save(@RequestBody UserData userData){
        return userDataService.save(userData);
    }
}
