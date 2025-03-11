/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

import javax.swing.*;

/**
 *
 * @author HP
 */
class HalPembelian extends JFrame {
    // Konstruktor halaman pembelian
    public HalPembelian (String kategori, int harga) {
        setTitle("Pembelian DVD"); // Mengatur judul frame
        setSize(400, 250); // Mengatur ukuran frame
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Menutup hanya halaman ini saat ditutup
        setLayout(null);

        // Menampilkan kategori DVD yang dipilih
        JLabel kategoriLabel = new JLabel("Kategori: " + kategori);
        kategoriLabel.setBounds(20, 20, 200, 25);
        add(kategoriLabel);

        // Menampilkan harga per DVD
        JLabel hargaLabel = new JLabel("Harga per DVD: Rp" + harga);
        hargaLabel.setBounds(20, 50, 200, 25);
        add(hargaLabel);

        // Input jumlah pembelian DVD
        JLabel jumlahLabel = new JLabel("Jumlah:");
        jumlahLabel.setBounds(20, 80, 100, 25);
        add(jumlahLabel);

        JTextField jumlahField = new JTextField();
        jumlahField.setBounds(100, 80, 50, 25);
        add(jumlahField);

        // Tombol untuk membeli DVD
        JButton beliButton = new JButton("Beli");
        beliButton.setBounds(20, 120, 100, 30);
        add(beliButton);

        // Label untuk menampilkan total harga
        JLabel totalLabel = new JLabel();
        totalLabel.setBounds(20, 160, 300, 25);
        add(totalLabel);
        


        // Event handler untuk tombol beli
        beliButton.addActionListener(e -> {
            try {
                int jumlah = Integer.parseInt(jumlahField.getText()); // Mengambil jumlah yang dimasukkan
                if (jumlah <= 0) {
                    throw new NumberFormatException(); // Jika jumlah kurang dari 1, lempar error
                }
                double total = jumlah * harga * 1.11; // Menghitung total harga dengan PPN 11%
                totalLabel.setText("Total Harga: Rp" + (int) total);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Masukkan jumlah yang valid!");
            }
        });

        setVisible(true);
    }
}

