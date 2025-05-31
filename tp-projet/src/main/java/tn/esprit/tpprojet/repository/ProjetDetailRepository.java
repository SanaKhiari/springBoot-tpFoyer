package tn.esprit.tpprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.tpprojet.entities.ProjetDetail;

import java.util.List;

@Repository
public interface ProjetDetailRepository extends JpaRepository<ProjetDetail, Long> {

    List<ProjetDetail> findByTechnologieLike(String technologie);
    List<ProjetDetail> findByTechnologieContains(String technologie);




}
