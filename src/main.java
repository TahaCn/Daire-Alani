import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double π = 3.14;

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextInt();
        double 𝛼;
        System.out.print("Açı giriniz : ");
        𝛼 = input.nextDouble();

        double alan;
        alan = (π * (r*r) * 𝛼)/360;
        System.out.println("Dairenizin alanı : " + alan);





    }



}
