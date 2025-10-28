public class Test {
    public static void main(String[] args) {
        int nombre = 0;

        if (args.length > 0){
            
            nombre = Integer.parseInt(args[0]);
        }else{

            java.util.Scanner scan = new java.util.Scanner(System.in);
            System.out.println("Etrer un nombre entier");
            

            if (scan.hasNextInt()) {
                nombre = scan.nextInt();
                System.out.println("Vous avez saisi : " + nombre);
            } else {
                System.out.println("Erreur : vous devez entrer un nombre entier !");
                scan.close();
                return;
            }
            scan.close();
        }

        if (nombre > 0) {
            System.out.println(nombre + " est positif");
        }else if (nombre < 0){
            System.out.println(nombre + " est négatif");
        }else {
            System.out.println("La valeur est null");
        }

        // Test pair/impair
        if (nombre != 0) {
            if (nombre % 2 == 0) {
                System.out.println(" et paire");
            } else {
                System.out.println(" et impaire");
            }
        } else if (nombre == 0){
            System.out.println(nombre + " vaut zèro");
        }

    }
}
