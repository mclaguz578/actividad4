package actividad4; 

public class Actividad4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Crear tres asignaturas con identificadores 1, 2 y 3
        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        // Crear un alumno con las tres asignaturas
        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

        // Crear un profesor
        Profesor profesor = new Profesor();

        // Asignar calificaciones aleatorias al alumno por parte del profesor
        profesor.ponerNotas(alumno);

        // Calcular la media de las calificaciones del alumno
        double media = profesor.calcularMedia(alumno);

        // Mostrar la media del alumno por pantalla
        System.out.println("La media del alumno es: " + media);
    }

}
