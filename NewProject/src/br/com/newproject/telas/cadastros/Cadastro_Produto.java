package br.com.newproject.telas.cadastros;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import br.com.newproject.model.Produto;
import br.com.newproject.telas.Principal;

public class Cadastro_Produto extends JFrame {

	private JPanel contentPane;
	private JTextField textCod;
	private JTextField textNome;
	private JTextField textUnd;
	private JTextField textEstCrt;
	private String[] cat_test = {"","MASSAS","CERVEJAS","PLACAS","LUVAS","JOELHOS"};
	private String[] tp_test = {"","ALIMENTO","BEBIDA","ELETRONICOS","CONEXOES"};

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

	public Cadastro_Produto() {
		
		super("Cadastro de Produto");
		
		ImageIcon icone = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image imagemIcone = icone.getImage();
		Image imagemPowerIcone = imagemIcone.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		setIconImage(imagemPowerIcone);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
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
		
		//Icon icoG = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/save.png"));
		
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
				
                Cadastro_Produto.this.dispose();
			}
		});
		
		List<Produto> produtos = Conexao.listarProduto();
		
		JTextArea mov_Individual = new JTextArea();
		mov_Individual.setBounds(561, 66, 397, 406);
		mov_Individual.setBackground(new Color(220, 220, 220));
		mov_Individual.setEditable(false);
		
		//Produto aux = (Produto) produtos;
		
		mov_Individual.setText("Nome: " +"\n");
		
		for(int i = 0; i < produtos.size(); i++) {
			
			mov_Individual.setText(produtos.get(i).getNome() +"\n");
	
		}
		
		
		
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
		contentPane.add(mov_Individual);
		contentPane.add(lblHora);
		contentPane.add(lblLogo);
		contentPane.add(lblBreveMovimentao);
	}
}
