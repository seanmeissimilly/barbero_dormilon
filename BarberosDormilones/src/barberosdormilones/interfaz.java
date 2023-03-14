package barberosdormilones;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class interfaz extends javax.swing.JFrame {

    private static int clientesEspera = 0;              // cantidad de sillas en espera ocupadas
    private Crear c = new Crear();                      // Instancia del hilo para crear clientes
    public boolean[] arrayBarberos = new boolean[3];    // Array para verificar los barberos disponibles
    public boolean[] arrayEspera = new boolean[4];      // Array para verificar las sillas disponibles
    public DefaultListModel modelo = new DefaultListModel();

    public interfaz() {
        this.setResizable(false);
        initComponents();
        this.setLocationRelativeTo(null);
        jLabelEspera1.setVisible(false);
        jLabelEspera2.setVisible(false);
        jLabelEspera3.setVisible(false);
        jLabelEspera4.setVisible(false);
        c.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelBarberoS = new javax.swing.JLabel();
        jLabelBarbero2S = new javax.swing.JLabel();
        jLabelBarbero3S = new javax.swing.JLabel();
        jLabelBarberoA = new javax.swing.JLabel();
        jLabelBarbero2A = new javax.swing.JLabel();
        jLabelBarbero3A = new javax.swing.JLabel();
        jLabelEspera1 = new javax.swing.JLabel();
        jLabelEspera2 = new javax.swing.JLabel();
        jLabelEspera3 = new javax.swing.JLabel();
        jLabelEspera4 = new javax.swing.JLabel();
        jButtonAgregarProceso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProcesosFuera = new javax.swing.JList<>();
        jLabelAtencion3 = new javax.swing.JLabel();
        jLabelatencion1 = new javax.swing.JLabel();
        jLabelatencion2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabeltotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelestado1 = new javax.swing.JLabel();
        jLabelestado2 = new javax.swing.JLabel();
        jLabelestado3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabeLacum1 = new javax.swing.JLabel();
        jLabelacum2 = new javax.swing.JLabel();
        jLabelacum3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/barbero.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/barbero.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/barbero.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabelBarberoS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero (1).png"))); // NOI18N
        jPanel1.add(jLabelBarberoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabelBarbero2S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero (1).png"))); // NOI18N
        jPanel1.add(jLabelBarbero2S, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jLabelBarbero3S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero (1).png"))); // NOI18N
        jPanel1.add(jLabelBarbero3S, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jLabelBarberoA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero.png"))); // NOI18N
        jPanel1.add(jLabelBarberoA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jLabelBarbero2A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero.png"))); // NOI18N
        jPanel1.add(jLabelBarbero2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jLabelBarbero3A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluquero.png"))); // NOI18N
        jPanel1.add(jLabelBarbero3A, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, -1, -1));

        jLabelEspera1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabelEspera2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jLabelEspera3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabelEspera4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/pensando.png"))); // NOI18N
        jPanel1.add(jLabelEspera4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jButtonAgregarProceso.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButtonAgregarProceso.setText("Agregar Proceso");
        jButtonAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarProcesoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAgregarProceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluqueria.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Barberos Dormilones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 340, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/peluqueria.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jListProcesosFuera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jListProcesosFuera);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 150, 350));

        jLabelAtencion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelAtencion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        jLabelatencion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelatencion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabelatencion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/avatar.png"))); // NOI18N
        jPanel1.add(jLabelatencion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel7.setText("ESTADO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 80, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setToolTipText("");
        jPanel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabeltotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabeltotal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabeltotal);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel9.setText("TOTAL ACUMULADO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 200, -1));

        jLabelestado1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        jLabelestado2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        jLabelestado3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jPanel1.add(jLabelestado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel13.setText("BARBERO 1:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 20));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel14.setText("BARBERO 2:");
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 282, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel15.setText("BARBERO 3:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 20));

        jLabeLacum1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jPanel1.add(jLabeLacum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 70, 20));
        jLabeLacum1.getAccessibleContext().setAccessibleDescription("");

        jLabelacum2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jPanel1.add(jLabelacum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 60, 20));

        jLabelacum3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jPanel1.add(jLabelacum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 50, 20));

        jButton1.setText("Acerca de");
        jButton1.setToolTipText("");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarProcesoActionPerformed
        // TODO add your handling code here:
        c.nuevoProceso();
    }//GEN-LAST:event_jButtonAgregarProcesoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, "Equipo:\n"
                + "Orestes Darian García Gutiérrez\n"
                + "Javier Correa Medina\n"
                + "Eduardo Francisco Rolo Santamaria\n"
                + "David Sean Meissimilly Frometa\n");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public int disminuir(int semaforo) {
        semaforo--;
        return semaforo;
    }

    //Crea un proceso(Cliente)
    private class Crear extends Thread {

        public void run() {
            while (true) {
                // Inicio semáforo
                if (!jLabelestado1.getText().equals("Cobrando")) {
                    jLabelestado1.setForeground(new Color(60, 63, 65));
                }
                if (!jLabelestado2.getText().equals("Cobrando")) {
                    jLabelestado2.setForeground(new Color(60, 63, 65));
                }
                if (!jLabelestado3.getText().equals("Cobrando")) {
                    jLabelestado3.setForeground(new Color(60, 63, 65));
                }
                for (int x = 0; x < arrayBarberos.length; x++) {
                    if (!arrayBarberos[x]) {
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        quitarCliente(x + 1);
                        dormir(x + 1);
                    } else {
                        activar(x + 1);
                    }
                }

                for (int x = 0; x < arrayEspera.length; x++) {
                    if (!arrayEspera[x]) {
                        desocuparSillaEspera(x + 1);
                        if (!modelo.isEmpty()) {
                            ocuparSilla(indexSillaVacia() + 1);
                            modelo.remove(0);
                            jListProcesosFuera.setModel(modelo);
                            arrayEspera[x] = true;
                        }

                    }
                }
            }
        }

        private void ocuparSilla(int silla) {
            switch (silla) {
                case 1:
                    jLabelEspera1.setVisible(true);
                    break;
                case 2:
                    jLabelEspera2.setVisible(true);
                    break;
                case 3:
                    jLabelEspera3.setVisible(true);
                    break;
                case 4:
                    jLabelEspera4.setVisible(true);
                    break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void nuevoProceso() {
            int contador = -1;
            boolean bandera = false;
            for (int x = 0; x < arrayBarberos.length; x++) {
                if (!arrayBarberos[x]) {
                    arrayBarberos[x] = true;
                    contador = x + 1;
                    bandera = true;
                    break;
                }
            }
            if (bandera) {
                despertar(contador);
            } else {
                //Si todos los barberos están ocupados, examina las sillas
                for (int x = 0; x < arrayEspera.length; x++) {
                    if (!arrayEspera[x]) {
                        arrayEspera[x] = true;
                        contador = x + 1;
                        bandera = true;
                        break;
                    }
                }
                if (bandera) {
                    // Asignar silla
                    ocuparSilla(contador);
                } else {
                    // Colocar en línea de espera "afuera"
                    modelo.addElement("Cliente en espera");
                    jListProcesosFuera.setModel(modelo);
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    public class atenderCliente extends Thread {

        private int contador = -1;

        public void run() {
            int numeroAleatorio = getRandomNumberInRange(10, 15);

            try {
                Thread.sleep(numeroAleatorio * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                clienteSatisfecho();
            } catch (InterruptedException ex) {
                Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        private void clienteSatisfecho() throws InterruptedException {
            arrayBarberos[contador - 1] = false;
            System.out.println("Adios, te atendio " + contador);

            if (contador == 1) {
                jLabelestado1.setForeground(new Color(29, 184, 29));
                jLabelestado1.setText("Cobrando");
                actualizarcobro(10, 0, 0);
//                jLabelestado1.setForeground(new Color(60, 63, 65)); 

            } else if (contador == 2) {
                jLabelestado2.setForeground(new Color(29, 184, 29));
                jLabelestado2.setText("Cobrando");
                actualizarcobro(0, 10, 0);
//                jLabelestado2.setForeground(new Color(60, 63, 65)); 

            } else {
                jLabelestado3.setForeground(new Color(29, 184, 29));
                jLabelestado3.setText("Cobrando");
                actualizarcobro(0, 0, 10);
//                jLabelestado3.setForeground(new Color(60, 63, 65)); 
            }
            verificarEspera();
        }

        private void verificarEspera() {
            if (arrayEspera[0] == true) {
                if (arrayEspera[1] == true) {
                    if (arrayEspera[2] == true) {
                        if (arrayEspera[3] == true) {
                            arrayEspera[3] = false;
                            desocuparSillaEspera(4);
                        } else {
                            arrayEspera[2] = false;
                            desocuparSillaEspera(3);
                        }
                    } else {
                        arrayEspera[1] = false;
                        desocuparSillaEspera(2);
                    }
                } else {
                    arrayEspera[0] = false;
                    desocuparSillaEspera(1);
                }
                arrayBarberos[contador - 1] = true;
                System.out.println("Hola, te atiende " + contador);
                despertar(contador);
            }
        }
    }

    public boolean sillasEsperaLlenas() {
        // Analiza si las sillas de espera están vacías o llenas
        // Regresa false si están ocupadas, o true si hay alguna vacía
        int contador = 0;
        if (jLabelEspera1.isVisible()) {
            contador++;
        }
        if (jLabelEspera2.isVisible()) {
            contador++;
        }
        if (jLabelEspera3.isVisible()) {
            contador++;
        }
        if (jLabelEspera4.isVisible()) {
            contador++;
        }

        return !(contador == 4);
    }

    public int indexSillaVacia() {
        if (!jLabelEspera1.isVisible()) {
            return 0;
        }
        if (!jLabelEspera2.isVisible()) {
            return 1;
        }
        if (!jLabelEspera3.isVisible()) {
            return 2;
        }
        if (!jLabelEspera4.isVisible()) {
            return 3;
        }

        return -1;
    }

    public void desocuparSillaEspera(int silla) {
        switch (silla) {
            case 1:
                jLabelEspera1.setVisible(false);
                break;
            case 2:
                jLabelEspera2.setVisible(false);
                break;
            case 3:
                jLabelEspera3.setVisible(false);
                break;
            case 4:
                jLabelEspera4.setVisible(false);
                break;
            default:
                break;
        }
    }

    int b1 = 10, b2 = 10, b3 = 10;    //monto acumulado para barbero 1,2,3
    int total = 0;        // monto acumulado total

    public void actualizarcobro(int silla1, int silla2, int silla3) {
        if (silla1 == 10 & silla2 == 0 & silla3 == 0) {
            jLabeLacum1.setText("$ " + String.valueOf(b1));
            b1 += silla1;
            total += silla1;
            jLabeltotal.setText("$ " + String.valueOf(total));
        } else if (silla1 == 0 & silla2 == 10 & silla3 == 0) {
            jLabelacum2.setText("$ " + String.valueOf(b2));
            b2 += silla2;
            total += silla2;
            jLabeltotal.setText("$ " + String.valueOf(total));
        } else {
            jLabelacum3.setText("$ " + String.valueOf(b3));
            b3 += silla3;
            total += silla3;
            jLabeltotal.setText("$ " + String.valueOf(total));
        }
    }

    public void actualizarcobro() {
        int preciocorte = 10;
        int b1 = 0, b2 = 0, b3 = 0;    //monto acumulado para barbero 1,2,3
        int total = 0;        // monto acumulado total
        jLabeltotal.setText("$ " + String.valueOf(total));
        jLabeLacum1.setText("$ " + String.valueOf(b1));
        jLabelacum2.setText("$ " + String.valueOf(b2));
        jLabelacum3.setText("$ " + String.valueOf(b3));
    }

    public void activar(int barbero) {
        switch (barbero) {
            case 1: {
                jLabelBarberoA.setVisible(true);
                jLabelatencion1.setVisible(true);
                jLabelestado1.setText("Atendiendo");
                break;
            }
            case 2: {
                jLabelBarbero2A.setVisible(true);
                jLabelatencion2.setVisible(true);
                jLabelestado2.setText("Atendiendo");
                break;
            }
            case 3: {
                jLabelBarbero3A.setVisible(true);
                jLabelAtencion3.setVisible(true);
                jLabelestado3.setText("Atendiendo");
                break;
            }
        }
    }

    public int despertar(int barbero) {
        switch (barbero) {
            case 1: {
                jLabelBarberoA.setVisible(true);
                jLabelatencion1.setVisible(true);
                atenderCliente atender = new atenderCliente();
                atender.contador = barbero;
                atender.start();
                break;
            }
            case 2: {
                jLabelBarbero2A.setVisible(true);
                jLabelatencion2.setVisible(true);
                atenderCliente atender = new atenderCliente();
                atender.contador = barbero;
                atender.start();
                break;
            }
            case 3: {
                jLabelBarbero3A.setVisible(true);
                jLabelAtencion3.setVisible(true);
                atenderCliente atender = new atenderCliente();
                atender.contador = barbero;
                atender.start();
                break;
            }
        }
        return 1;
    }

    public void quitarCliente(int cliente) {
        switch (cliente) {
            case 1:
                jLabelatencion1.setVisible(false);
                break;
            case 2:
                jLabelatencion2.setVisible(false);
                break;
            case 3:
                jLabelAtencion3.setVisible(false);
                break;
            default:
                break;
        }
    }

    public int dormir(int barbero) {
        switch (barbero) {
            case 1:
                jLabelBarberoA.setVisible(false);
                jLabelestado1.setText("Durmiendo");
                break;
            case 2:
                jLabelBarbero2A.setVisible(false);
                jLabelestado2.setText("Durmiendo");
                break;
            default:
                jLabelBarbero3A.setVisible(false);
                jLabelestado3.setText("Durmiendo");
                break;
        }
        return 1;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgregarProceso;
    private javax.swing.JLabel jLabeLacum1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAtencion3;
    private javax.swing.JLabel jLabelBarbero2A;
    private javax.swing.JLabel jLabelBarbero2S;
    private javax.swing.JLabel jLabelBarbero3A;
    private javax.swing.JLabel jLabelBarbero3S;
    private javax.swing.JLabel jLabelBarberoA;
    private javax.swing.JLabel jLabelBarberoS;
    private javax.swing.JLabel jLabelEspera1;
    private javax.swing.JLabel jLabelEspera2;
    private javax.swing.JLabel jLabelEspera3;
    private javax.swing.JLabel jLabelEspera4;
    private javax.swing.JLabel jLabelacum2;
    private javax.swing.JLabel jLabelacum3;
    private javax.swing.JLabel jLabelatencion1;
    private javax.swing.JLabel jLabelatencion2;
    private javax.swing.JLabel jLabelestado1;
    private javax.swing.JLabel jLabelestado2;
    private javax.swing.JLabel jLabelestado3;
    private javax.swing.JLabel jLabeltotal;
    private javax.swing.JList<String> jListProcesosFuera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
