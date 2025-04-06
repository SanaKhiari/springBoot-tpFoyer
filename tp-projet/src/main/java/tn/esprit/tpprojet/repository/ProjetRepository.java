package tn.esprit.tpprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpprojet.entities.Projet;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
