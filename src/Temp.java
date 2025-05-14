public class Temp{
    public static void main(String[] args) {
        double temperatura = 30.4;
        double temperaturaF =  (temperatura * 1.8) + 32;
        String mensagem = String.format("A temperatura %.2f em Celsius equivale a %.2f em Fahrenheit", temperatura, temperaturaF);
        System.out.println(mensagem);

        int displayTempInt = (int) temperaturaF;

        System.out.println("A temperatura em int equivale a: "  + displayTempInt);
    }
}
