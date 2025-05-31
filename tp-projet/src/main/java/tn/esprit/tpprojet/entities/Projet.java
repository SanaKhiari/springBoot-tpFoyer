package tn.esprit.tpprojet.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idprojet;
    String sujet;
    //@OneToOne (mappedBy = "projet")
    @OneToOne(cascade = CascadeType.ALL)
    ProjetDetail projetDetail;
    @ManyToMany(mappedBy = "projet")
    @ToString.Exclude
    @JsonIgnore
    Set<Equipe> equipes;

    public long getId_projet() {
        return idprojet;
    }

    public void setId_projet(long idprojet) {
        this.idprojet = idprojet;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public ProjetDetail getProjetDetail() {
        return projetDetail;
    }

    public void setProjetDetail(ProjetDetail projetDetail) {
        this.projetDetail = projetDetail;
    }

    public Set<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(Set<Equipe> equipes) {
        this.equipes = equipes;
    }


}
