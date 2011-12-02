public class Arboles  { 

    public Arboles() { 
      System.out.println("Un árbol genérico");
    }
  
    public Arboles(String tipo) { 
     System.out.println("Un árbol tipo " + tipo);
    }

    public Arboles(int altura) { 
     System.out.println("Un árbol de " + altura + " metros");
   } 

    public Arboles(int altura,String tipo) { 
     System.out.println("Un " + tipo + " de " + altura + " metros");
   } 
  
    public static void main(String args[]) { 
	Arboles arbol1 = new Arboles(4);
        Arboles arbol2 = new Arboles("Roble");
        Arboles arbol3 = new Arboles();
        Arboles arbol4 = new Arboles(5,"Pino");
     }
}