package com.leoni.execution.contrats.Models;

import jakarta.persistence.*;

@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;
    @Column(name = "MotDePasse")
    private String motDePasse;

    private String serviceAffectation;

    @Enumerated(EnumType.STRING)
    private RoleName role; // ⬅ Nouveau champ

    public enum RoleName {
        admin, user
    }

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getServiceAffectation() {
        return serviceAffectation;
    }

    public void setServiceAffectation(String serviceAffectation) {
        this.serviceAffectation = serviceAffectation;
    }

    public RoleName getRole() {
        return role;
    }

    public void setRole(RoleName role) {
        this.role = role;
    }
}
