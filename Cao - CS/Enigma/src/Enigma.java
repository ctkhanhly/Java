import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
@author Ly Cao
*/
public class Enigma extends JFrame{

	//delete boolean choseRotor1, 2,3,4,5
	//delete all the testing system.out.println
	boolean start = false;
	boolean keyPressed = false;
	
	int numRotor1Advance = 0;
	int numRotor2Advance = 0;
	int numKey = 0;
	char keyInput;
	char keyOutput;
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	Container pane;
	
	public JCheckBox rotor1;
	public JCheckBox rotor2;
	public JCheckBox rotor3;
	public JCheckBox rotor4;
	public JCheckBox rotor5;
	public JTextField groundSettings;
	public ArrayList<ArrayList<Character>> rotorsRunning;
	int rotor1Index;
	int rotor2Index;
	int rotor3Index;
	int rotor4Index;
	int rotor5Index;
	Rotors rotors = new Rotors();
	
	
	public JTextArea steckerboardPair;
	public JCheckBox showPlugboard;
	
	public JSpinner rotorI;
	public JSpinner rotorII;
	public JSpinner rotorIII;
	
	public JPanel lampQ;
	public JPanel lampW;
	public JPanel lampE;
	public JPanel lampR;
	public JPanel lampT;
	public JPanel lampY;
	public JPanel lampU;
	public JPanel lampI;
	public JPanel lampO;
	public JPanel lampP;
	public JPanel lampA;
	public JPanel lampS;
	public JPanel lampD;
	public JPanel lampF;
	public JPanel lampG;
	public JPanel lampH;
	public JPanel lampJ;
	public JPanel lampK;
	public JPanel lampL;
	public JPanel lampZ;
	public JPanel lampX;
	public JPanel lampC;
	public JPanel lampV;
	public JPanel lampB;
	public JPanel lampN;
	public JPanel lampM;
	
	public JLabel labelQ;
	public JLabel labelW;
	public JLabel labelE;
	public JLabel labelR;
	public JLabel labelT;
	public JLabel labelY;
	public JLabel labelU;
	public JLabel labelI;
	public JLabel labelO;
	public JLabel labelP;
	public JLabel labelA;
	public JLabel labelS;
	public JLabel labelD;
	public JLabel labelF;
	public JLabel labelG;
	public JLabel labelH;
	public JLabel labelJ;
	public JLabel labelK;
	public JLabel labelL;
	public JLabel labelZ;
	public JLabel labelX;
	public JLabel labelC;
	public JLabel labelV;
	public JLabel labelB;
	public JLabel labelN;
	public JLabel labelM;
	
	public Box keyboardBox;
	
	public JPanel keyQ;
	public JPanel keyW;
	public JPanel keyE;
	public JPanel keyR;
	public JPanel keyT;
	public JPanel keyY;
	public JPanel keyU;
	public JPanel keyI;
	public JPanel keyO;
	public JPanel keyP;
	public JPanel keyA;
	public JPanel keyS;
	public JPanel keyD;
	public JPanel keyF;
	public JPanel keyG;
	public JPanel keyH;
	public JPanel keyJ;
	public JPanel keyK;
	public JPanel keyL;
	public JPanel keyZ;
	public JPanel keyX;
	public JPanel keyC;
	public JPanel keyV;
	public JPanel keyB;
	public JPanel keyN;
	public JPanel keyM;


	
	public Enigma(){
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	     setTitle("Enigma Machine Simulation");
	     setResizable(false);
	     //get screen size
	     Toolkit tk = Toolkit.getDefaultToolkit();
		 Dimension dim = tk.getScreenSize();
		 int xPos = (dim.width / 2) - (this.getWidth() / 2);
		 int yPos = (dim.height / 2) - (this.getHeight()/ 2);
		 setLocation(xPos-280, yPos-320);
	     setDefaultLookAndFeelDecorated(true);
	     setSize(560, 680);
	      
	      pane = getContentPane();
	      pane.setLayout(null);
	      pane.setBackground(new Color(200,80, 50));
	      
	      Box plugboardBox = Box.createVerticalBox();
	      plugboardBox.setBounds(280, 20, 220, 100);
	      plugboardBox.setBorder(BorderFactory.createTitledBorder("Plugboard Settings"));
	      steckerboardPair = new JTextArea("");
	      steckerboardPair.setLineWrap(true);
	      steckerboardPair.setWrapStyleWord(true);
	      steckerboardPair.setColumns(29);
	      steckerboardPair.setToolTipText("Enter 10 pairs, e.g: AD MN BC");
	      plugboardBox.add(steckerboardPair);
	      showPlugboard = new JCheckBox("Show Configuration");
	      plugboardBox.add(showPlugboard);
	      ListenForChange lForChange = new ListenForChange();
	      showPlugboard.addItemListener(lForChange);
	      
	      Box rotorBox = Box.createVerticalBox();
	      rotorBox.setBounds(20, 20, 100, 170);
	      rotorBox.setBorder(BorderFactory.createTitledBorder("Rotor Settings"));
	      rotorBox.setToolTipText("Please choose 3 and only 3 rotors, in a specified order");
	      rotor1 = new JCheckBox("Rotor 1");
	      rotor2 = new JCheckBox("Rotor 2");
	      rotor3 = new JCheckBox("Rotor 3");
	      rotor4 = new JCheckBox("Rotor 4");
	      rotor5 = new JCheckBox("Rotor 5");
	      groundSettings = new JTextField("");
	      groundSettings.setToolTipText("Ground settings, e.g: mnj");
	      rotorBox.add(rotor1);
	      rotorBox.add(rotor2);
	      rotorBox.add(rotor3);
	      rotorBox.add(rotor4);
	      rotorBox.add(rotor5);
	      rotorBox.add(groundSettings);
	      rotorsRunning = new ArrayList<ArrayList<Character>>();
	      
	      rotor1.addItemListener(lForChange);
	      rotor2.addItemListener(lForChange);
	      rotor3.addItemListener(lForChange);
	      rotor4.addItemListener(lForChange);
	      rotor5.addItemListener(lForChange);
	      
	      
	      String[] letters = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	      //	      SpinnerModel model1 = new SpinnerListModel(alphabet);
//	      rotorI = new JSpinner(model1);
	      
//	      alphabet = new ArrayList<Character>();
//	      for(int i = 0; i<26; i++){
//	    	  alphabet.add(letters.charAt(i));
//	      }
	      rotorI = new JSpinner(new SpinnerListModel(letters));
	      rotorII = new JSpinner(new SpinnerListModel(letters));
	      rotorIII = new JSpinner(new SpinnerListModel(letters));
	     
	      //left to right: III to I
	      rotorIII.setBounds(this.getWidth()/2-20-70, 300, 40,20);//160
	      rotorII.setBounds(this.getWidth()/2-20, 300, 40,20);//230
	      rotorI.setBounds(this.getWidth()/2-20+70, 300, 40,20);//300
	      pane.add(rotorI);
	      pane.add(rotorII);
	      pane.add(rotorIII);
	      
	      
	     /*START OF KEY LAMP*/
	      Box lampboardBox = Box.createVerticalBox();
	      lampboardBox.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	      lampboardBox.setBounds(70, 340, 420, 130);
	      lampQ = new RoundedPanel(30);
	      lampQ.setBounds(80, 350, 30, 30);
	      lampQ.setOpaque(false);
	      lampQ.setBackground(Color.black);
	      lampQ.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampQ);
	      labelQ = new JLabel("Q");
	      labelQ.setForeground(Color.white);
	      lampQ.add(labelQ);
	      
