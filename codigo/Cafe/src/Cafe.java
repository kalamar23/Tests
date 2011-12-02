enum TamanoCafe{

CHICO(5), MEDIANO(8), GRANDE(10);

private int onzas;

TamanoCafe(int onzas){
this.onzas = onzas;
}

public int getOnzas(){
return this.onzas;
}

}

public class Cafe {
TamanoCafe tc;
public Cafe() {
}

public static void main(String... args){
Cafe c1 = new Cafe();
Cafe c2 = new Cafe();
c1.tc = TamanoCafe.GRANDE;
c2.tc = TamanoCafe.CHICO;
System.out.println("Tamaño de café 1(c1): "+c1.tc);
System.out.println("Tamaño de café 2(c2): "+c2.tc);

System.out.println("Onzas 1(c1): "+c1.tc.getOnzas());
System.out.println("Onzas 2(c2): "+c2.tc.getOnzas());
}

}