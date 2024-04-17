package actividad4; 

public class Actividad4 {

    public static void main(String[] args) {
        // Se crean tres asignaturas con identificadores 1, 2 y 3
        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        // Creamos un alumno con las tres asignaturas y la información personal
        Alumno alumno = new Alumno("Marina Clares", 1990, "77777777A", asignatura1, asignatura2, asignatura3);

        Profesor profesor = new Profesor();
        // Asignamos las calificaciones aleatorias al alumno por parte del profesor
        profesor.ponerNotas(alumno);

        // Calculamos y mostramos la media del alumno
        double media = profesor.calcularMedia(alumno);
        System.out.println("La media del alumno " + alumno.getNombre() + " es: " + media);
    }

}
