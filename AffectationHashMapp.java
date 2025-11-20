import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private HashMap<Employe, Departement> map = new HashMap<>();

    public void ajouterEmployeDepartement(Employe e, Departement d) {
        if (!map.containsKey(e)) {
            map.put(e, d);
        }
    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Departement> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        map.remove(e);
    }

    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (map.containsKey(e) && map.get(e).equals(d)) {
            map.remove(e);
        }
    }

    public void afficherEmployes() {
        for (Employe e : map.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        for (Departement d : map.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employe e) {
        return map.containsKey(e);
    }

    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d);
    }

    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> sorted = new TreeMap<>(
                (e1, e2) -> e1.getId() - e2.getId()
        );
        sorted.putAll(map);
        return sorted;
    }
}
