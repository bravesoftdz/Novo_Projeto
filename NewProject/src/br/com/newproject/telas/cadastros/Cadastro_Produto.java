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
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.connection.Conexao;
import br.com.newproject.model.Categoria;
import br.com.newproject.model.ModeloJTableProduto;
import br.com.newproject.model.Produto;
import br.com.newproject.model.Tipo;
import br.com.newproject.telas.Principal;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JScrollPane;

@SuppressWarnings({ "serial", "unused" })
public class Cadastro_Produto extends JFrame {

	private JPanel contentPane;
	private JTextField textCod;
	private JTextField textNome;
	private JTextField textUnd;
	private JTextField textEstCrt;
	private JTable tableBreveMov;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Produto frame = new Cadastro_Produto();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public Cadastro_Produto() {
		
		super("Cadastro de Produto");
		
		//this.setEnabled(true);
		
		List<Tipo> tipos = Conexao.listarTipo();
		String[] tp_test = new String[tipos.size()];
		for(int i = 0; i < tipos.size(); i++) {
			tp_test[i] = tipos.get(i).getNome();
		}
		
		List<Categoria> categs = Conexao.listarCateg();
		String[] cat_test = new String[categs.size()];
		for(int i = 0; i < categs.size(); i++) {
			cat_test[i] = categs.get(i).getNome();
		}
		
		ImageIcon icone = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image imagemIcone = icone.getImage();
		Image imagemPowerIcone = imagemIcone.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		setIconImage(imagemPowerIcone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 980, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Cadastro de Produto");
		lblNewJgoodiesTitle.setBounds(11, 5, 506, 64);
		lblNewJgoodiesTitle.setFont(new Font("Dialog", Font.BOLD, 46));
		
		JLabel lblCdigo = new JLabel("C\u00F3digo:");
		lblCdigo.setBounds(11, 165, 56, 21);
		lblCdigo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(11, 210, 50, 21);
		lblNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblUnidade = new JLabel("Unidade:");
		lblUnidade.setBounds(11, 255, 63, 21);
		lblUnidade.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblCategoria = new JLabel("Tipo:");
		lblCategoria.setBounds(11, 299, 74, 21);
		lblCategoria.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblTipo = new JLabel("Categoria:");
		lblTipo.setBounds(11, 342, 74, 21);
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		JLabel lblEstoqueCrtico = new JLabel("Estoque Cr\u00EDtico:");
		lblEstoqueCrtico.setBounds(289, 255, 111, 21);
		lblEstoqueCrtico.setFont(new Font("Dialog", Font.PLAIN, 16));
		
		textCod = new JTextField();
		textCod.setBounds(91, 159, 142, 33);
		textCod.setFont(new Font("Dialog", Font.PLAIN, 16));
		textCod.setColumns(10);
		textCod.setEditable(false);
		
		textNome = new JTextField();
		textNome.setBounds(91, 204, 464, 33);
		textNome.setFont(new Font("Dialog", Font.PLAIN, 16));
		textNome.setColumns(10);
		
		textUnd = new JTextField();
		textUnd.setBounds(91, 249, 142, 33);
		textUnd.setFont(new Font("Dialog", Font.PLAIN, 16));
		textUnd.setColumns(10);
		
		textEstCrt = new JTextField();
		textEstCrt.setBounds(413, 249, 142, 33);
		textEstCrt.setFont(new Font("Dialog", Font.PLAIN, 16));
		textEstCrt.setColumns(10);
		
		JComboBox comboBox_tp = new JComboBox(tp_test);
		comboBox_tp.setBounds(91, 294, 213, 31);
		comboBox_tp.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox_tp.setEditable(false);
		
		JComboBox comboBox_cat = new JComboBox(cat_test);
		comboBox_cat.setBounds(91, 337, 213, 31);
		comboBox_cat.setFont(new Font("Dialog", Font.PLAIN, 16));
		comboBox_cat.setEditable(false);
		
		ImageIcon iconG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		Image imaG = iconG.getImage();
		Image imagemG = imaG.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoG = new ImageIcon(imagemG);
		
		JButton btnGravar = new JButton("Salvar",icoG);
		btnGravar.setBounds(107, 473, 105, 32);
		
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Produto p = new Produto();
				p.setNome(textNome.getText());
				p.setUnidade(textUnd.getText());
				p.setEstoqueCritico(Integer.valueOf(textEstCrt.getText()));
				p.setTipo(comboBox_tp.getSelectedItem().toString());
				p.setCateg(comboBox_cat.getSelectedItem().toString());
				
				try {
				
				Conexao.guardar(p);
				
				}catch(NullPointerException f) {
					JOptionPane.showMessageDialog(null,"Ops.. Deve ter faltado preencher algo ai moral: \n" +f);
				}
				catch(Exception npe){
					JOptionPane.showMessageDialog(null, "Ops.. Algo deu errado: \n" +npe);
				}
				
				textCod.setText("");
				textNome.setText("");
				textUnd.setText("");
				textEstCrt.setText("");
				comboBox_tp.setSelectedItem(cat_test[0]);
				comboBox_cat.setSelectedItem(tp_test[0]);
				
				JOptionPane.showMessageDialog(null, "Produto Cadastrado!");
				Cadastro_Produto frame = new Cadastro_Produto();
				frame.setVisible(true);
				frame.setResizable(false);
				Cadastro_Produto.this.dispose();
			}
		});
		btnGravar.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/clear.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoL = new ImageIcon(imagemL);
		
		JButton btnLimpar = new JButton("Limpar", icoL);
		btnLimpar.setBounds(224, 473, 105, 32);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textCod.setText("");
				textNome.setText("");
				textUnd.setText("");
				textEstCrt.setText("");
				comboBox_tp.setSelectedItem(cat_test[0]);
				comboBox_cat.setSelectedItem(tp_test[0]);
				
			}
		});
		btnLimpar.setFont(new Font("Dialog", Font.BOLD, 14));
		
		ImageIcon iconV = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/back.png"));
		Image imaV = iconV.getImage();
		Image imagemV = imaV.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoV = new ImageIcon(imagemV);
		
		JButton btnVoltar = new JButton("Voltar", icoV);
		btnVoltar.setBounds(341, 473, 105, 32);
		btnVoltar.setFont(new Font("Dialog", Font.BOLD, 15));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal frame = new Principal();
				frame.setVisible(true);
                Cadastro_Produto.this.dispose();
			}
		});
		
		JLabel lblBreveMovimentao = DefaultComponentFactory.getInstance().createTitle("Breve movimenta\u00E7\u00E3o");
		lblBreveMovimentao.setBounds(562, 35, 197, 28);
		lblBreveMovimentao.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel lblLogo = DefaultComponentFactory.getInstance().createTitle("");
		lblLogo.setBounds(923, 474, 35, 31);
		ImageIcon icon = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image ima = icon.getImage();
		Image imagem = ima.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT);
		Icon ico = new ImageIcon(imagem);
		lblLogo.setIcon(ico);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		JLabel lblHora = DefaultComponentFactory.getInstance().createTitle(dtf.format(now));
		lblHora.setBounds(818, 474, 104, 33);
		lblHora.setFont(new Font("Dialog", Font.BOLD, 13));
		contentPane.setLayout(null);
		
		List<Produto> produts = Conexao.listarProduto();
		
		ArrayList dados = new ArrayList();
		
		for(int i = 0; i < produts.size(); i++) {
			
			Produto prod = new Produto();
			prod.setCodigo(produts.get(i).getCodigo());
			prod.setNome(produts.get(i).getNome());
			prod.setTipo(produts.get(i).getTipo());
			prod.setCateg(produts.get(i).getCateg());
			dados.add(prod);
		}
		
		ModeloJTableProduto modelo = new ModeloJTableProduto(dados);
		
		
		
			
		
		tableBreveMov = new JTable();
		//contentPane.add(tableBreveMov);
		tableBreveMov.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableBreveMov.setShowVerticalLines(true);
		tableBreveMov.setShowHorizontalLines(true);
		tableBreveMov.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tableBreveMov.setToolTipText("");
		tableBreveMov.setFont(new Font("Dialog", Font.BOLD, 12));
		
		tableBreveMov.setModel(modelo);
		tableBreveMov.getColumnModel().getColumn(0).setPreferredWidth(30);
		tableBreveMov.getColumnModel().getColumn(0).setResizable(false);
		tableBreveMov.getColumnModel().getColumn(1).setPreferredWidth(160);
		tableBreveMov.getColumnModel().getColumn(1).setResizable(false);
		tableBreveMov.getColumnModel().getColumn(2).setPreferredWidth(60);
		tableBreveMov.getColumnModel().getColumn(2).setResizable(false);
		tableBreveMov.getColumnModel().getColumn(3).setPreferredWidth(80);
		tableBreveMov.getColumnModel().getColumn(3).setResizable(false);
		tableBreveMov.setBounds(0, 0, 388, 391);
		JScrollPane scrollPane = new JScrollPane(tableBreveMov);
		scrollPane.setBounds(562, 71, 388, 391);
		contentPane.add(scrollPane);
		//contentPane.add(tableBreveMov);
		contentPane.add(lblCategoria);
		contentPane.add(lblNome);
		contentPane.add(lblTipo);
		contentPane.add(lblCdigo);
		contentPane.add(lblUnidade);
		contentPane.add(textCod);
		contentPane.add(textUnd);
		contentPane.add(lblEstoqueCrtico);
		contentPane.add(textEstCrt);
		contentPane.add(textNome);
		contentPane.add(comboBox_cat);
		contentPane.add(comboBox_tp);
		contentPane.add(btnGravar);
		contentPane.add(btnLimpar);
		contentPane.add(btnVoltar);
		contentPane.add(lblNewJgoodiesTitle);
		contentPane.add(lblHora);
		contentPane.add(lblLogo);
		contentPane.add(lblBreveMovimentao);
		
		ImageIcon iconA = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/add.png"));
		Image imaA = iconA.getImage();
		Image imagemA = imaA.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoA = new ImageIcon(imagemA);
		
		JButton btnAdcTipo = new JButton("Adc. Tipo", icoA);
		btnAdcTipo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cadastro_Tipo_Aux frame = new Cadastro_Tipo_Aux();
				frame.setVisible(true);
				frame.setResizable(false);
				Cadastro_Produto.this.dispose();
				
			}
		});
		btnAdcTipo.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAdcTipo.setBounds(318, 294, 136, 32);
		contentPane.add(btnAdcTipo);
		
		ImageIcon iconA2 = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/add.png"));
		Image imaA2 = iconA2.getImage();
		Image imagemA2 = imaA2.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		Icon icoA2 = new ImageIcon(imagemA2);
		
		JButton btnAdcCategoria = new JButton("Adc. Categoria", icoA2);
		btnAdcCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro_Categoria_Aux frame = new Cadastro_Categoria_Aux();
				frame.setVisible(true);
				frame.setResizable(false);
				Cadastro_Produto.this.dispose();
			}
		});
		btnAdcCategoria.setFont(new Font("Dialog", Font.BOLD, 14));
		btnAdcCategoria.setBounds(309, 337, 154, 32);
		contentPane.add(btnAdcCategoria);
	}
}
