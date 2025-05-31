package tn.esprit.tpprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpprojet.entities.Projet;
import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
    List<Projet> findByProjetDetailTechnologieLike(String technologie );
    List<Projet> findByEquipesIdEquipe(Long equipesId);
    //List<Projet> findEquipesByEquipesId(Long equipesId);
    //List<Projet> findByEquipesidEquipeAndProjetDetailDescription(Long equipesId);


    @Query("select p from Projet p where p.projetDetail.cout>:cout and p.projetDetail.technologie=:technologie")
    List<Projet> findByCoutAndTechnologie(@Param("cout") Long cout, @Param("technologie") String technologie);
}
