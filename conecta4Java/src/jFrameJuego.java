import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class jFrameJuego extends JFrame{
	
	boolean juegoCargado;
	JFileChooser fileChooser;
	JMenuBar menuBar;
	JMenu menu,menu2;
	JMenuItem menuItem1,menuItem2;
	JButton button1= new JButton();
	JButton button2= new JButton();
	JButton button3= new JButton();
	ImageIcon cargar,info;
	iniciarPartida nuevoPartida;

	public jFrameJuego() {
		juegoCargado = false;
		
		//Base frame del menu
		this.setLayout(new FlowLayout(FlowLayout.CENTER,20,20)); 
		this.setSize(250, 250);
		this.setTitle("Conecta 4");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(247, 236, 222));
		
		
		cargar = new ImageIcon("cargarFicher.png");//cargar ficheros de png iconos
		info = new ImageIcon("info.png");
		
		menuBar = new JMenuBar();// iniciar barra de menu
		menu = new JMenu("Cargar Juego"); // nombre del primero menu
		menu2 = new JMenu("Ayuda");// nombre del segundo menu
		
		menuBar.add(menu);//añadir menu al la barra
		menuBar.add(menu2);
		
		menuItem1 = new JMenuItem("Instrucciones");//añadir nombre de los submenu
		menuItem2 = new JMenuItem("Sobre");
		
		//poner icono al menu
		menuItem2.setIcon(info);; //un poco grande la verdad, pero era para probar :))
		

		menuItem2.setMnemonic(KeyEvent.VK_S);//añadir un caracter para seleccionar opciones del menu
		menuItem1.setMnemonic(KeyEvent.VK_I);
		
		menu.add(menuItem1); // añadir submenu al menu
		menu2.add(menuItem2);
		
		//poner texto al butones
		button1.setText("Nueva Partida");
		button2.setText("Seguir Jugando");
		button3.setText("Salir");
		
		//para quitar el "border" del texto.
		button1.setFocusable(false);
		button2.setFocusable(false); 
		button3.setFocusable(false);
		
		button1.setPreferredSize(new Dimension(150,50));
		button2.setPreferredSize(new Dimension(150,40));
		button3.setPreferredSize(new Dimension(150,35));
		
		
		//añadir butones y menu al frame
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.setJMenuBar(menuBar);
		
		
		//acciones menu
		menuItem1.addActionListener(e->{
			JOptionPane.showMessageDialog(null, "Seleccionar fichero con extension JAVA, tiene que ser un fichero guardado atraves de este juego.","Instruccion para cargar juego", JOptionPane.INFORMATION_MESSAGE);
		});
		menuItem2.addActionListener(e->{
			JOptionPane.showMessageDialog(null, "JUEGO CREADO POR GAYLE SANTOS VALDEZ.","Informacion del programa", JOptionPane.INFORMATION_MESSAGE);
		});
		
		
		
		//acciones de cada button
		button1.addActionListener(e->{
			nuevoPartida = new iniciarPartida();
			this.dispose();
			
		});
		/*
		 * CARGAR PARTIDA - ESTO ES LO QUE ME HE TARDADO UN MONTON.
		 * Se lee el object desde el fichero, El object seria la partida de JLabel guardado usando un getter.
		 * Para cargar el juego, hice un nuevo constructor de cada JFrame de la Inicio de partida y otro del tablaDelJuego que lleva otro constructor que tiene parametro para JLabel.
		 * En vez de crear un nuevo JLabel para empezar la partida, se añade el JLabel que se lee desde ObjectInputStream.
		 * */
		button2.addActionListener(e->{
			JFileChooser fileChooser = new JFileChooser();
		    FileNameExtensionFilter filtro = new FileNameExtensionFilter(".JAVA", "java");
		    fileChooser.setFileFilter(filtro);
			fileChooser.setDialogTitle("Fichero a Cargar");   
			int userSelection = fileChooser.showOpenDialog(null); 
			if (userSelection == JFileChooser.APPROVE_OPTION) {
				 
				    try {
				    	 FileInputStream fileStream = new FileInputStream(fileChooser.getSelectedFile());  
						ObjectInputStream objectStream = new ObjectInputStream(fileStream);
						nuevoPartida = new iniciarPartida((JLabel[][]) objectStream.readObject());
					} catch (IOException | ClassNotFoundException e1) {
						JOptionPane.showMessageDialog(null, "ERROR","NO HA CARGADO", JOptionPane.WARNING_MESSAGE);  
						e1.printStackTrace();
					}
			}
			
		
			this.dispose();

		});
		button3.addActionListener(e->{
			System.exit(0); // salir de programa
		});
		
		this.setVisible(true);
	}
}
