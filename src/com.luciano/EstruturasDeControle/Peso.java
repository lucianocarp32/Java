public class Peso {
    public static void main(String[]args){
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Informe seu peso: (ex: 73,2)");

        var peso = scanner.nextDouble();
        System.out.println("Informe sua altura: (ex: 1,91)");

        var altura = scanner.nextDouble();
        scanner.close();

        var imc = peso / (altura * altura);
        
        if (imc < 18.5){
            System.out.printf("Seu IMC é %.2f\n você está abaixo do peso", imc);
        } else if (imc < 25){
            System.out.printf("Seu IMC é %.2f\n você está com o peso ideal", imc);
        } else if(imc < 30){
            System.out.printf("Seu IMC é %.2f\n você está levemente acima do peso", imc);
        } else if(imc < 35){
            System.out.printf("Seu IMC é %.2f\n você está com Obesidade Grau I ", imc);
        } else if(imc < 40){
            System.out.printf("Seu IMC é %.2f\n você está com Obesidade Grau II(Severa) ", imc);
        } else{
            System.out.printf("Seu IMC é %.2f\n você está com Obesidade Grau III(Mórbida)", imc);
        }
    }
}
