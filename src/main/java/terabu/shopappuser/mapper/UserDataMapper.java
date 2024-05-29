package terabu.shopappuser.mapper;

import org.mapstruct.Mapper;
import terabu.shopappuser.dto.data.UserDataRequest;
import terabu.shopappuser.dto.data.UserDataResponse;
import terabu.shopappuser.entity.UserData;


@Mapper(componentModel = "spring")
public interface UserDataMapper {
    UserData toEntity(UserDataRequest userDataRequest);
    UserDataResponse toResponse(UserData userData);
}
