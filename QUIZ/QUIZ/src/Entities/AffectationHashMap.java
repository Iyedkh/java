package Entities;

import java.util.*;

public class AffectationHashMap {
    public Map<Employee,Departement> MapED = new HashMap<>();


    public void ajouterEmployeDepartement(Employee e, Departement d){
        MapED.put(e,d);
    }

    public void afficherEmployesEtDepartements(){
        System.out.println(MapED);
    }

    public void supprimerEmploye(Employee e){
        MapED.remove(e);
    }

    public void afficherEmployes(){
        Set<Employee> keys = MapED.keySet();
        Iterator<Employee> iterator = keys.iterator();
        while(iterator.hasNext()) {
            System.out.println("Key: " + iterator.next());
    }}

    public void afficherDepartements(){
        Collection<Departement> values = MapED.values();
        for (Departement value : values) {
            System.out.println("Value: " + value);

        }
    }

    public boolean rechercherEmploye (Employee e){
        if (MapED.containsKey(e)) {
            return true;
        } else {
            return false;
        }}

    public boolean rechercherDepartement (Departement d){
        if(MapED.containsValue(d)){
            return true;
        } else {
            return false;
        }}

    public TreeMap<Employee,Departement> trierMap(){
        Comparator<Employee> comparatorById = Comparator.comparingInt(Employee::getIdent);
        TreeMap<Employee, Departement> treeMap = new TreeMap<>(comparatorById);
        treeMap.putAll(MapED);
        return treeMap;
    }

}
