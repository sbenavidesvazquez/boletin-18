package boletin.pkg18;

public class MetodoAleatorio {

    static int[] numeros = new int[6];
    static int aux;

    public static void numeroAl() {
        for (int i = 0; i < numeros.length; i++) {
            int num = (int) (Math.random() * 50 + 1);
            numeros[i] = num;
            System.out.println("Elemento " + i + " = " + numeros[i]);
        }
        System.out.println("*******************");
        for (int i = numeros.length - 1; i > 0; i--) {
            System.out.println("Elemento-->" + i + " " + numeros[i]);
        }
    }
}
