package Main;

import Entities.*;

public class Main {
    public static void main(String[] args) {

        AffectationHashMap AH = new AffectationHashMap();

        Employee employe1 = new Employee(12345,"ahmed","bousbih","Marketing",1);
        Employee employe2 = new Employee (56789,"Molka","karwi","Marketing",3);
        Departement Marketing = new Departement(1,25,"Marketing");
        Departement Dev = new Departement(2,15,"Dev");

        AH.ajouterEmployeDepartement(employe1, Marketing);
        AH.ajouterEmployeDepartement(employe2, Dev);
        AH.ajouterEmployeDepartement(employe1, Dev); // Tentative d'affectation à un autre département pour Employe1
        AH.afficherEmployesEtDepartements();

        AH.trierMap();
    }
}