package tn.esprit.tpprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpprojet.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
