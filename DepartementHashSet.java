import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DepartementHashSet implements IDepartement<Departement> {

    private HashSet<Departement> liste = new HashSet<>();

    public void ajouterDepartement(Departement d) {
        liste.add(d);
    }

    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : liste) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    public boolean rechercherDepartement(Departement d) {
        return liste.contains(d);
    }

    public void supprimerDepartement(Departement d) {
        liste.remove(d);
    }

    public void afficherDepartements() {
        for (Departement d : liste) {
            System.out.println(d);
        }
    }

    public void trierDepartementsParId() {
        ArrayList<Departement> temp = new ArrayList<>(liste);
        Collections.sort(temp, new Comparator<Departement>() {
            public int compare(Departement d1, Departement d2) {
                return d1.getId() - d2.getId();
            }
        });
        for (Departement d : temp) {
            System.out.println(d);
        }
    }

    public void trierDepartementsParNomEtNombreEmployes() {
        ArrayList<Departement> temp = new ArrayList<>(liste);
        Collections.sort(temp, new Comparator<Departement>() {
            public int compare(Departement d1, Departement d2) {
                int cmp = d1.getNomDepartement().compareToIgnoreCase(d2.getNomDepartement());
                if (cmp == 0) {
                    return d1.getNombreEmployes() - d2.getNombreEmployes();
                }
                return cmp;
            }
        });
        for (Departement d : temp) {
            System.out.println(d);
        }
    }
}
