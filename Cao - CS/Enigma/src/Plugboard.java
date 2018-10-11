import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.CubicCurve2D;
import java.util.ArrayList;
import java.util.TimerTask;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import java.util.Timer;
import javax.swing.Timer;

//setVisible(true)whenever create a new instance -> not yet init 
//in the constructor

public class Plugboard extends JFrame{
	private final String model = "abcdefghijklmnopqrstuvwxyz";
	private ArrayList<Character> modelAlpha;
	
	public String[] pairs;
	
	private JPanel panelQ;
	private JPanel panelW;
	private JPanel panelE;
	private JPanel panelR;
	private JPanel panelT;
	private JPanel panelY;
	private JPanel panelU;
	private JPanel panelI;
	private JPanel panelO;
	private JPanel panelP;
	private JPanel panelA;
	private JPanel panelS;
	private JPanel panelD;
	private JPanel panelF;
	private JPanel panelG;
	private JPanel panelH;
	private JPanel panelJ;
	private JPanel panelK;
	private JPanel panelL;
	private JPanel panelZ;
	private JPanel panelX;
	private JPanel panelC;
	private JPanel panelV;
	private JPanel panelB;
	private JPanel panelN;
	private JPanel panelM;
	
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
	
	
	
	public Plugboard(String settings){
		 
		this.setTitle("Plugboard Configuration");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(430,200);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		
		this.setLocation((int)width-210, (int)height/2-215);	
		setResizable(false);
		this.getContentPane().setBackground(new Color(200,80, 50));
		
	     

		
		modelAlpha = new ArrayList<Character>();
		
		for(int i = 0; i<26; i++){
			modelAlpha.add(model.charAt(i));
		}
		pairs = settings.split(" ");
		for(int i = 0; i < 10; i++){
			change(pairs[i].charAt(0), pairs[i].charAt(1));
		}
		
		panelQ = new JPanel();
		panelQ.setBounds(30, 30, 10, 20);
		panelQ.setForeground(Color.white);
		this.add(panelQ);
		labelQ = new JLabel("Q");
		labelQ.setBounds(30,10,10,20);
		labelQ.setForeground(Color.black);
		this.add(labelQ);
		
		panelW = new JPanel();
		panelW.setBounds(70, 30, 10, 20);
		panelW.setForeground(Color.white);
		this.add(panelW);
		labelW = new JLabel("W");
		labelW.setBounds(70,10,15,20);
		labelW.setForeground(Color.black);
		this.add(labelW);
		
		panelE = new JPanel();
		panelE.setBounds(110, 30, 10, 20);
		panelE.setForeground(Color.white);
		this.add(panelE);
		labelE = new JLabel("E");
		labelE.setBounds(110,10,10,20);
		labelE.setForeground(Color.black);
		this.add(labelE);
		
		panelR = new JPanel();
		panelR.setBounds(150, 30, 10, 20);
		panelR.setForeground(Color.white);
		this.add(panelR);
		labelR = new JLabel("R");
		labelR.setBounds(150,10,10,20);
		labelR.setForeground(Color.black);
		this.add(labelR);
		
		panelT = new JPanel();
		panelT.setBounds(190, 30, 10, 20);
		panelT.setForeground(Color.white);
		this.add(panelT);
		labelT = new JLabel("T");
		labelT.setBounds(190,10,10,20);
		labelT.setForeground(Color.black);
		this.add(labelT);
		
		panelY = new JPanel();
		panelY.setBounds(230, 30, 10, 20);
		panelY.setForeground(Color.white);
		this.add(panelY);
		labelY = new JLabel("Y");
		labelY.setBounds(230,10,10,20);
		labelY.setForeground(Color.black);
		this.add(labelY);
		
		panelU = new JPanel();
		panelU.setBounds( 270, 30, 10, 20);
		panelU.setForeground(Color.white);
		this.add(panelU);
		labelU = new JLabel("U");
		labelU.setBounds(270,10,10,20);
		labelU.setForeground(Color.black);
		this.add(labelU);
		
		panelI = new JPanel();
		panelI.setBounds(310, 30, 10, 20);
		panelI.setForeground(Color.white);
		this.add(panelI);
		labelI = new JLabel("I");
		labelI.setBounds(310,10,10,20);
		labelI.setForeground(Color.black);
		this.add(labelI);
		
		panelO = new JPanel();
		panelO.setBounds(350, 30, 10, 20);
		panelO.setForeground(Color.white);
		this.add(panelO);
		labelO = new JLabel("O");
		labelO.setBounds(350,10,10,20);
		labelO.setForeground(Color.black);
		this.add(labelO);
		
		panelP = new JPanel();
		panelP.setBounds(390, 30, 10, 20);
		panelP.setForeground(Color.white);
		this.add(panelP);
		labelP = new JLabel("P");
		labelP.setBounds(390,10,10,20);
		labelP.setForeground(Color.black);
		this.add(labelP);
		
		panelA = new JPanel();
		panelA.setBounds(50, 80, 10, 20);
		panelA.setForeground(Color.white);
		this.add(panelA);
		labelA = new JLabel("A");
		labelA.setBounds(50,60,10,20);
		labelA.setForeground(Color.black);
		this.add(labelA);
		
		panelS = new JPanel();
		panelS.setBounds(90, 80, 10, 20);
		panelS.setForeground(Color.white);
		this.add(panelS);
		labelS = new JLabel("S");
		labelS.setBounds(90,60,10,20);
		labelS.setForeground(Color.black);
		this.add(labelS);
		
		panelD = new JPanel();
		panelD.setBounds(130, 80, 10, 20);
		panelD.setForeground(Color.white);
		this.add(panelD);
		labelD = new JLabel("D");
		labelD.setBounds(130,60,10,20);
		labelD.setForeground(Color.black);
		this.add(labelD);
		
		panelF = new JPanel();
		panelF.setBounds(170, 80, 10, 20);
		panelF.setForeground(Color.white);
		this.add(panelF);
		labelF = new JLabel("F");
		labelF.setBounds(170,60,10,20);
		labelF.setForeground(Color.black);
		this.add(labelF);
		
		panelG = new JPanel();
		panelG.setBounds(210, 80, 10, 20);
		panelG.setBackground(Color.white);
		this.add(panelG);
		labelG = new JLabel("G");
		labelG.setBounds(210,60,10,20);
		labelG.setForeground(Color.black);
		this.add(labelG);
		
		panelH = new JPanel();
		panelH.setBounds(250, 80, 10, 20);
		panelH.setForeground(Color.white);
		this.add(panelH);
		labelH = new JLabel("H");
		labelH.setBounds(250,60,10,20);
		labelH.setForeground(Color.black);
		this.add(labelH);
		
		panelJ = new JPanel();
		panelJ.setBounds(290, 80, 10, 20);
		panelJ.setForeground(Color.white);
		this.add(panelJ);
		labelJ = new JLabel("J");
		labelJ.setBounds(290,60,10,20);
		labelJ.setForeground(Color.black);
		this.add(labelJ);
		
		panelK = new JPanel();
		panelK.setBounds(330, 80, 10, 20);
		panelK.setForeground(Color.white);
		this.add(panelK);
		labelK = new JLabel("K");
		labelK.setBounds(330,60,10,20);
		labelK.setForeground(Color.black);
		this.add(labelK);
		
		panelL = new JPanel();
		panelL.setBounds(370, 80, 10, 20);
		panelL.setForeground(Color.white);
		this.add(panelL);
		labelL = new JLabel("L");
		labelL.setBounds(370,60,10,20);
		labelL.setForeground(Color.black);
		this.add(labelL);
		
		panelZ = new JPanel();
		panelZ.setBounds(90, 130, 10, 20);
		panelZ.setForeground(Color.white);
		this.add(panelZ);
		labelZ = new JLabel("Z");
		labelZ.setBounds(90,110,10,20);
		labelZ.setForeground(Color.black);
		this.add(labelZ);
		
		panelX = new JPanel();
		panelX.setBounds(130, 130, 10, 20);
		panelX.setForeground(Color.white);
		this.add(panelX);
		labelX = new JLabel("X");
		labelX.setBounds(130,110,10,20);
		labelX.setForeground(Color.black);
		this.add(labelX);
		
		panelC = new JPanel();
		panelC.setBounds(170, 130, 10, 20);
		panelC.setBackground(Color.white);
		this.add(panelC);
		labelC = new JLabel("C");
		labelC.setBounds(170,110,10,20);
		labelC.setForeground(Color.black);
		this.add(labelC);
		
		panelV = new JPanel();
		panelV.setBounds(210, 130, 10, 20);
		panelV.setForeground(Color.white);
		this.add(panelV);
		labelV = new JLabel("V");
		labelV.setBounds(210,110,10,20);
		labelV.setForeground(Color.black);
		this.add(labelV);
		
		panelB = new JPanel();
		panelB.setBounds(250, 130, 10, 20);
		panelB.setForeground(Color.white);
		this.add(panelB);
		labelB = new JLabel("B");
		labelB.setBounds(250,110,10,20);
		labelB.setForeground(Color.black);
		this.add(labelB);
		
		panelN = new JPanel();
		panelN.setBounds(290, 130, 10, 20);
		panelN.setBackground(Color.white);
		this.add(panelN);
		labelN = new JLabel("N");
		labelN.setBounds(290,110,10,20);
		labelN.setForeground(Color.black);
		this.add(labelN);
		
		panelM = new JPanel();
		panelM.setBounds(330, 130, 10, 20);
		panelM.setForeground(Color.white);
		this.add(panelM);
		labelM = new JLabel("M");
		labelM.setBounds(330,110,15,20);
		labelM.setForeground(Color.black);
		this.add(labelM);
		
		
	    this.add(new DrawStuff());
		
		
        
		//this.setVisible(true);
	}
	
