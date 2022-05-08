package karen;
import java.text.DecimalFormat;
import java.util.Scanner;
public class test {


        public static void main(String[] args) {
            System.out.println("Menu");
            int option;
            do {
                System.out.println("1- Option 1");
                System.out.println("2- Option 2");
                System.out.println("3- IMC");
                System.out.println("4- Exit");
                Scanner menu = new Scanner(System.in);
                System.out.println("Select an option: ");
                option = menu.nextInt();
                imc(option);
            } while (option != 4);
        }
        public static void imc(int option){

            Scanner scanner= new Scanner(System.in);


            switch (option) {
                case 1:
                    System.out.print("Selected Option 1 ");
                    break;
                case 2 :
                    System.out.print("Selected Option 2 ");
                    break;
                case 3:
                    System.out.println("Calculating the IMC- Body Mass Index(in english)");
                    System.out.print("Type your weight");
                    double number1 = scanner.nextDouble();
                    System.out.print("Type your stature");
                    double number2 = scanner.nextDouble();
                    if (number2 == 0) {
                        System.out.println("Impossible!Review the numbers");
                    } else {
                        double imc = number1 / (number2 * number2) ;
                        DecimalFormat formatted= new DecimalFormat("0.00");
                        System.out.println("Your IMC is  " +formatted.format(imc));

                        if(imc<=18.5) {
                            System.out.println("You are underweight!");
                        }
                        if (imc>=18.5 && imc<=24.99) {
                            System.out.println("You are very good!");
                        }
                        if(imc>=25.0 && imc<= 29.99) {
                            System.out.println("over weight! Advise!");
                        }
                        if(imc>=30.0 && imc<=34.99) {
                            System.out.println("Obese! Attention! Search a doctor");
                        }
                        if(imc>=35.00) {
                            System.out.println("Extremely obese! Urgent: GO TO DOCTOR");
                        }
                    }
                    break;
                case 4:
                    System.out.println("The program has ended ");
                    break;
                default :
                    System.out.println("Invalid selection");
                    break;
            }
        }





}
