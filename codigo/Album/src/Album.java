
public class Album {
	public String marca;
	public String tipo;
	public float pulgadas;

//Generar contructor 1	
	
public Album(String marca, String tipo, float pulgadas  ){
	this.setMarca(marca);
	this.setTipo(tipo);
	this.setPulgadas(pulgadas);
}

//Generar contructor 2
public Album(String marca){
this.Vectoriza(marca);

}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(float pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	public void mostrar(){
		
		System.out.println("La marca del computador es:"+getMarca());
		System.out.println("Su computador es un:"+getTipo());
		System.out.println("La pantalla es de :"+getPulgadas()+" Pulgadas");
		
	}
	
	public void Vectoriza (String marca){
	
	String vec [] = new String [6];
	
	for (int i=0;i < 6;i++){
	
	vec [i] = marca;
	}
	for (int i=0;i < 6;i++){
		
		System.out.println(vec [i]);
	
	}
		}

}