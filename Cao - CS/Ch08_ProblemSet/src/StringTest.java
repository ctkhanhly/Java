import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }
public static boolean isPalindrome(String word){
	StringBuffer Palindrome = new StringBuffer(word);
	for(int n=word.length()-1; n>=0; n--){
		if (!Character.isLetterOrDigit(word.charAt(n)))
			word= word.substring(0,n)+word.substring(n+1, word.length());
		//Palindrome.deleteCharAt(n);
		else
		     //Palindrome.append( Character.toUpperCase(word.charAt(n)));
		Palindrome.append( word.charAt(n));
	}
	//word.toUpperCase();
	Palindrome.delete(0, Palindrome.length()-word.length());
	if (word.equalsIgnoreCase(Palindrome.toString()))
		return true;
	else
		return false;
}
//public boolean isPalindrome(String word){
//	String Palindrome = "";
//	for(int n=0; n<word.length(); n--){
//		Palindrome += word.charAt(n).toUpperCase(word.charAt(n));
//	}
//	word.toUpperCase();
//	if (Palindrome.toString() == word)
//		return true;
//	else
//		return false;
//}
  public void actionPerformed(ActionEvent e)
  {
	  int like =0;
	  while(like<=5){
    String str = input.getText();
    // ... insert code to process str or call a method here
    // str = _______________________________ ;  
  
	 boolean doesCooneyLike = false;
	    for (int n=1; n< str.length(); n++){
	    	if (str.charAt(n)== str.charAt(n-1)){
	    		System.out.println("Yes Cooney likes " + str);
	    		doesCooneyLike = true;
	    		like++;
	    	 }
	    }
	    if (!doesCooneyLike){
	    	System.out.println("No, Cooney doesn't like " + str);
	    	like =0;
	    }
	
    
    result.setText(str);
    input.selectAll();
	  } 
    
  }

  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