	      lampW = new RoundedPanel(30);
	      lampW.setBounds(120, 350, 30, 30);
	      lampW.setOpaque(false);
	      lampW.setBackground(Color.black);
	      lampW.setForeground(Color.LIGHT_GRAY);  
	      pane.add(lampW);
	      labelW = new JLabel("W");
	      labelW.setForeground(Color.white);
	      lampW.add(labelW);
	      
	      lampE = new RoundedPanel(30);
	      lampE.setBounds(160, 350, 30, 30);
	      lampE.setOpaque(false);
	      lampE.setBackground(Color.black);
	      lampE.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampE);
	      labelE = new JLabel("E");
	      labelE.setForeground(Color.white);
	      lampE.add(labelE);
	      
	      lampR = new RoundedPanel(30);
	      lampR.setBounds(200, 350, 30, 30);
	      lampR.setOpaque(false);
	      lampR.setBackground(Color.black);
	      lampR.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampR);
	      labelR = new JLabel("R");
	      labelR.setForeground(Color.white);
	      lampR.add(labelR);
	      
	      lampT = new RoundedPanel(30);
	      lampT.setBounds(240, 350, 30, 30);
	      lampT.setOpaque(false);
	      lampT.setBackground(Color.black);
	      lampT.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampT);
	      labelT = new JLabel("T");
	      labelT.setForeground(Color.white);
	      lampT.add(labelT);
	      
	      lampY = new RoundedPanel(30);
	      lampY.setBounds(280, 350, 30, 30);
	      lampY.setOpaque(false);
	      lampY.setBackground(Color.black);
	      lampY.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampY);
	      labelY = new JLabel("Y");
	      labelY.setForeground(Color.white);
	      lampY.add(labelY);
	      
	      lampU = new RoundedPanel(30);
	      lampU.setBounds(320, 350, 30, 30);
	      lampU.setOpaque(false);
	      lampU.setBackground(Color.black);
	      lampU.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampU);
	      labelU = new JLabel("U");
	      labelU.setForeground(Color.white);
	      lampU.add(labelU);
	      
	      lampI = new RoundedPanel(30);
	      lampI.setBounds(360, 350, 30, 30);
	      lampI.setOpaque(false);
	      lampI.setBackground(Color.black);
	      lampI.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampI);
	      labelI = new JLabel("Q");
	      labelI.setForeground(Color.white);
	      lampI.add(labelI);
	      
	      lampO = new RoundedPanel(30);
	      lampO.setBounds(400, 350, 30, 30);
	      lampO.setOpaque(false);
	      lampO.setBackground(Color.black);
	      lampO.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampO);
	      labelO = new JLabel("O");
	      labelO.setForeground(Color.white);
	      lampO.add(labelO);
	      
	      lampP = new RoundedPanel(30);
	      lampP.setBounds(440, 350, 30, 30);
	      lampP.setOpaque(false);
	      lampP.setBackground(Color.black);
	      lampP.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampP);
	      labelP = new JLabel("P");
	      labelP.setForeground(Color.white);
	      lampP.add(labelP);
	      
	      lampA = new RoundedPanel(30);
	      lampA.setBounds(100, 390, 30, 30);
	      lampA.setOpaque(false);
	      lampA.setBackground(Color.black);
	      lampA.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampA);
	      labelA = new JLabel("A");
	      labelA.setForeground(Color.white);
	      lampA.add(labelA);
	      
	      lampS = new RoundedPanel(30);
	      lampS.setBounds(140, 390, 30, 30);
	      lampS.setOpaque(false);
	      lampS.setBackground(Color.black);
	      lampS.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampS);
	      labelS = new JLabel("S");
	      labelS.setForeground(Color.white);
	      lampS.add(labelS);
	      
	      lampD = new RoundedPanel(30);
	      lampD.setBounds(180, 390, 30, 30);
	      lampD.setOpaque(false);
	      lampD.setBackground(Color.black);
	      lampD.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampD);
	      labelD = new JLabel("D");
	      labelD.setForeground(Color.white);
	      lampD.add(labelD);
	      
	      lampF = new RoundedPanel(30);
	      lampF.setBounds(220, 390, 30, 30);
	      lampF.setOpaque(false);
	      lampF.setBackground(Color.black);
	      lampF.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampF);
	      labelF = new JLabel("F");
	      labelF.setForeground(Color.white);
	      lampF.add(labelF);
	      
	      lampG = new RoundedPanel(30);
	      lampG.setBounds(260, 390, 30, 30);
	      lampG.setOpaque(false);
	      lampG.setBackground(Color.black);
	      lampG.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampG);
	      labelG = new JLabel("G");
	      labelG.setForeground(Color.white);
	      lampG.add(labelG);
	      
	      lampH = new RoundedPanel(30);
	      lampH.setBounds(300, 390, 30, 30);
	      lampH.setOpaque(false);
	      lampH.setBackground(Color.black);
	      lampH.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampH);
	      labelH = new JLabel("H");
	      labelH.setForeground(Color.white);
	      lampH.add(labelH);
	      
	      lampJ = new RoundedPanel(30);
	      lampJ.setBounds(340, 390, 30, 30);
	      lampJ.setOpaque(false);
	      lampJ.setBackground(Color.black);
	      lampJ.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampJ);
	      labelJ = new JLabel("J");
	      labelJ.setForeground(Color.white);
	      lampJ.add(labelJ);
	      
	      lampK = new RoundedPanel(30);
	      lampK.setBounds(380, 390, 30, 30);
	      lampK.setOpaque(false);
	      lampK.setBackground(Color.black);
	      lampK.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampK);
	      labelK = new JLabel("K");
	      labelK.setForeground(Color.white);
	      lampK.add(labelK);
	      
	      lampL = new RoundedPanel(30);
	      lampL.setBounds(420, 390, 30, 30);
	      lampL.setOpaque(false);
	      lampL.setBackground(Color.black);
	      lampL.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampL);
	      labelL = new JLabel("L");
	      labelL.setForeground(Color.white);
	      lampL.add(labelL);
	      
	      lampZ = new RoundedPanel(30);
	      lampZ.setBounds(130, 430, 30, 30);
	      lampZ.setOpaque(false);
	      lampZ.setBackground(Color.black);
	      lampZ.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampZ);
	      labelZ = new JLabel("Z");
	      labelZ.setForeground(Color.white);
	      lampZ.add(labelZ);
	      
	      lampX = new RoundedPanel(30);
	      lampX.setBounds(170, 430, 30, 30);
	      lampX.setOpaque(false);
	      lampX.setBackground(Color.black);
	      lampX.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampX);
	      labelX = new JLabel("X");
	      labelX.setForeground(Color.white);
	      lampX.add(labelX);
	      
	      lampC = new RoundedPanel(30);
	      lampC.setBounds(210, 430, 30, 30);
	      lampC.setOpaque(false);
	      lampC.setBackground(Color.black);
	      lampC.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampC);
	      labelC = new JLabel("C");
	      labelC.setForeground(Color.white);
	      lampC.add(labelC);
	      
	      lampV = new RoundedPanel(30);
	      lampV.setBounds(250, 430, 30, 30);
	      lampV.setOpaque(false);
	      lampV.setBackground(Color.black);
	      lampV.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampV);
	      labelV = new JLabel("V");
	      labelV.setForeground(Color.white);
	      lampV.add(labelV);
	      
	      lampB = new RoundedPanel(30);
	      lampB.setBounds(290, 430, 30, 30);
	      lampB.setOpaque(false);
	      lampB.setBackground(Color.black);
	      lampB.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampB);
	      labelB = new JLabel("B");
	      labelB.setForeground(Color.white);
	      lampB.add(labelB);
	      
	      lampN = new RoundedPanel(30);
	      lampN.setBounds(330, 430, 30, 30);
	      lampN.setOpaque(false);
	      lampN.setBackground(Color.black);
	      lampN.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampN);
	      labelN = new JLabel("N");
	      labelN.setForeground(Color.white);
	      lampN.add(labelN);
	      
	      lampM = new RoundedPanel(30);
	      lampM.setBounds(370, 430, 30, 30);
	      lampM.setOpaque(false);
	      lampM.setBackground(Color.black);
	      lampM.setForeground(Color.LIGHT_GRAY);
	      pane.add(lampM);
	      labelM = new JLabel("M");
	      labelM.setForeground(Color.white);
	      lampM.add(labelM);
	/* END OF KEYLAMP*/
	      
	         /*START OF KEYBOARD*/
	      keyboardBox = Box.createVerticalBox();
	      keyboardBox.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	      keyboardBox.setBounds(70, 490, 420, 130);//60 apart from frame
	      ListenForMouseKB lForMouseKB = new ListenForMouseKB();
	      keyboardBox.addMouseListener(lForMouseKB);
	      
