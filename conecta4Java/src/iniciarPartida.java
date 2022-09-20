import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class iniciarPartida extends JFrame{
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem1,menuItem2,menuItem3;
	JFileChooser guardar;
	tablaDelJuego a;
	public iniciarPartida()
 {

		
		
		this.setLayout(null);
		this.setSize(560, 600);
		this.setTitle("Conecta 4");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(247, 236, 222));
		tablaDelJuego a = new tablaDelJuego(); // El class del juego a su propio Jframe.
		menuBar = new JMenuBar();
		menu = new JMenu("Opciones");
		menuBar.add(menu);
		//poner texto al menu	
		menuItem1 = new JMenuItem("Guardar partida");
		menuItem2 = new JMenuItem("Empezar de nuevo");
		menuItem3 = new JMenuItem("Salir del programa");
		
		//añadir caracteres a los opciones al evento de teclear
		menu.setMnemonic(KeyEvent.VK_O); //alt+O
		menuItem1.setMnemonic(KeyEvent.VK_G);
		menuItem2.setMnemonic(KeyEvent.VK_E);
		menuItem3.setMnemonic(KeyEvent.VK_S);
		
		
		//añadir contenidos
		this.setJMenuBar(menuBar);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.add(menuItem3);
		this.add(a);
		
		//acciones del menu
		menuItem1.addActionListener(e->{		 
			/*GUARDAR PARTIDA -
			 * 
			 * Se guarda el JLabel[][] desde getPartida del tablaDelJuego a traves del ObjectOutputStream.
			 * Basicamente se guarda el array del JLabel[][] que contiene las posiciones de los fotos.
			 * */
			
			JFileChooser fileChooser = new JFileChooser();
		    FileNameExtensionFilter filtro = new FileNameExtensionFilter(".JAVA", "java");
		    fileChooser.setFileFilter(filtro);
			fileChooser.setDialogTitle("Fichero a guardar");   
			int userSelection = fileChooser.showSaveDialog(null); 
			
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			 try {   
			        FileOutputStream fileStream = new FileOutputStream(fileChooser.getSelectedFile());   
			        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);   
			        objectStream.writeObject(a.getPartida());   
			        objectStream.close();   
			        fileStream.close();   

			        JOptionPane.showMessageDialog(null, "Guardado","Guardar", JOptionPane.INFORMATION_MESSAGE);   
			    } catch (Exception xx) {   
			    	JOptionPane.showMessageDialog(null, "ERROR","NO HA GUARDADO", JOptionPane.WARNING_MESSAGE);  
			    }   
			 
			}
			
		
			
		});
		menuItem2.addActionListener(e->{
			iniciarPartida nuevoPartida = new iniciarPartida(); 
			this.dispose();
		});
		menuItem3.addActionListener(e->{
			System.exit(0); // salir de la programa
		});
		this.setVisible(true);
		
	}
	
	
	public iniciarPartida(JLabel[][] jLabel)  throws HeadlessException { // Para cargar el juego, se lee el JLabel Object y iniciar el juego desde aquel Array de JLabel.
		super();
		
		this.setLayout(null);
		this.setSize(560, 600);
		this.setTitle("Conecta 4");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(247, 236, 222));
		a = new tablaDelJuego(jLabel); // El class del juego a su propio Jframe.
		menuBar = new JMenuBar();
		menu = new JMenu("Opciones");
		menuBar.add(menu);
		//poner texto al menu	
		menuItem1 = new JMenuItem("Guardar partida");
		menuItem2 = new JMenuItem("Empezar de nuevo");
		menuItem3 = new JMenuItem("Salir del programa");
		
		//añadir caracteres a los opciones al evento de teclear
		menu.setMnemonic(KeyEvent.VK_O); //alt+O
		menuItem1.setMnemonic(KeyEvent.VK_G);
		menuItem2.setMnemonic(KeyEvent.VK_E);
		menuItem3.setMnemonic(KeyEvent.VK_S);
		
		
		//añadir contenidos
		this.setJMenuBar(menuBar);
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.add(menuItem3);
		this.add(a);
		
		//acciones del menu
		menuItem1.addActionListener(e->{
			JFileChooser fileChooser = new JFileChooser();
			
		    FileNameExtensionFilter filtro = new FileNameExtensionFilter(".JAVA", "java");
		    fileChooser.setFileFilter(filtro);
			fileChooser.setDialogTitle("Fichero a guardar");   
			int userSelection = fileChooser.showSaveDialog(null); 
			
			if (userSelection == JFileChooser.APPROVE_OPTION) {
			 try {   
			        FileOutputStream fileStream = new FileOutputStream(fileChooser.getSelectedFile());   
			        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);   
			        objectStream.writeObject(a.getPartida());   
			        objectStream.close();   
			        fileStream.close();   

			        JOptionPane.showMessageDialog(null, "Guardado","Guardar", JOptionPane.INFORMATION_MESSAGE);   
			    } catch (Exception xx) {   
			    	JOptionPane.showMessageDialog(null, "ERROR","NO HA GUARDADO", JOptionPane.WARNING_MESSAGE);  
			    }   
			 
			}
			
		
		
		
			
		});
		menuItem2.addActionListener(e->{
			iniciarPartida nuevoPartida = new iniciarPartida(); 
			this.dispose();
		});
		menuItem3.addActionListener(e->{
			System.exit(0); // salir de la programa
		});
		this.setVisible(true);
	}
	
}
	
	