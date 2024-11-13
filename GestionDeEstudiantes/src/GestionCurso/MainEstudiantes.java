package GestionCurso;

import java.util.ArrayList;

public class MainEstudiantes {

	public static void main(String[] args) {
		ArrayList<Curso> Curso = new ArrayList<>();
		Curso c1 = new Curso("nombre1", "apellido1", 5.0);
		Curso c2 = new Curso("nombre2", "apellido2", 2.0);
		Curso c3 = new Curso("nombre3", "apellido3", 6.0);
		Curso c4 = new Curso("nombre4", "apellido4", 9.5);
		
		Curso.add(c1);
		Curso.add(c2);
		Curso.add(c3);
		Curso.add(c4);
		
		for (int i = 0; i < Curso.size(); i++) {
			System.out.println("Estudiantes: " + Curso.get(i).toString());
			
		}
		
		c1.setNota(2.0);
		System.out.println(c1);
		
		for (int i = 0; i < Curso.size(); i++) {
			System.out.println("Estudiantes: " + Curso.get(i).toString());
			
		}

	}

}