//	      ListenForMouseMotion lForMouseMotion = new ListenForMouseMotion();
//	      pane.addMouseMotionListener(lForMouseMotion);
	     // keyboardBox.addKeyListener(lForMouseMotion);
	      //if(p==  keyboardBox.){
	      //if(70<=x && x<=490 && 490<=y && y<=620){
//	      if(mouseMovedToKey){
	      	
	      ListenForKey lForKey = new ListenForKey();
	      pane.addKeyListener(lForKey);
	      pane.setFocusable(true);
		  pane.requestFocusInWindow();
		 
		   

	     
//	      }
	      
			 keyQ = new RoundedPanel(30);
		      keyQ.setBounds(80, 500, 30, 30);
		      keyQ.setOpaque(false);
		      keyQ.setBackground(Color.black);
		      keyQ.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyQ);
		      labelQ = new JLabel("Q");
		      labelQ.setForeground(Color.white);
		      keyQ.add(labelQ);
		      ListenForMouse lForMouseQ = new ListenForMouse('q');
		      keyQ.addMouseListener(lForMouseQ);
		      
		      keyW = new RoundedPanel(30);
		      keyW.setBounds(120, 500, 30, 30);
		      keyW.setOpaque(false);
		      keyW.setBackground(Color.black);
		      keyW.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyW);
		      labelW = new JLabel("W");
		      labelW.setForeground(Color.white);
		      keyW.add(labelW);
		      ListenForMouse lForMouseW = new ListenForMouse('w');
		      keyW.addMouseListener(lForMouseW);
		      
		      keyE = new RoundedPanel(30);
		      keyE.setBounds(160, 500, 30, 30);
		      keyE.setOpaque(false);
		      keyE.setBackground(Color.black);
		      keyE.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyE);
		      labelE = new JLabel("E");
		      labelE.setForeground(Color.white);
		      keyE.add(labelE);
		      ListenForMouse lForMouseE = new ListenForMouse('e');
		      keyE.addMouseListener(lForMouseE);
		      
		      keyR = new RoundedPanel(30);
		      keyR.setBounds(200, 500, 30, 30);
		      keyR.setOpaque(false);
		      keyR.setBackground(Color.black);
		      keyR.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyR);
		      labelR = new JLabel("R");
		      labelR.setForeground(Color.white);
		      keyR.add(labelR);
		      ListenForMouse lForMouseR = new ListenForMouse('r');
		      keyR.addMouseListener(lForMouseR);
		      
		      keyT = new RoundedPanel(30);
		      keyT.setBounds(240, 500, 30, 30);
		      keyT.setOpaque(false);
		      keyT.setBackground(Color.black);
		      keyT.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyT);
		      labelT = new JLabel("T");
		      labelT.setForeground(Color.white);
		      keyT.add(labelT);
		      ListenForMouse lForMouseT = new ListenForMouse('t');
		      keyT.addMouseListener(lForMouseT);
		      
		      keyY = new RoundedPanel(30);
		      keyY.setBounds(280, 500, 30, 30);
		      keyY.setOpaque(false);
		      keyY.setBackground(Color.black);
		      keyY.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyY);
		      labelY = new JLabel("Y");
		      labelY.setForeground(Color.white);
		      keyY.add(labelY);
		      ListenForMouse lForMouseY = new ListenForMouse('y');
		      keyY.addMouseListener(lForMouseY);
		      
		      keyU = new RoundedPanel(30);
		      keyU.setBounds(320, 500, 30, 30);
		      keyU.setOpaque(false);
		      keyU.setBackground(Color.black);
		      keyU.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyU);
		      labelU = new JLabel("U");
		      labelU.setForeground(Color.white);
		      keyU.add(labelU);
		      ListenForMouse lForMouseU = new ListenForMouse('u');
		      keyU.addMouseListener(lForMouseU);
		      
		      keyI = new RoundedPanel(30);
		      keyI.setBounds(360, 500, 30, 30);
		      keyI.setOpaque(false);
		      keyI.setBackground(Color.black);
		      keyI.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyI);
		      labelI = new JLabel("Q");
		      labelI.setForeground(Color.white);
		      keyI.add(labelI);
		      ListenForMouse lForMouseI = new ListenForMouse('i');
		      keyI.addMouseListener(lForMouseI);
		      
		      keyO = new RoundedPanel(30);
		      keyO.setBounds(400, 500, 30, 30);
		      keyO.setOpaque(false);
		      keyO.setBackground(Color.black);
		      keyO.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyO);
		      labelO = new JLabel("O");
		      labelO.setForeground(Color.white);
		      keyO.add(labelO);
		      ListenForMouse lForMouseO = new ListenForMouse('o');
		      keyO.addMouseListener(lForMouseO);
		      
		      keyP = new RoundedPanel(30);
		      keyP.setBounds(440, 500, 30, 30);
		      keyP.setOpaque(false);
		      keyP.setBackground(Color.black);
		      keyP.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyP);
		      labelP = new JLabel("P");
		      labelP.setForeground(Color.white);
		      keyP.add(labelP);
		      ListenForMouse lForMouseP = new ListenForMouse('p');
		      keyP.addMouseListener(lForMouseP);
		      
		      keyA = new RoundedPanel(30);
		      keyA.setBounds(100, 540, 30, 30);
		      keyA.setOpaque(false);
		      keyA.setBackground(Color.black);
		      keyA.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyA);
		      labelA = new JLabel("A");
		      labelA.setForeground(Color.white);
		      keyA.add(labelA);
		      ListenForMouse lForMouseA = new ListenForMouse('a');
		      keyA.addMouseListener(lForMouseA);
		      
		      keyS = new RoundedPanel(30);
		      keyS.setBounds(140, 540, 30, 30);
		      keyS.setOpaque(false);
		      keyS.setBackground(Color.black);
		      keyS.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyS);
		      labelS = new JLabel("S");
		      labelS.setForeground(Color.white);
		      keyS.add(labelS);
		      ListenForMouse lForMouseS = new ListenForMouse('s');
		      keyS.addMouseListener(lForMouseS);
		      
		      keyD = new RoundedPanel(30);
		      keyD.setBounds(180, 540, 30, 30);
		      keyD.setOpaque(false);
		      keyD.setBackground(Color.black);
		      keyD.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyD);
		      labelD = new JLabel("D");
		      labelD.setForeground(Color.white);
		      keyD.add(labelD);
		      ListenForMouse lForMouseD = new ListenForMouse('d');
		      keyD.addMouseListener(lForMouseD);
		      
		      keyF = new RoundedPanel(30);
		      keyF.setBounds(220, 540, 30, 30);
		      keyF.setOpaque(false);
		      keyF.setBackground(Color.black);
		      keyF.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyF);
		      labelF = new JLabel("F");
		      labelF.setForeground(Color.white);
		      keyF.add(labelF);
		      ListenForMouse lForMouseF = new ListenForMouse('f');
		      keyF.addMouseListener(lForMouseF);
		      
		      keyG = new RoundedPanel(30);
		      keyG.setBounds(260, 540, 30, 30);
		      keyG.setOpaque(false);
		      keyG.setBackground(Color.black);
		      keyG.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyG);
		      labelG = new JLabel("G");
		      labelG.setForeground(Color.white);
		      keyG.add(labelG);
		      ListenForMouse lForMouseG = new ListenForMouse('g');
		      keyG.addMouseListener(lForMouseG);
		      
		      keyH = new RoundedPanel(30);
		      keyH.setBounds(300, 540, 30, 30);
		      keyH.setOpaque(false);
		      keyH.setBackground(Color.black);
		      keyH.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyH);
		      labelH = new JLabel("H");
		      labelH.setForeground(Color.white);
		      keyH.add(labelH);
		      ListenForMouse lForMouseH = new ListenForMouse('h');
		      keyH.addMouseListener(lForMouseH);
		      
		      keyJ = new RoundedPanel(30);
		      keyJ.setBounds(340, 540, 30, 30);
		      keyJ.setOpaque(false);
		      keyJ.setBackground(Color.black);
		      keyJ.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyJ);
		      labelJ = new JLabel("J");
		      labelJ.setForeground(Color.white);
		      keyJ.add(labelJ);
		      ListenForMouse lForMouseJ = new ListenForMouse('j');
		      keyJ.addMouseListener(lForMouseJ);
		      
		      keyK = new RoundedPanel(30);
		      keyK.setBounds(380, 540, 30, 30);
		      keyK.setOpaque(false);
		      keyK.setBackground(Color.black);
		      keyK.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyK);
		      labelK = new JLabel("K");
		      labelK.setForeground(Color.white);
		      keyK.add(labelK);
		      ListenForMouse lForMouseK = new ListenForMouse('k');
		      keyK.addMouseListener(lForMouseK);
		      
		      keyL = new RoundedPanel(30);
		      keyL.setBounds(420, 540, 30, 30);
		      keyL.setOpaque(false);
		      keyL.setBackground(Color.black);
		      keyL.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyL);
		      labelL = new JLabel("L");
		      labelL.setForeground(Color.white);
		      keyL.add(labelL);
		      ListenForMouse lForMouseL = new ListenForMouse('l');
		      keyL.addMouseListener(lForMouseL);
		      
		      keyZ = new RoundedPanel(30);
		      keyZ.setBounds(130, 580, 30, 30);
		      keyZ.setOpaque(false);
		      keyZ.setBackground(Color.black);
		      keyZ.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyZ);
		      labelZ = new JLabel("Z");
		      labelZ.setForeground(Color.white);
		      keyZ.add(labelZ);
		      ListenForMouse lForMouseZ = new ListenForMouse('z');
		      keyZ.addMouseListener(lForMouseZ);
		      
		      keyX = new RoundedPanel(30);
		      keyX.setBounds(170, 580, 30, 30);
		      keyX.setOpaque(false);
		      keyX.setBackground(Color.black);
		      keyX.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyX);
		      labelX = new JLabel("X");
		      labelX.setForeground(Color.white);
		      keyX.add(labelX);
		      ListenForMouse lForMouseX = new ListenForMouse('x');
		      keyX.addMouseListener(lForMouseX);
		      
		      keyC = new RoundedPanel(30);
		      keyC.setBounds(210, 580, 30, 30);
		      keyC.setOpaque(false);
		      keyC.setBackground(Color.black);
		      keyC.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyC);
		      labelC = new JLabel("C");
		      labelC.setForeground(Color.white);
		      keyC.add(labelC);
		      ListenForMouse lForMouseC = new ListenForMouse('c');
		      keyC.addMouseListener(lForMouseC);
		      
		      keyV = new RoundedPanel(30);
		      keyV.setBounds(250, 580, 30, 30);
		      keyV.setOpaque(false);
		      keyV.setBackground(Color.black);
		      keyV.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyV);
		      labelV = new JLabel("V");
		      labelV.setForeground(Color.white);
		      keyV.add(labelV);
		      ListenForMouse lForMouseV = new ListenForMouse('v');
		      keyV.addMouseListener(lForMouseV);
		      
		      keyB = new RoundedPanel(30);
		      keyB.setBounds(290, 580, 30, 30);
		      keyB.setOpaque(false);
		      keyB.setBackground(Color.black);
		      keyB.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyB);
		      labelB = new JLabel("B");
		      labelB.setForeground(Color.white);
		      keyB.add(labelB);
		      ListenForMouse lForMouseB = new ListenForMouse('b');
		      keyB.addMouseListener(lForMouseB);
		      
		      keyN = new RoundedPanel(30);
		      keyN.setBounds(330, 580, 30, 30);
		      keyN.setOpaque(false);
		      keyN.setBackground(Color.black);
		      keyN.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyN);
		      labelN = new JLabel("N");
		      labelN.setForeground(Color.white);
		      keyN.add(labelN);
		      ListenForMouse lForMouseN = new ListenForMouse('n');
		      keyN.addMouseListener(lForMouseN);
		      
		      keyM = new RoundedPanel(30);
		      keyM.setBounds(370, 580, 30, 30);
		      keyM.setOpaque(false);
		      keyM.setBackground(Color.black);
		      keyM.setForeground(Color.LIGHT_GRAY);
		      pane.add(keyM);
		      labelM = new JLabel("M");
		      labelM.setForeground(Color.white);
		      keyM.add(labelM);
		      ListenForMouse lForMouseM = new ListenForMouse('m');
		      keyM.addMouseListener(lForMouseM);
		      /* END OF KEYBOARD*/
	     
	      pane.add(plugboardBox);
	      pane.add(rotorBox);
	      pane.add(lampboardBox);
	      pane.add(keyboardBox);
	      
	      //connectToLampPath(keyInput);
	      
	      this.setVisible(true);
	}
	
	private class ListenForMouseKB implements MouseListener{

		public void mouseClicked(MouseEvent e) {
			pane.setFocusable(true);
			pane.requestFocusInWindow();	
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
		
	}
	class RoundedPanel extends JPanel
	  {
	      private Color backgroundColor;
	      private int cornerRadius = 15;

	      public RoundedPanel(LayoutManager layout, int radius) {
	          super(layout);
	          cornerRadius = radius;
	      }

	      public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
	          super(layout);
	          cornerRadius = radius;
	          backgroundColor = bgColor;
	      }

	      public RoundedPanel(int radius) {
	          super();
	          cornerRadius = radius;
	      }

	      public RoundedPanel(int radius, Color bgColor) {
	          super();
	          cornerRadius = radius;
	          backgroundColor = bgColor;
	      }

	      @Override
	      protected void paintComponent(Graphics g) {
	          super.paintComponent(g);
	          Dimension arcs = new Dimension(cornerRadius, cornerRadius);
	          int width = getWidth();
	          int height = getHeight();
	          Graphics2D graphics = (Graphics2D) g;
	          graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	          //Draws the rounded panel with borders.
	          if (backgroundColor != null) {
	              graphics.setColor(backgroundColor);
	          } else {
	              graphics.setColor(getBackground());
	          }
	          graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
	          graphics.setColor(getForeground());
	          graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
	      }
	     
	  }
	
	
	private class ListenForChange implements ItemListener{

		public void itemStateChanged(ItemEvent e) {
			if(e.getSource() == rotor1){
				//ground
				rotorsRunning.add(rotors.getRoll1_1());
				//ring
				rotorsRunning.add(rotors.getRoll1_2());
				//index of the ring
				rotor1Index = rotorsRunning.size() -1;
				System.out.println("Rotor1");
			}
			if(e.getSource() == rotor2){
				rotorsRunning.add(rotors.getRoll2_1());
				rotorsRunning.add(rotors.getRoll2_2());
				rotor2Index = rotorsRunning.size() -1;
				System.out.println("Rotor2");
			}
			if(e.getSource() == rotor3){
				rotorsRunning.add(rotors.getRoll3_1());
				rotorsRunning.add(rotors.getRoll3_2());
				rotor3Index = rotorsRunning.size() -1;
				System.out.println("Rotor3");
			}
			if(e.getSource() == rotor4){
				rotorsRunning.add(rotors.getRoll4_1());
				rotorsRunning.add(rotors.getRoll4_2());
				rotor4Index = rotorsRunning.size() -1;
				System.out.println("Rotor4");
			}
			if(e.getSource() == rotor5){
				rotorsRunning.add(rotors.getRoll5_1());
				rotorsRunning.add(rotors.getRoll5_2());
				rotor5Index = rotorsRunning.size() -1;
				System.out.println("Rotor5");
			}
			if(showPlugboard.isSelected()){
				new Plugboard(steckerboardPair.getText()).setVisible(true);
			}
//			if(keyPressed){
//				rotorI.setValue(rotorsRunning.get(1).get(0).toString());
//			}
//			if(numRotor1Advance % 26 == 0){
//				rotorII.setValue(rotorsRunning.get(3).get(0).toString());
//			}
//			if(numRotor2Advance % 26 == 0){
//				rotorIII.setValue(rotorsRunning.get(5).get(0).toString());
//			}
		}

		
	}
	private class ListenForMouse implements MouseListener{

		char input;
		
		public ListenForMouse(char input){
			this.input = input;
		}
		public void mouseClicked(MouseEvent e) {
			
		}

		public void mousePressed(MouseEvent e) {
			keyInput = input;
			System.out.println(keyInput);
			numKey ++;
			if(input == 'q'){
				keyQ.setForeground(Color.DARK_GRAY);
			}
			if(input == 'w'){
				keyW.setForeground(Color.DARK_GRAY);
			}
			if(input == 'e'){
				keyE.setForeground(Color.DARK_GRAY);
			}
			if(input == 'r'){
				keyR.setForeground(Color.DARK_GRAY);
			}
			if(input == 't'){
				keyT.setForeground(Color.DARK_GRAY);
			}
			if(input == 'y'){
				keyY.setForeground(Color.DARK_GRAY);
			}
			if(input == 'u'){
				keyU.setForeground(Color.DARK_GRAY);
			}
			if(input == 'i'){
				keyI.setForeground(Color.DARK_GRAY);
			}
			if(input == 'o'){
				keyO.setForeground(Color.DARK_GRAY);
			}
			if(input == 'p'){
				keyP.setForeground(Color.DARK_GRAY);
			}
			if(input == 'a'){
				keyA.setForeground(Color.DARK_GRAY);
			}
			if(input == 's'){
				keyS.setForeground(Color.DARK_GRAY);
			}
			if(input == 'd'){
				keyD.setForeground(Color.DARK_GRAY);
			}
			if(input == 'f'){
				keyF.setForeground(Color.DARK_GRAY);
			}
			if(input == 'g'){
				keyG.setForeground(Color.DARK_GRAY);
			}
			if(input == 'h'){
				keyH.setForeground(Color.DARK_GRAY);
			}
			if(input == 'j'){
				keyJ.setForeground(Color.DARK_GRAY);
			}
			if(input == 'k'){
				keyK.setForeground(Color.DARK_GRAY);
			}
			if(input == 'l'){
				keyL.setForeground(Color.DARK_GRAY);
			}
			if(input == 'z'){
				keyZ.setForeground(Color.DARK_GRAY);
			}
			if(input == 'x'){
				keyX.setForeground(Color.DARK_GRAY);
			}
			if(input == 'c'){
				keyC.setForeground(Color.DARK_GRAY);
			}
			if(input == 'v'){
				keyV.setForeground(Color.DARK_GRAY);
			}
			if(input == 'b'){
				keyB.setForeground(Color.DARK_GRAY);
			}
			if(input == 'n'){
				keyN.setForeground(Color.DARK_GRAY);
			}
			if(input == 'm'){
				keyM.setForeground(Color.DARK_GRAY);
			}
			
			if(numKey == 1){
				connectToLampPath(keyInput);
				}
				//change spinner set value whenever rotors advance
				keyOutput = new Plugboard(steckerboardPair.getText()).getModelAplpha().get(alphabet.indexOf(keyInput));
				//rotor1 - outer then ring
				keyOutput = rotorsRunning.get(1).get(rotorsRunning.get(0).indexOf(keyOutput));
				//only ring setting advances.
				rotorsRunning.set(1, rotors.advance(rotorsRunning.get(1)));
				numRotor1Advance++;
				//rotor2
				keyOutput = rotorsRunning.get(3).get(rotorsRunning.get(2).indexOf(keyOutput));
				if(numRotor1Advance % 26 == 0){
					rotorsRunning.set(3, rotors.advance(rotorsRunning.get(3)));
					numRotor2Advance++;
				}
				//rotor3
				keyOutput = rotorsRunning.get(5).get(rotorsRunning.get(4).indexOf(keyOutput));
				if(numRotor2Advance % 26 == 0){
					rotorsRunning.set(5, rotors.advance(rotorsRunning.get(5)));
				}
				//reflector
				keyOutput = new Reflector().getReflector11().get(alphabet.indexOf(keyOutput));
				//rotor3 - ring and then outer.
				keyOutput = rotorsRunning.get(4).get(rotorsRunning.get(5).indexOf(keyOutput));
				//rotor2
				keyOutput = rotorsRunning.get(2).get(rotorsRunning.get(3).indexOf(keyOutput));
				//rotor1
				keyOutput = rotorsRunning.get(0).get(rotorsRunning.get(1).indexOf(keyOutput));
				//plugboard
				keyOutput = new Plugboard(steckerboardPair.getText()).getModelAplpha().get(alphabet.indexOf(keyOutput));
				findCharLamp(keyOutput).setBackground(Color.YELLOW);
				Timer timer = new Timer(300, new ActionListener(){
					public void actionPerformed(ActionEvent e){
						findCharLamp(keyOutput).setBackground(Color.black);
						System.out.print(keyOutput);
						((Timer)(e.getSource())).stop();
					}
				});
				timer.setRepeats(false);
				timer.start();
			
		}
		public void mouseReleased(MouseEvent e) {
			if(input == 'q'){
				keyQ.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'w'){
				keyW.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'e'){
				keyE.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'r'){
				keyR.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 't'){
				keyT.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'y'){
				keyY.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'u'){
				keyU.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'i'){
				keyI.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'o'){
				keyO.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'p'){
				keyP.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'a'){
				keyA.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 's'){
				keyS.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'd'){
				keyD.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'f'){
				keyF.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'g'){
				keyG.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'h'){
				keyH.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'j'){
				keyJ.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'k'){
				keyK.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'l'){
				keyL.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'z'){
				keyZ.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'x'){
				keyX.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'c'){
				keyC.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'v'){
				keyV.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'b'){
				keyB.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'n'){
				keyN.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'm'){
				keyM.setForeground(Color.LIGHT_GRAY);
			}
		}
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
	}
	private class ListenForKey implements KeyListener{

		char input;
		public void keyTyped(KeyEvent e) {
			keyInput = e.getKeyChar();
		}
		public void keyPressed(KeyEvent e) {
			numKey ++;
			input = e.getKeyChar();
			keyInput = input;
			//keyPressed = true;
			if(input == 'q'){
				keyQ.setForeground(Color.DARK_GRAY);
				//rotorI.setValue(rotorsRunning.get(0).get(0).toString());
			}
			if(input == 'w'){
				keyW.setForeground(Color.DARK_GRAY);
			}
			if(input == 'e'){
				keyE.setForeground(Color.DARK_GRAY);
			}
			if(input == 'r'){
				keyR.setForeground(Color.DARK_GRAY);
			}
			if(input == 't'){
				keyT.setForeground(Color.DARK_GRAY);
			}
			if(input == 'y'){
				keyY.setForeground(Color.DARK_GRAY);
			}
			if(input == 'u'){
				keyU.setForeground(Color.DARK_GRAY);
			}
			if(input == 'i'){
				keyI.setForeground(Color.DARK_GRAY);
			}
			if(input == 'o'){
				keyO.setForeground(Color.DARK_GRAY);
			}
			if(input == 'p'){
				keyP.setForeground(Color.DARK_GRAY);
			}
			if(input == 'a'){
				keyA.setForeground(Color.DARK_GRAY);
			}
			if(input == 's'){
				keyS.setForeground(Color.DARK_GRAY);
			}
			if(input == 'd'){
				keyD.setForeground(Color.DARK_GRAY);
			}
			if(input == 'f'){
				keyF.setForeground(Color.DARK_GRAY);
			}
			if(input == 'g'){
				keyG.setForeground(Color.DARK_GRAY);
			}
			if(input == 'h'){
				keyH.setForeground(Color.DARK_GRAY);
			}
			if(input == 'j'){
				keyJ.setForeground(Color.DARK_GRAY);
			}
			if(input == 'k'){
				keyK.setForeground(Color.DARK_GRAY);
			}
			if(input == 'l'){
				keyL.setForeground(Color.DARK_GRAY);
			}
			if(input == 'z'){
				keyZ.setForeground(Color.DARK_GRAY);
			}
			if(input == 'x'){
				keyX.setForeground(Color.DARK_GRAY);
			}
			if(input == 'c'){
				keyC.setForeground(Color.DARK_GRAY);
			}
			if(input == 'v'){
				keyV.setForeground(Color.DARK_GRAY);
			}
			if(input == 'b'){
				keyB.setForeground(Color.DARK_GRAY);
			}
			if(input == 'n'){
				keyN.setForeground(Color.DARK_GRAY);
			}
			if(input == 'm'){
				keyM.setForeground(Color.DARK_GRAY);
			}
			if(numKey == 1){
			connectToLampPath(keyInput);
			System.out.println("Rotor1 part 1: " + rotorsRunning.get(0));
			System.out.println("Rotor1 part 2: " + rotorsRunning.get(1));
			System.out.println("Rotor2 part 1: " + rotorsRunning.get(2));
			System.out.println("Rotor2 part 2: " + rotorsRunning.get(3));
			System.out.println("Rotor3 part 1: " + rotorsRunning.get(4));
			System.out.println("Rotor3 part 2: " + rotorsRunning.get(5));
			}
			//change spinner set value whenever rotors advance
			keyOutput = new Plugboard(steckerboardPair.getText()).getModelAplpha().get(alphabet.indexOf(keyInput));
			//System.out.println(keyOutput);
			//rotor1 - outer then ring
			keyOutput = rotorsRunning.get(1).get(rotorsRunning.get(0).indexOf(keyOutput));
			//System.out.println(keyOutput);
			
			//System.out.println("Rotor 1: " + rotorsRunning.get(1));
			numRotor1Advance++;
			//System.out.println("numRotor1Advance: " +numRotor1Advance);
			//rotor2
			keyOutput = rotorsRunning.get(3).get(rotorsRunning.get(2).indexOf(keyOutput));
			//System.out.println(keyOutput);
			
			//rotor3
			keyOutput = rotorsRunning.get(5).get(rotorsRunning.get(4).indexOf(keyOutput));
			//System.out.println(keyOutput);
			
			//reflector
			//keyOutput = new Reflector().getReflector11().get(alphabet.indexOf(keyOutput));
			keyOutput = new Reflector().approach(keyOutput);
			//System.out.println(keyOutput);
			//rotor3 - ring and then outer.
			keyOutput = rotorsRunning.get(4).get(rotorsRunning.get(5).indexOf(keyOutput));
			//System.out.println(keyOutput);
			//rotor2
			keyOutput = rotorsRunning.get(2).get(rotorsRunning.get(3).indexOf(keyOutput));
			//System.out.println(keyOutput);
			//rotor1
			keyOutput = rotorsRunning.get(0).get(rotorsRunning.get(1).indexOf(keyOutput));
			//System.out.println(keyOutput);
			//plugboard
			keyOutput = new Plugboard(steckerboardPair.getText()).getModelAplpha().get(alphabet.indexOf(keyOutput));
			//System.out.println(keyOutput);
			
			//only ring setting advances.
			rotorsRunning.set(1, rotors.advance(rotorsRunning.get(1)));
			if(numRotor1Advance % 26 == 0){
				rotorsRunning.set(3, rotors.advance(rotorsRunning.get(3)));
				numRotor2Advance++;
				//System.out.println("numRotor2Advance: " +numRotor2Advance);
				//System.out.println("Rotor 2: " + rotorsRunning.get(3));
			}
			if(numRotor2Advance % 26 == 0 && numRotor2Advance != 0){
				rotorsRunning.set(5, rotors.advance(rotorsRunning.get(5)));
				//System.out.println("numRotor2Advance: " +numRotor2Advance);
				//System.out.println("Rotor 3: " + rotorsRunning.get(5));
			}
			
			findCharLamp(keyOutput).setBackground(Color.YELLOW);
			Timer timer = new Timer(200, new ActionListener(){
				public void actionPerformed(ActionEvent e){
					findCharLamp(keyOutput).setBackground(Color.black);
					System.out.print(keyOutput);
					((Timer)(e.getSource())).stop();
				}
			});
			timer.setRepeats(false);
			timer.start();
		
		}
		public void keyReleased(KeyEvent e) {
			input = e.getKeyChar();
			if(input == 'q'){
				keyQ.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'w'){
				keyW.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'e'){
				keyE.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'r'){
				keyR.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 't'){
				keyT.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'y'){
				keyY.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'u'){
				keyU.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'i'){
				keyI.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'o'){
				keyO.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'p'){
				keyP.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'a'){
				keyA.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 's'){
				keyS.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'd'){
				keyD.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'f'){
				keyF.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'g'){
				keyG.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'h'){
				keyH.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'j'){
				keyJ.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'k'){
				keyK.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'l'){
				keyL.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'z'){
				keyZ.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'x'){
				keyX.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'c'){
				keyC.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'v'){
				keyV.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'b'){
				keyB.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'n'){
				keyN.setForeground(Color.LIGHT_GRAY);
			}
			if(input == 'm'){
				keyM.setForeground(Color.LIGHT_GRAY);
			}
		}
		
	}

	public JPanel findCharLamp(char letter){
		if(letter == 'q'){
			return lampQ;
		}
		else if(letter == 'w'){
			return lampW;
		}
		else if(letter == 'e'){
			return lampE;
		}
		else if(letter == 'r'){
			return lampR;
		}
		else if(letter == 't'){
			return lampT;
		}
		else if(letter == 'y'){
			return lampY;
		}
		else if(letter == 'u'){
			return lampU;
		}
		else if(letter == 'i'){
			return lampI;
		}
		else if(letter == 'o'){
			return lampO;
		}
		else if(letter == 'p'){
			return lampP;
		}
		else if(letter == 'a'){
			return lampA;
		}
		else if(letter == 's'){
			return lampS;
		}
		else if(letter == 'd'){
			return lampD;
		}
		else if(letter == 'f'){
			return lampF;
		}
		else if(letter == 'g'){
			return lampG;
		}
		else if(letter == 'h'){
			return lampH;
		}
		else if(letter == 'j'){
			return lampJ;
		}
		else if(letter == 'k'){
			return lampK;
		}
		else if(letter == 'l'){
			return lampL;
		}
		else if(letter == 'z'){
			return lampZ;
		}
		else if(letter == 'x'){
			return lampX;
		}
		else if(letter == 'c'){
			return lampC;
		}
		else if(letter == 'v'){
			return lampV;
		}
		else if(letter == 'b'){
			return lampB;
		}
		else if(letter == 'n'){
			return lampN;
		}
		else{
			return lampM;
		}
		
		
	}
	private JSpinner getRingSettingsOrder(int index){
		if(index == 1){
			return rotorI;
		}
		else if(index == 3){
			return rotorII;
		}
		else{
			return rotorIII;
		}
	}
	private void connectToLampPath(char keyInput){
		//spinner same order as rotorsRunning
		if(rotor1.isSelected()){
			//init inner ring - ring settings
			rotorsRunning.set(rotor1Index, rotors.Init(Character.toLowerCase(((String)getRingSettingsOrder(rotor1Index).getValue()).charAt(0)), rotors.getRoll1_2()));
			//init outer ring - ground settings
			rotorsRunning.set(rotor1Index-1, rotors.Init(groundSettings.getText().charAt(rotor1Index/2), rotors.getRoll1_1()));
			
		}
		if(rotor2.isSelected()){
			rotorsRunning.set(rotor2Index, rotors.Init(Character.toLowerCase(((String)getRingSettingsOrder(rotor2Index).getValue()).charAt(0)), rotors.getRoll2_2()));
			rotorsRunning.set(rotor2Index-1, rotors.Init(groundSettings.getText().charAt(rotor2Index/2), rotors.getRoll2_1()));
		}
		if(rotor3.isSelected()){
			rotorsRunning.set(rotor3Index, rotors.Init(Character.toLowerCase(((String)getRingSettingsOrder(rotor3Index).getValue()).charAt(0)), rotors.getRoll3_2()));
			rotorsRunning.set(rotor3Index-1, rotors.Init(groundSettings.getText().charAt(rotor3Index/2), rotors.getRoll3_1()));
		}
		if(rotor4.isSelected()){
			rotorsRunning.set(rotor4Index, rotors.Init(Character.toLowerCase(((String)getRingSettingsOrder(rotor4Index).getValue()).charAt(0)), rotors.getRoll4_2()));
			rotorsRunning.set(rotor4Index-1, rotors.Init(groundSettings.getText().charAt(rotor4Index/2), rotors.getRoll4_1()));
		}
		if(rotor5.isSelected()){
			rotorsRunning.set(rotor5Index, rotors.Init(Character.toLowerCase(((String)getRingSettingsOrder(rotor5Index).getValue()).charAt(0)), rotors.getRoll5_2()));
			rotorsRunning.set(rotor5Index-1, rotors.Init(groundSettings.getText().charAt(rotor5Index/2), rotors.getRoll5_1()));
		}
		
	}
	public static void main(String[] args) {
		new Enigma();
		
		
	}
	

}