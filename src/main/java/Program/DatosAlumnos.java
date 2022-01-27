package Program;

public class DatosAlumnos {
    private String matricula;
    private String primerApellido;
    private String segundoApellido;
    private String nombres;

    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getPrimerApellido(){
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }
    
    public String getSegundoApellido(){
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido){
        this.segundoApellido = segundoApellido;
    }

    public String getNombres(){
        return nombres;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
}
