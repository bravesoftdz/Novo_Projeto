package br.com.newproject.telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import br.com.newproject.connection.Conexao;
import br.com.newproject.telas.cadastros.Cadastro_Categoria;
import br.com.newproject.telas.cadastros.Cadastro_Estabelecimento;
import br.com.newproject.telas.cadastros.Cadastro_Operador;
import br.com.newproject.telas.cadastros.Cadastro_Participante;
import br.com.newproject.telas.cadastros.Cadastro_Produto;
import br.com.newproject.telas.cadastros.Cadastro_Tipo;

public class Principal extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
					frame.setResizable(false);
					
				} catch (Exception e) {
					
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
	}

	public Principal() {
		
		super("X-ESTOQUE");

		ImageIcon iconL = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image imaL = iconL.getImage();
		Image imagemL = imaL.getScaledInstance(20, 20, Image.SCALE_DEFAULT);
		
		setIconImage(imagemL);
		
		Conexao.iniciarFabrica();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 180, 980, 720);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		mnCadastros.setForeground(Color.BLACK);
		mnCadastros.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnCadastros);
		
		JMenuItem mntmProduto = new JMenuItem("Produto");
		mntmProduto.setFont(new Font("Dialog", Font.BOLD, 14));
		mntmProduto.addMouseListener(new MouseListener () {
			
			@Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mousePressed(MouseEvent e) {
            	
                Cadastro_Produto frame = new Cadastro_Produto();
                frame.setVisible(true);
                frame.setResizable(false);
            }
             
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mouseEntered(MouseEvent e) {

            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }*/
                 
            }
             
            @Override
            public void mouseClicked(MouseEvent e) {
            	
            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }  */
            }
		});
		mnCadastros.add(mntmProduto);
		
		JMenuItem mntmTipo = new JMenuItem("Tipo");
		mntmTipo.setFont(new Font("Dialog", Font.BOLD, 14));
		mntmTipo.addMouseListener(new MouseListener () {
			
			@Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mousePressed(MouseEvent e) {
            	
                Cadastro_Tipo frame = new Cadastro_Tipo();
                frame.setVisible(true);
                frame.setResizable(false);
            }
             
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mouseEntered(MouseEvent e) {

            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }*/
                 
            }
             
            @Override
            public void mouseClicked(MouseEvent e) {
            	
            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }  */
            }
		});
		mnCadastros.add(mntmTipo);
		
		JMenuItem mntmCategoria = new JMenuItem("Categoria");
		mntmCategoria.setFont(new Font("Dialog", Font.BOLD, 14));
		mntmCategoria.addMouseListener(new MouseListener () {
			
			@Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mousePressed(MouseEvent e) {
            	
                Cadastro_Categoria frame = new Cadastro_Categoria();
                frame.setVisible(true);
                frame.setResizable(false);
            }
             
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mouseEntered(MouseEvent e) {

            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }*/
                 
            }
             
            @Override
            public void mouseClicked(MouseEvent e) {
            	
            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }  */
            }
		});
		mnCadastros.add(mntmCategoria);
		
		JMenuItem mntmParticipante = new JMenuItem("Participante");
		mntmParticipante.setFont(new Font("Dialog", Font.BOLD, 14));
		mntmParticipante.addMouseListener(new MouseListener () {
			
			@Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mousePressed(MouseEvent e) {
            	
                Cadastro_Participante frame = new Cadastro_Participante();
                frame.setVisible(true);
                frame.setResizable(false);
            }
             
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mouseEntered(MouseEvent e) {

            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }*/
                 
            }
             
            @Override
            public void mouseClicked(MouseEvent e) {
            	
            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }  */
            }
		});
		mnCadastros.add(mntmParticipante);
		
		JMenuItem mntmOperador = new JMenuItem("Operador");
		mntmOperador.setFont(new Font("Dialog", Font.BOLD, 14));
		mntmOperador.addMouseListener(new MouseListener () {
			
			@Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mousePressed(MouseEvent e) {
            	
                Cadastro_Operador frame = new Cadastro_Operador();
                frame.setVisible(true);
                frame.setResizable(false);
            }
             
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mouseEntered(MouseEvent e) {

            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }*/
                 
            }
             
            @Override
            public void mouseClicked(MouseEvent e) {
            	
            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }  */
            }
		});
		mnCadastros.add(mntmOperador);
		
		JMenuItem mntmEstabelecimento = new JMenuItem("Estabelecimento");
		mntmEstabelecimento.setFont(new Font("Dialog", Font.BOLD, 14));
		mntmEstabelecimento.addMouseListener(new MouseListener () {
			
			@Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mousePressed(MouseEvent e) {
            	
                Cadastro_Estabelecimento frame = new Cadastro_Estabelecimento();
                frame.setVisible(true);
                frame.setResizable(false);
            }
             
            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                 
            }
             
            @Override
            public void mouseEntered(MouseEvent e) {

            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }*/
                 
            }
             
            @Override
            public void mouseClicked(MouseEvent e) {
            	
            	/*JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
            	
                if(e.getSource() != null)
                {
                	 JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
                }  */
            }
		});
		mnCadastros.add(mntmEstabelecimento);
		
		JMenu mnAcoes = new JMenu("A\u00E7\u00F5es");
		mnAcoes.setForeground(Color.BLACK);
		mnAcoes.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnAcoes);
		
		JMenuItem mntmCompra = new JMenuItem("Compra");
		mntmCompra.setFont(new Font("Dialog", Font.BOLD, 14));
		mnAcoes.add(mntmCompra);
		
		JMenuItem mntmVenda = new JMenuItem("Venda");
		mntmVenda.setFont(new Font("Dialog", Font.BOLD, 14));
		mnAcoes.add(mntmVenda);
		
		JMenuItem mntmBalano = new JMenuItem("Balan\u00E7o");
		mntmBalano.setFont(new Font("Dialog", Font.BOLD, 14));
		mnAcoes.add(mntmBalano);
		
		JMenu mnRelatorios = new JMenu("Relat\u00F3rios");
		mnRelatorios.setForeground(Color.BLACK);
		mnRelatorios.setFont(new Font("Dialog", Font.BOLD, 20));
		mnRelatorios.addMouseListener(new MouseListener() {
            
           @Override
           public void mouseReleased(MouseEvent e) {
               // TODO Auto-generated method stub
                
           }
            
           @Override
           public void mousePressed(MouseEvent e) {
               // TODO Auto-generated method stub
                
           }
            
           @Override
           public void mouseExited(MouseEvent e) {
               // TODO Auto-generated method stub
                
           }
            
           @Override
           public void mouseEntered(MouseEvent e) {
               // TODO Auto-generated method stub
                
           }
            
           @Override
           public void mouseClicked(MouseEvent e) {
               if(e.getSource() != null)
               {
            	   JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
               }
                
           }
       });
		menuBar.add(mnRelatorios);
		
		menuBar.add(Box.createHorizontalGlue());
		
		JMenu mnAjuda = new JMenu("Ajuda");
		mnAjuda.setForeground(Color.BLACK);
		mnAjuda.setFont(new Font("Dialog", Font.BOLD, 20));
		mnAjuda.addMouseListener(new MouseListener() {
            
           @Override
           public void mouseReleased(MouseEvent e) {
               // TODO Auto-generated method stub
           }
           @Override
           public void mousePressed(MouseEvent e) {
               // TODO Auto-generated method stub
           }
           @Override
           public void mouseExited(MouseEvent e) {
               // TODO Auto-generated method stub
           }
           @Override
           public void mouseEntered(MouseEvent e) {
               // TODO Auto-generated method stub
           }
           @Override
           public void mouseClicked(MouseEvent e) {
               if(e.getSource() != null)
               {
            	   JOptionPane.showMessageDialog(null, "Óia!!! Deu certo qué uma beleza");
               }
                
           }
       });
		menuBar.add(mnAjuda);
		
		JMenu mnConfigs = new JMenu("Configura\u00E7\u00F5es");
		mnConfigs.setForeground(Color.BLACK);
		mnConfigs.setFont(new Font("Dialog", Font.BOLD, 20));
		menuBar.add(mnConfigs);
		
		JMenuItem mntmLogoMarca = new JMenuItem("Logo Marca");
		mntmLogoMarca.setFont(new Font("Dialog", Font.BOLD, 14));
		mnConfigs.add(mntmLogoMarca);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblData = DefaultComponentFactory.getInstance().createLabel(dtf.format(now));
		lblData.setBounds(807, 612, 135, 21);
		lblData.setFont(new Font("Dialog", Font.BOLD, 16));
		
		JTextArea movProds = new JTextArea();
		movProds.setBounds(11, 5, 712, 537);
		movProds.setBackground(new Color(220, 220, 220));
		movProds.setEditable(false);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBackground(new Color(245, 245, 245));
		lblLogo.setBounds(785, 421, 173, 179);
		ImageIcon icon = new ImageIcon(Principal.class.getResource("/br/com/newproject/img/logo.png"));
		Image ima = icon.getImage();
		Image imagem = ima.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT);
		Icon ico = new ImageIcon(imagem);
		lblLogo.setIcon(ico);
		
		JLabel lblXestoque = new JLabel("X-ESTOQUE");
		lblXestoque.setBounds(6, 577, 363, 65);
		lblXestoque.setFont(new Font("Bookman Old Style", Font.BOLD, 55));
		contentPane.setLayout(null);
		contentPane.add(movProds);
		contentPane.add(lblXestoque);
		contentPane.add(lblLogo);
		contentPane.add(lblData);
		
		
	}
}
