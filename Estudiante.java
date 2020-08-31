
class Estudiante extends Persona {
 private int codigodeEstudiante;
 private double notaFinal;
 
 public Estudiante(String nombre,String apellido,int edad, int codigodeEstudiante, double notaFinal) {
	 super(nombre,apellido,edad);
	 this.codigodeEstudiante=codigodeEstudiante;
	 this.notaFinal=notaFinal;
		}
 public void MostrarDatos() {
	 	System.out.println("Nombre:"+getNombre()+
	 			"\nApellido:"+getApelldo()+
	 			"\nEdad:"+getEdad()+
	 			"\nCodigo del Estudiante:"+codigodeEstudiante+
	 			"\nNota Final:"+notaFinal
	 			);
	 	
 }
 

}
