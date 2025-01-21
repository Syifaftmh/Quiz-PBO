import javax.swing.*;
import java.awt.event.ActionEvent;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Aplikasi GUI Sederhana");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Mengatur layout manual

        // Membuat label
        JLabel label = new JLabel("");
        label.setBounds(50, 80, 200, 30); // Mengatur posisi dan ukuran label

        // Membuat tombol
        JButton button = new JButton("Klik Saya");
        button.setBounds(90, 30, 100, 30); // Mengatur posisi dan ukuran tombol

        // Menambahkan ActionListener ke tombol
        button.addActionListener((ActionEvent e) -> {
            label.setText("Tombol telah diklik!");
        });

        // Menambahkan tombol dan label ke frame
        frame.add(button);
        frame.add(label);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
