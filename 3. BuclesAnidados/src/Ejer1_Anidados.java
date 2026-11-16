import java.util.Scanner;
public class Ejer1_Anidados {

	public static void main(String[] args) 
	
	{
		String nombre, nombreAlumnoNotaMinima="";
		float nota, notaMaxAlumno=0, notaMinAlumno=0, suma=0, media=0, notaMinTodos=11;
		final int MAX_ALUMNOS=2, MAX_ASIGNATURAS=2;
		int contAlumMayor8=0;
		Scanner entrada = new Scanner (System.in);
		
		/*para cada variable de resultado nos preguntamos donde:
			 - Se inicializa
			 - Se modifica
			 - Se muestra 
		*/
		
		for(int contAlumnos = 1; contAlumnos<=MAX_ALUMNOS; contAlumnos++)
		{//entrada
						
			System.out.println("Intro nombre del alumno " + contAlumnos + ": ");
			nombre = entrada.next();
			
			
			for(int contAsignaturas=1; contAsignaturas<=MAX_ASIGNATURAS; contAsignaturas++)
			{
				System.out.println("\tIntro nota de la asignatura " + contAsignaturas + ": ");
				nota = entrada.nextFloat();
				
				if (contAsignaturas==1) notaMaxAlumno = notaMinAlumno = nota;
				
				else if(nota>notaMaxAlumno) notaMaxAlumno = nota;
					else if(nota<notaMinAlumno) notaMinAlumno = nota;
				
				if (contAsignaturas==1) suma += nota;
				
			}//fin del bucle interno o asignatura
			
			if(notaMinAlumno < notaMinTodos)
			{
				notaMinTodos = notaMinAlumno;
				nombreAlumnoNotaMinima = nombre;
			}
			
			if(notaMaxAlumno>8) contAlumMayor8++;
			System.out.println("Max nota: " + notaMaxAlumno + "\tMin nota: " + notaMinAlumno);
			
		}//fin del bucle externo o alumno
		
		System.out.println("La nota menor de todos es " + notaMinTodos + "de " + nombreAlumnoNotaMinima);
		System.out.println("Alumnos con alguna nota mayor que 8: " + contAlumMayor8);
		if(MAX_ALUMNOS!=0) media=suma/MAX_ALUMNOS;
		System.out.println("Media: " + media);
		
		
	}

}
