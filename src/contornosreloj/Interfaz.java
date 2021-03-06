/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contornosreloj;

import java.awt.Font;
import javax.swing.JTextField;

/**
 *Interfaz que simula el funcionamiento de un reloj digital
 * @author dani
 */
public class Interfaz extends javax.swing.JFrame{
    static boolean alarma_reloj=true; //False=alarma  True=reloj
    /**
     * Constructor de la interfaz, dónde se lanza la vetana y se establecen fuentes
     */
    public Interfaz(){
        initComponents();
        setVisible(true);
        setLocation(300, 200);
        Font fuente=new Font("Dialog", Font.BOLD, 60);
        Font fuente_indicador=new Font("Dialog",Font.BOLD,20);
        visualizador.setFont(fuente);
        visualizador.setHorizontalAlignment(JTextField.CENTER);
        indicador.setFont(fuente_indicador);
        indicador.setHorizontalAlignment(JTextField.CENTER);
        reloj_o_alarma.setText("Reloj");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        visualizador = new javax.swing.JTextField();
        indicador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reloj_o_alarma = new javax.swing.JTextField();
        PosponerButton = new javax.swing.JButton();
        mas_horas = new javax.swing.JButton();
        mas_minutos = new javax.swing.JButton();
        alarma_on = new javax.swing.JButton();
        alarma_of = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ver_reloj = new javax.swing.JButton();
        ver_alarma = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        visualizador.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        visualizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizadorActionPerformed(evt);
            }
        });

        indicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicadorActionPerformed(evt);
            }
        });

        jLabel2.setText("Alarma");

        jLabel3.setText("Hora");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reloj_o_alarma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visualizador, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(indicador))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(reloj_o_alarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indicador, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(visualizador))
                .addContainerGap())
        );

        PosponerButton.setText("Posponer");
        PosponerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PosponerButtonActionPerformed(evt);
            }
        });

        mas_horas.setText("+ HOR");
        mas_horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mas_horasActionPerformed(evt);
            }
        });

        mas_minutos.setText("+ MIN");
        mas_minutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mas_minutosActionPerformed(evt);
            }
        });

        alarma_on.setText("On Alarma");
        alarma_on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarma_onActionPerformed(evt);
            }
        });

        alarma_of.setText("Off Alarma");
        alarma_of.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarma_ofActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/altavoz.png"))); // NOI18N

        ver_reloj.setText("Ver Reloj");
        ver_reloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_relojActionPerformed(evt);
            }
        });

        ver_alarma.setText("Ver Alarma");
        ver_alarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_alarmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ver_reloj)
                                .addGap(18, 18, 18)
                                .addComponent(ver_alarma))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mas_horas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mas_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alarma_on, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alarma_of, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PosponerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mas_horas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas_minutos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarma_on, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alarma_of, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PosponerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ver_reloj)
                    .addComponent(ver_alarma))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Botón que activa la alarma, establece a "True" el campo "Activada" de la clase Alarma.
 * @param evt 
 */
    private void alarma_onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarma_onActionPerformed
        Alarma.activada=true;
        indicador.setText(Alarma.indicador);
    }//GEN-LAST:event_alarma_onActionPerformed
/**
 * Botón que pospone 2 minutos el tiempo de la alarma si esta está activada.
 *
 * @param evt 
 */
    private void PosponerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PosponerButtonActionPerformed
        if(Alarma.activada==true){
        for(int i=0;i<2;i++)
            Alarma.incrementarMinutos();
        }
    }//GEN-LAST:event_PosponerButtonActionPerformed
/**
 * Incrementa la hora del reloj o la alarma, dependiendo cuál estea visible.
 * @param evt 
 */
    private void mas_horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mas_horasActionPerformed
        incrementarHoras();
            
    }//GEN-LAST:event_mas_horasActionPerformed
/**
 * Incrementa el minuto del reloj o la alarma, dependiendo cuál estea visible.
 * @param evt 
 */
    private void mas_minutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mas_minutosActionPerformed
        incrementarMinutos();
    }//GEN-LAST:event_mas_minutosActionPerformed
/**
 * Apaga la alarma o la desactiva si esta está sonando.
 * @param evt 
 */
    private void alarma_ofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarma_ofActionPerformed
        Alarma.activada=false;
        indicador.setText(" ");
    }//GEN-LAST:event_alarma_ofActionPerformed
/**
 * Clase del visualizador de hora.
 * @param evt 
 */
    private void visualizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizadorActionPerformed
        
    }//GEN-LAST:event_visualizadorActionPerformed
/**
 * Clase del indicador de alarma.
 * @param evt 
 */
    private void indicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_indicadorActionPerformed
/**
 * Botón para ver la hora del Reloj.
 * @param evt 
 */
    private void ver_relojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_relojActionPerformed
        alarma_reloj=true;
        reloj_o_alarma.setText("Reloj");
        
    }//GEN-LAST:event_ver_relojActionPerformed
/**
 * Botón para ver la hora de la alarma.
 * @param evt 
 */
    private void ver_alarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_alarmaActionPerformed
        Alarma alarma;
        reloj_o_alarma.setText("Alarma");
        alarma_reloj=false;
        if(Alarma.activada==false)
            alarma=new Alarma();
    }//GEN-LAST:event_ver_alarmaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
        
            }
        });
        

    }
    /**
     * Muestra la hora del reloj en el visualizador.
     */
    public static void mostrarHora(){
            visualizador.setText(Reloj.horacompleta);
    }
    /**
     * Muestra la hora de la alarma en el visualizador.
     */
    public static void mostrarAlarma(){
            visualizador.setText(Alarma.getHoracompleta());
    }
    /**
     * Incrementa el número de la hora del reloj.
     */
    public static void incrementarHoras(){
        if(alarma_reloj==true)
            Reloj.masHoras();
        else
            Alarma.IncrementarHoras();
    }
    /**
     * Incrementa el número de los minutos del reloj.
     */
    public static void incrementarMinutos(){
        if(alarma_reloj==true)
            Reloj.masMinutos();
        else
            Alarma.incrementarMinutos();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton PosponerButton;
    private static javax.swing.JButton alarma_of;
    private static javax.swing.JButton alarma_on;
    private static javax.swing.JTextField indicador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JButton mas_horas;
    private static javax.swing.JButton mas_minutos;
    private javax.swing.JTextField reloj_o_alarma;
    private static javax.swing.JButton ver_alarma;
    private static javax.swing.JButton ver_reloj;
    private static javax.swing.JTextField visualizador;
    // End of variables declaration//GEN-END:variables

}
