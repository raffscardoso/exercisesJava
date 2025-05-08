import java.util.Scanner;

public class calArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String mensagem = """
                            Calculo de areas!
                            Escolha a area que deseja calcular:
                              1- Area do quadrado
                              2- Area do circulo
                            """;
        System.out.println(mensagem);
        int numUser = leitor.nextInt();
        switch (numUser){
            case 1:
                System.out.println("Digite o valor do lado do quadrado(m)");
                int lado = leitor.nextInt();
                int areaQuadrado = lado * lado;
                System.out.println("A area do quadrado e " + areaQuadrado + " metros quadrados!");
                break;
            case 2:
                double pi = 3.14;
                System.out.println("Digite o valor do raio do circulo");
                int raio = leitor.nextInt();
                int areaCirculo = (int) ((raio * raio) * pi);
                System.out.println("A area do circulo e aproximadamente " + areaCirculo);
                break;
            default:
                System.out.println("Entrada invalida!");
        }
    }
}
