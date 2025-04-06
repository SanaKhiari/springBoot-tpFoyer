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
    long id_Equipe;
    String nom;
    Domaine domaine;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    Set<Projet> projet = new HashSet<Projet>();

    public long getId_Equipe() {
        return id_Equipe;
    }

    public void setId_Equipe(long id_Equipe) {
        this.id_Equipe = id_Equipe;
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
