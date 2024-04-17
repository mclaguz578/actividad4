package actividad4;

public class Alumno {
	
    private String nombre;
    private int anioNacimiento;
    private String dni;
	private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;

    // Constructor que incluye nombre, año de nacimiento y D.N.I.
    public Alumno(String nombre, int anioNacimiento, String dni, Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3) {
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.dni = dni;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int idAsignatura1, int idAsignatura2, int idAsignatura3) {
        this.asignatura1 = new Asignatura(idAsignatura1);
        this.asignatura2 = new Asignatura(idAsignatura2);
        this.asignatura3 = new Asignatura(idAsignatura3);
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
