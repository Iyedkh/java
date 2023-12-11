package Entities;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
    public int ident;
    public String nom,prenom,dep;
    public int grade;

    public Employee(int ident, String nom, String prenom, String dep, int grade) {
        this.ident = ident;
        this.nom = nom;
        this.prenom = prenom;
        this.dep = dep;
        this.grade = grade;
    }

    Employee(){}

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
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

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ident=" + ident +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dep='" + dep + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int DepCompare = o1.getDep().compareTo( o2.getDep());  //string

        int GradeCompare = o1.getGrade() - o2.getGrade(); // entier b - yet9arnou

        // 2nd level comparison
        return (DepCompare == 0) ? GradeCompare : DepCompare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ident == employee.ident && Objects.equals(nom, employee.nom);
    }

    @Override
    public int compareTo(Employee o) {
        return this.ident-o.getIdent();
    }

}
