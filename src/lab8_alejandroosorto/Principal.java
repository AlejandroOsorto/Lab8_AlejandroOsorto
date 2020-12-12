package lab8_alejandroosorto;

import java.io.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author Alejandro
 */
public class Principal extends javax.swing.JFrame
{
    
    ArrayList listaProgramas = new ArrayList();
    ArrayList listaProgramasSeleccionados = new ArrayList();
    
    AdminBarra AB;
    
    public Principal()
    {
        initComponents();
        setLocationRelativeTo(null);
        
        DefaultComboBoxModel m = (DefaultComboBoxModel) CB_TipoPrograma.getModel();
        m.addElement("Anime");
        m.addElement("Serie");
        m.addElement("Documental");
        m.addElement("Pelicula");
        
        DefaultComboBoxModel m2 = (DefaultComboBoxModel) CB_GeneroPrograma.getModel();
        m2.addElement("Comedia");
        m2.addElement("Romance");
        m2.addElement("Terror");
        m2.addElement("SyFy");
        m2.addElement("Suspenso");
        m2.addElement("Accion");
        
        AdminHora AH = new AdminHora(LAB_Hora2);
        Thread proceso = new Thread(AH);
        proceso.start();
        
        AdminHora AH2 = new AdminHora(LAB_Hora1);
        Thread proceso2 = new Thread(AH2);
        proceso2.start();
        
        AB = new AdminBarra(BarraGuardar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        M_CD_SubMenuListar = new javax.swing.JPopupMenu();
        MI_Modificar = new javax.swing.JMenuItem();
        MI_EliminarPrograma = new javax.swing.JMenuItem();
        M_CD_SubMenuAggLista = new javax.swing.JPopupMenu();
        MI_EliminarLista = new javax.swing.JMenuItem();
        JD_Eliminar = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        L_ProgramasEliminar = new javax.swing.JList<>();
        BTN_Eliminar = new javax.swing.JButton();
        PPrincipal = new javax.swing.JTabbedPane();
        P_AgregarPrograma = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CT_NombrePrograma = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SP_Puntuacion = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        CT_AñoPrograma = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CB_TipoPrograma = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        CB_GeneroPrograma = new javax.swing.JComboBox<>();
        BTN_AgregarPrograma = new javax.swing.JButton();
        LAB_Hora1 = new javax.swing.JLabel();
        P_AgregarLista = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CT_NombreCL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CB_ProgramasCL = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        L_ProgramasSeleccionadosCL = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        BTN_GuardarLista = new javax.swing.JButton();
        BTN_AgregarALista = new javax.swing.JButton();
        BarraGuardar = new javax.swing.JProgressBar();
        LAB_Hora2 = new javax.swing.JLabel();
        P_MostrarLista = new javax.swing.JPanel();
        BTN_CargarLista = new javax.swing.JButton();
        BTN_CerrarLista = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        T_Area = new javax.swing.JTextArea();
        BTN_ElimPrograma = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        MI_Modificar.setText("Modificar");
        M_CD_SubMenuListar.add(MI_Modificar);

        MI_EliminarPrograma.setText("jMenuItem1");
        M_CD_SubMenuListar.add(MI_EliminarPrograma);

        MI_EliminarLista.setText("Quitar");
        MI_EliminarLista.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MI_EliminarListaActionPerformed(evt);
            }
        });
        M_CD_SubMenuAggLista.add(MI_EliminarLista);

        jPanel1.setBackground(new java.awt.Color(153, 169, 179));

        jScrollPane2.setViewportView(L_ProgramasEliminar);

        BTN_Eliminar.setText("Eliminar");
        BTN_Eliminar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_Eliminar)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BTN_Eliminar)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JD_EliminarLayout = new javax.swing.GroupLayout(JD_Eliminar.getContentPane());
        JD_Eliminar.getContentPane().setLayout(JD_EliminarLayout);
        JD_EliminarLayout.setHorizontalGroup(
            JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        JD_EliminarLayout.setVerticalGroup(
            JD_EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Claudilists");

        PPrincipal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PPrincipalMouseClicked(evt);
            }
        });

        P_AgregarPrograma.setBackground(new java.awt.Color(88, 127, 154));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre: ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Puntuacion: ");

        SP_Puntuacion.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Año de lanzamiento: ");

        CT_AñoPrograma.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                CT_AñoProgramaKeyTyped(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo: ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Género: ");

        BTN_AgregarPrograma.setBackground(new java.awt.Color(50, 56, 58));
        BTN_AgregarPrograma.setForeground(new java.awt.Color(255, 255, 255));
        BTN_AgregarPrograma.setText("Agregar programa");
        BTN_AgregarPrograma.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_AgregarProgramaMouseClicked(evt);
            }
        });

        LAB_Hora1.setBackground(new java.awt.Color(255, 255, 255));
        LAB_Hora1.setForeground(new java.awt.Color(0, 0, 0));
        LAB_Hora1.setOpaque(true);

        javax.swing.GroupLayout P_AgregarProgramaLayout = new javax.swing.GroupLayout(P_AgregarPrograma);
        P_AgregarPrograma.setLayout(P_AgregarProgramaLayout);
        P_AgregarProgramaLayout.setHorizontalGroup(
            P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(CT_NombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(SP_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CT_AñoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(CB_TipoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(CB_GeneroPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTN_AgregarPrograma))
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_AgregarProgramaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LAB_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        P_AgregarProgramaLayout.setVerticalGroup(
            P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AgregarProgramaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CT_NombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SP_Puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CT_AñoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CB_TipoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CB_GeneroPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(BTN_AgregarPrograma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LAB_Hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PPrincipal.addTab("Agregar programa", P_AgregarPrograma);

        P_AgregarLista.setBackground(new java.awt.Color(102, 92, 119));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la lista: ");

        CT_NombreCL.setBackground(new java.awt.Color(76, 90, 128));
        CT_NombreCL.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Programas:");

        L_ProgramasSeleccionadosCL.setModel(new DefaultListModel());
        L_ProgramasSeleccionadosCL.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                L_ProgramasSeleccionadosCLMouseClicked(evt);
            }
        });
        L_ProgramasSeleccionadosCL.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                L_ProgramasSeleccionadosCLKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(L_ProgramasSeleccionadosCL);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lista de programas ya seleccionados: ");

        BTN_GuardarLista.setBackground(new java.awt.Color(50, 56, 58));
        BTN_GuardarLista.setForeground(new java.awt.Color(255, 255, 255));
        BTN_GuardarLista.setText("Guardar lista");
        BTN_GuardarLista.setEnabled(false);
        BTN_GuardarLista.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_GuardarListaMouseClicked(evt);
            }
        });

        BTN_AgregarALista.setBackground(new java.awt.Color(50, 56, 58));
        BTN_AgregarALista.setForeground(new java.awt.Color(255, 255, 255));
        BTN_AgregarALista.setText("Agregar a lista");
        BTN_AgregarALista.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BTN_AgregarAListaActionPerformed(evt);
            }
        });

        BarraGuardar.setBackground(new java.awt.Color(0, 0, 0));
        BarraGuardar.setForeground(new java.awt.Color(255, 255, 255));

        LAB_Hora2.setBackground(new java.awt.Color(255, 255, 255));
        LAB_Hora2.setForeground(new java.awt.Color(0, 0, 0));
        LAB_Hora2.setText(" ");
        LAB_Hora2.setOpaque(true);

        javax.swing.GroupLayout P_AgregarListaLayout = new javax.swing.GroupLayout(P_AgregarLista);
        P_AgregarLista.setLayout(P_AgregarListaLayout);
        P_AgregarListaLayout.setHorizontalGroup(
            P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AgregarListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_AgregarListaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(CT_NombreCL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_AgregarListaLayout.createSequentialGroup()
                        .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_ProgramasCL, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(BTN_AgregarALista, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(112, 112, 112)
                        .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_GuardarLista, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BarraGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LAB_Hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        P_AgregarListaLayout.setVerticalGroup(
            P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_AgregarListaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CT_NombreCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_AgregarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_AgregarListaLayout.createSequentialGroup()
                        .addComponent(CB_ProgramasCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_AgregarALista))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(BarraGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_GuardarLista)
                .addGap(2, 2, 2)
                .addComponent(LAB_Hora2)
                .addContainerGap())
        );

        PPrincipal.addTab("Agregar ClaudiList", P_AgregarLista);

        P_MostrarLista.setBackground(new java.awt.Color(143, 173, 153));

        BTN_CargarLista.setBackground(new java.awt.Color(50, 56, 58));
        BTN_CargarLista.setForeground(new java.awt.Color(255, 255, 255));
        BTN_CargarLista.setText("Cargar una lista");
        BTN_CargarLista.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_CargarListaMouseClicked(evt);
            }
        });

        BTN_CerrarLista.setBackground(new java.awt.Color(50, 56, 58));
        BTN_CerrarLista.setForeground(new java.awt.Color(255, 255, 255));
        BTN_CerrarLista.setText("Cerrar lista");
        BTN_CerrarLista.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_CerrarListaMouseClicked(evt);
            }
        });

        T_Area.setColumns(20);
        T_Area.setRows(5);
        jScrollPane3.setViewportView(T_Area);

        BTN_ElimPrograma.setBackground(new java.awt.Color(50, 56, 58));
        BTN_ElimPrograma.setForeground(new java.awt.Color(255, 255, 255));
        BTN_ElimPrograma.setText("Eliminar programa");
        BTN_ElimPrograma.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                BTN_ElimProgramaMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(50, 56, 58));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refrescar lista");

        javax.swing.GroupLayout P_MostrarListaLayout = new javax.swing.GroupLayout(P_MostrarLista);
        P_MostrarLista.setLayout(P_MostrarListaLayout);
        P_MostrarListaLayout.setHorizontalGroup(
            P_MostrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MostrarListaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(P_MostrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(BTN_CargarLista)
                    .addGroup(P_MostrarListaLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(168, 168, 168)
                        .addComponent(BTN_CerrarLista)))
                .addGap(45, 45, 45)
                .addComponent(BTN_ElimPrograma)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        P_MostrarListaLayout.setVerticalGroup(
            P_MostrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_MostrarListaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BTN_CargarLista)
                .addGap(29, 29, 29)
                .addGroup(P_MostrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_ElimPrograma))
                .addGap(18, 18, 18)
                .addGroup(P_MostrarListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_CerrarLista)
                    .addComponent(jButton1))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        PPrincipal.addTab("Mostrar una lista", P_MostrarLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_GuardarListaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_GuardarListaMouseClicked
    {//GEN-HEADEREND:event_BTN_GuardarListaMouseClicked
        // TODO add your handling code here:
        String nombre;
        
        if (CT_NombreCL.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Nombre no valido, ingrese un nombre");
        }
        else
        {
            nombre = CT_NombreCL.getText();
            
            ClaudiList CL = new ClaudiList();
            CL.setNombre(nombre);
            
            CL.setLista(listaProgramasSeleccionados);
            CL.EscribirArchivo();
            
            DefaultListModel mLista = (DefaultListModel) L_ProgramasSeleccionadosCL.getModel();
            mLista.removeAllElements();
            
            listaProgramasSeleccionados.clear();
            
            AB.start();
        }
    }//GEN-LAST:event_BTN_GuardarListaMouseClicked

    private void L_ProgramasSeleccionadosCLKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_L_ProgramasSeleccionadosCLKeyPressed
    {//GEN-HEADEREND:event_L_ProgramasSeleccionadosCLKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_DELETE)
        {
            if (L_ProgramasSeleccionadosCL.getSelectedIndex() >= 0)
            {
                DefaultListModel mLista = (DefaultListModel) L_ProgramasSeleccionadosCL.getModel();
                mLista.remove(L_ProgramasSeleccionadosCL.getSelectedIndex());
                L_ProgramasSeleccionadosCL.setModel(mLista);
                JOptionPane.showMessageDialog(this, "Programa eliminado exitosamente de la lista");
                if (mLista.isEmpty())
                {
                    BTN_GuardarLista.setEnabled(false);
                }
                else
                {
                    BTN_GuardarLista.setEnabled(true);
                }
            }
        }
    }//GEN-LAST:event_L_ProgramasSeleccionadosCLKeyPressed

    private void L_ProgramasSeleccionadosCLMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_L_ProgramasSeleccionadosCLMouseClicked
    {//GEN-HEADEREND:event_L_ProgramasSeleccionadosCLMouseClicked
        // TODO add your handling code here:
        if (L_ProgramasSeleccionadosCL.getSelectedIndex() >= 0)
        {
            if (evt.isMetaDown())
            {
                M_CD_SubMenuAggLista.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_L_ProgramasSeleccionadosCLMouseClicked

    private void CT_AñoProgramaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_CT_AñoProgramaKeyTyped
    {//GEN-HEADEREND:event_CT_AñoProgramaKeyTyped
        // TODO add your handling code here:
        char check = evt.getKeyChar();

        if (Character.isLetter(check))
        {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "No puede ingresar letras");
        }
    }//GEN-LAST:event_CT_AñoProgramaKeyTyped

    private void BTN_AgregarProgramaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_AgregarProgramaMouseClicked
    {//GEN-HEADEREND:event_BTN_AgregarProgramaMouseClicked
        // TODO add your handling code here:
        String nombre;
        int punt;
        int año;
        String tipo;
        String gen;
        
        if (CT_NombrePrograma.getText().isEmpty()|| CT_AñoPrograma.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Uno o mas campos estan vacios, por favor rellenelos con la informacion solicitada");
        }
        else
        {
            nombre = CT_NombrePrograma.getText();
            punt = (int)SP_Puntuacion.getValue();
            año = Integer.parseInt(CT_AñoPrograma.getText());
            tipo = CB_TipoPrograma.getSelectedItem().toString();
            gen = CB_GeneroPrograma.getSelectedItem().toString();
            
            listaProgramas.add(new Programa(nombre, punt, año, tipo, gen));
            
            JOptionPane.showMessageDialog(null, "Programa agregado exitosamente");
        }
    }//GEN-LAST:event_BTN_AgregarProgramaMouseClicked

    private void PPrincipalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PPrincipalMouseClicked
    {//GEN-HEADEREND:event_PPrincipalMouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel mProg = (DefaultComboBoxModel) CB_ProgramasCL.getModel();
        
        mProg.removeAllElements();
        for (int i = 0; i < listaProgramas.size(); i++)        
        {
            mProg.addElement(listaProgramas.get(i));
        }
        
    }//GEN-LAST:event_PPrincipalMouseClicked

    private void BTN_AgregarAListaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BTN_AgregarAListaActionPerformed
    {//GEN-HEADEREND:event_BTN_AgregarAListaActionPerformed
        // TODO add your handling code here:
        
        if (CB_ProgramasCL.getSelectedIndex() >= 0)
        {
            String programa = CB_ProgramasCL.getSelectedItem().toString();
            DefaultListModel listProg = (DefaultListModel) L_ProgramasSeleccionadosCL.getModel();
            listProg.addElement(programa);
            listaProgramasSeleccionados.add(programa);
            L_ProgramasSeleccionadosCL.setModel(listProg);
            
            if (L_ProgramasSeleccionadosCL.getSize() == null)
            {
                BTN_GuardarLista.setEnabled(false);
            }
            else
            {
                BTN_GuardarLista.setEnabled(true);
            }
        }
    }//GEN-LAST:event_BTN_AgregarAListaActionPerformed

    private void MI_EliminarListaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MI_EliminarListaActionPerformed
    {//GEN-HEADEREND:event_MI_EliminarListaActionPerformed
        // TODO add your handling code here:
        if (L_ProgramasSeleccionadosCL.getSelectedIndex() >= 0)
        {
            DefaultListModel mLista = (DefaultListModel) L_ProgramasSeleccionadosCL.getModel();
            mLista.remove(L_ProgramasSeleccionadosCL.getSelectedIndex());
            L_ProgramasSeleccionadosCL.setModel(mLista);
            JOptionPane.showMessageDialog(this, "Programa eliminado exitosamente de la lista");
            
            if (mLista.isEmpty())
            {
                BTN_GuardarLista.setEnabled(false);
            } 
            else
            {
                BTN_GuardarLista.setEnabled(true);
            }
        }
    }//GEN-LAST:event_MI_EliminarListaActionPerformed

    private void BTN_CargarListaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_CargarListaMouseClicked
    {//GEN-HEADEREND:event_BTN_CargarListaMouseClicked
        // TODO add your handling code here:
        
        T_Area.setText("");
        
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            JFileChooser FC = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "txt");
            FC.setFileFilter(filtro);
            int seleccion = FC.showOpenDialog(this);
            
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {
                fichero = FC.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                T_Area.setText("");
                while ((linea = br.readLine()) != null)
                {
                    T_Area.append(linea + "\n");
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            br.close();
            fr.close();
        }
        catch (Exception ex) {}
        
    }//GEN-LAST:event_BTN_CargarListaMouseClicked

    private void BTN_CerrarListaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_CerrarListaMouseClicked
    {//GEN-HEADEREND:event_BTN_CerrarListaMouseClicked
        // TODO add your handling code here:
        T_Area.setText("");
    }//GEN-LAST:event_BTN_CerrarListaMouseClicked

    private void BTN_ElimProgramaMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_ElimProgramaMouseClicked
    {//GEN-HEADEREND:event_BTN_ElimProgramaMouseClicked
        // TODO add your handling code here:
        JD_Eliminar.setModal(true);
        JD_Eliminar.pack();
        JD_Eliminar.setLocationRelativeTo(this);
        JD_Eliminar.setVisible(true);
    }//GEN-LAST:event_BTN_ElimProgramaMouseClicked

    private void BTN_EliminarMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_BTN_EliminarMouseClicked
    {//GEN-HEADEREND:event_BTN_EliminarMouseClicked
        // TODO add your handling code here:
        
        L_ProgramasEliminar.getSelectedIndex();
    }//GEN-LAST:event_BTN_EliminarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AgregarALista;
    private javax.swing.JButton BTN_AgregarPrograma;
    private javax.swing.JButton BTN_CargarLista;
    private javax.swing.JButton BTN_CerrarLista;
    private javax.swing.JButton BTN_ElimPrograma;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JButton BTN_GuardarLista;
    private javax.swing.JProgressBar BarraGuardar;
    private javax.swing.JComboBox<String> CB_GeneroPrograma;
    private javax.swing.JComboBox<String> CB_ProgramasCL;
    private javax.swing.JComboBox<String> CB_TipoPrograma;
    private javax.swing.JTextField CT_AñoPrograma;
    private javax.swing.JTextField CT_NombreCL;
    private javax.swing.JTextField CT_NombrePrograma;
    private javax.swing.JDialog JD_Eliminar;
    private javax.swing.JLabel LAB_Hora1;
    private javax.swing.JLabel LAB_Hora2;
    private javax.swing.JList<String> L_ProgramasEliminar;
    private javax.swing.JList<String> L_ProgramasSeleccionadosCL;
    private javax.swing.JMenuItem MI_EliminarLista;
    private javax.swing.JMenuItem MI_EliminarPrograma;
    private javax.swing.JMenuItem MI_Modificar;
    private javax.swing.JPopupMenu M_CD_SubMenuAggLista;
    private javax.swing.JPopupMenu M_CD_SubMenuListar;
    private javax.swing.JTabbedPane PPrincipal;
    private javax.swing.JPanel P_AgregarLista;
    private javax.swing.JPanel P_AgregarPrograma;
    private javax.swing.JPanel P_MostrarLista;
    private javax.swing.JSpinner SP_Puntuacion;
    private javax.swing.JTextArea T_Area;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
