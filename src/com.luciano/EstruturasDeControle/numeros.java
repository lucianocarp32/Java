/*Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, 
com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, 
incluindo os números informados e em ordem decrescente;
*/

public class numeros {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        int firstNumber = scanner.nextInt();
        System.out.println("Informe o segundo número (maior que o primeiro):");
        int secondNumber = scanner.nextInt();
        while (secondNumber <= firstNumber){
            System.out.println("Informe um número maior que o primeiro:");
            secondNumber = scanner.nextInt();
        }
        
        System.out.println("Escolha entre 1 para ímpar e 2 para par:");
        int choice = scanner.nextInt();
        
            if (choice != 1 && choice != 2) {
                System.out.println("Escolha inválida. Por favor, escolha entre 1 para ímpar e 2 para par:");
                choice = scanner.nextInt();
            }
        
        int i = secondNumber;


        switch (choice){
            case 1: //ímpar
                System.out.println("Números ímpares no intervalo:");
                
                for (i = secondNumber; i >= firstNumber; i-- ){
                    var result = i %2;
                    if ( result == 1 ){
                        System.out.println(i);
                    }

                }

                break;
            case 2: //par
                System.out.println("Números pares no intervalo:");
                
                for (i = secondNumber; i >= firstNumber; i-- ){
                    var result = i %2;
                    if ( result == 0 ){
                        System.out.println(i);
                    }
                
                }
                break;
        }
        scanner.close();
        
   
    }
}