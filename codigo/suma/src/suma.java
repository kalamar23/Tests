import java.io.*;
public class suma {

	public static void main(String[] args) throws IOException {
		
BufferedReader L = new BufferedReader (new InputStreamReader(System.in));
int x=0,y=0,r=0;

System.out.println("Ingrese un número:");
x=Integer.parseInt(L.readLine());
System.out.println("Ingrese el numero que se sumara al anterior ");
try {
y=Integer.parseInt(L.readLine());
r=x+y;
System.out.println("El resultado de la suma es :"+r);

}
catch(NumberFormatException n) {
System.out.println("No es un Numero");
main(args);
} 

}

}
