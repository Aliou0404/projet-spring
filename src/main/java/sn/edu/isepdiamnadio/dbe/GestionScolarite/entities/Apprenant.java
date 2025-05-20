package sn.edu.isepdiamnadio.dbe.GestionScolarite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType
            .IDENTITY)
    private  Integer id;
    private String nom;
    private  String prenom;
    private Integer promo;
    private  String image;



    public Integer getPromo() {
        return promo;
    }

    public void setPromo(Integer promo) {
        this.promo = promo;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPrenom(String aliou) {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
