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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.connection.Conexao;
import br.com.newproject.model.Categoria;
import br.com.newproject.model.ModeloJTableCategoria;
import br.com.newproject.model.ModeloJTableProduto;
import br.com.newproject.model.Produto;
import br.com.newproject.model.Tipo;
import br.com.newproject.telas.Principal;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;

public class Cadastro_Categoria_Aux extends JFrame {

	private JPanel contentPane;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTable tableCategs;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Categoria_Aux frame = new Cadastro_Categoria_Aux();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Cadastro_Categoria_Aux() {
		
		super("Cadastro de Categoria");
		
		this.setFocusableWindowState(true);
		
		List<Tipo> tipos = Conexao.listarTipo();
		String[] tp_test = new String[tipos.size()];
		for(int i = 0; i < tipos.size(); i++) {
			tp_test[i] = tipos.get(i).getNome();
		}
		
		ImageIcon icone = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image imagemIcone = icone.getImage();
		Image imagemPowerIcone = imagemIcone.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		setIconImage(imagemPowerIcone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 980, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblCadastroDeCategoria = DefaultComponentFactory.getInstance().createTitle("Cadastro de Categoria");
		lblCadastroDeCategoria.setBounds(11, 11, 493, 57);
		lblCadastroDeCategoria.setFont(new Font("Dialog", Font.BOLD, 46));
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(11, 175, 56, 21);
		lblCodigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(11, 220, 46, 21);
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(11, 264, 35, 21);
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textCodigo = new JTextField();
		textCodigo.setBounds(85, 169, 142, 33);
		textCodigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCodigo.setColumns(10);
		textCodigo.setEditable(false);
		
		textNome = new JTextField();
		textNome.setBounds(85, 214, 252, 33);
		textNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNome.setColumns(10);
		
		JComboBox comboBox = new JComboBox(tp_test);
		comboBox.setBounds(85, 259, 170, 31);
		comboBox.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(929, 420, 35, 35);
		ImageIcon icon = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image ima = icon.getImage();
		Image imagem = ima.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT);
		Icon ico = new ImageIcon(imagem);
		lblLogo.setIcon(ico);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		JLabel lblHora = new JLabel(dtf.format(now));
		lblHora.setBounds(823, 431, 100, 18);
		lblHora.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JLabel lblCategoriasCadastradas = DefaultComponentFactory.getInstance().createTitle("Categorias Cadastradas");
		lblCategoriasCadastradas.setBounds(542, 38, 207, 24);
		lblCategoriasCadastradas.setFont(new Font("Dialog", Font.BOLD, 18));
		
		ImageIcon iconG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		Image imaG = iconG.getImage();
		Image imagemG = imaG.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoG = new ImageIcon(imagemG);
		
		JButton btnNewButton = new JButton("Salvar", icoG);
		btnNewButton.setBounds(98, 423, 105, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Categoria c = new Categoria();
				c.setNome(textNome.getText());
				c.setTipo(comboBox.getSelectedItem().toString());
				
				try {
				Conexao.guardar(c);
				}catch(NullPointerException f) {
					JOptionPane.showMessageDialog(null,"Ops.. Deve ter faltado preencher algo ai moral: \n" +f);
				}
				catch(Exception npe){
					JOptionPane.showMessageDialog(null, "Ops.. Algo deu errado: \n" +npe);
				}
				
				textNome.setText("");
				
				JOptionPane.showMessageDialog(null, "Categoria Cadastrada!");
				Cadastro_Produto frame = new Cadastro_Produto();
				frame.setVisible(true);
				frame.setResizable(false);
				Cadastro_Categoria_Aux.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnNewButton_1 = new JButton("Limpar", icoL);
		btnNewButton_1.setBounds(215, 423, 105, 32);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCodigo.setText("");
				textNome.setText("");
				
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconV = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/back.png"));
		Image imaV = iconV.getImage();
		Image imagemV = imaV.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoV = new ImageIcon(imagemV);
		
		JButton btnNewButton_2 = new JButton("Voltar", icoV);
		btnNewButton_2.setBounds(332, 423, 105, 32);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Produto frame = new Cadastro_Produto();
				frame.setVisible(true);
				frame.setResizable(false);
				Cadastro_Categoria_Aux.this.dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 14));
		contentPane.setLayout(null);
		
		tableCategs = new JTable();
		tableCategs.setFont(new Font("Dialog", Font.BOLD, 12));
		tableCategs.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableCategs.setShowVerticalLines(true);
		tableCategs.setShowHorizontalLines(true);
		tableCategs.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tableCategs.setBounds(542, 74, 416, 341);
		
		List<Categoria> categs = Conexao.listarCateg();
		
		ArrayList dados = new ArrayList();
		
		for(int i = 0; i < categs.size(); i++) {
			
			Categoria categ = new Categoria();
			categ.setCodigo(categs.get(i).getCodigo());
			categ.setNome(categs.get(i).getNome());
			categ.setTipo(categs.get(i).getTipo());
			dados.add(categ);
		}
		
		ModeloJTableCategoria modelo = new ModeloJTableCategoria(dados);
		
		tableCategs.setModel(modelo);
		tableCategs.getColumnModel().getColumn(0).setPreferredWidth(30);
		tableCategs.getColumnModel().getColumn(0).setResizable(false);
		tableCategs.getColumnModel().getColumn(1).setPreferredWidth(130);
		tableCategs.getColumnModel().getColumn(1).setResizable(false);
		tableCategs.getColumnModel().getColumn(2).setPreferredWidth(130);
		tableCategs.getColumnModel().getColumn(2).setResizable(false);
		
		JScrollPane scrollPane = new JScrollPane(tableCategs);
		scrollPane.setBounds(542, 74, 416, 341);
		contentPane.add(scrollPane);
		//contentPane.add(tableCategs);
		contentPane.add(lblCadastroDeCategoria);
		contentPane.add(lblNome);
		contentPane.add(lblTipo);
		contentPane.add(lblCodigo);
		contentPane.add(textCodigo);
		contentPane.add(comboBox);
		contentPane.add(textNome);
		contentPane.add(lblCategoriasCadastradas);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(lblHora);
		contentPane.add(lblLogo);
	}
}
