package br.com.newproject.telas.cadastros;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.connection.Conexao;
import br.com.newproject.model.Estabelecimento;
import br.com.newproject.telas.Principal;

public class Cadastro_Estabelecimento extends JFrame {

	private JPanel contentPane;
	private JTextField textEndEst;
	private JTextField textRazaoEst;
	private JTextField textNomeEst;
	private JTextField textCod;
	private JTextField textCpf_Cnpj;
	private JTextField textEmailEst;
	private JTextField textInscrEst;
	private JTextField textCepEst;
	private JTextField textTelefoneEst;
	private JTextField textInsrMuniEst;
	private JTextField textBairroEst;
	private JTextField textNumeroEst;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Estabelecimento frame = new Cadastro_Estabelecimento();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cadastro_Estabelecimento() {
		
		super("Cadastro de Estabelecimento");
		
		this.setFocusableWindowState(true);
		
		ImageIcon icone = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image imagemIcone = icone.getImage();
		Image imagemPowerIcone = imagemIcone.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		setIconImage(imagemPowerIcone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 980, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCadastroDeEstabelecimento = DefaultComponentFactory.getInstance().createTitle("Cadastro de Estabelecimento");
		lblCadastroDeEstabelecimento.setBounds(11, 11, 643, 59);
		lblCadastroDeEstabelecimento.setFont(new Font("Dialog", Font.BOLD, 46));
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(11, 108, 56, 21);
		lblCodigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(11, 159, 46, 21);
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblRazao = new JLabel("Raz\u00E3o:");
		lblRazao.setBounds(11, 210, 49, 21);
		lblRazao.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblEnd = new JLabel("Endere\u00E7o");
		lblEnd.setBounds(11, 259, 83, 21);
		lblEnd.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblCpc_Cnpj = new JLabel("CPF/CNPJ:");
		lblCpc_Cnpj.setBounds(276, 108, 83, 21);
		lblCpc_Cnpj.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblEmail = new JLabel("Cidade:");
		lblEmail.setBounds(11, 358, 56, 21);
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(476, 358, 54, 21);
		lblEstado.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblEmail_1 = new JLabel("Email:");
		lblEmail_1.setBounds(11, 409, 44, 21);
		lblEmail_1.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblInscricaoEstadual = new JLabel("Inscri\u00E7\u00E3o Estadual:");
		lblInscricaoEstadual.setBounds(11, 460, 131, 21);
		lblInscricaoEstadual.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textEndEst = new JTextField();
		textEndEst.setBounds(160, 253, 515, 33);
		textEndEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textEndEst.setColumns(10);
		
		textRazaoEst = new JTextField();
		textRazaoEst.setBounds(160, 204, 515, 33);
		textRazaoEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textRazaoEst.setColumns(10);
		
		textNomeEst = new JTextField();
		textNomeEst.setBounds(160, 153, 515, 33);
		textNomeEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNomeEst.setColumns(10);
		
		textCod = new JTextField();
		textCod.setBounds(160, 102, 104, 33);
		textCod.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCod.setColumns(10);
		textCod.setEditable(false);
		
		textCpf_Cnpj = new JTextField();
		textCpf_Cnpj.setBounds(371, 102, 304, 33);
		textCpf_Cnpj.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCpf_Cnpj.setColumns(10);
		
		textEmailEst = new JTextField();
		textEmailEst.setBounds(160, 403, 304, 33);
		textEmailEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textEmailEst.setColumns(10);
		
		textInscrEst = new JTextField();
		textInscrEst.setBounds(160, 454, 304, 33);
		textInscrEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textInscrEst.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(476, 314, 55, 16);
		lblBairro.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JComboBox comboBoxEstadoEst = new JComboBox();
		comboBoxEstadoEst.setBounds(633, 353, 279, 31);
		comboBoxEstadoEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(687, 261, 64, 16);
		lblNumero.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(476, 411, 72, 16);
		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("CEP:");
		lblNewLabel.setBounds(11, 314, 55, 16);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textCepEst = new JTextField();
		textCepEst.setBounds(160, 306, 304, 33);
		textCepEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCepEst.setColumns(10);
		
		JLabel lblInscrioMunicipal = new JLabel("Inscri\u00E7\u00E3o Municipal:");
		lblInscrioMunicipal.setBounds(476, 462, 145, 16);
		lblInscrioMunicipal.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textTelefoneEst = new JTextField();
		textTelefoneEst.setBounds(633, 403, 279, 33);
		textTelefoneEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textTelefoneEst.setColumns(10);
		
		textInsrMuniEst = new JTextField();
		textInsrMuniEst.setBounds(633, 454, 279, 33);
		textInsrMuniEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textInsrMuniEst.setColumns(10);
		
		textBairroEst = new JTextField();
		textBairroEst.setBounds(633, 306, 279, 33);
		textBairroEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textBairroEst.setColumns(10);
		
		textNumeroEst = new JTextField();
		textNumeroEst.setBounds(763, 253, 149, 33);
		textNumeroEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNumeroEst.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(lblCadastroDeEstabelecimento);
		contentPane.add(lblEmail);
		contentPane.add(lblBairro);
		contentPane.add(lblNewLabel);
		contentPane.add(textBairroEst);
		contentPane.add(lblInscricaoEstadual);
		contentPane.add(textInscrEst);
		contentPane.add(lblInscrioMunicipal);
		contentPane.add(textInsrMuniEst);
		contentPane.add(lblCodigo);
		contentPane.add(lblNome);
		contentPane.add(lblRazao);
		contentPane.add(lblEnd);
		contentPane.add(lblCpc_Cnpj);
		contentPane.add(textEndEst);
		contentPane.add(textRazaoEst);
		contentPane.add(textNomeEst);
		contentPane.add(textCod);
		contentPane.add(textCpf_Cnpj);
		contentPane.add(lblNumero);
		contentPane.add(textCepEst);
		contentPane.add(lblEstado);
		contentPane.add(textNumeroEst);
		contentPane.add(lblEmail_1);
		contentPane.add(textEmailEst);
		contentPane.add(comboBoxEstadoEst);
		contentPane.add(lblTelefone);
		contentPane.add(textTelefoneEst);
		
		JComboBox comboBoxCidadeEst = new JComboBox();
		comboBoxCidadeEst.setBounds(160, 355, 304, 31);
		contentPane.add(comboBoxCidadeEst);
		
		ImageIcon iconG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		Image imaG = iconG.getImage();
		Image imagemG = imaG.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoG = new ImageIcon(imagemG);
		
		JButton btnGuardar = new JButton("Salvar", icoG);
		btnGuardar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Estabelecimento est = new Estabelecimento();
				
				est.setEndereco(textEndEst.getText());
				est.setRazao(textRazaoEst.getText());
				est.setNome(textNomeEst.getText());
				est.setCnpj(textCpf_Cnpj.getText());
				est.setEmail(textEmailEst.getText());
				est.setInsc_estadual(textInscrEst.getText());
				est.setCep(textCepEst.getText());
				est.setTelefone(textTelefoneEst.getText());
				est.setInsc_municipal(textInsrMuniEst.getText());
				est.setBairro(textBairroEst.getText());
				est.setNumero(textNumeroEst.getText());
				
				try {
					Conexao.guardar(est);
				}catch(NullPointerException f) {
					JOptionPane.showMessageDialog(null,"Ops.. Deve ter faltado preencher algo ai moral: \n" +f);
				}
				catch(Exception npe){
					JOptionPane.showMessageDialog(null, "Ops.. Algo deu errado: \n" +npe);
				}
				
				textEndEst.setText("");
				textRazaoEst.setText("");
				textNomeEst.setText("");
				textCod.setText("");
				textCpf_Cnpj.setText("");
				textEmailEst.setText("");
				textInscrEst.setText("");
				textCepEst.setText("");
				textTelefoneEst.setText("");
				textInsrMuniEst.setText("");
				textBairroEst.setText("");
				textNumeroEst.setText("");
				
				JOptionPane.showMessageDialog(null, "Estabelecimento Cadastrado!");
			}
		});
		btnGuardar.setBounds(288, 543, 105, 32);
		contentPane.add(btnGuardar);
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnLimpar = new JButton("Limpar", icoL);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textEndEst.setText("");
				textRazaoEst.setText("");
				textNomeEst.setText("");
				textCod.setText("");
				textCpf_Cnpj.setText("");
				textEmailEst.setText("");
				textInscrEst.setText("");
				textCepEst.setText("");
				textTelefoneEst.setText("");
				textInsrMuniEst.setText("");
				textBairroEst.setText("");
				textNumeroEst.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnLimpar.setBounds(405, 543, 105, 32);
		contentPane.add(btnLimpar);
		
		ImageIcon iconV = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/back.png"));
		Image imaV = iconV.getImage();
		Image imagemV = imaV.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoV = new ImageIcon(imagemV);
		
		JButton btnVoltar = new JButton("Voltar", icoV);
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Principal frame = new Principal();
				frame.setVisible(true);
				Cadastro_Estabelecimento.this.dispose();
			}
		});
		btnVoltar.setBounds(522, 543, 105, 32);
		contentPane.add(btnVoltar);
	}
}
