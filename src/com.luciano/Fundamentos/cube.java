public class cube {
    public static void main(String[] args){

        System.out.println("Digite o tamanho de um dos lados do cubo:");
        var scanner = new java.util.Scanner(System.in);
        var side = scanner.nextInt();
        var area = side * side;
        System.out.printf(" A área do quadrado é: %s", area);

        // aqui eu fecho o scanner para evitar vazamento de memória, já que não vou mais usar ele
        scanner.close();
    }
}
