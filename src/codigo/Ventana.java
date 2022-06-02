/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author clara
 */
public class Ventana extends javax.swing.JFrame {

    int indiceNumero = 0, indiceSuma = 0, indiceResta = 0, indiceMultiplicacion = 0, indiceDivision = 0,
            indiceResiduo = 0;

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        txtEntrada = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(232, 232, 232));
        jTabbedPane1.setForeground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setFont(new java.awt.Font("Corbel", 1, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 100, 40));

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane2.setViewportView(txtResultado);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 590, 110));

        txtEntrada.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });
        jPanel2.add(txtEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 450, 100));

        jTabbedPane1.addTab("Analizador Léxico", jPanel2);

        jPanel3.setBackground(new java.awt.Color(232, 232, 232));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "Número", "Suma", "Resta", "Multiplicación", "División", "Residuo"
                }));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 590, 330));

        jTabbedPane1.addTab("Tabla de tokens", jPanel3);

        jPanel4.setBackground(new java.awt.Color(232, 232, 232));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Instituto Tecnológico Superior de Jerez");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Jerez de García Salinas Zac.          10 de mayo de 2022 ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Ricardo Reyes Robledo     S19070030 ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Bryan Ezequiel Valdez Calderon     S19070118");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Clara Ruby Pinedo Berumen     S19070080 ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Ingeniería en Sistemas Computacionales");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Lenguajes y Automatas           6° Semestre ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("M.C.E Vanessa Saldivar Quezada ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jTabbedPane1.addTab("Datos", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Este método se encarga de recorrer toda la tabla y asignarle el valor de null
    // a todas las celdas
    private void limpiarTabla() {
        int filas = jTable1.getRowCount();
        int columnas = jTable1.getColumnCount();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                jTable1.setValueAt(null, i, j);
            }
        }
    }

    /**
     * Este método lee caracter por caracter la cadena de entrada y según el
     * caracter que lea
     * lo guarda en la tabla de tokens o lo imprime en la consola como un error.
     * 
     * @param args the command line arguments
     */
    private int lastError = 0;
    private int lastErrorLength = 0;
    private String getErrorIndex(Lexer lexer){                                  //substring de entrada que comienza desde el índice del último error más su longitud
                                                                                                                                //suma el índice y la longitud del último error para dar un mensaje más preciso
        int beginError = (Integer.parseInt(""+txtEntrada.getText().substring(lastError+lastErrorLength).indexOf(lexer.lexeme))+1+lastError+lastErrorLength);
        int endError = beginError+lexer.lexeme.length()-1;
        String ret = "Error en las columnas "+beginError+"-"+endError+"; ";
        lastErrorLength = lexer.lexeme.length();
        lastError = (Integer.parseInt(""+txtEntrada.getText().substring(lastError+lastErrorLength).indexOf(lexer.lexeme))+lastError+lastErrorLength);
        return ret;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // En esta sección se regresan los indices que se usan para la tabla a su estado
        // por defecto
        indiceNumero = 0;
        indiceSuma = 0;
        indiceResta = 0;
        indiceMultiplicacion = 0;
        indiceDivision = 0;
        indiceResiduo = 0;
        lastError = 0;          //para reestablecer el indice del último error y la longitud del mismo
        lastErrorLength = 0;

        limpiarTabla();

        // Se crea el archivo con el que se va a trabajar
        File archivo = new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(txtEntrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Se abre el archivo para leerlo
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while (true) {// Se lee caracter por caracter el archivo y se clasifican los tokens, se
                          // agregan a la tabla de tokens dependiendo el indice del token y del tipo
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    resultado += "FIN";
                    txtResultado.setText(resultado);
                    return;
                }
                switch (tokens) {
                    case ErrorOperador:
                        resultado += getErrorIndex(lexer) + lexer.lexeme +  "\n Es un error de operador: no puedes poner más de un operador"
                                + "\n       seguido a menos que sean de polaridades o que sea una un signo"
                                + "\n       después de una operación como multiplicación y división\n";
                        break;
                    case ErrorPuntoOperador:
                        resultado += getErrorIndex(lexer) + lexer.lexeme + " Es un error de punto operador: no puedes poner un operador después de un punto\n";
                        break;
                    case ErrorMultiplesOperadores:
                        resultado += getErrorIndex(lexer) + "\n" + lexer.lexeme +  "  Es un error de multiples operadores: no puede haber 2 o más operadores juntos, "
                                + "\n       a menos que sea una división/multiplicación seguida"
                                + "\n       de 1 ó n cantidad de signos, o bien solamente n cantidad de signos\n";
                        break;
                    case ErrorMultipunto:
                        resultado += getErrorIndex(lexer) + lexer.lexeme + " Es un error multipunto: no puedes poner 2 o más puntos seguidos\n";
                        break;
                    case ErrorDivZero:
                        resultado += getErrorIndex(lexer) + lexer.lexeme + " Es un error de división entre cero: no puedes dividir un número entre cero\n";
                        break;
                    case ERROR:
                        resultado += lexer.lexeme + " Es un " + tokens + "\n";
                        break;
                    case Numero:
                        // resultado += lexer.lexeme + ": Es un " + tokens + "\n";
                        jTable1.setValueAt("" + lexer.lexeme, indiceNumero, 0);
                        indiceNumero += 1;
                        break;

                    case Suma:
                        // resultado += "+: Es una suma \n";
                        jTable1.setValueAt("+", indiceSuma, 1);
                        indiceSuma += 1;
                        break;

                    case Resta:
                        // resultado += "-: Es una resta \n";
                        jTable1.setValueAt("-", indiceResta, 2);
                        indiceResta += 1;
                        break;

                    case Multiplicacion:
                        // resultado += "*: Es una multiplicacion \n";
                        jTable1.setValueAt("*", indiceMultiplicacion, 3);
                        indiceMultiplicacion += 1;
                        break;

                    case Division:
                        // resultado += "/: Es una division \n";
                        jTable1.setValueAt("/", indiceDivision, 4);
                        indiceDivision += 1;
                        break;

                    case Residuo:
                        // resultado += "%: Es un residuo \n";
                        jTable1.setValueAt("%", indiceResiduo, 5);
                        indiceResiduo += 1;
                        break;

                    default:
                        // resultado += "Token: " + tokens + "\n";
                        break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtEntradaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtEntradaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
