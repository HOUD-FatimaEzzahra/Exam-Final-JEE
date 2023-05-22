package ma.enset.backend.f_houd.repositories;

import ma.enset.backend.f_houd.entities.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionRepository extends JpaRepository<Avion, Long> {
}
