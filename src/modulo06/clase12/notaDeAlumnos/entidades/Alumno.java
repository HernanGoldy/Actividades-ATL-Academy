package modulo06.clase12.notaDeAlumnos.entidades;

public class Alumno {

    private String nombre;
    private String apellido;
    private Double nota;

    public Alumno(String nombre, String apellido, Double nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Double getNota() {
        return nota;
    }

    public void Setnota(Double listaNotas) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nota=" + nota +
                '}';
    }
}
