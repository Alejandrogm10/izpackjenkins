package ex36;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
      int  EMFR= 0;
      int EFR = 0;
      int ER= 0;
      int ENR=0;
      double SPC = 0.0;
     Scanner sc = new Scanner(System.in);
          System.out.print("Codigo:");
           int COD = sc.nextInt();
     do
     {
           System.out.print("Promedio credito:");
           double PC = sc.nextDouble();
           SPC = SPC + PC;
               if ( PC >= 4.8)
               {
                  EMFR = EMFR + 1;
                  System.out.println("El codigo " + COD + "ES MUY FUERTE RECOMENDADO POR PROMEDIO DE " + PC);
               }
               else
               {    
                 if ( PC >= 4.5)
                 {
                    EFR = (EMFR ); 
                    System.out.println("El codigo " + COD + "ES FUERTE RECOMENDADO POR PROMEDIO DE " + PC);
                 }
                  else
                 {    
                       if (PC >= 4.0) 
                       {
                           ER = ER +1;
                        System.out.println("El codigo " + COD + "ES RECOMENDADO POR PROMEDIO DE " + PC);
                       }
                       else
                       {
                         ENR = ENR +1;
                         System.out.println("El codigo " + COD + "NO RECOMENDADO POR PROMEDIO DE " + PC);   
                       }
                 }
               }
         System.out.print("Codigo:");
            COD = sc.nextInt();
     }
  while (COD != 0);
       double NTE = EMFR + EFR + ER +ENR;
       double PCG = SPC / NTE;
   System.out.println(EMFR);
   System.out.println(EFR);
   System.out.println(ER);
   System.out.println(ENR);
   System.out.println(PCG);
   
    }
    
}
 