package tn.esprit.tpprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpprojet.entities.Equipe;

import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    List<Equipe> findByNomAndProjetProjetDetailDescription(String nom, String Description);

    @Query("select e from Equipe e join e.projet p where p.projetDetail.technologie=:t and p.projetDetail.dateDebut>current_date ")
    List<Equipe> findBytchnologieAndDateDebut(@Param("t") String technologie);

}
