package sn.edu.isepdiamnadio.dbe.GestionScolarite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity

public class Enseignant {
    @Id
    @GeneratedValue(strategy = GenerationType
            .IDENTITY)

    private  Integer id;
    private String nom;
    private  String prenom;
    private String matieres;

    public String getMatieres() {
        return matieres;
    }

    public void setMatieres(String matieres) {
        this.matieres = matieres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Enseignant(String prenom) {
        this.prenom = prenom;
    }

    public Enseignant() {

    }
}
