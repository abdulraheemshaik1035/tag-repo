public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read text from the terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Java! ===");
        
        // 1. Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!\n");

        // 2. Read two numbers for calculations
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt(60);

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt(70);
//this is extra line added by dev2
