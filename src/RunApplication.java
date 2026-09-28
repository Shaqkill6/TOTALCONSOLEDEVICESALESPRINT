import java.util.Scanner;

public class RunApplication {
    void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = input.nextInt();input.nextLine();
        String consoleType;
        if (choice == 1){
            consoleType = "PS5";
        }
        else if (choice == 2){
            consoleType = "XBOX";
        }
        else {
            consoleType = "SWITCH";
        }

        System.out.println("Enter the store: " );
        String store = input.nextLine();
        System.out.println("Enter the total sales of PS5 consoles for Number 1 Electronics Store: ");
        int totalSales = input.nextInt();

        ConsoleSales sales = new ConsoleSales(consoleType,store,totalSales);
        sales.printReport();
    }
}