	public void change(char x, char y){
		int xPos = modelAlpha.indexOf(x);
		int yPos = modelAlpha.indexOf(y);
		swap(xPos,yPos, modelAlpha);
		//return modelAlpha;
	}
	public ArrayList<Character> getModelAplpha(){
		return modelAlpha;
	}
	public void swap(int x, int y, ArrayList<Character> a){
		char temp = a.get(y);
		a.set(y, a.get(x));
		a.set(x, temp);
	}
	public void unplug(){
		for(int i = 0; i<26; i++){
			modelAlpha.set(i,model.charAt(i));
		}
	}
private class DrawStuff extends JComponent{
		int bigCount = 0;
	public DrawStuff(){
		Timer timer1 = new Timer(1500, new ActionListener(){
     	    
			int count = bigCount;
     	   public void actionPerformed(ActionEvent e){
     		  if(count==10){((Timer)(e.getSource())).stop();}
     		  else{
     			  count++;
     		  bigCount = count;
   		   repaint();
     		  }
           }
		});
		timer1.setRepeats(true);
		timer1.start();
	}
		public void paint(Graphics g){
			
            Graphics2D graph2 = (Graphics2D)g;
            graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            CubicCurve2D cubicCurve1 = new CubicCurve2D.Double();
            int x11 = findCharpanel(pairs[0].charAt(0)).getX() + 5;
            int y11 = findCharpanel(pairs[0].charAt(0)).getY() + 10;
            int x12 = findCharpanel(pairs[0].charAt(1)).getX() + 5;
            int y12 = findCharpanel(pairs[0].charAt(1)).getY() + 10; 
            cubicCurve1.setCurve(x11, y11, x11+5, y11+30, x12-5, y12+30, x12, y12);
           
            CubicCurve2D cubicCurve2 = new CubicCurve2D.Double();
            int x21 = findCharpanel(pairs[1].charAt(0)).getX() + 5;
            int y21 = findCharpanel(pairs[1].charAt(0)).getY() + 10;
            int x22 = findCharpanel(pairs[1].charAt(1)).getX() + 5;
            int y22 = findCharpanel(pairs[1].charAt(1)).getY() + 10; 
            cubicCurve2.setCurve(x21, y21, x21+5, y21+30, x22-5, y22+30, x22, y22);
            
            CubicCurve2D cubicCurve3 = new CubicCurve2D.Double();
            int x31 = findCharpanel(pairs[2].charAt(0)).getX() + 5;
            int y31 = findCharpanel(pairs[2].charAt(0)).getY() + 10;
            int x32 = findCharpanel(pairs[2].charAt(1)).getX() + 5;
            int y32 = findCharpanel(pairs[2].charAt(1)).getY() + 10; 
            cubicCurve3.setCurve(x31, y31, x31+5, y31+30, x32-5, y32+30, x32, y32);
            
            CubicCurve2D cubicCurve4 = new CubicCurve2D.Double();
            int x41 = findCharpanel(pairs[3].charAt(0)).getX() + 5;
            int y41 = findCharpanel(pairs[3].charAt(0)).getY() + 10;
            int x42 = findCharpanel(pairs[3].charAt(1)).getX() + 5;
            int y42 = findCharpanel(pairs[3].charAt(1)).getY() + 10; 
            cubicCurve4.setCurve(x41, y41, x41+5, y41+30, x42-5, y42+30, x42, y42);
            
            CubicCurve2D cubicCurve5 = new CubicCurve2D.Double();
            int x51 = findCharpanel(pairs[4].charAt(0)).getX() + 5;
            int y51 = findCharpanel(pairs[4].charAt(0)).getY() + 10;
            int x52 = findCharpanel(pairs[4].charAt(1)).getX() + 5;
            int y52 = findCharpanel(pairs[4].charAt(1)).getY() + 10; 
            cubicCurve5.setCurve(x51, y51, x51+5, y51+30, x52-5, y52+30, x52, y52);
            
            CubicCurve2D cubicCurve6 = new CubicCurve2D.Double();
            int x61 = findCharpanel(pairs[5].charAt(0)).getX() + 5;
            int y61 = findCharpanel(pairs[5].charAt(0)).getY() + 10;
            int x62 = findCharpanel(pairs[5].charAt(1)).getX() + 5;
            int y62 = findCharpanel(pairs[5].charAt(1)).getY() + 10; 
            cubicCurve6.setCurve(x61, y61, x61+5, y61+30, x62-5, y62+30, x62, y62);
            
            CubicCurve2D cubicCurve7 = new CubicCurve2D.Double();
            int x71 = findCharpanel(pairs[6].charAt(0)).getX() + 5;
            int y71 = findCharpanel(pairs[6].charAt(0)).getY() + 10;
            int x72 = findCharpanel(pairs[6].charAt(1)).getX() + 5;
            int y72 = findCharpanel(pairs[6].charAt(1)).getY() + 10; 
            cubicCurve7.setCurve(x71, y71, x71+5, y71+30, x72-5, y72+30, x72, y72);
            
            CubicCurve2D cubicCurve8 = new CubicCurve2D.Double();
            int x81 = findCharpanel(pairs[7].charAt(0)).getX() + 5;
            int y81 = findCharpanel(pairs[7].charAt(0)).getY() + 10;
            int x82 = findCharpanel(pairs[7].charAt(1)).getX() + 5;
            int y82 = findCharpanel(pairs[7].charAt(1)).getY() + 10; 
            cubicCurve8.setCurve(x81, y81, x81+5, y81+30, x82-5, y82+30, x82, y82);
            
            CubicCurve2D cubicCurve9 = new CubicCurve2D.Double();
            int x91 = findCharpanel(pairs[8].charAt(0)).getX() + 5;
            int y91 = findCharpanel(pairs[8].charAt(0)).getY() + 10;
            int x92 = findCharpanel(pairs[8].charAt(1)).getX() + 5;
            int y92 = findCharpanel(pairs[8].charAt(1)).getY() + 10; 
            cubicCurve9.setCurve(x91, y91, x91+5, y91+30, x92-5, y92+30, x92, y92);
            
            CubicCurve2D cubicCurve10 = new CubicCurve2D.Double();
            int x101 = findCharpanel(pairs[9].charAt(0)).getX() + 5;
            int y101 = findCharpanel(pairs[9].charAt(0)).getY() + 10;
            int x102 = findCharpanel(pairs[9].charAt(1)).getX() + 5;
            int y102 = findCharpanel(pairs[9].charAt(1)).getY() + 10; 
            cubicCurve10.setCurve(x101, y101, x101+5, y101+30, x102-5, y102+30, x102, y102);
            
            
            graph2.setPaint(Color.BLACK);
            graph2.setStroke(new BasicStroke(3));
            
//           Timer timer1 = new Timer();
//           timer1.schedule(new TimerTask(){
//        	   public void run(){
//        		   
//        		   }
//           }, 3000);
            
            
           
        		   if(bigCount ==1){
        		   graph2.draw(cubicCurve1);
                   findCharpanel(pairs[0].charAt(0)).setBackground(Color.black);
                   findCharpanel(pairs[0].charAt(1)).setBackground(Color.black);
        		   }
        		   else if(bigCount == 2){
        		   graph2.draw(cubicCurve1);
                   graph2.draw(cubicCurve2);
                   findCharpanel(pairs[1].charAt(0)).setBackground(Color.black);
                   findCharpanel(pairs[1].charAt(1)).setBackground(Color.black);
        		   }
        		   else if (bigCount == 3){
        		   graph2.draw(cubicCurve1);
                   graph2.draw(cubicCurve2);
				   graph2.draw(cubicCurve3);
	               findCharpanel(pairs[2].charAt(0)).setBackground(Color.black);
	               findCharpanel(pairs[2].charAt(1)).setBackground(Color.black);
        		   }
        		   else if(bigCount == 4){
            	   graph2.draw(cubicCurve1);
                   graph2.draw(cubicCurve2);
    			   graph2.draw(cubicCurve3);
        		   graph2.draw(cubicCurve4);
	               findCharpanel(pairs[3].charAt(0)).setBackground(Color.black);
	               findCharpanel(pairs[3].charAt(1)).setBackground(Color.black);
        		   }
        		   else if( bigCount == 5){
        			   graph2.draw(cubicCurve1);
                       graph2.draw(cubicCurve2);
        			   graph2.draw(cubicCurve3);
            		   graph2.draw(cubicCurve4);
   				   graph2.draw(cubicCurve5);
                   findCharpanel(pairs[4].charAt(0)).setBackground(Color.black);
                   findCharpanel(pairs[4].charAt(1)).setBackground(Color.black);
        		   }
        		   else if(bigCount == 6){
        			   graph2.draw(cubicCurve1);
                       graph2.draw(cubicCurve2);
        			   graph2.draw(cubicCurve3);
            		   graph2.draw(cubicCurve4);
   				   graph2.draw(cubicCurve5);
   				   graph2.draw(cubicCurve6);
                   findCharpanel(pairs[5].charAt(0)).setBackground(Color.black);
                   findCharpanel(pairs[5].charAt(1)).setBackground(Color.black);
        		   }
        		   else if(bigCount == 7){
        			   graph2.draw(cubicCurve1);
                       graph2.draw(cubicCurve2);
        			   graph2.draw(cubicCurve3);
            		   graph2.draw(cubicCurve4);
   				   graph2.draw(cubicCurve5);
   				   graph2.draw(cubicCurve6);
   				   graph2.draw(cubicCurve7);
                   findCharpanel(pairs[6].charAt(0)).setBackground(Color.black);
                   findCharpanel(pairs[6].charAt(1)).setBackground(Color.black);
        		   }
        		   else if(bigCount == 8){
        			   graph2.draw(cubicCurve1);
                       graph2.draw(cubicCurve2);
        			   graph2.draw(cubicCurve3);
            		   graph2.draw(cubicCurve4);
   				   graph2.draw(cubicCurve5);
   				   graph2.draw(cubicCurve6);
   				   graph2.draw(cubicCurve7);
   				   graph2.draw(cubicCurve8);
                   findCharpanel(pairs[7].charAt(0)).setBackground(Color.black);
                   findCharpanel(pairs[7].charAt(1)).setBackground(Color.black);
        		   }
        		   else if(bigCount == 9){
        			   graph2.draw(cubicCurve1);
                       graph2.draw(cubicCurve2);
        			   graph2.draw(cubicCurve3);
            		   graph2.draw(cubicCurve4);
   				   graph2.draw(cubicCurve5);
   				   graph2.draw(cubicCurve6);
   				   graph2.draw(cubicCurve7);
   				   graph2.draw(cubicCurve8);
   				   graph2.draw(cubicCurve9);
                   findCharpanel(pairs[8].charAt(0)).setBackground(Color.black);
                   findCharpanel(pairs[8].charAt(1)).setBackground(Color.black);
        		   }
        		   else if( bigCount == 10){
        			   graph2.draw(cubicCurve1);
                       graph2.draw(cubicCurve2);
        			   graph2.draw(cubicCurve3);
            		   graph2.draw(cubicCurve4);
   				   graph2.draw(cubicCurve5);
   				   graph2.draw(cubicCurve6);
   				   graph2.draw(cubicCurve7);
   				   graph2.draw(cubicCurve8);
   				   graph2.draw(cubicCurve9);
   				   graph2.draw(cubicCurve10);
                   findCharpanel(pairs[9].charAt(0)).setBackground(Color.black);
                   findCharpanel(pairs[9].charAt(1)).setBackground(Color.black);
        		   
        		   }
        		   
        		   
          //timer1.stop();
          
           
//           try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}

          
           
		}
		
}

public JPanel findCharpanel(char letter){
	if(letter == 'q'){
		return panelQ;
	}
	else if(letter == 'w'){
		return panelW;
	}
	else if(letter == 'e'){
		return panelE;
	}
	else if(letter == 'r'){
		return panelR;
	}
	else if(letter == 't'){
		return panelT;
	}
	else if(letter == 'y'){
		return panelY;
	}
	else if(letter == 'u'){
		return panelU;
	}
	else if(letter == 'i'){
		return panelI;
	}
	else if(letter == 'o'){
		return panelO;
	}
	else if(letter == 'p'){
		return panelP;
	}
	else if(letter == 'a'){
		return panelA;
	}
	else if(letter == 's'){
		return panelS;
	}
	else if(letter == 'd'){
		return panelD;
	}
	else if(letter == 'f'){
		return panelF;
	}
	else if(letter == 'g'){
		return panelG;
	}
	else if(letter == 'h'){
		return panelH;
	}
	else if(letter == 'j'){
		return panelJ;
	}
	else if(letter == 'k'){
		return panelK;
	}
	else if(letter == 'l'){
		return panelL;
	}
	else if(letter == 'z'){
		return panelZ;
	}
	else if(letter == 'x'){
		return panelX;
	}
	else if(letter == 'c'){
		return panelC;
	}
	else if(letter == 'v'){
		return panelV;
	}
	else if(letter == 'b'){
		return panelB;
	}
	else if(letter == 'n'){
		return panelN;
	}
	else{
		return panelM;
	}
	
	
}
	//test
	public static void main(String[] args){
		//Plugboard p = new Plugboard();
		//System.out.println("original setting: " + p.getModelAplpha());
		//p.change('m', 'k');
		//modelAlpha is changed
		//System.out.println("changed setting: " + p.getModelAplpha());
		//p.unplug();
		//System.out.println("Unplugged setting: " + p.getModelAplpha());
		String h = "mn op ed rf gh ws xz ur vb im";
		h.replace(" ", "");
		//System.out.println(h);
		
		new Plugboard("tn op ed rf gh ws xz uq vb ik");
	}
}
