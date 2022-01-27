package Program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.LinkedList;

public class AdministracionArchivos {
   
    private LinkedList<DatosAlumnos> datosAlumnos = new LinkedList<>();
    private LinkedList <NuevoCSV> nuevoCSV = new LinkedList<>();
    private int numColumnas;
    private int navegador=0;
    private int validarImporteCSV = 0;
    
    public void importarCSV(File archivo){
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr  = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            while ((linea=br.readLine())!=null){
                String arreglo [] = linea.split(",");
                numColumnas=arreglo.length;
               
                if(arreglo.length==4){
                    DatosAlumnos a  = new DatosAlumnos();
                    a.setMatricula(arreglo[0]);
                    a.setPrimerApellido(arreglo[1]);
                    a.setSegundoApellido(arreglo[2]);
                    a.setNombres(arreglo[3]);
                    datosAlumnos.add(a);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(fr!=null){
                    fr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void setvalidarImporteCSV(){
        validarImporteCSV=1;
    }

    public int getvalidarImporteCSV() {
        return validarImporteCSV;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas=numColumnas;
    }

    public void exportarCSV(File archivo){
        FileWriter fichero = null;
        PrintWriter pw= null;

        try {
            fichero = new FileWriter(archivo);
            pw  = new PrintWriter(fichero);
            for(NuevoCSV u:  nuevoCSV){
                String linea = u.getMatricula()+","+u.getAsignatura()+","+u.getCalificacion();
                pw.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(fichero!=null){
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void guardarCambios( javax.swing.JTextField Matricula,javax.swing.JTextField Asignatura,javax.swing.JTextField Calificacion){
        
        NuevoCSV nuevosDatos = new NuevoCSV();
        nuevosDatos.setMatricula(Matricula.getText());
        nuevosDatos.setAsignatura(Asignatura.getText());
        nuevosDatos.setCalificacion(Integer.parseInt(Calificacion.getText()));
        nuevoCSV.add(nuevosDatos);
    }

    public boolean validarDatosIngresados(){
        return datosAlumnos.isEmpty();
    }

   public void mostrarDatos(javax.swing.JTextField Matricula, javax.swing.JTextField PrimerApellido, javax.swing.JTextField SegundoApellido, javax.swing.JTextField Nombre){

       Matricula.setText(datosAlumnos.get(navegador).getMatricula());

       PrimerApellido.setText(datosAlumnos.get(navegador).getPrimerApellido());


       SegundoApellido.setText(datosAlumnos.get(navegador).getSegundoApellido());

       Nombre.setText(datosAlumnos.get(navegador).getNombres());
    }

    public void anterior(){
        navegador=navegador-1;
        if(navegador==-1){
            navegador=0;
        }else if(navegador>nuevoCSV.size()){
            navegador=nuevoCSV.size();
        }
    }

    public void siguiente(){
        navegador=navegador+1;
        if(navegador==-1){
            navegador=0;
        }else if(navegador>datosAlumnos.size()){
            navegador=datosAlumnos.size();
        }
    }

    public int getNavegador() {
        return navegador;
    }
    public void setNavegador() {
        navegador=datosAlumnos.size();   
    }

    public void reducirEstudiantes(int index){
        datosAlumnos.remove(index);
        setNavegador();
    }

}
