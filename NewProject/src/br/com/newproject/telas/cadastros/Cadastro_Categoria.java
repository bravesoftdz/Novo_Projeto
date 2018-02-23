package br.com.newproject.telas.cadastros;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.telas.Principal;

import java.awt.Font;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;

public class Cadastro_Categoria extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Categoria frame = new Cadastro_Categoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cadastro_Categoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCadastroDeCategoria = DefaultComponentFactory.getInstance().createTitle("Cadastro de Categoria");
		lblCadastroDeCategoria.setFont(new Font("Dialog", Font.BOLD, 40));
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textCodigo = new JTextField();
		textCodigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCodigo.setColumns(10);
		
		textNome = new JTextField();
		textNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNome.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JTextArea CategoriasCadastradas = new JTextArea();
		CategoriasCadastradas.setBackground(new Color(220, 220, 220));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(6, 300, 35, 35);
		ImageIcon icon = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image ima = icon.getImage();
		Image imagem = ima.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT);
		Icon ico = new ImageIcon(imagem);
		lblLogo.setIcon(ico);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		JLabel lblHora = new JLabel(dtf.format(now));
		lblHora.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JLabel lblCategoriasCadastradas = DefaultComponentFactory.getInstance().createTitle("Categorias Cadastradas");
		lblCategoriasCadastradas.setFont(new Font("Dialog", Font.BOLD, 18));
		
		ImageIcon iconG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		Image imaG = iconG.getImage();
		Image imagemG = imaG.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoG = new ImageIcon(imagemG);
		
		JButton btnNewButton = new JButton("Salvar", icoG);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnNewButton_1 = new JButton("Limpar", icoL);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconV = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/back.png"));
		Image imaV = iconV.getImage();
		Image imagemV = imaV.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoV = new ImageIcon(imagemV);
		
		JButton btnNewButton_2 = new JButton("Voltar", icoV);
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 14));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCadastroDeCategoria, GroupLayout.PREFERRED_SIZE, 435, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNome)
										.addComponent(lblTipo)
										.addComponent(lblCodigo))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
										.addComponent(textNome, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCategoriasCadastradas)
								.addComponent(CategoriasCadastradas, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(64)
							.addComponent(btnNewButton)
							.addGap(18)
							.addComponent(btnNewButton_1)
							.addGap(18)
							.addComponent(btnNewButton_2)
							.addPreferredGap(ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
							.addComponent(lblHora)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblLogo)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblCadastroDeCategoria)
						.addComponent(lblCategoriasCadastradas))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCodigo))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNome)
								.addComponent(textNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTipo)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(CategoriasCadastradas, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblHora)
							.addGap(14))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnNewButton)
									.addComponent(btnNewButton_1)
									.addComponent(btnNewButton_2))
								.addComponent(lblLogo))
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
