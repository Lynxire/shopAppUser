package terabu.shopappuser.entity;

import jakarta.persistence.*;

@lombok.Data
@Entity
@Table(name = "data")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Long orders;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
