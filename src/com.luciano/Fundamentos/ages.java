public class ages {
    public static void main(String[] args) throws Exception {


    try ( var scanner = new java.util.Scanner(System.in)) {; //try with resources, o scanner é fechado automaticamente após o uso
    System.out.println("Digite seu nome:");
    var name1 = scanner.next();
    System.out.println("Qual a sua idade?");
    var age1 = scanner.nextInt();

    System.out.println("Digite seu nome:");
    var name2 = scanner.next();
    System.out.println("Qual a sua idade?");
    var age2 = scanner.nextInt();

    var ageDifference = Math.abs(age1 - age2);
    System.out.printf("%s tem %s anos, Já %s tem %s anos, vocês tem uma diferença de %s anos", name1, age1, name2, age2, ageDifference);
        } //o scanner é fechado automaticamente após o uso
    }
}
