public class Main {
    public static void main(String[] args) {

        DepartementHashSet gestionDep = new DepartementHashSet();
        AffectationHashMap affect = new AffectationHashMap();

        Departement d1 = new Departement(1, "Informatique", 30);
        Departement d2 = new Departement(2, "RH", 10);

        Employe e1 = new Employe(101, "Ali", "ouissale");
        Employe e2 = new Employe(102, "Sara", "Nour");
        Employe e3 = new Employe(103, "Moussa", "Karim");

        gestionDep.ajouterDepartement(d1);
        gestionDep.ajouterDepartement(d2);

        affect.ajouterEmployeDepartement(e1, d1);
        affect.ajouterEmployeDepartement(e2, d2);
        affect.ajouterEmployeDepartement(e3, d1);

        affect.afficherEmployesEtDepartements();

        affect.ajouterEmployeDepartement(e1, d2);

        System.out.println("-----");
        affect.afficherEmployesEtDepartements();

        affect.supprimerEmploye(e2);

        System.out.println("-----");
        affect.afficherEmployes();

        System.out.println("-----");
        affect.afficherDepartements();

        System.out.println("-----");
        System.out.println(affect.trierMap());
    }
}
