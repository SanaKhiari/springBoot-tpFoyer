package tn.esprit.tpprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.tpprojet.entities.Domaine;
import tn.esprit.tpprojet.entities.Entreprise;

import java.util.List;


@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    //@Query("select e from Entreprise e where e.adresse=:adresse")
    @Query(value = "select * from entreprise e where e.adresse=:adresse",nativeQuery = true )
    List<Entreprise> findByAdresse(@Param("adresse") String adresse);

    @Query("select e from Entreprise e join e.equipes equipe where equipe.domaine=:domaine")
    List<Entreprise> findByDomaine(@Param("domaine") Domaine domaine);

    //@Query(value = "select * from entreprise e join equipe on e.id_entrprise=:equipe.entreprise_id_entrprise where equipe.domaine=:domaine ",nativeQuery = true)
    //List<Entreprise> findByDomaine(@Param("domaine") String domaine);




    @Modifying
    @Query("UPDATE Entreprise e set e.adresse=:adress where  e.idEntrprise=:id")
    int  adress(@Param("adresse") String adresse,@Param("id") Long id);




}
