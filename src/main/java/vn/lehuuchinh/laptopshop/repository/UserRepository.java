package vn.lehuuchinh.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.lehuuchinh.laptopshop.domain.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{
    User save(User hoidanit);
    List<User> findByEmail(String email);
}
