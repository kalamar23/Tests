
public enum Marcas {

Toshiba(Empresas.Toshiba),
toshiba(Empresas.toshiba),
Compaq(Empresas.Compaq),
compaq(Empresas.compaq),
Intel(Empresas.Intel),
intel(Empresas.intel);



private Empresas empresas;
public Empresas empresas(){
	return empresas;
}
Marcas(Empresas empresas){
	this.empresas = empresas;
}


public enum Empresas {
Toshiba, toshiba, Compaq, compaq, Intel, intel;

}
}

