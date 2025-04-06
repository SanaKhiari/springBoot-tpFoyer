package tn.esprit.tpprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ProjetDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id_projetDetail;
    String description;
    String technologie;
    long cout;
    Date dateDebut;
    @OneToOne(mappedBy = "projetDetail")
        @ToString.Exclude
        @JsonIgnore
    Projet projet;

    public long getId_projetDetail() {
        return id_projetDetail;
    }

    public void setId_projetDetail(long id_projetDetail) {
        this.id_projetDetail = id_projetDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologie() {
        return technologie;
    }

    public void setTechnologie(String technologie) {
        this.technologie = technologie;
    }

    public long getCout() {
        return cout;
    }

    public void setCout(long cout) {
        this.cout = cout;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
}
