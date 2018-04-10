package br.com.newproject.telas.cadastros;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.connection.Conexao;
import br.com.newproject.model.ModeloJTableTipo;
import br.com.newproject.model.Tipo;
import br.com.newproject.telas.Principal;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;

public class Cadastro_Tipo_Aux2 extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTable tableTipos;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Tipo_Aux2 frame = new Cadastro_Tipo_Aux2();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cadastro_Tipo_Aux2() {
		
		super("Cadastro de Tipos");
		
		this.setFocusableWindowState(true);
		
		ImageIcon icone = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image imagemIcone = icone.getImage();
		Image imagemPowerIcone = imagemIcone.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		setIconImage(imagemPowerIcone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 980, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCadastroDeTipo = DefaultComponentFactory.getInstance().createTitle("Cadastro de Tipo");
		lblCadastroDeTipo.setBounds(11, 11, 454, 64);
		lblCadastroDeTipo.setFont(new Font("Dialog", Font.BOLD, 46));
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(11, 188, 56, 21);
		lblCodigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(11, 233, 46, 21);
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textCodigo = new JTextField();
		textCodigo.setBounds(85, 182, 122, 33);
		textCodigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCodigo.setColumns(10);
		textCodigo.setEditable(false);
		
		textNome = new JTextField();
		textNome.setBounds(85, 227, 239, 33);
		textNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNome.setColumns(10);
		
		JLabel lblTiposCadastrados = new JLabel("Tipos Cadastrados");
		lblTiposCadastrados.setBounds(477, 43, 162, 24);
		lblTiposCadastrados.setFont(new Font("Dialog", Font.BOLD, 18));
		
		ImageIcon iconG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		Image imaG = iconG.getImage();
		Image imagemG = imaG.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoG = new ImageIcon(imagemG);
		
		JButton btnSalvar = new JButton("Salvar", icoG);
		btnSalvar.setBounds(77, 420, 105, 32);
		btnSalvar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tipo t = new Tipo();
				t.setNome(textNome.getText());
				
				try {
					Conexao.guardar(t);
				}catch(NullPointerException f) {
					JOptionPane.showMessageDialog(null,"Ops.. Deve ter faltado preencher algo ai moral: \n" +f);
				}
				catch(Exception npe){
					JOptionPane.showMessageDialog(null, "Ops.. Algo deu errado: \n" +npe);
				}
				
				textNome.setText("");
				
				JOptionPane.showMessageDialog(null, "Tipo Cadastrado!");
				Cadastro_Produto frame = new Cadastro_Produto();
				frame.setVisible(true);
				frame.setResizable(false);
				Cadastro_Tipo_Aux2.this.dispose();
			}
		});
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnLimpar = new JButton("Limpar", icoL);
		btnLimpar.setBounds(194, 420, 105, 32);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCodigo.setText("");
				textNome.setText("");
			}
		});
		btnLimpar.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconV = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/back.png"));
		Image imaV = iconV.getImage();
		Image imagemV = imaV.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoV = new ImageIcon(imagemV);
		
		JButton btnVoltar = new JButton("Voltar", icoV);
		btnVoltar.setBounds(311, 420, 105, 32);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro_Categoria frame = new Cadastro_Categoria();
				frame.setVisible(true);
				frame.setResizable(false);
				Cadastro_Tipo_Aux2.this.dispose();
			}
		});
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 14));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(923, 420, 35, 35);
		ImageIcon icon = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image ima = icon.getImage();
		Image imagem = ima.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT);
		Icon ico = new ImageIcon(imagem);
		lblLogo.setIcon(ico);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		JLabel lblHora = new JLabel(dtf.format(now));
		lblHora.setBounds(819, 428, 100, 18);
		lblHora.setFont(new Font("Dialog", Font.BOLD, 13));
		contentPane.setLayout(null);
		
		List<Tipo> tipos = Conexao.listarTipo();
		
		ArrayList dados = new ArrayList();
		
		for(int i = 0; i < tipos.size(); i++) {
			
			Tipo tipo = new Tipo();
			tipo.setCodigo(tipos.get(i).getCodigo());
			tipo.setNome(tipos.get(i).getNome());
			dados.add(tipo);
		}
		
		ModeloJTableTipo modelo = new ModeloJTableTipo(dados);
		
		tableTipos = new JTable();
		tableTipos.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tableTipos.setFont(new Font("Dialog", Font.BOLD, 12));
		tableTipos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableTipos.setShowVerticalLines(true);
		tableTipos.setShowHorizontalLines(true);
		tableTipos.setBounds(477, 79, 481, 337);
		tableTipos.setModel(modelo);
		tableTipos.getColumnModel().getColumn(0).setPreferredWidth(30);
		tableTipos.getColumnModel().getColumn(0).setResizable(false);
		tableTipos.getColumnModel().getColumn(1).setPreferredWidth(330);
		tableTipos.getColumnModel().getColumn(1).setResizable(false);
		JScrollPane scrollPane = new JScrollPane(tableTipos);
		scrollPane.setBounds(477, 79, 481, 337);
		contentPane.add(scrollPane);
		//contentPane.add(tableTipos);
		contentPane.add(lblNome);
		contentPane.add(lblCodigo);
		contentPane.add(textCodigo);
		contentPane.add(textNome);
		contentPane.add(btnSalvar);
		contentPane.add(btnLimpar);
		contentPane.add(btnVoltar);
		contentPane.add(lblCadastroDeTipo);
		contentPane.add(lblHora);
		contentPane.add(lblLogo);
		contentPane.add(lblTiposCadastrados);
		
	}
}
