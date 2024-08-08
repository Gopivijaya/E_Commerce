package vijaya.com.e_commerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vijaya.com.e_commerce.models.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByName(String name);
}
