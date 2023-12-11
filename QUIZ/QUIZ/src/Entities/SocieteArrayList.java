package Entities;

import Entities.IGestion;

import java.util.*;

public class SocieteArrayList implements IGestion<Employee> {

    List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void ajouterEmploye(Employee t) {
        employeeList.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        /* methode 1 : avec for
        for(Employee e : employeeList){
            if(e.getNom().equals(nom)){
                return true;
            }
        }
        //Methode 2 avec for
        for(int i=0; i<employeeList.size();i++){ //taille avec size()
            if(employeeList.get(i).getNom().equals(nom)){  //get(i) pour acceder a l'objet
                return true;
            }
    }*/
        //Methode 3 avec iterator
        Iterator<Employee> i = employeeList.iterator();
        while (i.hasNext()){
            if(i.next().getNom().equals(nom)){
            return true;}
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee t) {
        return employeeList.contains(t);
    }

    @Override
    public void supprimerEmploye(Employee t) {
        employeeList.remove(t); //fama equals jawna behi
    }

    @Override
    public void displayEmploye() {
        System.out.print(employeeList); //fama toStrong jawna behi
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employeeList);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Comparator<Employee> departementComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getDep().compareTo(o2.getDep());
            }
        };
        Comparator<Employee> gradeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };
        Collections.sort(employeeList, new Employee());
    }
}
