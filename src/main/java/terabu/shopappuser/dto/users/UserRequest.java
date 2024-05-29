package terabu.shopappuser.dto.users;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Data
public class UserRequest {
    @NotBlank(message = "пустое поле логина")
    @Length(min = 4, max = 50, message = "длина логина должна быть от 4 до 50 символов")
    private String login;
    @NotBlank(message = "пустое поле почты")
    private String email;
    @NotBlank(message = "пустое поле пароля")
    @Length(min = 10, message = "длина пароля должна быть от 10 символов")
    private String password;
}
