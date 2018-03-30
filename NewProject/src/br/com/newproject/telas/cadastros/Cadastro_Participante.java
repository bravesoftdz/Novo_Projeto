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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.connection.Conexao;
import br.com.newproject.model.Participante;
import br.com.newproject.telas.Principal;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Cadastro_Participante extends JFrame {

	private JPanel contentPane;
	private JTextField textInscrMunic;
	private JTextField textInscrEst;
	private JTextField textRazaoSocial;
	private JTextField textNome;
	private JTextField textCod;
	private JTextField textEndereco;
	private JTextField textComplemento;
	private JTextField textCep;
	private JTextField textCpfCnpj;
	private JTextField textNumero;
	private JTextField textBairro;
	private String tipo[] = {"","Cliente", "Fornecedor", "Cliente/Fornecedor"};
	private String estadosBr[] = {"", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RO", "RS", "RR", "SC", "SE", "SP", "TO"};
	private JTextField textFone;
	private JTextField textEmail;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Participante frame = new Cadastro_Participante();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cadastro_Participante() {
		
		super("Cadastro de Participante");
		
		ImageIcon icone = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image imagemIcone = icone.getImage();
		Image imagemPowerIcone = imagemIcone.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		setIconImage(imagemPowerIcone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCadastroDeParticipante = DefaultComponentFactory.getInstance().createTitle("Cadastro de Participante");
		lblCadastroDeParticipante.setBounds(11, 11, 553, 52);
		lblCadastroDeParticipante.setFont(new Font("Dialog", Font.BOLD, 46));
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(11, 110, 56, 21);
		lblCodigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(11, 161, 46, 21);
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblRazaoSocial = new JLabel("Razao Social:");
		lblRazaoSocial.setBounds(11, 212, 97, 21);
		lblRazaoSocial.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblInscrEst = new JLabel("Inscricao Estadual:");
		lblInscrEst.setBounds(11, 263, 131, 21);
		lblInscrEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblInscrMunic = new JLabel("Inscricao Municipal:");
		lblInscrMunic.setBounds(481, 263, 141, 21);
		lblInscrMunic.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblEndereco = new JLabel("Endereco:");
		lblEndereco.setBounds(11, 314, 72, 21);
		lblEndereco.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblComplemento = new JLabel("Complemento:");
		lblComplemento.setBounds(11, 365, 102, 21);
		lblComplemento.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(11, 416, 56, 21);
		lblCidade.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblCep = new JLabel("Cep:");
		lblCep.setBounds(609, 416, 34, 21);
		lblCep.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textInscrMunic = new JTextField();
		textInscrMunic.setBounds(654, 257, 304, 33);
		textInscrMunic.setFont(new Font("Dialog", Font.PLAIN, 16));
		textInscrMunic.setColumns(10);
		
		textInscrEst = new JTextField();
		textInscrEst.setBounds(165, 257, 304, 33);
		textInscrEst.setFont(new Font("Dialog", Font.PLAIN, 16));
		textInscrEst.setColumns(10);
		
		textRazaoSocial = new JTextField();
		textRazaoSocial.setBounds(165, 206, 304, 33);
		textRazaoSocial.setFont(new Font("Dialog", Font.PLAIN, 16));
		textRazaoSocial.setColumns(10);
		
		textNome = new JTextField();
		textNome.setBounds(165, 155, 304, 33);
		textNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNome.setColumns(10);
		
		textCod = new JTextField();
		textCod.setBounds(165, 104, 104, 33);
		textCod.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCod.setColumns(10);
		textCod.setEditable(false);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(165, 308, 380, 33);
		textEndereco.setFont(new Font("Dialog", Font.PLAIN, 16));
		textEndereco.setColumns(10);
		
		textComplemento = new JTextField();
		textComplemento.setBounds(165, 359, 304, 33);
		textComplemento.setFont(new Font("Dialog", Font.PLAIN, 16));
		textComplemento.setColumns(10);
		
		textCep = new JTextField();
		textCep.setBounds(654, 410, 149, 33);
		textCep.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCep.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(481, 161, 35, 21);
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblCpfCnpj = new JLabel("CPF/CNPJ:");
		lblCpfCnpj.setBounds(481, 212, 83, 21);
		lblCpfCnpj.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textCpfCnpj = new JTextField();
		textCpfCnpj.setBounds(654, 206, 304, 33);
		textCpfCnpj.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCpfCnpj.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(557, 314, 65, 21);
		lblNumero.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(481, 365, 47, 21);
		lblBairro.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(354, 416, 54, 21);
		lblEstado.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textNumero = new JTextField();
		textNumero.setBounds(654, 308, 104, 33);
		textNumero.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNumero.setColumns(10);
		
		textBairro = new JTextField();
		textBairro.setBounds(654, 359, 304, 33);
		textBairro.setFont(new Font("Dialog", Font.PLAIN, 16));
		textBairro.setColumns(10);
		
		JComboBox comboBoxTipo = new JComboBox(tipo);
		comboBoxTipo.setBounds(654, 156, 177, 31);
		comboBoxTipo.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBoxTipo.setEditable(false);
		
		JComboBox comboBoxEstado = new JComboBox(estadosBr);
		comboBoxEstado.setBounds(420, 411, 177, 31);
		comboBoxEstado.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBoxEstado.setEditable(false);
		
		JComboBox comboBoxCidade = new JComboBox();
		comboBoxCidade.setBounds(165, 411, 177, 31);
		comboBoxCidade.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBoxCidade.setEditable(false);
		
		ImageIcon iconG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		Image imaG = iconG.getImage();
		Image imagemG = imaG.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoG = new ImageIcon(imagemG);
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnNewButton_1 = new JButton("Limpar", icoL);
		btnNewButton_1.setBounds(403, 530, 105, 32);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textInscrMunic.setText("");
				textInscrEst.setText("");
				textRazaoSocial.setText("");
				textNome.setText("");
				textCod.setText("");
				textEndereco.setText("");
				textComplemento.setText("");
				textCep.setText("");
				textCpfCnpj.setText("");
				textNumero.setText("");
				textBairro.setText("");
				textFone.setText("");
				textEmail.setText("");
				comboBoxTipo.setSelectedItem(tipo[0]);
				comboBoxEstado.setSelectedItem(estadosBr[0]);
				comboBoxCidade.setSelectedItem(0);
				
			}
		});
		
		ImageIcon iconV = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/back.png"));
		Image imaV = iconV.getImage();
		Image imagemV = imaV.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoV = new ImageIcon(imagemV);
		
		JButton btnNewButton_2 = new JButton("Voltar", icoV);
		btnNewButton_2.setBounds(520, 530, 105, 32);
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Participante.this.dispose();
			}
		});
		
		JLabel lblFoto = new JLabel("foto");
		lblFoto.setBounds(963, 542, 35, 33);
		ImageIcon icon = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image ima = icon.getImage();
		Image imagem = ima.getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_DEFAULT);
		Icon ico = new ImageIcon(imagem);
		lblFoto.setIcon(ico);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		
		JLabel lblHora = new JLabel(dtf.format(now));
		lblHora.setBounds(849, 553, 109, 16);
		lblHora.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(481, 469, 72, 16);
		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textFone = new JTextField();
		textFone.setBounds(654, 461, 304, 33);
		textFone.setFont(new Font("Dialog", Font.PLAIN, 16));
		textFone.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(11, 469, 55, 16);
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textEmail = new JTextField();
		textEmail.setBounds(165, 461, 304, 33);
		textEmail.setFont(new Font("Dialog", Font.PLAIN, 16));
		textEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar", icoG);
		btnNewButton.setBounds(286, 531, 105, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
Participante part = new Participante();
				
				part.setInscr_muni(textInscrMunic.getText());
				part.setInscr_esta(textInscrEst.getText());
				part.setRazao(textRazaoSocial.getText());
				part.setNome(textNome.getText());
				part.setEndereco(textEndereco.getText());
				part.setComplemento(textComplemento.getText());
				part.setCep(textCep.getText());
				part.setCpf_cnpj(textCpfCnpj.getText());
				part.setNumero(textNumero.getText());
				part.setBairro(textBairro.getText());
				part.setFone(textFone.getText());
				part.setEmail(textEmail.getText());
				part.setTipo(comboBoxTipo.getSelectedItem().toString());
				part.setEstado(comboBoxEstado.getSelectedItem().toString());
				//part.setCidade(comboBoxCidade.getSelectedItem().toString());
				
				try {
					Conexao.guardar(part);
				}catch(NullPointerException f) {
					JOptionPane.showMessageDialog(null,"Ops.. Deve ter faltado preencher algo ai moral: \n" +f);
				}
				catch(Exception npe){
					JOptionPane.showMessageDialog(null, "Ops.. Algo deu errado: \n" +npe);
				}
					
				textInscrMunic.setText("");
				textInscrEst.setText("");
				textRazaoSocial.setText("");
				textNome.setText("");
				textCod.setText("");
				textEndereco.setText("");
				textComplemento.setText("");
				textCep.setText("");
				textCpfCnpj.setText("");
				textNumero.setText("");
				textBairro.setText("");
				textFone.setText("");
				textEmail.setText("");
				comboBoxTipo.setSelectedItem(tipo[0]);
				comboBoxEstado.setSelectedItem(estadosBr[0]);
				comboBoxCidade.setSelectedItem(0);
				
				JOptionPane.showMessageDialog(null, "Participante Cadastrado!");
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		contentPane.setLayout(null);
		contentPane.add(lblCadastroDeParticipante);
		contentPane.add(lblCodigo);
		contentPane.add(textCod);
		contentPane.add(lblNome);
		contentPane.add(textNome);
		contentPane.add(lblTipo);
		contentPane.add(comboBoxTipo);
		contentPane.add(lblRazaoSocial);
		contentPane.add(textRazaoSocial);
		contentPane.add(lblCpfCnpj);
		contentPane.add(textCpfCnpj);
		contentPane.add(lblInscrEst);
		contentPane.add(textInscrEst);
		contentPane.add(lblInscrMunic);
		contentPane.add(textInscrMunic);
		contentPane.add(lblEndereco);
		contentPane.add(textEndereco);
		contentPane.add(lblNumero);
		contentPane.add(textNumero);
		contentPane.add(lblComplemento);
		contentPane.add(textComplemento);
		contentPane.add(lblBairro);
		contentPane.add(textBairro);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(lblHora);
		contentPane.add(lblFoto);
		contentPane.add(lblCidade);
		contentPane.add(lblTelefone);
		contentPane.add(comboBoxCidade);
		contentPane.add(lblEstado);
		contentPane.add(comboBoxEstado);
		contentPane.add(lblCep);
		contentPane.add(textCep);
		contentPane.add(textFone);
		contentPane.add(lblEmail);
		contentPane.add(textEmail);
		contentPane.add(btnNewButton);
	}
}
