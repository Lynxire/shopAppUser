package terabu.shopappuser.dto.data;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDataRequest {
    private String name;
    private String surname;
    @Length(min = 10)
    private String password;
    private String email;
    @Length(min = 4, max = 50)
    private String login;
    @NotNull
    @Min(1)
    private Long userId;
}
