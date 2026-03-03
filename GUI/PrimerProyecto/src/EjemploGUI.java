import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjemploGUI extends JFrame {
    public EjemploGUI() {
        initComponents();
    }

    private void initComponents() {
        // Configuramos los parámetros de la ventana
        setTitle("Ejemplo de ventana");
        setLocation(200, 500); // setLocationRelativeTo(null);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 2) Crear los componentes
        JLabel etiqueta1 = new JLabel("Primer Numero");
        JTextField campoDeTexto = new JTextField(10);
        JLabel etiqueta2 = new JLabel("Segundo Numero");
        JTextField campoDeTexto2 = new JTextField(10);
        JButton sumar = new JButton("Sumar");
        JButton restar = new JButton("Restar");
        JTextField campoDeTextoResultado = new JTextField(15);
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Vas a sumar");
                int numero1 = Integer.parseInt(campoDeTexto.getText());
                int numero2 = Integer.parseInt(campoDeTexto2.getText());
                campoDeTextoResultado.setText("El reusltado es: " + (numero1+numero2));
            }
        });
        restar.addActionListener(e ->
            campoDeTextoResultado.setText("El resultado es: " + 
            (Integer.parseInt(campoDeTexto.getText()) - Integer.parseInt(campoDeTexto2.getText())))
        );



        // 3) Crear un contenedor
        JPanel panelDeContenido = new JPanel();
        // 4) Asociar los componentes al contenedor
        panelDeContenido.add(etiqueta1);
        panelDeContenido.add(campoDeTexto);
        panelDeContenido.add(etiqueta2);
        panelDeContenido.add(campoDeTexto2);
        panelDeContenido.add(sumar);
        panelDeContenido.add(restar);
        panelDeContenido.add(campoDeTextoResultado);
        // 5) Asociar el contenedor a la ventana
        setContentPane(panelDeContenido);
        // 6) Hacer visible la ventana
        setVisible(true);
    }


    // @Override
    // public void actionPerformed( ActionEvent event){
    //     numClicks++;
    //     campoDeTexto.
    // }



    public static void main(String[] args) {
        EjemploGUI ejemplo = new EjemploGUI();

    }
}
