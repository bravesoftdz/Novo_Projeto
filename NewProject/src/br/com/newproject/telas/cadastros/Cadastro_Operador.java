package br.com.newproject.telas.cadastros;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.connection.Conexao;
import br.com.newproject.model.Operador;
import br.com.newproject.telas.Principal;
import java.awt.Color;

public class Cadastro_Operador extends JFrame {

	private JPanel contentPane;
	private JTextField textConfSenha;
	private JTextField textSenha;
	private JTextField textUsuario;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Operador frame = new Cadastro_Operador();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cadastro_Operador() {
		
		super("Cadastro de Operador");
		
		ImageIcon icone = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image imagemIcone = icone.getImage();
		Image imagemPowerIcone = imagemIcone.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		setIconImage(imagemPowerIcone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCadastroDeOperador = DefaultComponentFactory.getInstance().createTitle("Cadastro de Operador");
		lblCadastroDeOperador.setBounds(11, 11, 515, 52);
		lblCadastroDeOperador.setFont(new Font("Dialog", Font.BOLD, 46));
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(11, 119, 58, 21);
		lblUsuario.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(11, 170, 49, 21);
		lblSenha.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha:");
		lblConfirmarSenha.setBounds(11, 221, 122, 21);
		lblConfirmarSenha.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblPermisses = DefaultComponentFactory.getInstance().createTitle("Permiss\u00F5es");
		lblPermisses.setBounds(11, 274, 104, 24);
		lblPermisses.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JCheckBox chckCadastro = new JCheckBox("Cadastros");
		chckCadastro.setBounds(11, 324, 122, 21);
		chckCadastro.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JCheckBox chckAcoes = new JCheckBox("A\u00E7\u00F5es");
		chckAcoes.setBounds(11, 363, 104, 21);
		chckAcoes.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JCheckBox chckRelatorios = new JCheckBox("Relatorios");
		chckRelatorios.setBounds(150, 324, 147, 21);
		chckRelatorios.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JCheckBox chckConfig = new JCheckBox("Configura\u00E7\u00F5es");
		chckConfig.setBounds(150, 363, 147, 21);
		chckConfig.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textConfSenha = new JTextField();
		textConfSenha.setBounds(150, 215, 225, 33);
		textConfSenha.setFont(new Font("Dialog", Font.PLAIN, 16));
		textConfSenha.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(150, 164, 225, 33);
		textSenha.setFont(new Font("Dialog", Font.PLAIN, 16));
		textSenha.setColumns(10);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(150, 113, 225, 33);
		textUsuario.setFont(new Font("Dialog", Font.PLAIN, 16));
		textUsuario.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblCadastroDeOperador);
		contentPane.add(lblPermisses);
		contentPane.add(chckCadastro);
		contentPane.add(chckAcoes);
		contentPane.add(chckRelatorios);
		contentPane.add(chckConfig);
		contentPane.add(lblConfirmarSenha);
		contentPane.add(lblSenha);
		contentPane.add(lblUsuario);
		contentPane.add(textUsuario);
		contentPane.add(textSenha);
		contentPane.add(textConfSenha);
		
		JTextArea textAreaOperadoresCadas = new JTextArea();
		textAreaOperadoresCadas.setBackground(new Color(220, 220, 220));
		textAreaOperadoresCadas.setFont(new Font("Dialog", Font.PLAIN, 14));
		textAreaOperadoresCadas.setBounds(554, 68, 404, 357);
		textAreaOperadoresCadas.setEditable(false);
		contentPane.add(textAreaOperadoresCadas);
		
		JLabel lblLogo = new JLabel("logo");
		lblLogo.setBounds(923, 429, 35, 32);
		ImageIcon icon = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image ima = icon.getImage();
		Image imagem = ima.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT);
		Icon ico = new ImageIcon(imagem);
		lblLogo.setIcon(ico);
		contentPane.add(lblLogo);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		
		JLabel lblHora = new JLabel(dtf.format(now));
		lblHora.setFont(new Font("Dialog", Font.BOLD, 13));
		lblHora.setBounds(821, 437, 104, 16);
		contentPane.add(lblHora);
		
		JLabel lblUsuarioCadastrados = new JLabel("Usuario Cadastrados");
		lblUsuarioCadastrados.setFont(new Font("Dialog", Font.BOLD, 18));
		lblUsuarioCadastrados.setBounds(554, 40, 188, 16);
		contentPane.add(lblUsuarioCadastrados);
		
		ImageIcon iconG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		Image imaG = iconG.getImage();
		Image imagemG = imaG.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoG = new ImageIcon(imagemG);
		
		JButton btnSalvar = new JButton("Salvar", icoG);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Operador ope = new Operador();
				ope.setNome(textUsuario.getText());
				ope.setSenha(textConfSenha.getText());
				ope.setConfirm_senha(textConfSenha.getText());
				
				try {
					Conexao.guardar(ope);
				}catch(NullPointerException f) {
					JOptionPane.showMessageDialog(null,"Ops.. Deve ter faltado preencher algo ai moral: \n" +f);
				}
				catch(Exception npe){
					JOptionPane.showMessageDialog(null, "Ops.. Algo deu errado: \n" +npe);
				}
				
				textConfSenha.setText("");
				textSenha.setText("");
				textUsuario.setText("");
				
				JOptionPane.showMessageDialog(null, "Operador Cadastrado!");
			}
		});
		btnSalvar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSalvar.setBounds(112, 423, 105, 32);
		contentPane.add(btnSalvar);
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnLimpar = new JButton("Limpar", icoL);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textConfSenha.setText("");
				textSenha.setText("");
				textUsuario.setText("");
			}
		});
		btnLimpar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnLimpar.setBounds(229, 423, 105, 32);
		contentPane.add(btnLimpar);
		
		ImageIcon iconV = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/back.png"));
		Image imaV = iconV.getImage();
		Image imagemV = imaV.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoV = new ImageIcon(imagemV);
		
		JButton btnVoltar = new JButton("Voltar", icoV);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Operador.this.dispose();
			}
		});
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnVoltar.setBounds(346, 423, 105, 32);
		contentPane.add(btnVoltar);
	}
}
