import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * import = ctrl shift o
 * khi an 1 cai phim, click chuot-> thuc hien 1 tac vu nao day
 */
//https://stackoverflow.com/questions/2167751/what-addactionlistener-does
public class Button extends JFrame implements ActionListener{
//actionlistener cung co tac dung voi Jmenu.
	private  JLabel label;//instance
	private JButton button1;
	public Button() {
		// TODO Auto-generated method stub
		this.setSize(400,250);
		setLocation(500,300);
		setResizable(false);
		this.setTitle("My funny frame");
		
		//running process - tao nhieu frame ko quit process=> lam cham may
				//tuong tac giua 2 frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		 label = new JLabel();
		 //local variable of constructor- cannot use in method
		//JLabel label = new JLabel();
		add(label);
		
		JButton button = new JButton("Hit me");//display tren cai button(tittle cua no)
		//add(button);=> nhu v cai nut se chiem het man hinh 
		//set vi tri tuong quan voi label, dat label len tren
		
		add(button, "North", 1);//1: index, so 1 : da add vao label roi
		//-1: last
		//Adds the specified component to this container with the specified constraints at the specified index.

		
		//action cho button 2 cach: tao tren frame va tao truc tiep cho no
		//ca 2 deu lien quan den ActionListener la interface - phai implement actionperform method cua no
		//cach 1
		//oracle: local class and anonymous class
//https://docstore.mik.ua/orelly/java-ent/jnut/ch03_12.htm
		button.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent e ){
				//do sth here
				
				
				label.setText("Turorials Blog");
				//b/c label lies outside the method new ActionListener-inner class
				//innerclass ko the tru cap vao thanh phan cua outerclass dc
				//muon thi phai thay final => nhung ko muon lam v ^^
				
				//or
				
				//changeText();
			}
		});
		
		button1 = new JButton("Hit me 1");
		add(button1, "South",1);
		button1.addActionListener(this);
//this = Button class, is an ActionListener since it implemented the class
		
	}
	public void actionPerformed(ActionEvent e){
		JButton b = (JButton)e.getSource();//getSource tra ve 1 object.
		if(b== button1){
			label.setText("Study and Share");
		}
		//how to use any instance of JButton in this class?
	}
/*
 * I use getSource() for JRadioButtons for example.
 *  I write methods that returns each JRadioButton so in my Listener Class
 *   I can specify an action each time a new JRadioButton is pressed.
In this one, I get the source of any JRadioButton that is focused 
when the user hits it. guiSeleccion.getJrbDat() 
returns the reference to the JRadioButton that is in the 
class GUISeleccion (this is a Frame)




 */
	public void changeText(){
		label.setText("Tutorial Blog");
	}
	public static void main(String[] args){
		Button button = new Button();
	button.setVisible(true);
	}
}
//add(button)
/*
index the position in the container's list at which to
*                 insert the component, where <code>-1</code>
*                 means append to the end

* @exception IllegalArgumentException if {@code index} is invalid;
*            if {@code comp} is a child of this container, the valid
*            range is {@code [-1, getComponentCount()-1]}; if component is
*            not a child of this container, the valid range is
*            {@code [-1, getComponentCount()]}
*/
/*
 * public class Button {
  private final List<ActionListener> listeners = new ArrayList<ActionListener>();

  public void addActionListener(ActionListener l) {
    listeners.add(l);
  }

  public void click() {
    ActionEvent event = new ActionEvent(this, 0, "click");
    for (ActionListener l : listeners) {
      l.actionPerformed(event);
    }
  }
}
 */
