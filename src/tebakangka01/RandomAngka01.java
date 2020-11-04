package tebakangka01;
import java.util.Scanner;
public class RandomAngka01 {
        Scanner in = new Scanner(System.in);
        //atribut
        int acak;
        int benar; 
        
        //method
        void tebakAngka (){
            //perulangan
            while (benar !=1){
             //input tebakan
                System.out.print("Tebakan anda: ");
             int nilai = in.nextInt();
                 if (nilai > acak){
                   System.out.println("Hehe... Tebakan anda terlalu besar");
                   benar = 0;
               } 
                 else if (nilai < acak){
                 System.out.println("Hehe... Tebakan anda terlalu kecil") ;
                 benar = 0;
               }
                 else {
                   System.out.println("Tebakan anda benar");
                   benar = 1;
               }
             }     
             }
    }
   