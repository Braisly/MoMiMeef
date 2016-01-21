/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Date;

/**
 *
 * @author lala
 */
public class ConectionStatusPane extends javax.swing.JPanel {

    /**
     * Creates new form ConectionStatusPane
     */
    public ConectionStatusPane() {
        initComponents();
        connectionStatusTextField.setText("Esperando información.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        connectionStatusTextField = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(333, 38));
        setMinimumSize(new java.awt.Dimension(333, 38));

        jLabel1.setText("Estado de los datos");

        connectionStatusTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(connectionStatusTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(connectionStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setConectionStatus(String msg){
        connectionStatusTextField.setText(msg);
    } 
    
    public void setRetrayalTime(float seconds){
        connectionStatusTextField.setToolTipText("Próxima actualización:" + String.valueOf(seconds) + "segundos");
    }
    
    public void setNextConnectionTimeInFifteenMinutes(){
        Date now = new Date();
        now.setTime(now.getTime() + 900000l);
        connectionStatusTextField.setToolTipText("Próxima actualización a las" + now.toString() );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField connectionStatusTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
