import java.util.Scanner;

public class Ejer3_8Asignaturas {

	public static void main(String[]args)
	
	{
	Scanner entrada = new Scanner (System.in);
	
	String nomAsignatura;
	char sexo;
	int numHoras, numAlumnosCursan;
	float notapractica, notateorica, mediateorica=0, mediapractica=0, sumapractica=0, sumateorica=0;
	
	final int MAX_ASIGNATURAS=2;
	
		for(int contAsignaturas=1;contAsignaturas<=MAX_ASIGNATURAS; contAsignaturas++)
		{//inicio bucle externo
		System.out.println("Introduce el nombre de la asignatura" + contAsignaturas);
		nomAsignatura = entrada.next();
		
		System.out.println("Indica el número de horas de la asignatura");
		numHoras = entrada.nextInt();
		
		System.out.println("Indica el número de alumnos que cursan la asignatura");
		numAlumnosCursan = entrada.nextInt();
	
			for(int contAlumno=1;contAlumno<=numAlumnosCursan;contAlumno++)
			{//inicio bucle intenro
			System.out.println("Indique el sexo del alumno: H o M");
			sexo = entrada.next().charAt(0);
			
			System.out.println("Indique la nota práctica");
			notapractica = entrada.nextFloat();
			
			System.out.println("Indique la nota teórica");
			notateorica = entrada.nextFloat();
			
			
			}//fin bucle interno			
			
			
		if(numHoras>8)
			mediapractica += sumapractica/numAlumnosCursan;
			mediateorica += sumateorica/numAlumnosCursan;
			System.out.println("En las asignaturas de más de 8 horas la nota media práctica es " + mediapractica + " y la note media teorica es " + mediateorica);
		}//fin bucle externo
	}
}
