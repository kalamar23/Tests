import java.io.*;
public class tabla {
	public static void main(String[] args) throws IOException {
		
BufferedReader t = new BufferedReader (new InputStreamReader(System.in));
int x=0,r=0;
System.out.println("Ingrese la tabla que desea calcular meñor a 10");
x=Integer.parseInt(t.readLine());		

if (x > 10) {
			
		System.out.println("Usted debe ingresar un numero menor a 10");
		}
else {
	for (int i = 0; i < 10; i++) {
	r=x*i;
		System.out.println(x +"x"+ i +" = "+r);
	
}
		
	}

}
}