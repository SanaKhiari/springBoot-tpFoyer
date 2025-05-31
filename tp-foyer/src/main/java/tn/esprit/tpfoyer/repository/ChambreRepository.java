package tn.esprit.tpfoyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Bloc;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    List<Chambre> findAllByTypeChambre(TypeChambre typeChambre);
    Chambre findChambreByNumeroChambre(Long numeroChambre);

    @Query("SELECT c FROM Chambre c JOIN c.reservations r JOIN r.etudiants e where e.cin=:cin ")
    Chambre findChambreByEtudiantCin(@Param("cin") String cin);




}

