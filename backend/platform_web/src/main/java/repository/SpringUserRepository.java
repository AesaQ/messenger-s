package repository;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringUserRepository extends JpaRepository<User, Long> {
}
