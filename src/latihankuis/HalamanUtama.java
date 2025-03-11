/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class HalamanUtama extends JFrame implements ActionListener {
    JLabel LabelSelamatDatang = new JLabel();
    JLabel LabelPilihanMenu = new JLabel("Silahkan pilih DVD yang akan dibeli ");
    JButton anakButton = new JButton("DVD Anak");
    JButton dewasaButton = new JButton("DVD Dewasa");
    JButton lansiaButton = new JButton("DVD Lansia");
    JButton logoutButton = new JButton("Logout");

    // Perbaikan: Konstruktor menerima parameter `username`
    HalamanUtama(String username) {
        setTitle("INI HOME");
        setSize(720, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);

        // Menampilkan pesan selamat datang dengan username
        LabelSelamatDatang.setText("Selamat Datang " + username + " Anomali");
        LabelSelamatDatang.setFont(new Font("Times New Roman", Font.BOLD, 24));
        LabelSelamatDatang.setBounds(20, 40, 600, 30);

        LabelPilihanMenu.setFont(new Font("Arial", Font.PLAIN, 14));
        LabelPilihanMenu.setBounds(20, 80, 300, 30);

        anakButton.setBounds(20, 150, 150, 30);
        dewasaButton.setBounds(220, 150, 150, 30);
        lansiaButton.setBounds(420, 150, 150, 30);
        logoutButton.setBounds(20, 300, 150, 30);

        // Menambahkan ActionListener
        anakButton.addActionListener(this);
        dewasaButton.addActionListener(this);
        lansiaButton.addActionListener(this);
        logoutButton.addActionListener(this);

        // Menambahkan komponen ke frame
        add(LabelSelamatDatang);
        add(LabelPilihanMenu);
        add(anakButton);
        add(dewasaButton);
        add(lansiaButton);
        add(logoutButton);

        // Tampilkan frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logoutButton) {
            new HalamanLogin();  
            dispose();
        } else if (e.getSource() == anakButton) {
            new HalamanPembelian("DVD Anak", 27891);
            dispose();
        } else if (e.getSource() == dewasaButton) {
            new HalamanPembelian("DVD Dewasa", 35396);
            dispose();
        } else if (e.getSource() == lansiaButton) {
            new HalamanPembelian("DVD Lansia", 38550);
            dispose();
        }
    }
}
