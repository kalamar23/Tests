public class Variables2 {

	// Inicializar Array de 3 dimensiones y medir longitud
	public void array (){
	
int suma=0,total=0;
			
		int arreglo [][][] = {{{8, 20, 4, 4},{4, 13, 34, 8}},
							{{4, 30, 4, 2},{7, 12, 54, 8}},
							{{3, 5, 78, 6},{4, 7, 18, 9}}};
		
		for (int extremo = 0;extremo < arreglo.length;extremo++){
			System.out.println("Variable extremo:"+extremo);
			
			for (int medio = 0;medio < arreglo[extremo].length;medio++){
				
				System.out.println("Variable medio:"+medio);
				
				for (int interior = 0; interior < arreglo[extremo][medio].length;interior++){
					System.out.println("Variable interior:"+interior);
					
					suma += arreglo [extremo][medio][interior];
					total++;
				}			
				
			}			
		}
	System.out.println("El valor medio del Array es:"+suma/total);	
	}
	
	// Un Array de String  
	
	public String arreglo2(int pala){
		String palabra [];
		palabra = new String [2];
		
		palabra [1] = "Hola mundo desde Java !!!";
		palabra [0] = "Hola Claudio que tal ? soy tu amor";
System.out.println(palabra[pala]);
		
	return palabra[pala];
	}
	
	public static void main(String[] args) {
		
Variables2 re = new Variables2();

//re.array();
//re.arreglo2(0);

	}

}
