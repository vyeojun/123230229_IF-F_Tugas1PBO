/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class HalamanLogin extends JFrame implements ActionListener {
    JLabel tulisan = new JLabel("Enih, Halaman Login");
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
 
    
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordTextField = new JPasswordField();

    JButton tombolLogin = new JButton("Login");
    JButton tombolReset = new JButton("Reset");  
    

    HalamanLogin() {
        setVisible(true); 
        setSize(720, 480);
        setTitle("Ini halaman Login yaw");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(tulisan);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameTextField);
        add(passwordTextField);
        add(tombolLogin);
        add(tombolReset);
        
        // Ubah warna background untuk input username & password
        usernameTextField.setBackground(Color.decode("#BCCCDC")); 
        passwordTextField.setBackground(Color.decode("#BCCCDC")); 

        // Ubah warna teks di dalam input field
        usernameTextField.setForeground(Color.decode("#102C57")); 
        passwordTextField.setForeground(Color.decode("#102C57")); 


         // mau ganti warna button 
        tombolLogin.setBackground(Color.decode("#D9EAFD"));
        tombolReset.setBackground(Color.decode("#BCCCDC"));
        
       
        // mau ganti tulisan di dalam button
        tombolLogin.setForeground(Color.decode("#102C57"));
        tombolReset.setForeground(Color.decode("#102C57"));

        tulisan.setBounds(210, 20, 150, 24);
        usernameLabel.setBounds(20, 84, 440, 12);
        passwordLabel.setBounds(20, 152, 440, 12);
        usernameTextField.setBounds(18, 100, 440, 32);
        passwordTextField.setBounds(18, 170, 440, 32);
        tombolLogin.setBounds(50, 220, 200, 32);
        tombolReset.setBounds(50, 280, 200, 32);

        tombolLogin.addActionListener(this);
        tombolReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == tombolLogin) {
                String username = usernameTextField.getText();
                char[] passwordChar = passwordTextField.getPassword();
                String password = new String(passwordChar);

                if (username.equals("229") && password.equals("229")) {
                    System.out.println("Sukses");
                    JOptionPane.showMessageDialog(this, "yippie, selamat ya login berhasil!");
                    
                    new HalamanUtama (username);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "wupsie, Username atau password kamu salah :/");
                }
            } else if (e.getSource() == tombolReset) {
                usernameTextField.setText("");
                passwordTextField.setText("");
            }
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new HalamanLogin();
    }
    }
