package vista;

import controlador.Navegador;
import controlador.Producto;

/**
 *
 * @author Magh
 */
public class FrmPrincipal extends javax.swing.JFrame {
    private Navegador nav;
    
    /**
     * Crea nuevo formulario FrmPrincipal.
     */
    public FrmPrincipal(Navegador nav) {
        this.nav = nav;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo = new javax.swing.JPanel();
        etiMenuPrincipal = new javax.swing.JLabel();
        panPrincipal = new javax.swing.JPanel();
        panProducto = new javax.swing.JPanel();
        etiProducto = new javax.swing.JLabel();
        panCliente = new javax.swing.JPanel();
        etiCliente = new javax.swing.JLabel();
        panOrden = new javax.swing.JPanel();
        etiOrden = new javax.swing.JLabel();
        panEmpleado = new javax.swing.JPanel();
        etiEmpleado = new javax.swing.JLabel();
        panUsuario = new javax.swing.JPanel();
        etiUsuarios = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("frmMenuPrincipal"); // NOI18N
        setSize(getPreferredSize());

        panFondo.setBackground(new java.awt.Color(0, 204, 204));
        panFondo.setMinimumSize(new java.awt.Dimension(800, 540));

        etiMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etiMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiMenuPrincipal.setText("Menú Principal");

        panPrincipal.setMinimumSize(new java.awt.Dimension(800, 440));
        panPrincipal.setPreferredSize(new java.awt.Dimension(800, 440));

        panProducto.setToolTipText("Gestionar Productos");
        panProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panProducto.setPreferredSize(new java.awt.Dimension(100, 100));
        panProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panProductoMouseClicked(evt);
            }
        });

        etiProducto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiProducto.setText("Producto");

        javax.swing.GroupLayout panProductoLayout = new javax.swing.GroupLayout(panProducto);
        panProducto.setLayout(panProductoLayout);
        panProductoLayout.setHorizontalGroup(
            panProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(etiProducto)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panProductoLayout.setVerticalGroup(
            panProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProductoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etiProducto)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panCliente.setToolTipText("Gestionar Clientes");
        panCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panCliente.setMinimumSize(new java.awt.Dimension(100, 100));
        panCliente.setPreferredSize(new java.awt.Dimension(100, 100));

        etiCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiCliente.setText("Cliente");

        javax.swing.GroupLayout panClienteLayout = new javax.swing.GroupLayout(panCliente);
        panCliente.setLayout(panClienteLayout);
        panClienteLayout.setHorizontalGroup(
            panClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(etiCliente)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panClienteLayout.setVerticalGroup(
            panClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panClienteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etiCliente)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panOrden.setToolTipText("Gestionar Ordenes");
        panOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panOrden.setMinimumSize(new java.awt.Dimension(100, 100));
        panOrden.setPreferredSize(new java.awt.Dimension(100, 100));

        etiOrden.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiOrden.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiOrden.setText("Orden");

        javax.swing.GroupLayout panOrdenLayout = new javax.swing.GroupLayout(panOrden);
        panOrden.setLayout(panOrdenLayout);
        panOrdenLayout.setHorizontalGroup(
            panOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrdenLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(etiOrden)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panOrdenLayout.setVerticalGroup(
            panOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOrdenLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etiOrden)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panEmpleado.setToolTipText("Gestionar Empleados");
        panEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panEmpleado.setMinimumSize(new java.awt.Dimension(100, 100));
        panEmpleado.setPreferredSize(new java.awt.Dimension(100, 100));

        etiEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiEmpleado.setText("Empleado");

        javax.swing.GroupLayout panEmpleadoLayout = new javax.swing.GroupLayout(panEmpleado);
        panEmpleado.setLayout(panEmpleadoLayout);
        panEmpleadoLayout.setHorizontalGroup(
            panEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEmpleadoLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(etiEmpleado)
                .addGap(10, 10, 10))
        );
        panEmpleadoLayout.setVerticalGroup(
            panEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEmpleadoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etiEmpleado)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        panUsuario.setToolTipText("Gestionar Usuarios");
        panUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panUsuario.setMinimumSize(new java.awt.Dimension(100, 100));
        panUsuario.setPreferredSize(new java.awt.Dimension(100, 100));

        etiUsuarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiUsuarios.setText("Usuario");

        javax.swing.GroupLayout panUsuarioLayout = new javax.swing.GroupLayout(panUsuario);
        panUsuario.setLayout(panUsuarioLayout);
        panUsuarioLayout.setHorizontalGroup(
            panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panUsuarioLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(etiUsuarios)
                .addGap(20, 20, 20))
        );
        panUsuarioLayout.setVerticalGroup(
            panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUsuarioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(etiUsuarios)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(panCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(panUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(panOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panProductoMouseClicked
        nav.mostrarFrmProducto();
    }//GEN-LAST:event_panProductoMouseClicked

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        setVisible(false);
        nav.mostrarFrmLogin();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JLabel etiCliente;
    private javax.swing.JLabel etiEmpleado;
    private javax.swing.JLabel etiMenuPrincipal;
    private javax.swing.JLabel etiOrden;
    private javax.swing.JLabel etiProducto;
    private javax.swing.JLabel etiUsuarios;
    private javax.swing.JPanel panCliente;
    private javax.swing.JPanel panEmpleado;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panOrden;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JPanel panProducto;
    private javax.swing.JPanel panUsuario;
    // End of variables declaration//GEN-END:variables
}
