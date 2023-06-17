package com.ismo.crjj.efm.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "Etablissement")
public class Etablissement {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_etab")
    private int codeEtab;
    
    @Column(name = "Nom_Etab")
    private String nomEtab;
    
    @Column(name = "Adresse_etab")
    private String adresseEtab;
    
    @Column(name = "Tel_etab")
    private String telEtab;
    
    public Etablissement() {
        // Default constructor
    }
    
    public Etablissement(int codeEtab, String nomEtab, String adresseEtab, String telEtab) {
        this.codeEtab = codeEtab;
        this.nomEtab = nomEtab;
        this.adresseEtab = adresseEtab;
        this.telEtab = telEtab;
    }
    
    public int getCodeEtab() {
        return codeEtab;
    }
    
    public void setCodeEtab(int codeEtab) {
        this.codeEtab = codeEtab;
    }
    
    public String getNomEtab() {
        return nomEtab;
    }
    
    public void setNomEtab(String nomEtab) {
        this.nomEtab = nomEtab;
    }
    
    public String getAdresseEtab() {
        return adresseEtab;
    }
    
    public void setAdresseEtab(String adresseEtab) {
        this.adresseEtab = adresseEtab;
    }
    
    public String getTelEtab() {
        return telEtab;
    }
    
    public void setTelEtab(String telEtab) {
        this.telEtab = telEtab;
    }
    
    
}
