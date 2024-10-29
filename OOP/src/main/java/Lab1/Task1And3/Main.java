package Lab1.Task1And3;

public class Main {
    public static void main(String[] args) {

        Display d1 = new Display(200, 100, 20.5f, "ASUS");
        Display d2 = new Display(100, 50, 40f, "LENOVO");
        Display d3 = new Display(300, 200, 45f, "MSI");

//        d1.compareSize(d2);
//        d1.compareSharpness(d2);
        System.out.println("Display 1 and 2 comparison");
        d1.compareWithMonitor(d2);
        System.out.println("\nDisplay 1 and 3 comparison");
        d1.compareWithMonitor(d3);
        System.out.println("\nDisplay 2 and 3 comparison");
        d2.compareWithMonitor(d3);


    }
}