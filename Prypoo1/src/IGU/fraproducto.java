/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGU;
import java.util.Calendar;
import validaciones.Control;
import validaciones.Validacion;
import controles.crtproducto;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import modelo.prod;
public class fraproducto extends javax.swing.JInternalFrame {
private crtproducto ctr;
    private JButton[] bot;
    private Control c;
    private Validacion v;
    private char opc;
    private int index;
    public fraproducto() {
        initComponents();
        getContentPane().setBackground(new Color(51,0,204));
        /*instanciamos el objeto*/
        ctr = new crtproducto();
        v = new Validacion();
        bot = new JButton[]{btnedi, btnelim};
        c = new Control();
        listado();
    }

    private void listado() {
        ctr.listar(tbproducto, ctr.consultar());
        c.habilitarBotones(bot, new boolean[]{false, false});
        c.encerarControles(pnlbus);
        c.bloquearControles(pnlbus, false);
        cbobus.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crud = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblCrud = new javax.swing.JLabel();
        lblCrud1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pnldat = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_desc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jdtfeci = new com.toedter.calendar.JDateChooser();
        jdtfec = new com.toedter.calendar.JDateChooser();
        pn_pre = new javax.swing.JSpinner();
        btnFI = new javax.swing.JButton();
        btnFC = new javax.swing.JButton();
        txt_feci = new javax.swing.JTextField();
        txt_fec = new javax.swing.JTextField();
        txt_cant = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnSalidaCrud = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlbus = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_bus = new javax.swing.JTextField();
        cbobus = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbproducto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnedi = new javax.swing.JButton();
        btnelim = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        Crud.setBackground(new java.awt.Color(154, 240, 243));
        Crud.setMinimumSize(new java.awt.Dimension(750, 500));

        jPanel3.setBackground(new java.awt.Color(185, 34, 66));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRODUCTO");

        lblCrud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/alimento.jpg"))); // NOI18N
        lblCrud.setText("Crear Cliente");

        lblCrud1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/alimento.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCrud1))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblCrud1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        pnldat.setBackground(new java.awt.Color(245, 33, 252));
        pnldat.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("DESCRIPCION:");

        txt_desc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_descKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("FECHA DE INGRESO:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("FECHA DE CADUCIDAD:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("INGRESE PRECIO:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("INGRESE CANTIDAD:");

        jdtfeci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jdtfeciMousePressed(evt);
            }
        });
        jdtfeci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jdtfeciKeyPressed(evt);
            }
        });

        pn_pre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pn_pre.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 9999.0d, 1.0d));
        pn_pre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pn_pre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pn_preKeyPressed(evt);
            }
        });

        btnFI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/seleccionar.jpg"))); // NOI18N
        btnFI.setText("Seleccionar");
        btnFI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIActionPerformed(evt);
            }
        });

        btnFC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/seleccionar.jpg"))); // NOI18N
        btnFC.setText("Seleccionar");
        btnFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFCActionPerformed(evt);
            }
        });

        txt_cant.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cantKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cantKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnldatLayout = new javax.swing.GroupLayout(pnldat);
        pnldat.setLayout(pnldatLayout);
        pnldatLayout.setHorizontalGroup(
            pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldatLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnldatLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_desc))
                    .addGroup(pnldatLayout.createSequentialGroup()
                        .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnldatLayout.createSequentialGroup()
                                .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdtfeci, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(jdtfec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(pnldatLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pn_pre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFI)
                            .addComponent(btnFC, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fec)
                            .addGroup(pnldatLayout.createSequentialGroup()
                                .addComponent(txt_feci, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addComponent(txt_cant))
                        .addGap(13, 13, 13)))
                .addGap(17, 17, 17))
        );
        pnldatLayout.setVerticalGroup(
            pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnldatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnldatLayout.createSequentialGroup()
                        .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdtfeci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnldatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFI)
                            .addComponent(txt_feci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFC)
                        .addComponent(txt_fec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jdtfec, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnldatLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pn_pre))
                        .addGap(97, 97, 97))
                    .addGroup(pnldatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnldatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel10.setBackground(new java.awt.Color(255, 100, 65));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/guardar.jpg"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalidaCrud.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalidaCrud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/salir.jpg"))); // NOI18N
        btnSalidaCrud.setText("Salir");
        btnSalidaCrud.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnSalidaCrud.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSalidaCrud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaCrudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar)
                .addGap(81, 81, 81)
                .addComponent(btnSalidaCrud, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btnSalidaCrud)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout CrudLayout = new javax.swing.GroupLayout(Crud.getContentPane());
        Crud.getContentPane().setLayout(CrudLayout);
        CrudLayout.setHorizontalGroup(
            CrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrudLayout.createSequentialGroup()
                .addGroup(CrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CrudLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(CrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnldat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(CrudLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(CrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CrudLayout.createSequentialGroup()
                    .addGap(0, 179, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 179, Short.MAX_VALUE)))
        );
        CrudLayout.setVerticalGroup(
            CrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnldat, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(CrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CrudLayout.createSequentialGroup()
                    .addGap(0, 12, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(203, 140, 140));
        setPreferredSize(new java.awt.Dimension(800, 550));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(143, 242, 212));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRO DE PRODUCTOS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/alimento.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/alimento.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.inactiveTitleBackground"));

        pnlbus.setBackground(new java.awt.Color(240, 151, 98));

        jLabel1.setText("BUSCAR POR: ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/LUPA.PNG"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        txt_bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busActionPerformed(evt);
            }
        });
        txt_bus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busKeyReleased(evt);
            }
        });

        cbobus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un item", "Descripcion" }));
        cbobus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbobusItemStateChanged(evt);
            }
        });
        cbobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbobusActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/selec.png"))); // NOI18N

        tbproducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbproductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbproducto);

        javax.swing.GroupLayout pnlbusLayout = new javax.swing.GroupLayout(pnlbus);
        pnlbus.setLayout(pnlbusLayout);
        pnlbusLayout.setHorizontalGroup(
            pnlbusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbusLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbobus, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(txt_bus, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addContainerGap(53, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlbusLayout.setVerticalGroup(
            pnlbusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlbusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(pnlbusLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlbusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlbusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(cbobus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_bus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlbus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(240, 162, 100));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/NUEVO.JPG"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/modi.jpg"))); // NOI18N
        btnedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnediActionPerformed(evt);
            }
        });

        btnelim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ELIMINAR.JPG"))); // NOI18N
        btnelim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnelimActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/ssalir.jpg"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnedi, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnelim, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addComponent(btnelim)
                    .addComponent(btnedi)
                    .addComponent(btnCrear))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_descKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descKeyPressed
        v.siguiente(pn_pre, evt);
    }//GEN-LAST:event_txt_descKeyPressed

    private void txt_descKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descKeyTyped
        // TODO add your handling code here:
        v.validarCajas(evt, 2);
    }//GEN-LAST:event_txt_descKeyTyped

    private void jdtfeciMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdtfeciMousePressed

    }//GEN-LAST:event_jdtfeciMousePressed

    private void jdtfeciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdtfeciKeyPressed

    }//GEN-LAST:event_jdtfeciKeyPressed

    private void pn_preKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pn_preKeyPressed
        // TODO add your handling code here:
        v.siguiente(txt_cant, evt);
    }//GEN-LAST:event_pn_preKeyPressed

    private void btnFIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIActionPerformed
        String dia = Integer.toString(jdtfeci.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jdtfeci.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(jdtfeci.getCalendar().get(Calendar.YEAR));
        String fecha = (year + "-" + mes+ "-" + dia);
        txt_feci.setText(fecha);
    }//GEN-LAST:event_btnFIActionPerformed

    private void btnFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFCActionPerformed
        String dia = Integer.toString(jdtfec.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(jdtfec.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(jdtfec.getCalendar().get(Calendar.YEAR));
        String fecha = (year + "-" + mes+ "-" + dia);
        txt_fec.setText(fecha);
    }//GEN-LAST:event_btnFCActionPerformed

    private void txt_cantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantKeyPressed

    }//GEN-LAST:event_txt_cantKeyPressed

    private void txt_cantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cantKeyTyped
        v.validarCajas(evt, 1);
          int numerocaracteres=6;
        if(txt_cant.getText().length()>=numerocaracteres){
          evt.consume();}
    }//GEN-LAST:event_txt_cantKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (c.validarPanel(pnldat)) {
            prod d = new prod();
            d.setDescripcion(txt_desc.getText().trim());
            d.setFechaIngreso(txt_feci.getText().trim());
            d.setFechaCaducidad(txt_fec.getText().trim());
            d.setPrecio(Double.parseDouble(pn_pre.getValue()+""));
            d.setCantidad(txt_cant.getText().trim());
            String mensaje = "";
            switch (opc) {
                case 'g':
                d.setCodigo(ctr.codigoGenerador());
                mensaje = ctr.crear(d);
                break;
                case 'm':
                d.setCodigo(index);
                mensaje = ctr.modificar(d);
                break;
            }
            JOptionPane.showMessageDialog(null, mensaje, "Notificación", JOptionPane.INFORMATION_MESSAGE);
            listado();
            Crud.dispose();
            this.show();
        } else {
            JOptionPane.showMessageDialog(null, "Falta de ingresar valores !!", "Notificación", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalidaCrudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaCrudActionPerformed
        // TODO add your handling code here:
        Crud.dispose();
        listado();
        this.show();
    }//GEN-LAST:event_btnSalidaCrudActionPerformed

    private void tbproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbproductoMouseClicked
        c.habilitarBotones(bot, new boolean[]{false, false});
        if (tbproducto.getRowCount() > 0) {
            c.habilitarBotones(bot, new boolean[]{true, true});
            index = (Integer.parseInt(tbproducto.getValueAt(tbproducto.getSelectedRow(), 0).toString()));
        }
    }//GEN-LAST:event_tbproductoMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        listado();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txt_busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busActionPerformed

    }//GEN-LAST:event_txt_busActionPerformed

    private void txt_busKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busKeyReleased
        ctr.buscar(tbproducto, cbobus.getSelectedIndex(), txt_bus.getText().trim());
    }//GEN-LAST:event_txt_busKeyReleased

    private void cbobusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbobusItemStateChanged
        txt_bus.setEnabled(false);
        txt_bus.setText("");
        tbproducto.clearSelection();
        c.habilitarBotones(bot, new boolean[]{false, false});
        if (cbobus.getSelectedIndex() > 0) {
            txt_bus.setEnabled(true);
            txt_bus.requestFocus();
        }
    }//GEN-LAST:event_cbobusItemStateChanged

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        c.bloquearControles(pnldat, true);
        c.encerarControles(pnldat);
        txt_desc.requestFocus();
        Crud.setTitle("Nuevo Trabajador");
        Crud.getContentPane().setBackground(new Color(51,0,204));
        int ancho = (int) Crud.getPreferredSize().getWidth() + 30;
        int alto = (int) Crud.getPreferredSize().getHeight() + 40;
        Crud.setSize(ancho, alto);
        Crud.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        Crud.setVisible(true);
        Crud.setLocationRelativeTo(null);
        opc = 'g';
        this.hide();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnediActionPerformed
        c.bloquearControles(pnldat, true);
        c.encerarControles(pnldat);
        txt_desc.requestFocus();
        Crud.setTitle("Editar Trabajador");
        int ancho = (int) Crud.getPreferredSize().getWidth() + 30;
        int alto = (int) Crud.getPreferredSize().getHeight() + 50;
        Crud.setSize(ancho, alto);
        Crud.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        Crud.setVisible(true);
        Crud.setLocationRelativeTo(null);
        opc = 'm';
        //modificar
        txt_desc.setText(tbproducto.getValueAt(tbproducto.getSelectedRow(), 1).toString());
        txt_feci.setText(tbproducto.getValueAt(tbproducto.getSelectedRow(), 2).toString());
        txt_fec.setText(tbproducto.getValueAt(tbproducto.getSelectedRow(), 3).toString());
        txt_cant.setText(tbproducto.getValueAt(tbproducto.getSelectedRow(), 5).toString());
        pn_pre.setValue(Double.parseDouble(tbproducto.getValueAt(tbproducto.getSelectedRow(), 4).toString()));
      
        this.hide();
    }//GEN-LAST:event_btnediActionPerformed

    private void btnelimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnelimActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Desea usted eliminar el registro !!", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_NO_OPTION) {
            prod d = new prod();
            d.setCodigo(index);
            JOptionPane.showMessageDialog(null, ctr.eliminar(d), "Notificación", JOptionPane.INFORMATION_MESSAGE);
        }
        listado();
    }//GEN-LAST:event_btnelimActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cbobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbobusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbobusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Crud;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnFC;
    private javax.swing.JButton btnFI;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalidaCrud;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnedi;
    private javax.swing.JButton btnelim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbobus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private com.toedter.calendar.JDateChooser jdtfec;
    private com.toedter.calendar.JDateChooser jdtfeci;
    private javax.swing.JLabel lblCrud;
    private javax.swing.JLabel lblCrud1;
    private javax.swing.JSpinner pn_pre;
    private javax.swing.JPanel pnlbus;
    private javax.swing.JPanel pnldat;
    private javax.swing.JTable tbproducto;
    private javax.swing.JTextField txt_bus;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_fec;
    private javax.swing.JTextField txt_feci;
    // End of variables declaration//GEN-END:variables
}
