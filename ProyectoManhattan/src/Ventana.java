import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField txtFieldIngresarCodigo_Registrar;
    private JTextField txtFieldIngresarNombre_Registrar;
    private JTextField txtFieldIngresarDescripcion_Registrar;
    private JTextField txtFieldIngresarPrecioVenta_Registrar;
    private JTextField txtFieldIngresarPrecioCompra_Registrar;
    private JTextField txtFieldIngresarStock_Registrar;
    private JButton btnAñadirProducto_Registrar;
    private JTextArea textArea1;

    Product aux=new Product();
    List listaux=new List();
    public Ventana(){


        btnAñadirProducto_Registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code=txtFieldIngresarCodigo_Registrar.getText();
                String name=txtFieldIngresarNombre_Registrar.getText();
                String description=txtFieldIngresarDescripcion_Registrar.getText();
                double salePrice=Double.parseDouble(txtFieldIngresarPrecioVenta_Registrar.getText());
                double purchasePrice=Double.parseDouble(txtFieldIngresarPrecioCompra_Registrar.getText());
                int stock=Integer.parseInt(txtFieldIngresarStock_Registrar.getText());
                listaux.addProduct(new Product(code,name,description,salePrice,purchasePrice,stock));
                JOptionPane.showMessageDialog(null,"Se añadio correctamente el producto");
                textArea1.setText(listaux.seeAllProducts());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
