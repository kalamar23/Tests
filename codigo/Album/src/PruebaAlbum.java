import java.io.*;


public class PruebaAlbum {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
	String option="";
	String option2="toshiba compaq vector";
	
BufferedReader i = new BufferedReader(new InputStreamReader(System.in));		
Bienvenida b = new Bienvenida();
b.Welcome();
while(option2.equalsIgnoreCase("toshiba compaq vector")){
System.out.println("Ingrese una marca de computador:");
option=i.readLine();
if (option.equals("Compaq") || option.equals("compaq"))   {
	
Album al1 = new Album("Compaq","Notebook", 14);
al1.mostrar();
break;
}

else if (option.equals("Toshiba") || option.equals("toshiba")){
Album al1 = new Album("Toshiba","Notebook", 15);
al1.mostrar();
break;
}
else if (option.equals("vector") || option.equals("Vector")){
Album al2 = new Album("Toshiba");
al2.Vectoriza("");
break;
}
}
	}

}