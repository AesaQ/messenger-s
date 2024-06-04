package repository;

import entity.Communicate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringCommunicateRepository extends JpaRepository<Communicate, Long> {
}
