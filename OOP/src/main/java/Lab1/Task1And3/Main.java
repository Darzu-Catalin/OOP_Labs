package Lab1.Task1And3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Display d1 = new Display(200, 100, 20.5f, "ASUS");
//        Display d2 = new Display(100, 50, 40f, "LENOVO");
//        Display d3 = new Display(300, 200, 45f, "MSI");
//
////        d1.compareSize(d2);
////        d1.compareSharpness(d2);
//        System.out.println("Display 1 and 2 comparison");
//        d1.compareWithMonitor(d2);
//        System.out.println("\nDisplay 1 and 3 comparison");
//        d1.compareWithMonitor(d3);
//        System.out.println("\nDisplay 2 and 3 comparison");
//        d2.compareWithMonitor(d3);

        ArrayList<Display> displayList = new ArrayList<>();

        displayList.add(new Display( 27, 23, 163,"Dell U2720Q"));
        displayList.add(new Display(27, 23, 163, "LG 27UK"));
        displayList.add(new Display(32, 28, 137, "ASUS ProArt PA32U"));
        displayList.add(new Display(27, 23, 144,"Samsung Odyssey G3"));
        displayList.add(new Display(32, 28, 137, "BenQ PD32"));

        Assistant assistant = new Assistant("Catalin", displayList);

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("===== Display Assistant Menu =====");
            System.out.println("1. Show Best Display");
            System.out.println("2. Buy Display");
            System.out.println("3. Print Available Displays");
            System.out.println("4. Get Recommendation");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = 0;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            }catch(Exception e) {
                scanner.nextLine();
            }

            switch (choice) {
                case 1:
                    // Show Best Display
                    assistant.assist();
                    break;

                case 2:
                    // Buy Display
                    System.out.print("Enter the name of the display to buy: ");
                    String displayName = scanner.nextLine();
                    // Assuming Display has a method to find a display by name
                    Display displayToBuy = assistant.findDisplayByName(displayName);
                    assistant.buyDisplay(displayToBuy);
                    break;

                case 3:
                    // Print Available Displays
                    assistant.printDisplay();
                    break;

                case 4:
                    // Get Recommendation
                    System.out.print("Enter the specifiactions for the display: ");
                    System.out.println();
                    System.out.print("Enter the height: ");
                    int height = scanner.nextInt();
                    System.out.print("Enter the width: ");
                    int width = scanner.nextInt();
                    System.out.print("Enter the ppi: ");
                    float ppi = scanner.nextFloat();

                    Display displayToRecommend = new Display(width, height, ppi, "");
                    assistant.getRecommandation(displayToRecommend);
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }



    }
}