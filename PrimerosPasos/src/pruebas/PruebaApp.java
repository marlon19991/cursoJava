package pruebas;

import java.util.Arrays;

public class PruebaApp {
 
    public static void main(String[] args) {
    	
    		 
            int num[]=rellenarArrayDesde(6);
            solution(num, 100);
        }
     
   
        public static void solution (int A[], int K){
        	
        	 K=100;
        	 for(int j=0;j<A.length;j++){
        		 System.out.print("+---");
        	}
        	 System.out.println("");
            for(int i=0;i<A.length;i++){
            	
            	
            	
            	
                System.out.print("|" + A[i]);
               
                
            } 
            
           
        }
     
        public static int[] rellenarArrayDesde(int a){
        	 int [] num={4, 35, 80, 123, 12345, 44, 8, 5};
           
            return num;
        }
}