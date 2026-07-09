//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

public class tabuada {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in); //importação do scanner para ler a entrada do usuário
        System.out.println("Informe um número:");    //solicita ao usuário que informe um número
        var number = scanner.nextInt(); scanner.close();  //lê o número informado pelo usuário e fecha o scanner
        System.out.println("tabuada do " + number);  
        for (int i = 1; i <= 10; i++){  //laço de repetição para gerar a tabuada de 1 até 10
            System.out.printf("%d * %d = %d\n", number, i, i * number); //imprime a tabuada do número informado pelo usuário
        }
    }
}
