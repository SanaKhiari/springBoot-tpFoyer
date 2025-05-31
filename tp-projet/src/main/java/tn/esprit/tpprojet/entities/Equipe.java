package tn.esprit.tpprojet.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEquipe;
    String nom;
    Domaine domaine;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Set<Projet> projet = new HashSet<Projet>();

    @ManyToOne
    Entreprise entreprise;

    public long getId_Equipe() {
        return idEquipe;
    }

    public void setId_Equipe(long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public Set<Projet> getProjet() {
        return projet;
    }

    public void setProjet(Set<Projet> projet) {
        this.projet = projet;
    }
}
