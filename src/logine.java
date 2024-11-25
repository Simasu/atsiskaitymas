import java.util.Arrays;
import java.util.Scanner;

public class logine {
    public static void logicalOperations() {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu: ");
        int num1 = input.nextInt();
        System.out.println("Iveskite antra skaiciu: ");
        int num2 = input.nextInt();

        System.out.println(num1 > num2);
        System.out.println(num1 / 5 & num2 / 5);
    }

    public static void StringBuilder(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yveskite sakiny: ");
        String sakinys = input.nextLine();
        System.out.println("Originalus sakinys: " + sakinys);
        String didziosios = sakinys.toUpperCase();
        System.out.println("Didziosiomis: " + didziosios);
        String atvirksciai = "";
        for (int i = 0; i < sakinys.length(); i++) {
            atvirksciai = sakinys.charAt(i) + atvirksciai;
        }
        System.out.println("Atvirkscias: " + atvirksciai);
        int zodziuSkaicius = sakinys.split("\\s").length;
        System.out.println("Zodziu skaicius: " + zodziuSkaicius);
        System.out.println("Prasideda Java: " + input.findInLine("Java"));
    }

    public static void arrayOperations(Arrays args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite 5 skaicius: ");
        int[] anArray = {input.nextInt(5)};
        Arrays.sort(anArray);
        System.out.println(Arrays.stream(anArray).min());
        System.out.println(Arrays.stream(anArray).max());
        System.out.println(Arrays.stream(anArray).average());
    }

    public static void matrixOperations(String[] args) {
        String[][] array = {
                {"3", "5", "7"},
                {"1", "4", "8"},
                {"2", "6", "9"}
        };
        System.out.println(array.length);
        String pirmaEiluta = array[0][0] + array[0][1] + array[0][2];
        System.out.println("1 eilutes suma: " + pirmaEiluta);
        String antraEilute = array[1][0] + array[1][1] + array[1][2];
        System.out.println("2 eilutes suma: " + antraEilute);
        String treciaEilute = array[2][0] + array[2][1] + array[2][2];
        System.out.println("3 eilutes suma:" + treciaEilute);
    }

    public static void printNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: " + input);
        int skaicius = input.nextInt();

    }

    public static int calculateFactorial(int args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int skaicius = input.nextInt();
        int factorial = calculateFactorial(skaicius);
        System.out.println("Faktorialas " + skaicius + " = " + factorial);
        return skaicius;
    }

    public static void calculate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Yveskite pirma skaiciu: ");
        int num1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Yveskite antra skaiciu: ");
        int num2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Yveskite parametra: ");
        String parametras = input3.nextLine();
    }
}
