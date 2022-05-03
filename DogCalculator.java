import java.util.Scanner;

public class DogCalculator {

    public static void main(String[] args) {
        System.out.print(" Ile kilogramów waży twój pies : ");
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble(); //podajesz wage psa

        double mm = Math.pow(weight, 0.75);    // oblicza metaboliczna mase ciała psa
        System.out.println(" Masa metaboliczna twojego psa to : " + mm);

        double rer = mm * 70;  //oblicza dobowe zapotrzebowanie kaloryczne
        System.out.println(" RER twojego psa to: " + rer);

        System.out.print("Czy twój pies jest kastrowany/sterylizowany? (yes/no) : ");
         String yesorno = scanner.next();
         switch(yesorno) {
             case "yes" :
                 double der = rer * 1.6;
                 System.out.println(" Dzienne zapotrzebowanie kaloryczne twojego psa wynosi : " + der);
                 break;
             case "no":
                 double derr = rer * 1.8;
                 System.out.println(" Dzienne zapotrzebowanie kaloryczne twojego psa wynosi : " + derr);
                 break;

              }
          }

    }






