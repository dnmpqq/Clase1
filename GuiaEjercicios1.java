package paqueteguia1;

public class GuiaEjercicios1 {

	public static void main(String[] args) {
		System.out.println("Ordenes con ciclo while");
		int a=5,b=14,cont=5;
		
		boolean Var = true;
		while(cont<=14) {
			
			System.out.print(cont+",");
			
			cont=cont+1;
			
		} cont=5;
		System.out.println();
			while (cont<=14) {
				
				if(cont%2==0) {
					
					System.out.print(cont+",");
				}
				cont=cont+1;
			}
			cont=5;
			System.out.println();
       if (Var == false || Var ==true) {
    	  
    		   while (cont<=14) {
    			   
    			   if (cont%2!=0 && Var== false) {
    				   System.out.print(cont+",");
    			   }
    			   else if (cont%2==0 && Var == true){
    				   System.out.print(cont+",");
    			   } 
    			   cont=cont+1;
    		   }
    		  
    		  
       }
     //orden invertido con ciclo for
       System.out.println();
        System.out.println("Orden invertido con ciclo for");
		
		for (int i=b;i>=a;i-- ) {
			System.out.print(i+"-");
		}
	}

}
