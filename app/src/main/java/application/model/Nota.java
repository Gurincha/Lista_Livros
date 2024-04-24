package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nota")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Historia;
    private String Desenvolvimento;
    private String Capa;
    private String Escrita;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getHistoria() {
        return Historia;
    }
    public void setHistoria(String historia) {
        Historia = historia;
    }
    public String getDesenvolvimento() {
        return Desenvolvimento;
    }
    public void setDesenvolvimento(String desenvolvimento) {
        Desenvolvimento = desenvolvimento;
    }
    public String getCapa() {
        return Capa;
    }
    public void setCapa(String capa) {
        Capa = capa;
    }
    public String getEscrita() {
        return Escrita;
    }
    public void setEscrita(String escrita) {
        Escrita = escrita;
    }

       
}
