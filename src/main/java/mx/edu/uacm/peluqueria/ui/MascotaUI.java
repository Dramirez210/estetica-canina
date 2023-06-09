
package mx.edu.uacm.peluqueria.ui;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.edu.uacm.peluqueria.logica.Controlador;
import mx.edu.uacm.peluqueria.logica.Mascota;

public class MascotaUI extends javax.swing.JFrame {

    Controlador ctrl = null;
    
    public MascotaUI() {
        ctrl = new Controlador();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel1.setText("Mascotas");

        listaTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(listaTabla);

        jLabel2.setText("Datos de mascotas:");

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dramirez\\Documents\\NetBeansProjects\\Peluqueria\\src\\main\\java\\mx\\edu\\uacm\\peluqueria\\img\\eliminar-25.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dramirez\\Documents\\NetBeansProjects\\Peluqueria\\src\\main\\java\\mx\\edu\\uacm\\peluqueria\\img\\editar-25.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(14, 14, 14)
                        .addComponent(btnEditar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dramirez\\Documents\\NetBeansProjects\\Peluqueria\\src\\main\\java\\mx\\edu\\uacm\\peluqueria\\img\\flecha-25.png")); // NOI18N
        btnRegresar.setText(" Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnRegresar)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //tabla vacia
        if(listaTabla.getRowCount() > 0){
            //selecion de una fila
            if(listaTabla.getSelectedRow()!= -1){
                //id columna
                int id = Integer.parseInt(String.valueOf(listaTabla.getValueAt(listaTabla.getSelectedRow(), 0)));
                int idDuenio = id;
                ctrl.borrarRegistro(id, idDuenio);
                
                mostrarMensaje("Registro eliminado.", "Info", "Borrado");
                cargarTabla();
            }else{
                mostrarMensaje("No se seleciono ningun registro.", "Error", "No se pudo eliminar");
            }
        }else{
            mostrarMensaje("No hay nada registros para eliminar", "Error", "No se pudo eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //tabla vacia
        if(listaTabla.getRowCount() > 0){
            //selecion de una fila
            if(listaTabla.getSelectedRow()!= -1){
                //id columna
                int id = Integer.parseInt(String.valueOf(listaTabla.getValueAt(listaTabla.getSelectedRow(), 0)));
                //int idDuenio = id;
                
                ModificarDatos pantallaModificar = new ModificarDatos(id);
                pantallaModificar.setVisible(true);
                pantallaModificar.setLocationRelativeTo(null);
                
                this.dispose();
            }else{
                mostrarMensaje("No se seleciono ningun registro.", "Error", "No se pudo eliminar");
            } 
        }else{
            mostrarMensaje("No hay nada registros para eliminar", "Error", "No se pudo eliminar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Principal p = new Principal();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

   public void mostrarMensaje(String mensaje, String tipo, String titulo){
       
       JOptionPane confirmar = new JOptionPane(mensaje);
       if (tipo.equals("Info")){
           confirmar.setMessageType(JOptionPane.INFORMATION_MESSAGE);
       }else if(tipo.equals("Error")){
           confirmar.setMessageType(JOptionPane.ERROR_MESSAGE);
       }
       JDialog dialog = confirmar.createDialog(titulo);
       dialog.setAlwaysOnTop(true);
       dialog.setVisible(true);
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaTabla;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //modelo de la tabla
        DefaultTableModel tabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //Titulos tabla
        String titulos[] = {"Numero", "Nombre", "Raza", "Color", 
            "Alergico", "Observaciones", "Atencion especial",  "Dueño", "Celular"};
        tabla.setColumnIdentifiers(titulos);
        
        //cargar datos BD
        List<Mascota> listaMascotas = ctrl.traerMascotas();
        //Agregar cada row
        if(listaMascotas != null){
            for(Mascota m : listaMascotas){
                Object[] objeto = {m.getId(), m.getNombre(), m.getRaza(), m.getColor(),
                m.getAlergico(), m.getObservaciones(), m.getAtencionEspecial(), 
                m.getDuenio().getNombre(), m.getDuenio().getCelular()};
                
                tabla.addRow(objeto);
            }
        }
        listaTabla.setModel(tabla);
    }

    
}
