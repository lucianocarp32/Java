public class rectangle {
    public static void main(String[] args){

        System.out.println("Informe a base do retângulo:");
        var scanner = new java.util.Scanner(System.in);
        var base = scanner.nextInt();
        System.out.println("Informe a altura do retângulo:");
        var height = scanner.nextInt();
        var area = base * height;
        System.out.printf(" A área do seu retângulo é: %s", area);

        scanner.close();
    }
}
