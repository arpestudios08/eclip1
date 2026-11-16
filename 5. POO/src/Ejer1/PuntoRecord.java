package Ejer1;

public record PuntoRecord(double x, double y) {
public PuntoRecord (double x, double y) {
	if(x<0) this.x=0;
	else this.x=x;
	
	this.y=y;
}


}
