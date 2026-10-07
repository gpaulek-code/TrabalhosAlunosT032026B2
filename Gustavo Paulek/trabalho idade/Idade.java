import java.util.Scanner;

public class Idade {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Qual seu nome ");
        String nome = scanner.nextLine();

        System.out.print("Informe sua idade ");
        int idade= scanner.nextInt();

        if (idade>=18){
            System.out.print ("tu eh de maior ");


        }
        else{
            System.out.print ("tu eh de menor ");
        }
        scanner.close();
    }
}

