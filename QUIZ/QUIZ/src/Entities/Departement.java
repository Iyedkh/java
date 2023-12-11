package Entities;

import java.util.Comparator;
import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id,nbEmpolye;
    private String depart;

    public Departement(int id, int nbEmpolye, String depart) {
        this.id = id;
        this.nbEmpolye = nbEmpolye;
        this.depart = depart;
    }


    public Departement(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbEmpolye() {
        return nbEmpolye;
    }

    public void setNbEmpolye(int nbEmpolye) {
        this.nbEmpolye = nbEmpolye;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(depart, that.depart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nbEmpolye, depart);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nbEmpolye=" + nbEmpolye +
                ", depart='" + depart + '\'' +
                '}';
    }


    @Override
    public int compareTo(Departement o) {
        return this.id-o.id;
    }
}
