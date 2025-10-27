public class Hello {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.println("bonjour et bienvenu dans mon programme java");
        System.out.print("Quel est votre nom ? ");
        String nom = scan.nextLine();

        System.out.print("Quel est votre prénom ? ");
        String prenom = scan.nextLine();

        System.out.println("Salut " + nom.toUpperCase() + " !");
        System.out.println("Bienvenue " + nom.toUpperCase() + " " + prenom.toLowerCase() + " !");
    }
}