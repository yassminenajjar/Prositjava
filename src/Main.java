import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ZooManagment Z1 = new ZooManagment();

        System.out.println("zooname :");
        Scanner sc =new Scanner(System.in);
        System.out.println("nbrdecages :");
        Z1.zooName = sc.nextLine();
        System.out.println("nombre de cages  :");
        Z1.nbrCages = sc.nextInt();
        System.out.println("le zoo "+Z1.zooName+" contient "+Z1.nbrCages+"Cages");






        }
    }
