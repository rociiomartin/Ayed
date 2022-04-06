package Ejercicio3;

import java.util.Iterator;

/*
 3. Creación de instancias mediante el uso del operador new
 
a. Cree una clase llamada Estudiante con los atributos especificados abajo y
sus correspondientes métodos getters y setters (haga uso de las facilidades
que brinda eclipse)
● nombre
● apellido
● comision
● email
● direccion

b. Cree una clase llamada Profesor con los atributos especificados abajo y sus
correspondientes métodos getters y setters (haga uso de las facilidades que
brinda eclipse)
● nombre
● apellido
● email
● catedra
● facultad

c. Agregue un método de instancia llamado tusDatos() en la clase Estudiante
y en la clase Profesor, que retorne un String con los datos de los atributos
de las mismas. Para acceder a los valores de los atributos utilice los getters
previamente definidos.

d. Escriba una clase llamada Test con el método main, el cual cree un arreglo
con 2 objetos Estudiante, otro arreglo con 3 objetos Profesor, y luego
recorra ambos arreglos imprimiendo los valores obtenidos mediante el
método tusDatos(). Recuerde asignar los valores de los atributos de los
objetos Estudiante y Profesor invocando los respectivos métodos setters.

e. Agregue dos breakpoints, uno en la línea donde itera sobre los estudiantes y
otro en la línea donde itera sobre los profesores.

f. Ejecute el Test en modo debug y avance paso a paso visualizando si
estudiante o el profesor recuperado es lo esperado.
 */
public class Test {

	public static void main(String[] args) {
		
		 Estudiante vector1[]=new Estudiante[2];
		 Profesor vector2[]=new Profesor[3];
		 
		 //Carga estudiantes
			Estudiante e=new Estudiante();
			e.setNombre("Dario");
			e.setApellido("Jurado");
			e.setDireccion("151 n 1333");
			e.setComision("Mañana");
			e.setEmail("dariojurado@gmail.com");
			vector1[0]=e;

			Estudiante e1=new Estudiante();
			e.setNombre("Rocio");
			e.setApellido("Martin");
			e.setDireccion("131 n 1333");
			e.setComision("Mañana");
			e.setEmail("rociomartin@gmail.com");
			vector1[1]=e1;
			
		//Carga Profesores
		 for (int i = 0; i < vector2.length; i++) {
			Profesor p=new Profesor();
			p.setApellido();
			p.setCatedra();
            p.setEmail();
            p.setNombre();
            p.setFacultad();
			vector2[i]=p;
		}
		 
		 //Imprime
		 for (int i = 0; i < vector1.length; i++) {
			 System.out.println(vector1[i].tusDatos());
		}
		 
	    for (int i = 0; i < vector2.length; i++) {
	    	 System.out.println(vector2[i].tusDatos());
		}
	}
	
