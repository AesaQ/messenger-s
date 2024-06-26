package repository;

import entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpringMessageRepository extends JpaRepository<Message, Long> {
    @Query("SELECT m FROM Message m WHERE m.communicateId = ?1")
    List<Message> findByCommunicateId(Long id);
}
