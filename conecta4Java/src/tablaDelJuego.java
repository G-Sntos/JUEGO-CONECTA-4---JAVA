import java.awt.Color;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class tablaDelJuego extends JPanel{
	
	int r1,r2,r3,r4,r5,r6,r7; //cada colomna con su propia cuenta del row, declarado global para poder acceder lo al tiempo de recargar el juego.
 	int turnos=0;
	boolean ganador=false,rojo;
	
	ImageIcon oval = new ImageIcon("oval.png");
	ImageIcon p1 = new ImageIcon("p1.png");
	ImageIcon p2 = new ImageIcon("p2.png");
	TextField R,A;
	JButton one,two,three,four,five,six,seven,oneB,twoB,threeB,fourB,fiveB,sixB,sevenB; //buttones de control
	JLabel partida [][] = new JLabel[6][7];
	
	
	
 public tablaDelJuego() {
	 /*Cada vez que tecleen el button se mira si hay un ganador atraves del funcion esGanador().
	  * No encuentro la manera que sea iterativo, cada vez que pongo un while o do/while se queda pillado-
	  * la parte de este class porque no se termina y al final nunca se inicia este panel.
	  * 
	  * turnos++ es para el numero total de turnos , 42 es lo maximo posible y se declara el juego empate.
	  * 
	  * */
	 
	 	r1 =5;
	 	r2 =5;
	 	r3 =5;
	 	r4 =5;
	 	r5 =5;
	 	r6 =5;
	 	r7 =5;
	 
	 	//nombre de butotones
	 	one = new JButton("Rojo");
	 	two = new JButton("Rojo");
	 	three = new JButton("Rojo");
	 	four = new JButton("Rojo");
	 	five = new JButton("Rojo");
	 	six = new JButton("Rojo");
		seven = new JButton("Rojo");
		oneB = new JButton("Azul");
	 	twoB = new JButton("Azul");
	 	threeB = new JButton("Azul");
	 	fourB = new JButton("Azul");
	 	fiveB = new JButton("Azul");
	 	sixB = new JButton("Azul");
		sevenB = new JButton("Azul");
	 	
	 	//quiter el "border" al texto cuando esta en foco
	 	one.setFocusable(false);
	 	two.setFocusable(false);
	 	three.setFocusable(false);
	 	four.setFocusable(false);
	 	five.setFocusable(false);
	 	six.setFocusable(false);
	 	seven.setFocusable(false);
	 	oneB.setFocusable(false);
	 	twoB.setFocusable(false);
	 	threeB.setFocusable(false);
	 	fourB.setFocusable(false);
	 	fiveB.setFocusable(false);
	 	sixB.setFocusable(false);
	 	sevenB.setFocusable(false);
	 	
	 	R = new TextField("Nombre Rojo-P1");
	 	A = new TextField("Nombre Azul-P2");
	 	
	 	
	 	
	 	
	 	for(int i=0; i<partida.length; i++) { //crear la tabla, con un foto "oval.png"
	 		for(int x=0; x<partida[0].length; x++) {
	 			partida[i][x] = new JLabel();
	 			partida[i][x].setIcon(oval);	
	 			this.add(partida[i][x]);//añadir cada label individual en este panel
	 		}
	 	};
		this.add(one);
	 	this.add(two);
	 	this.add(three);
	 	this.add(four);
	 	this.add(five);
	 	this.add(six);
	 	this.add(seven);
		this.add(oneB);
	 	this.add(twoB);
	 	this.add(threeB);
	 	this.add(fourB);
	 	this.add(fiveB);
	 	this.add(sixB);
	 	this.add(sevenB);
	 	this.add(A);
	 	this.add(R);
	 	this.setBounds(20,20,500,500);    //size del panel
	    this.setBackground(new Color(247, 236, 222));
	   
	    
	  	  //buttones rojo
	  	  one.addActionListener(e->{
			  partida[r1][0].setIcon(p1);
			  r1--;
			  turnos++;
			  ganador = esGanador(p1, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
			  
			  
		  });
		  two.addActionListener(e->{
			  partida[r2][1].setIcon(p1);
			  r2--;
			  turnos++;
			  ganador = esGanador(p1, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
			  
		  });
		  three.addActionListener(e->{
			  partida[r3][2].setIcon(p1);
			  r3--;
			  turnos++;
			  ganador = esGanador(p1, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
			  
		  });
		  four.addActionListener(e->{
			  partida[r4][3].setIcon(p1);
			  r4--;
			  turnos++;
			  ganador = esGanador(p1, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
			  
		  });
		  five.addActionListener(e->{
			  partida[r5][4].setIcon(p1);
			  r5--;
			  turnos++;
			  ganador = esGanador(p1, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  });
		  six.addActionListener(e->{
			  partida[r6][5].setIcon(p1);
			  r6--;
			  turnos++;
			  ganador = esGanador(p1, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  });
		  seven.addActionListener(e->{
			  partida[r7][6].setIcon(p1);
			  r7--;
			  turnos++;
			  ganador = esGanador(p1, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  });
		  
		  //buttones azul
		  oneB.addActionListener(e->{
			  partida[r1][0].setIcon(p2);
			  r1--;
			  turnos++;
			  ganador = esGanador(p2, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  });
		  twoB.addActionListener(e->{
			  partida[r2][1].setIcon(p2);
			  r2--;
			  turnos++;
			  ganador = esGanador(p2, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
			  
		  });
		  threeB.addActionListener(e->{
			  partida[r3][2].setIcon(p2);
			  r3--;
			  turnos++;
			  ganador = esGanador(p2, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
			  
		  });
		  fourB.addActionListener(e->{
			  partida[r4][3].setIcon(p2);
			  r4--;
			  turnos++;
			  ganador = esGanador(p2, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  });
		  fiveB.addActionListener(e->{
			  partida[r5][4].setIcon(p2);
			  r5--;
			  turnos++;
			  ganador = esGanador(p2, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
			  
		  });
		  sixB.addActionListener(e->{
			  partida[r6][5].setIcon(p2);
			  r6--;
			  turnos++;
			  ganador = esGanador(p2, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  });
		  sevenB.addActionListener(e->{
			  partida[r7][6].setIcon(p2);
			  r7--;
			  turnos++;
			  ganador = esGanador(p2, partida);
			  if(ganador==true) {
				  rojo=true;
				  if(rojo==false){
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }else if(rojo==true) {
					  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
					  System.exit(0);
				  }
			  }
				  
			  if(turnos == 42) {
				  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
			  
		  });
		  
		  
	   
 }
 

public tablaDelJuego(JLabel[][] a2) { // Constructor hecho para cargar juegos.
	r1 =5;
 	r2 =5;
 	r3 =5;
 	r4 =5;
 	r5 =5;
 	r6 =5;
 	r7 =5;
 
 	//nombre de butotones
 	one = new JButton("Rojo");
 	two = new JButton("Rojo");
 	three = new JButton("Rojo");
 	four = new JButton("Rojo");
 	five = new JButton("Rojo");
 	six = new JButton("Rojo");
	seven = new JButton("Rojo");
	oneB = new JButton("Azul");
 	twoB = new JButton("Azul");
 	threeB = new JButton("Azul");
 	fourB = new JButton("Azul");
 	fiveB = new JButton("Azul");
 	sixB = new JButton("Azul");
	sevenB = new JButton("Azul");
 	
 	//quiter el "border" al texto cuando esta en foco
 	one.setFocusable(false);
 	two.setFocusable(false);
 	three.setFocusable(false);
 	four.setFocusable(false);
 	five.setFocusable(false);
 	six.setFocusable(false);
 	seven.setFocusable(false);
 	oneB.setFocusable(false);
 	twoB.setFocusable(false);
 	threeB.setFocusable(false);
 	fourB.setFocusable(false);
 	fiveB.setFocusable(false);
 	sixB.setFocusable(false);
 	sevenB.setFocusable(false);
 	
 	R = new TextField("Nombre Rojo-P1");
 	A = new TextField("Nombre Azul-P2");
 	
 	
 	
 	
 	for(int i=0; i<partida.length; i++) { //crear la tabla, con un foto "oval.png"
 		for(int x=0; x<partida[0].length; x++) {
 			
 			this.add(a2[i][x]);//añadir cada label individual en este panel desde el ObjectInputStream, esto es el unico cambio de este constructor
 		}
 	};
	this.add(one);
 	this.add(two);
 	this.add(three);
 	this.add(four);
 	this.add(five);
 	this.add(six);
 	this.add(seven);
	this.add(oneB);
 	this.add(twoB);
 	this.add(threeB);
 	this.add(fourB);
 	this.add(fiveB);
 	this.add(sixB);
 	this.add(sevenB);
 	this.add(A);
 	this.add(R);
 	this.setBounds(20,20,500,500);    //size del panel
    this.setBackground(new Color(247, 236, 222));
   
    
  	  //buttones rojo
  	  one.addActionListener(e->{
		  partida[r1][0].setIcon(p1);
		  r1--;
		  turnos++;
		  ganador = esGanador(p1, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
		  
		  
	  });
	  two.addActionListener(e->{
		  partida[r2][1].setIcon(p1);
		  r2--;
		  turnos++;
		  ganador = esGanador(p1, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
		  
	  });
	  three.addActionListener(e->{
		  partida[r3][2].setIcon(p1);
		  r3--;
		  turnos++;
		  ganador = esGanador(p1, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
		  
	  });
	  four.addActionListener(e->{
		  partida[r4][3].setIcon(p1);
		  r4--;
		  turnos++;
		  ganador = esGanador(p1, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
		  
	  });
	  five.addActionListener(e->{
		  partida[r5][4].setIcon(p1);
		  r5--;
		  turnos++;
		  ganador = esGanador(p1, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
	  });
	  six.addActionListener(e->{
		  partida[r6][5].setIcon(p1);
		  r6--;
		  turnos++;
		  ganador = esGanador(p1, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
	  });
	  seven.addActionListener(e->{
		  partida[r7][6].setIcon(p1);
		  r7--;
		  turnos++;
		  ganador = esGanador(p1, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
	  });
	  
	  //buttones azul
	  oneB.addActionListener(e->{
		  partida[r1][0].setIcon(p2);
		  r1--;
		  turnos++;
		  ganador = esGanador(p2, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
	  });
	  twoB.addActionListener(e->{
		  partida[r2][1].setIcon(p2);
		  r2--;
		  turnos++;
		  ganador = esGanador(p2, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
		  
	  });
	  threeB.addActionListener(e->{
		  partida[r3][2].setIcon(p2);
		  r3--;
		  turnos++;
		  ganador = esGanador(p2, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
		  
	  });
	  fourB.addActionListener(e->{
		  partida[r4][3].setIcon(p2);
		  r4--;
		  turnos++;
		  ganador = esGanador(p2, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
	  });
	  fiveB.addActionListener(e->{
		  partida[r5][4].setIcon(p2);
		  r5--;
		  turnos++;
		  ganador = esGanador(p2, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
		  
	  });
	  sixB.addActionListener(e->{
		  partida[r6][5].setIcon(p2);
		  r6--;
		  turnos++;
		  ganador = esGanador(p2, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
	  });
	  sevenB.addActionListener(e->{
		  partida[r7][6].setIcon(p2);
		  r7--;
		  turnos++;
		  ganador = esGanador(p2, partida);
		  if(ganador==true) {
			  rojo=true;
			  if(rojo==false){
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+A.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }else if(rojo==true) {
				  JOptionPane.showMessageDialog(null, "Enhorabuena! "+R.getText(),"JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
				  System.exit(0);
			  }
		  }
			  
		  if(turnos == 42) {
			  JOptionPane.showMessageDialog(null, "EMPATE!.","JUEGO TERMINADO", JOptionPane.INFORMATION_MESSAGE);
			  System.exit(0);
		  }
		  
	  });
	  
	  
   
}


public static boolean esGanador(ImageIcon player, JLabel[][] grid){ //Comprobar ganador
	//comparan el icono que lleva cada JLabel	
	 //Seguro que hay otras manera pero esto lo encontre lo mejor para tener el boolean del ganador
	 //4 across
		for(int row = 0; row<grid.length; row++){
			for (int col = 0;col < grid[0].length - 3;col++){
				if (grid[row][col].getIcon() == player 	&& 
					grid[row][col+1].getIcon() == player &&
					grid[row][col+2].getIcon() == player &&
					grid[row][col+3].getIcon() == player){
					return true;
				}
			}			
		}
		//4 up and down
		for(int row = 0; row < grid.length - 3; row++){
			for(int col = 0; col < grid[0].length; col++){
				if (grid[row][col].getIcon() == player   && 
					grid[row+1][col].getIcon() == player &&
					grid[row+2][col].getIcon() == player &&
					grid[row+3][col].getIcon() == player){
					return true;
				}
			}
		}
		//upward diagonal
		for(int row = 3; row < grid.length; row++){
			for(int col = 0; col < grid[0].length - 3; col++){
				if (grid[row][col].getIcon() == player   && 
					grid[row-1][col+1].getIcon() == player &&
					grid[row-2][col+2].getIcon() == player &&
					grid[row-3][col+3].getIcon() == player){
					return true;
				}
			}
		}
		//downward diagonal
		for(int row = 0; row < grid.length - 3; row++){
			for(int col = 0; col < grid[0].length - 3; col++){
				if (grid[row][col].getIcon() == player   && 
					grid[row+1][col+1].getIcon() == player &&
					grid[row+2][col+2].getIcon() == player &&
					grid[row+3][col+3].getIcon() == player){
					return true;
				}
			}
		}
		return false;
 
}

public  JLabel[][] getPartida() {
	return partida;
}
public void setPartida(JLabel[][] partida) {
	this.partida = partida;
}

 
}
