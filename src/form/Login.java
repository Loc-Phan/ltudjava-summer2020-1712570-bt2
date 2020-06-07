package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JPasswordField;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setForeground(Color.CYAN);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 329);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDangNhap = new JLabel("ĐĂNG NHẬP");
		lblDangNhap.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDangNhap.setHorizontalAlignment(SwingConstants.CENTER);
		lblDangNhap.setBounds(157, 25, 161, 32);
		contentPane.add(lblDangNhap);
		
		JLabel lblTenDangNhap = new JLabel("Tên đăng nhập");
		lblTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblTenDangNhap.setBounds(24, 65, 119, 39);
		contentPane.add(lblTenDangNhap);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(165, 70, 218, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblMatKhau = new JLabel("Mật khẩu");
		lblMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMatKhau.setBounds(24, 117, 119, 39);
		contentPane.add(lblMatKhau);
		
		JCheckBox chckbxGiaoVien = new JCheckBox("  Là giáo viên");
		chckbxGiaoVien.setBackground(SystemColor.controlHighlight);
		chckbxGiaoVien.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxGiaoVien.setBounds(165, 161, 142, 39);
		contentPane.add(chckbxGiaoVien);
		
		JButton btnDangNhap = new JButton("ĐĂNG NHẬP");
		btnDangNhap.setBorder(new LineBorder(SystemColor.activeCaptionBorder, 3, true));
		btnDangNhap.setBackground(UIManager.getColor("ColorChooser.background"));
		btnDangNhap.setForeground(Color.BLACK);
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(165, 209, 153, 32);
		contentPane.add(btnDangNhap);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 122, 218, 30);
		contentPane.add(passwordField);
	}
}
