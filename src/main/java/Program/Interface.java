package Program;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Interface extends javax.swing.JFrame {
    AdministracionArchivos fichero = new AdministracionArchivos();
    
    public Interface() {
        initComponents();

        Matricula.setEnabled(false);
        Nombres.setEnabled(false);
        PrimerApellido.setEnabled(false);
        SegundoApellido.setEnabled(false);
        Asignatura.setEnabled(false);
        Calificacion.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImportarCSV = new javax.swing.JToggleButton();
        ExportarCSV = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        GuardarCambios = new javax.swing.JToggleButton();
        Matricula = new javax.swing.JTextField();
        PrimerApellido = new javax.swing.JTextField();
        SegundoApellido = new javax.swing.JTextField();
        Nombres = new javax.swing.JTextField();
        Anterior = new javax.swing.JToggleButton();
        Siguiente = new javax.swing.JToggleButton();
        Asignatura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Calificacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evento) {
                cerrarVentana(evento);
            }
        });


        ImportarCSV.setText("Importar CSV");
        ImportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                ImportarCSVActionPerformed(evento);
            }
        });

        ExportarCSV.setText("Exportar CSV");
        ExportarCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                ExportarCSVActionPerformed(evento);
            }
        });

        jLabel1.setText("Matricula");

        jLabel2.setText("Primer Apellido");

        jLabel3.setText("Segundo Apellido");

        jLabel4.setText("Nombres");

        GuardarCambios.setText("Guardar Cambios");
        GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                GuardarCambiosActionPerformed(evento);
            }
        });

        Matricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                MatriculaActionPerformed(evento);
            }
        });

        PrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                PrimerApellidoActionPerformed(evento);
            }
        });

        SegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                SegundoApellidoActionPerformed(evento);
            }
        });

        Nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                NombresActionPerformed(evento);
            }
        });

        Anterior.setText("Anterior");
        Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                AnteriorActionPerformed(evento);
            }
        });

        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                SiguienteActionPerformed(evento);
            }
        });

        Asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                AsignaturaActionPerformed(evento);
            }
        });

        jLabel5.setText("Asignatura");

        jLabel6.setText("Calificacion");

        Calificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                CalificacionActionPerformed(evento);
            }
        });




javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Asignatura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(Nombres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SegundoApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrimerApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Matricula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calificacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(ImportarCSV)
                        .addGap(38, 38, 38)
                        .addComponent(ExportarCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GuardarCambios)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Siguiente)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImportarCSV)
                    .addComponent(ExportarCSV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GuardarCambios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anterior)
                    .addComponent(Siguiente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public  void cerrarPrograma(){
        String opciones[]={"Cerrar de todos modos","Cancelar"};
    int opcion = JOptionPane.showOptionDialog(this, "¿Realmente desea cerrar la aplicacion?, el archivo de calificaciones no ha sido exportado", "Precaución", 0, 0, null, opciones, this);
    if(opcion==JOptionPane.YES_OPTION){
        System.exit(0);
    }
    }


    public void cerrarVentana(WindowEvent evento) {
        if(fichero.validarDatosIngresados()&&fichero.getvalidarImporteCSV()!=0){
            setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            cerrarPrograma();
        }
    }

    private void PrimerApellidoActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_PrimerApellidoActionPerformed
        PrimerApellido.setEnabled(false);

    }//GEN-LAST:event_PrimerApellidoActionPerformed

    private void GuardarCambiosActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_GuardarCambiosActionPerformed
        fichero.guardarCambios(Matricula, Asignatura, Calificacion);

        fichero.reducirEstudiantes(fichero.getNavegador());
        if(fichero.validarDatosIngresados()){
            Asignatura.setEnabled(false);
            Calificacion.setEnabled(false);
            Matricula.setText("");
            PrimerApellido.setText("");
            SegundoApellido.setText("");
            Nombres.setText("");
            Asignatura.setText("");
            
            Calificacion.setText("");
            GuardarCambios.setEnabled(false);
        }


    }//GEN-LAST:event_GuardarCambiosActionPerformed

    private void ImportarCSVActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_ImportarCSVActionPerformed
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv", "csv");
        seleccionarArchivo.setFileFilter(filtro);

        if(seleccionarArchivo.showDialog(this, "ABRIR CSV")==JFileChooser.APPROVE_OPTION){
            File archivo =seleccionarArchivo.getSelectedFile();
            if(archivo.getName().endsWith("csv")){
                fichero.importarCSV(archivo);
                if(fichero.getNumColumnas()==4){
                    
                    Asignatura.setEnabled(true);
                   Calificacion.setEnabled(true);
  
                    fichero.mostrarDatos(Matricula, PrimerApellido, SegundoApellido, Nombres);
                    fichero.setvalidarImporteCSV();
                       
                    JOptionPane.showMessageDialog(null, "Carga del archivo completa");
                }else{
                    JOptionPane.showMessageDialog(null, "El numero de columnas es invalido o el archivo está vacío");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "La extension del archivo es invalida");
            }
        }
    }//GEN-LAST:event_ImportarCSVActionPerformed

    private void ExportarCSVActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_ExportarCSVActionPerformed

        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv", "csv");
        seleccionarArchivo.setFileFilter(filtro);

        if(fichero.getvalidarImporteCSV()==1){
            if(fichero.validarDatosIngresados()){
                if(seleccionarArchivo.showDialog(this, "EXPORTAR CSV")==JFileChooser.APPROVE_OPTION){
                    File archivo =seleccionarArchivo.getSelectedFile();
                    if(archivo.getName().endsWith("csv")){
                        fichero.exportarCSV(archivo);
                    }else{
                        JOptionPane.showMessageDialog(null, "El archivo no tiene la extensión csv");
                    }
                }         
            }else{
                JOptionPane.showMessageDialog(null, "Algunos alumnos aun no reciben calificación");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No ha importado ningun archivo todavía");

        }
        

    }//GEN-LAST:event_ExportarCSVActionPerformed

    private void MatriculaActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_MatriculaActionPerformed
        // TODO add your handling code here:
        Matricula.setEnabled(false);
    }//GEN-LAST:event_MatriculaActionPerformed

    private void SegundoApellidoActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_SegundoApellidoActionPerformed
        // TODO add your handling code here:
        SegundoApellido.setEnabled(false);
    }//GEN-LAST:event_SegundoApellidoActionPerformed

    private void NombresActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_NombresActionPerformed
        // TODO add your handling code here:
        Nombres.setEnabled(false);
    }//GEN-LAST:event_NombresActionPerformed

    private void AnteriorActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_AnteriorActionPerformed
        // TODO add your handling code here:
        fichero.anterior();
        fichero.mostrarDatos(Matricula, PrimerApellido, SegundoApellido, Nombres);
    }//GEN-LAST:event_AnteriorActionPerformed

    private void AsignaturaActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_AsignaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsignaturaActionPerformed

    private void CalificacionActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_CalificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CalificacionActionPerformed

    private void SiguienteActionPerformed(java.awt.event.ActionEvent evento) {//GEN-FIRST:event_SiguienteActionPerformed
        // TODO add your handling code here:
        fichero.siguiente();
        fichero.mostrarDatos(Matricula, PrimerApellido, SegundoApellido, Nombres);
    }//GEN-LAST:event_SiguienteActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Anterior;
    private javax.swing.JTextField Asignatura;
    private javax.swing.JTextField Calificacion;
    private javax.swing.JToggleButton ExportarCSV;
    private javax.swing.JToggleButton GuardarCambios;
    private javax.swing.JToggleButton ImportarCSV;
    private javax.swing.JTextField Matricula;
    private javax.swing.JTextField Nombres;
    private javax.swing.JTextField PrimerApellido;
    private javax.swing.JTextField SegundoApellido;
    private javax.swing.JToggleButton Siguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
