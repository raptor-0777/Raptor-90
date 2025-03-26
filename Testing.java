import java.util.Arrays;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {

        Scanner ss = new Scanner(System.in);

        String [] stroed = new String[1];
        String [] kk = new String[4];
        kk[0] = "Hello";
        kk[1] = "Java ";
        kk[2] = "C++";
        kk[3] = "Ui";

        boolean sas = true;

        // do {
            
            
        // for (int j = 0; j < kk.length; j++) {

        //     System.out.println((j+1)+ ". "+ kk[j] );
        //     stroed[0] = (j+1) + kk[j];

        // }

        // System.out.print(" Enter what you like ");
        // String javaaa = ss.nextLine();

        // for (int i = 0; i < kk.length; i++) {
            
        //     String opo;
        //     int stt = (i+1);
        //     opo = Integer.toString(stt);

        //     if (kk[i].contains(javaaa) || opo.equals(javaaa)) {

        //         System.out.print(" You select : " + kk[i] + "\n If you want to loop again : ");
        //         int yess = ss.nextInt();
        //         ss.nextLine();
        //         if (yess==123) {
        //             sas = true;
        //             continue;

        //         }else{
        //             sas = false;
        //             continue;
        //         }

                
        //     }
            

        // }


        // } while (sas);


            String sainn[] = new String[5];
            

            sainn[0]= "dssadsad";
            sainn[1] = "Hello";
            sainn[2] = "Res";

          String result =  String.join("\n", sainn);

            System.out.println(result);


    }
    
}
