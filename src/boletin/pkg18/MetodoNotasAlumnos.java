package boletin.pkg18;

import java.util.Scanner;

public class MetodoNotasAlumnos {

    static int[] dam = new int[6];
    static String[] alum = new String[6];
    static int apro = 0;
    static int susp = 0;
    static int not;

    public static void nombres() {
        String nombre = "";
        for (int i = 0; i < alum.length; i++) {
            Scanner nom = new Scanner(System.in);
            nombre = nom.nextLine();
            alum[i] = nombre;

        }
        System.out.println(" ");
        for (int i = 0; i < alum.length; i++) {
            System.out.println("Elemento: " + i + " ---> " + alum[i]);
        }
        System.out.println("    ");
    }

    public static void listAprob() {
        for (int i = 0; i < dam.length; i++) {
            not = (int) (Math.random() * 10 + 1);
            dam[i] = not;
            if (not >= 5) {
                System.out.println("Aprobó: " + alum[i] + " " + dam[i]);
            }
        }
        System.out.println("  ");
    }

    public static void listaOrdenada() {

        int cambio, aux;
        String al;

        do {
            cambio = 0;
            for (int i = 0; i < dam.length - 1; i++) {
                if (dam[i] > dam[i + 1]) {
                    aux = dam[i];
                    dam[i] = dam[i + 1];
                    dam[i + 1] = aux;

                    al = alum[i];
                    alum[i] = alum[i + 1];
                    alum[i + 1] = al;
                    cambio = 1;
                }

            }

        } while (cambio != 0);
    }

    public static void verNotAl() {
        for (int i = 0; i < dam.length; i++) {
            System.out.println("alumno " + alum[i] + " --> " + dam[i]);
        }
    }

    public static void pedir() {
        String al;
        Scanner d = new Scanner(System.in);
        al = d.nextLine();

        for(int i=0;i<dam.length;i++){
            if(al.equals(alum[i])){
                System.out.println(dam[i]);
            }    
        }
        

    }
}
