import java.io.*;

public class entrada {

	public static void main(String[] args) throws IOException {
int ch;
	System.out.println("Usted debe ingresar una palabra:");
	
	while ((ch = System.in.read()) != 13) {
		
		System.out.print((char) ch);
		
		
	}
	System.out.println();		
		
	}

}
