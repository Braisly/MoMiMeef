/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DB.ConnectSqlite;
import Data.Opcion;
import ServerAccess.MEFF_Opciones;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lala
 */
public class Call_options extends javax.swing.JPanel {

    /**
     * Creates new form Call_options
     */
    private ServerAccess.MEFF_Opciones conection;
    private ArrayList<Opcion> call_options;

    public Call_options() {
        initComponents();
        conection = new MEFF_Opciones();
        conection.divideOptions();
        call_options = conection.OpcionesCALL;
        cleanTable();
        updateTable();
        updateComboBox();
        updateWalletComboBox();
    }
    
    public void updateInfo(){
        System.out.println("Test flag");
        conection.divideOptions();
        call_options = conection.OpcionesCALL;
        cleanTable();
        updateTable();
        updateComboBox();
        updateWalletComboBox();
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
        cb = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new ViewExtentions.AlternateColorJTable();
        addToAWallet = new javax.swing.JButton();
        walletComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        numOptionsCombobox = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(1131, 461));

        jLabel1.setText("Ordenar por fecha");

        cb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemStateChanged(evt);
            }
        });
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(new java.awt.Dimension(454, 404));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Hora", "Volumen", "Último", "Volumen_Compra", "Precio_Compra", "Volumen_Venta", "Precio_Venta", "Vencimiento", "Ejercicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setDoubleBuffered(true);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        addToAWallet.setText("Añadir a una cartera");
        addToAWallet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToAWalletActionPerformed(evt);
            }
        });

        walletComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                walletComboBoxMouseClicked(evt);
            }
        });
        walletComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Cartera de destino:");

        jLabel3.setText("Número de opciones compradas:");

        numOptionsCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numOptionsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(walletComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addToAWallet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1119, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(addToAWallet)
                    .addComponent(walletComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(numOptionsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        
    }//GEN-LAST:event_cbActionPerformed

    private void cbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemStateChanged
        
        if(evt.getStateChange() == ItemEvent.SELECTED){
            String item = evt.getItem().toString();
            if (item.equals("Mostrar todo")){
                updateTable();
                return;
            }
            cleanTable();
            DefaultTableModel tableData = (DefaultTableModel) table.getModel();
            for (Opcion call_option : call_options) {
                if(call_option.Vencimiento.equals(item)){
                    tableData.addRow(call_option.toArray());
                }
            }
        }
    }//GEN-LAST:event_cbItemStateChanged

    private void addToAWalletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToAWalletActionPerformed
        ConnectSqlite connect = new ConnectSqlite();
        //TODO obtener la cartera de destino.Del combobox
        String wallet = walletComboBox.getSelectedItem().toString();
        //TODO obtener los índices de los seleccionados.
        int[] selectedIndex = table.getSelectedRows();
        //Insertar todas las opciones en la base de datos.
        for (int i = 0; i < selectedIndex.length; i++) {
            connect.insertarOpcionEnCartera(wallet, call_options.get(selectedIndex[i]),"0");
        }
        connect.desconectar();
    }//GEN-LAST:event_addToAWalletActionPerformed

    private void walletComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletComboBoxActionPerformed
        Object change = walletComboBox.getSelectedItem();
        walletComboBox.setSelectedItem(change);
        
        
        
    }//GEN-LAST:event_walletComboBoxActionPerformed

    private void walletComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_walletComboBoxMouseClicked
        updateWalletComboBox();
    }//GEN-LAST:event_walletComboBoxMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        //TODO Obtener la cantidad de la tabla.
       int row = this.table.getSelectedRow();
        String value = this.table.getModel().getValueAt(row, 3).toString(); //TODO cuando se cambie el modelo de las opciones cambiar esto?
        try {
            Integer amount = Integer.parseInt(value);
            numOptionsCombobox.removeAllItems();

            for (Integer i = 1; i <= amount; i++) {
                numOptionsCombobox.addItem(i.toString());
            }
        } catch (Exception e) {
            numOptionsCombobox.removeAllItems();
            numOptionsCombobox.addItem("-");
            return;
        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToAWallet;
    private javax.swing.JComboBox cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox numOptionsCombobox;
    private javax.swing.JTable table;
    private javax.swing.JComboBox walletComboBox;
    // End of variables declaration//GEN-END:variables

    private void updateTable() {
        if (conection.divideOptions()) {
            DefaultTableModel tableData = (DefaultTableModel) table.getModel();

            for (Opcion opt : conection.OpcionesCALL) {
                tableData.addRow(opt.toArray());
            }
        }
    }

    private void cleanTable() {
        DefaultTableModel tableData = (DefaultTableModel) table.getModel();
        int rows = tableData.getRowCount();
        for (int i = (rows - 1); i >= 0; i--) {
            tableData.removeRow(i);
        }
    }

    private void updateComboBox() {
        DefaultTableModel tableData = (DefaultTableModel) table.getModel();
        //el vencimiento es la tabla 8.
        cb.removeAllItems();
        cb.addItem("Mostrar todo");
        Vector<Vector> rows = (Vector) tableData.getDataVector();
        Set<String> cbModel = new TreeSet<String>();
        for (Vector row : rows) {
            if(cbModel.add((String)row.elementAt(7)))
                cb.addItem(row.elementAt(7));
        }
        

    }

    void updateWalletComboBox() {
        ConnectSqlite connection = new ConnectSqlite();
        List l = connection.showAllWallets();
        connection.desconectar();
        
        walletComboBox.removeAllItems();

        for (Object l1 : l) {
            walletComboBox.addItem(l1.toString());
        }
    }

}
