package terabu.shopappuser.dto.users;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import terabu.shopappuser.entity.status.Role;

import java.time.LocalDate;

@Data
public class UserResponse {
    private Long id;
    private String login;
    private String email;
    private String password;
    private LocalDate dateRegistration;
    private String role;
}
