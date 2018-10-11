import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



//https://stackoverflow.com/questions/15025092/border-with-rounded-corners-transparency

public class RoundedLineBorder extends JFrame {

	JPanel p5;
  public RoundedLineBorder() {
    //super(true);

	  //JPanel thePanel = new JPanel();
//	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	  this.setSize(500, 200);
//	  this.setContentPane(new RoundedLineBorder());
	  
    //JLabel label = new JLabel("<html>Stack<br/>Overflow</html>");
//    JLabel label = new JLabel("Test");
//    LineBorder line = new LineBorder(Color.blue, 1, true); // color, thickness, rounded
//    label.setBorder(line);
//    add(label, BorderLayout.CENTER);
//    label.setBackground(Color.green);
//    //this.add(thePanel);
	  /*RoundedPanelExample*/
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Rounded Panel Example");
      setResizable(true);
      setDefaultLookAndFeelDecorated(true);
      setSize(500, 700);

//     JPanel thePanel = new JPanel();
//    thePanel.setBorder(BorderFactory.createRaisedBevelBorder());
//    thePanel.setLayout(new BorderLayout());
//    thePanel.setBackground(Color.gray);
 
    
      Container pane = getContentPane();
      pane.setLayout(null);
      pane.setBackground(new Color(200,80, 50));
      ListenForKey lForKey = new ListenForKey();
      pane.addKeyListener(lForKey);

      
      String[] shows = {"Breaking Bad", "Life on Mars", "Doctor Who"};
		
      JComboBox favoriteShows = new JComboBox(shows);
      favoriteShows.setBounds(0,0,200,400);
      pane.add(favoriteShows);
      pane.setFocusable(true);
      pane.requestFocusInWindow();
      
       p5 = new RoundedPanel(30);//radius
      p5.setBounds(this.getWidth()/2,this.getHeight()/2,30,30);
      p5.setBackground(Color.BLUE);
      p5.setOpaque(false);
      p5.setForeground(Color.LIGHT_GRAY);//border
      pane.add(p5);
      ListenForMouse lForMouse = new ListenForMouse();
      //p5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.MAGENTA));
      //p5.setBorder(new LineBorder(Color.cyan, 5, true));
      //p5.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

      JPanel p4 = new RoundedPanel(30);//radius
      p4.setBounds(this.getWidth()/2+40,this.getHeight()/2+40,30,30);
      p4.setBackground(Color.BLUE);
      p4.setOpaque(false);
      pane.add(p4);

      
      p5.addMouseListener(lForMouse);
      
      JLabel label = new JLabel("Q");
      //label.setLocation()
      p5.add(label);
     //addComp(p5,label,p5.getWidth()/2,p5.getHeight()/2, 1,1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
     Box keyboardBox = Box.createVerticalBox();
     keyboardBox.setBorder(BorderFactory.createLoweredSoftBevelBorder());
     keyboardBox.createRigidArea(new Dimension(200,100));
     keyboardBox.setBounds(100, 100, 300, 300);//x,y,width, height
//
//     keyboardBox.add(p5);
//     keyboardBox.add(p4);
//     this.add(keyboardBox);
     // pane.add(thePanel, BorderLayout.CENTER);
//      thePanel.add(p5);
//      thePanel.add(p4);
//      this.add(thePanel);
     
    JLabel label1 = new JLabel("K");
    //label1.setBounds(110,110,30,30);
    keyboardBox.add(label1);
    label1.setLocation(110,200);
    //cannot move labels.
    JLabel label2 = new JLabel("M");
    keyboardBox.add(label2);
     
    DrawStuff d = new DrawStuff();
	pane.add(d);
     pane.add(keyboardBox);
     this.setVisible(true);
  }
  private class ListenForKey implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() =='q'){
			p5.setForeground(Color.black);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyChar() =='q'){
			p5.setForeground(Color.LIGHT_GRAY);
		}
		
	}
	  
  }
  private class DrawStuff extends JComponent{
		
		public void paint(Graphics g){
            Graphics2D graph2 = (Graphics2D)g;
            graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Shape drawArc2D = new Arc2D.Double(this.getWidth()/2+15, this.getHeight()/2+15, 40, 25, Math.toDegrees(Math.atan(1)), 180, Arc2D.OPEN);
            Shape drawLine = new Line2D.Float(20,90,55,250);

            graph2.setPaint(Color.BLACK);
            graph2.draw(drawArc2D);
            graph2.draw(drawLine);

		}
  }
  class FrameForPlug extends JFrame{
	  public FrameForPlug (){
		  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	      setTitle("Rounded Panel Example");
	      setResizable(true);
	      setDefaultLookAndFeelDecorated(true);
	      setSize(200, 200);
	      
	      Box keyboardBox = Box.createVerticalBox();
	      keyboardBox.setBorder(BorderFactory.createLoweredSoftBevelBorder());
	      keyboardBox.createRigidArea(new Dimension(200,100));
	      keyboardBox.setBounds(50, 50, 100, 100);
	      this.add(keyboardBox);
	      
	      this.setVisible(true);
	  }
  }
  	private class ListenForMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			p5.setBackground(Color.red);
			FrameForPlug f = new FrameForPlug();
			  int optionType = JOptionPane.OK_CANCEL_OPTION;
		      int result = JOptionPane.showConfirmDialog(null, "This is the Plugboard configuration", "Information", optionType);
		      if (result == JOptionPane.OK_OPTION || result == JOptionPane.CANCEL_OPTION) {
		    	 // f.hide();
		    	  f.dispose();
		      }
		      //the program starts here!
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
		
  	}
  public static void main(String s[]) {
//    JFrame frame = new JFrame("Rounded Line Border");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(500, 200);
//    frame.setContentPane(new RoundedLineBorder());
//    frame.setVisible(true);
	  new RoundedLineBorder();
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
  
}