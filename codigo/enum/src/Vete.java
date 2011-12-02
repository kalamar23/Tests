enum Veterinaria {
	
	ZORRO_DEL_DESIERTO (Animal.ZORRO,Lugar.DESIERTO),
	LLAMO_DEL_DESIERTO (Animal.LLAMO,Lugar.DESIERTO),
	CONEJO_DEL_DESIERTO (Animal.CONEJO,Lugar.DESIERTO),
	AGUILA_DEL_AIRE (Animal.AGUILA,Lugar.AIRE),
	HALCON_DEL_AIRE (Animal.HALCON,Lugar.AIRE),
	CONDOR_DEL_AIRE (Animal.CONDOR,Lugar.AIRE),
	CORVINA_DEL_AGUA (Animal.CORVINA,Lugar.AGUA),
	CONGRIO_DEL_AGUA (Animal.CONGRIO,Lugar.AGUA),
	PEJEREY_DEL_AGUA (Animal.PEJEREY,Lugar.AGUA);

private Animal animal;
public Animal animal (){
	return animal;
}
private Lugar lugar;
public Lugar lugar (){
	return lugar;
}

Veterinaria (Animal animal,Lugar lugar){
	this.animal = animal;
	this.lugar	= lugar ;
}
	
	
public enum Animal {
	
	ZORRO, LLAMO, CONEJO, AGUILA, HALCON, CONDOR, CORVINA, CONGRIO, PEJEREY
}

	
public enum Lugar {
	
DESIERTO, AIRE, AGUA

} 


}




public class Vete {
Veterinaria.Lugar tc;
Veterinaria.Animal te;
	
	public static void main(String[] args) {
		
Vete ve1 = new Vete();
Vete ve2 = new Vete();

ve1.tc = Veterinaria.Lugar.AIRE;

ve2.te = Veterinaria.Animal.AGUILA;

if (){v

System.out.println("El animal que usted escogió es de:" +ve1.tc);
}
	}

}
