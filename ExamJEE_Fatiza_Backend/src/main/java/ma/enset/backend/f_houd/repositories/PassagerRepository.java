package ma.enset.backend.f_houd.repositories;

import ma.enset.backend.f_houd.entities.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassagerRepository extends JpaRepository<Passager, Long> {
}
