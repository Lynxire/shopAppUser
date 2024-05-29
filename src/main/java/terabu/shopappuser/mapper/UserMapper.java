package terabu.shopappuser.mapper;

import org.mapstruct.Mapper;
import terabu.shopappuser.dto.users.UserRequest;
import terabu.shopappuser.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    public User toEntity(UserRequest userRequest);
}
