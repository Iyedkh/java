package Entities;

import java.util.*;

public class DepartementHashSet implements IDépartement<Departement>{

    Set<Departement> DepSet = new HashSet<>();


    @Override
    public void ajouterDepartement(Departement departement) {
        DepSet.add(departement); //Fama hashcode w equals jawna behi
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> IT = DepSet.iterator();
        while (IT.hasNext()){
            if(IT.next().getDepart().equals(nom)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return DepSet.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        DepSet.remove(departement);
    }

    @Override
    public void displayDepartement() {
        System.out.println(DepSet);
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet <Departement> treeset = new TreeSet<>();
        treeset.addAll(DepSet);
        return treeset;
    }
}
