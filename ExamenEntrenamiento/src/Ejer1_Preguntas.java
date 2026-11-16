
public class Ejer1_Preguntas {
/*
 * 
	a) Qué diferencia hay entre sobrescribir y sobrecargar.
	
	- Sobrecargar (Overloading): consiste en crear varios métodos con el mismo nombre, pero con diferentes parámetros (distinto número o tipo de parámetros). Se realiza normalmente dentro de una misma clase.
	- Sobrescribir (Overriding): consiste en redefinir en una clase hija un método que ya existe en su clase padre, manteniendo su misma firma.
	
	b) Cuando te interesa declarar un método static.
	
	Cuando queremos que un método pertenezca a la clase y no a un objeto concreto.
	Se utiliza cuando el método no necesita acceder a atributos de instancia y queremos poder llamarlo directamente mediante el nombre de la clase.
		
	c) De la misma forma que creas objetos con new, ¿podrías eliminar esas instancias cuando no las necesites?
	Explícalo.
	
	No podemos eliminar directamente un objeto en Java mediante una instrucción como delete.
	Java utiliza un sistema recolector de basura, que libera automáticamente la memoria ocupada por objetos que ya no son accesibles desde el programa.
	
	d) Java usa paso por valor en los argumentos de los métodos. Eso conlleva que no podamos modificar el valor
	de una variable simple, sin embargo, al pasarle un objeto puede modificarse. Explícalo y dibújalo.

	Java siempre utiliza el paso por valor, pero su comportamiento depende de lo que se esté pasando:
	- Variables simples: se copia el valor de la variable. Los cambios realizados dentro del método no modifican la variable original.
	- Objetos: se copia el valor de la referencia al objeto. Por tanto, podemos modificar los atributos del mismo objeto desde el método.
	
*/
}
