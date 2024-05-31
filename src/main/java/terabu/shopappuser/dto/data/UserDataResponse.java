package terabu.shopappuser.dto.data;

import lombok.Data;


@Data
public class UserDataResponse {
    private Long id;
    private String name;
    private String surname;
    private Long orders;
    private Long userId;
}
