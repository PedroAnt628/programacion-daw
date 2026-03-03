import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploGUI7 extends JFrame implements ActionListener {
    private JButton[][] botones = new JButton[3][3];
    private boolean turnoX = true; // true = X, false = O

    public EjemploGUI7() {
        setTitle("3 en Raya");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 3));
        inicializarBotones();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        // Sólo permitir jugadas cuando es el turno del jugador X
        if (!turnoX) {
            return;
        }
        if (!btn.getText().isEmpty()) {
            return;
        }
        // Jugador coloca X
        btn.setText("X");
        turnoX = false;
        if (hayGanador()) {
            JOptionPane.showMessageDialog(null, "¡Hay ganador!");
            reiniciar();
            return;
        } else if (tableroLleno()) {
            JOptionPane.showMessageDialog(null, "Empate");
            reiniciar();
            return;
        }
        // Turno de la IA
        jugadaIA();
        // Comprobar resultado tras la jugada de la IA
        if (hayGanador()) {
            JOptionPane.showMessageDialog(null, "¡Hay ganador!");
            reiniciar();
            return;
        } else if (tableroLleno()) {
            JOptionPane.showMessageDialog(null, "Empate");
            reiniciar();
            return;
        }
        // Devolver el turno al jugador
        turnoX = true;
    }

    // ---------------- CREAR TABLERO ----------------
    private void inicializarBotones() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j] = new JButton("");
                botones[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                botones[i][j].addActionListener(this);
                add(botones[i][j]);
            }
        }
    }

    private void reiniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[i][j].setText("");
            }
        }
        turnoX = true;
    }

    private boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    // ---------------- LÓGICA DE JUEGO ----------------
    private void jugadaIA() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (botones[i][j].getText().isEmpty()) {
                    botones[i][j].setText("O");
                    return;
                }
            }
        }
    }

    private boolean hayGanador() {
        // Filas
        for (int i = 0; i < 3; i++) {
            if (!botones[i][0].getText().isEmpty() &&
                    botones[i][0].getText().equals(botones[i][1].getText()) &&
                    botones[i][0].getText().equals(botones[i][2].getText())) {
                return true;
            }
        }
        // Columnas
        for (int j = 0; j < 3; j++) {
            if (!botones[0][j].getText().isEmpty() &&
                    botones[0][j].getText().equals(botones[1][j].getText()) &&
                    botones[0][j].getText().equals(botones[2][j].getText())) {
                return true;
            }
        }
        // Diagonales
        if (!botones[0][0].getText().isEmpty() &&
                botones[0][0].getText().equals(botones[1][1].getText()) &&
                botones[0][0].getText().equals(botones[2][2].getText())) {
            return true;
        }
        if (!botones[0][2].getText().isEmpty() &&
                botones[0][2].getText().equals(botones[1][1].getText()) &&
                botones[0][2].getText().equals(botones[2][0].getText())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        new EjemploGUI7().setVisible(true);
    }

}
