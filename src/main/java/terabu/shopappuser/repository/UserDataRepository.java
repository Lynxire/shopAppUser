package terabu.shopappuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import terabu.shopappuser.entity.UserData;


import java.util.Optional;

public interface UserDataRepository extends JpaRepository<UserData,Long> {
    public Optional<UserData> findByUserId(Long userId);
    public Optional<UserData> findDataByUserId(Long userId);
}
