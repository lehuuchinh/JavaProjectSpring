package vn.lehuuchinh.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import vn.lehuuchinh.laptopshop.domain.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Long>{
    User save(User hoidanit);
    List<User> findByEmail(String email);
}
