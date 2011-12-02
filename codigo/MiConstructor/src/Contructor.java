
public class Contructor {

	public Contructor(){
		System.out.println("Computador generico");
	}
	
	public Contructor (String marca) {
		
		System.out.println("Computador"+marca);
	}
	
	public Contructor (String marca,int tipo){
		
		System.out.println("Computador"+ marca +"de"+tipo+"pulgadas");
	}
	
	public static void main(String[] args) {
		
		Contructor contructor1 = new Contructor();
		Contructor contructor2 = new Contructor ("Toshiba");
		Contructor contructor3 = new Contructor("Toshiba",8);
		

	}

}
