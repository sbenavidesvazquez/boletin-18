package boletin.pkg18;

import java.util.Scanner;

public class Dni {

    static int nif;

    public static void letra() {

        Scanner num = new Scanner(System.in);
        nif = num.nextInt();
        int let=nif%23;
        String[] letra={"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
        int[] res={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
         
        for(int i=0;i<res.length;i++){
            if(let==res[i]){
                 System.out.println(letra[i]);
            }
        }
        
    }

}
