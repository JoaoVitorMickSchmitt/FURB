package estudoProva3UI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField id;
	private JTextField nome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton criar = new JButton("New usuario");
		criar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u = new Usuario();
				u.setId(Integer.parseInt(id.getText()));
				u.setNome(nome.getText());
			    Usuario.adicionarPessoa(u);
			}
		});
		criar.setBounds(163, 102, 89, 23);
		contentPane.add(criar);
		
		id = new JTextField();
		id.setText("id");
		id.setToolTipText("");
		id.setBounds(163, 29, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		nome = new JTextField();
		nome.setText("nome");
		nome.setBounds(163, 60, 86, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		JTextArea txtrId = new JTextArea();
		txtrId.setBackground(new Color(192, 192, 192));
		txtrId.setText("ID= ");
		txtrId.setBounds(96, 79, 60, 22);
		contentPane.add(txtrId);
		
		JButton trocaNome = new JButton("trocar nome");
		trocaNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u = new Usuario();
				int idUsuario = Integer.parseInt(id.getText());
				String novonome = nome.getText();
				Usuario.atualizarPessoa(idUsuario, novonome);
				 JOptionPane.showMessageDialog(null, "Nome atualizado com sucesso!");
			}
		});
		trocaNome.setBounds(163, 170, 89, 23);
		contentPane.add(trocaNome);
	}
}
