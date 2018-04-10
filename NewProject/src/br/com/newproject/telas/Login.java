package br.com.newproject.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.connection.Conexao;
import br.com.newproject.model.Operador;
import br.com.newproject.model.Tipo;

import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField TextPass;

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
		
		Conexao.iniciarFabrica();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(680, 280, 640, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		List<Operador> Operas = Conexao.listarOpe();
		String[] Operadores = new String[Operas.size()];
		for(int i = 0; i < Operas.size(); i++) {
			Operadores[i] = Operas.get(i).getNome();
		}
		
		JLabel lblSsestoque = DefaultComponentFactory.getInstance().createTitle("SS-ESTOQUE");
		lblSsestoque.setBounds(110, 11, 414, 65);
		lblSsestoque.setFont(new Font("Bookman Old Style", Font.BOLD, 55));
		
		TextPass = new JPasswordField();
		TextPass.setBounds(186, 209, 254, 33);
		
		JLabel lblOperador = new JLabel("Operador.:");
		lblOperador.setBounds(93, 157, 75, 21);
		lblOperador.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblSenha = new JLabel("Senha.:");
		lblSenha.setBounds(115, 213, 53, 21);
		lblSenha.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblAlphaVersion = DefaultComponentFactory.getInstance().createTitle("Alpha Version");
		lblAlphaVersion.setBounds(270, 356, 88, 19);
		lblAlphaVersion.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JComboBox comboBoxOpers = new JComboBox(Operadores);
		comboBoxOpers.setBounds(186, 153, 254, 33);
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/enter.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnEntrar = new JButton("Entrar", icoL);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String operador = comboBoxOpers.getSelectedItem().toString();
				String senha = TextPass.getText();
				
				List<Operador> opers = Conexao.listarOpe();
				
				String[] auxN = new String[opers.size()];
				String[] auxS = new String[opers.size()];
				for(int i=0; i < opers.size();i++) {
					auxN[i] = opers.get(i).getNome();
					auxS[i] = opers.get(i).getSenha();
					if(operador.equals(auxN[i]) && senha.equals(auxS[i])){
						Principal frame = new Principal();
						frame.setVisible(true);
						frame.setResizable(false);
						Login.this.dispose();
						break;
					}
				}
				
				
				//JOptionPane.showMessageDialog(null, "Senha incorreta para operador selecionado..");
			
				
			}
		});
		btnEntrar.setBounds(186, 260, 108, 32);
		btnEntrar.setFont(new Font("Dialog", Font.BOLD, 14));
		contentPane.setLayout(null);
		
		ImageIcon iconC = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaC = iconC.getImage();
		Image imagemC = imaC.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoC = new ImageIcon(imagemC);
		
		JButton btnNewButton = new JButton("Limpar",icoC);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TextPass.setText("");
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBounds(332, 260, 108, 32);
		contentPane.add(btnNewButton);
		contentPane.add(lblSsestoque);
		contentPane.add(lblOperador);
		contentPane.add(lblSenha);
		contentPane.add(TextPass);
		contentPane.add(btnEntrar);
		contentPane.add(lblAlphaVersion);
		
		
		contentPane.add(comboBoxOpers);
	}
}
