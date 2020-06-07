package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;

public class Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setTitle("Dashboard");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 671, 500);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnQuanLySV = new JButton("QUẢN LÝ SINH VIÊN");
		btnQuanLySV.setBackground(UIManager.getColor("ColorChooser.background"));
		btnQuanLySV.setBorder(new LineBorder(new Color(160, 160, 160), 2, true));
		btnQuanLySV.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnQuanLySV.setBounds(29, 100, 289, 35);
		contentPane.add(btnQuanLySV);
		
		JButton btnQuanLyTKB = new JButton("QUẢN LÝ THỜI KHÓA BIỂU");
		btnQuanLyTKB.setBackground(UIManager.getColor("ColorChooser.background"));
		btnQuanLyTKB.setBorder(new LineBorder(SystemColor.controlShadow, 2, true));
		btnQuanLyTKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnQuanLyTKB.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnQuanLyTKB.setBounds(29, 171, 289, 35);
		contentPane.add(btnQuanLyTKB);
		
		JButton btnDanhSachLop = new JButton("DANH SÁCH LỚP");
		btnDanhSachLop.setBackground(UIManager.getColor("ColorChooser.background"));
		btnDanhSachLop.setBorder(new LineBorder(SystemColor.controlShadow, 2, true));
		btnDanhSachLop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDanhSachLop.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDanhSachLop.setBounds(29, 239, 289, 35);
		contentPane.add(btnDanhSachLop);
		
		JButton btnQuanLyDiem = new JButton("QUẢN LÝ ĐIỂM");
		btnQuanLyDiem.setBackground(UIManager.getColor("ColorChooser.background"));
		btnQuanLyDiem.setBorder(new LineBorder(SystemColor.controlShadow, 2, true));
		btnQuanLyDiem.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnQuanLyDiem.setBounds(29, 305, 289, 35);
		contentPane.add(btnQuanLyDiem);
		
		JButton btnQuanLyPK = new JButton("QUẢN LÝ PHÚC KHẢO");
		btnQuanLyPK.setBackground(UIManager.getColor("ColorChooser.background"));
		btnQuanLyPK.setBorder(new LineBorder(SystemColor.controlShadow, 2, true));
		btnQuanLyPK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuanLyPK.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnQuanLyPK.setBounds(29, 368, 289, 35);
		contentPane.add(btnQuanLyPK);
		
		JButton btnXemDiem = new JButton("XEM ĐIỂM");
		btnXemDiem.setBackground(UIManager.getColor("ColorChooser.background"));
		btnXemDiem.setEnabled(false);
		btnXemDiem.setBorder(new LineBorder(SystemColor.controlShadow, 2, true));
		btnXemDiem.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnXemDiem.setBounds(352, 100, 289, 35);
		contentPane.add(btnXemDiem);
		
		JButton btnDangKiPK = new JButton("ĐĂNG KÍ PHÚC KHẢO");
		btnDangKiPK.setBackground(UIManager.getColor("ColorChooser.background"));
		btnDangKiPK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDangKiPK.setEnabled(false);
		btnDangKiPK.setBorder(new LineBorder(SystemColor.controlShadow, 2, true));
		btnDangKiPK.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDangKiPK.setBounds(352, 171, 289, 35);
		contentPane.add(btnDangKiPK);
		
		JButton btnDoiMatKhau = new JButton("Đổi mật khẩu");
		btnDoiMatKhau.setBackground(UIManager.getColor("ColorChooser.background"));
		btnDoiMatKhau.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnDoiMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDoiMatKhau.setBounds(352, 23, 134, 35);
		contentPane.add(btnDoiMatKhau);
		
		JButton btnDangXuat = new JButton("Đăng xuất");
		btnDangXuat.setBackground(UIManager.getColor("ColorChooser.background"));
		btnDangXuat.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnDangXuat.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnDangXuat.setBounds(507, 23, 134, 35);
		contentPane.add(btnDangXuat);
	}
}
