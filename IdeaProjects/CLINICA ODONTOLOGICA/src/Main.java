import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame {
    private JTextField txtNombre;
    private JTextField txttratamientos;
    private JButton btnAgregarPaciente;
    private JTextArea txtAreaPacientes;
    public Interfaz Clinicaodontológica(){
// Configuración de la ventana principal
        setTitle("Clínica odontologica");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
// Panel para los campos de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(2, 2));
        panelEntrada.add(new JLabel("Nombre del paciente:"));
        txtNombre = new JTextField();
        panelEntrada.add(txtNombre);
        panelEntrada.add(new JLabel("tratamiento del paciente:"));
        txtNombre = new JTextField();
        panelEntrada.add(txttratamientos);
        add(panelEntrada, BorderLayout.NORTH);
// Botón para agregar pacientes
        btnAgregarPaciente = new JButton("Agregar Paciente");
        btnAgregarPaciente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarPaciente();;;;;
            }
        });
        add(btnAgregarPaciente, BorderLayout.CENTER);
// Área de texto para mostrar la lista de pacientes
        txtAreaPacientes = new JTextArea();
        txtAreaPacientes.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaPacientes);
        add(scrollPane, BorderLayout.SOUTH);
        return null;
    }
    private void agregarPaciente() {
        String nombre = txtNombre.getText();
        Label txttratamiento = null;
        String tratamiento = txttratamiento.getText();
        if (!nombre.isEmpty() && !tratamiento.isEmpty()) {
            // Agregar el paciente a la lista y mostrarlo en el área de texto
            txtAreaPacientes.append("Nombre: " + nombre + ", tratamiento: " + tratamiento + "\n");



// Aquí puedes agregar la lógica para guardar el paciente en la base de datoso en la memoria
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el nombre y el tratamiento del paciente.");
        }
// Limpiar los campos de entrada después de agregar el paciente
        txtNombre.setText("");
        txttratamiento.setText("");
    }
    public static void main(String[] args) {
        // Crear y mostrar la interfaz de usuario
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazClinicaodontologica().setVisible ();
            }
        });
    }

    private class Interfaz {
    }
}

