package boletin.pkg18;

public class MetodoNotas {

    static private int[] DAM = new int[30];
    static int apro = 0;
    static int susp = 0;
    static int not;

    public static void notas() {
        for (int i = 0; i < DAM.length; i++) {
            not = (int) (Math.random() * 10 + 1);
            DAM[i] = not;
            if (not < 5) {
                susp++;
            }
            if (not >= 5) {
                apro++;
            }
        }
        System.out.println("Aprobados= " + apro + "; Suspensos= " + susp);
    }

    public static void NotaMedia() {
        int suma = 0;
        int notMed;

        for (int i = 0; i < DAM.length; i++) {
            suma = suma + DAM[i];
        }
        notMed = suma / DAM.length;
        System.out.println("Nota media= " + notMed);
    }

    public static void NotaAlta() {
        int notAl = DAM[0];

        for (int i = 0; i < DAM.length; i++) {
            if (DAM[i] > notAl) {
                notAl = DAM[i];
            }
        }
        System.out.println("la nota mas alta es " + notAl);
    }
}
