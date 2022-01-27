package Program;

public class NuevoCSV extends DatosAlumnos{
    private String matricula;
    private String Asignatura;
    private int calificacion;

    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getAsignatura(){
        return this.Asignatura;
    }
    public void setAsignatura(String nombreAsignatura){
        this.Asignatura = nombreAsignatura;
    }

    public int getCalificacion(){
        return this.calificacion;
    }
    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }
}
