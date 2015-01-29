package boletin.pkg18;

public class Boletin18 {

    MetodoNotas obx = new MetodoNotas();
    Dni let = new Dni();

    public static void main(String[] args) {
      //  MetodoAleatorio.numeroAl();
        // System.out.println("***********************************");
        // System.out.println("NOTAS");
        // MetodoNotas.notas();
        //MetodoNotas.NotaMedia();
        //MetodoNotas.NotaAlta();
        //System.out.println("******************************************");
        System.out.println("NOTAS Y NOMBRES");
        System.out.println("escribe 6 nombres:");
        MetodoNotasAlumnos.nombres();
        MetodoNotasAlumnos.listAprob();
        MetodoNotasAlumnos.verNotAl();
        MetodoNotasAlumnos.listaOrdenada();
        System.out.println(" ");
        MetodoNotasAlumnos.verNotAl();
        System.out.println("");
        System.out.println("Que alumno quiere ver");
        MetodoNotasAlumnos.pedir();
        //System.out.println("******************");
        //System.out.println("Escriba su NIF para averiguar su letra");
        //Dni.letra();
    }

}
