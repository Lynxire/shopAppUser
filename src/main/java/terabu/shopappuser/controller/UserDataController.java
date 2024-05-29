package terabu.shopappuser.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import terabu.shopappuser.dto.data.UserDataRequest;
import terabu.shopappuser.dto.data.UserDataResponse;
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
}
