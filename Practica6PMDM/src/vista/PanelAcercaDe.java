/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

/**
 *
 * @author alumno
 */
public class PanelAcercaDe extends javax.swing.JPanel {

    /** Creates new form PanelAcercaDe */
    public PanelAcercaDe() {
        initComponents();
        tfAutor.setEnabled(false);
        tfFecha.setEnabled(false);
        tfVersion.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAcerca = new javax.swing.JPanel();
        lblCreador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfAutor = new javax.swing.JTextField();
        tfVersion = new javax.swing.JTextField();
        tfFecha = new javax.swing.JTextField();

        lblCreador.setText("Creador:");

        jLabel2.setText("Fecha:");

        jLabel3.setText("Versión:");

        tfAutor.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfAutor.setText("Pedro Puertas Rodríguez");

        tfVersion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfVersion.setText("1.0");

        tfFecha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tfFecha.setText("03/11/2022");

        javax.swing.GroupLayout pnlAcercaLayout = new javax.swing.GroupLayout(pnlAcerca);
        pnlAcerca.setLayout(pnlAcercaLayout);
        pnlAcercaLayout.setHorizontalGroup(
            pnlAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcercaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(pnlAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCreador)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(pnlAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfAutor)
                    .addComponent(tfVersion)
                    .addComponent(tfFecha))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlAcercaLayout.setVerticalGroup(
            pnlAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcercaLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(pnlAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreador)
                    .addComponent(tfAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnlAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnlAcercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAcerca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAcerca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCreador;
    private javax.swing.JPanel pnlAcerca;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfFecha;
    private javax.swing.JTextField tfVersion;
    // End of variables declaration//GEN-END:variables

}
