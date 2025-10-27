public class Test {
    public static void main(String[] args) {
        int nombre = 0;

        if (args.length > 0){
            
            nombre = Integer.parseInt(args[0]);
        }else{

            java.util.Scanner scan = new java.util.Scanner(System.in);
            System.out.println("Etrer un nombre entier");
            nombre = scan.nextInt();
        }

        if (nombre > 0) {
            System.out.println(nombre + " est positif");
        }else if (nombre < 0){
            System.out.println(nombre + " est négatif");
        }else if (nombre == 0){
            System.out.println(nombre + " vaut zèro");
        }else {
            System.out.println("La valeur est null");
        }

    }
}
