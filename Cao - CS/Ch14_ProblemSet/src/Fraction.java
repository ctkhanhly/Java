
public class Fraction implements Comparable<Fraction>{
/*
 * Methods:   description
 * 
 * 
 * 
 * reduce()
 * getValue()
 * 
 */
	//Fields
	private int num;
	private int denom;
	public int getNum() {
		return num;
	}
	public int getDenom() {
		return denom;
	}
	public static int count;//same in whole class, regardless of what obj created
	//should be private, other can access but cannot change b/c may affect other ppl's method
	//change name of num still ok
	//CONSTRUCTOR
	//no-args constructor
	//constructor dont have a return type
	public Fraction(){
		this(0);
		count++;
	}
	public Fraction(int n){
		num = n;
		denom =1;
	}
	 public Fraction (int n, int d){
		    if(d!=0){
		    num = n;
		    denom = d;
		    }
		    else 
		      throw new IllegalArgumentException("Fraction Construction Error: Denominator cannot be 0.");
		    reduce();
		    count++;
	 }
	 //copy constructor: take another Fraction object as a parameter and create a fraction 
	 //equal to it
	 public Fraction(Fraction other){
		    num = other.num;
		    denom = other.denom;
		    count++;
		  }
	 //accessor methods
	 //mutator methods = modifiers
	public String toString(){
		return num + " / " + denom;
	}
	 public Fraction add(int n){
		    return new Fraction(n*denom + num, denom);
		    //returns a reference to an object of Fraction class
		  }
		  
	 public Fraction add(Fraction other){
		    if(denom == other.denom){
		      return new Fraction (num + other.num, denom);
		    }
		    
		    else {
		      return new Fraction(num*other.denom+denom*other.num,denom*other.denom);
		    }
		  }
		  
	 public Fraction multiply(int n){
		    //num *=n; dont want to change the fraction 
		 //by just employing the method
		    Fraction m = new Fraction (num*n,denom);
		    m.reduce();
		    return m;
		  }
		  
	public Fraction multiply (Fraction F){
//		    num = num*F.num;
//		    denom = denom*F.denom;
		    Fraction m = new Fraction(num*F.num, denom*F.denom);
		    m.reduce();
		    return m;
		  
		  }
	//accessor	  
	public double getValue(){
		    return (double)(num)/denom;
		  }
	 private void reduce(){
		    if(num == 0){
		      denom = 1;
		      return;//what does this do?
		    }
		    
		    if(denom < 0){
		      num *= -1;
		      denom *= -1;
		    }
		    
		    int g = gcf(num, denom);
		    num /= g;
		    denom /= g;
	 }
		  
		  public static int gcf(int n, int d){//this should be private int gcf, but i want 
			  //to show myself static methods
		    while(d!=0){
		      int temp = d;
		      d =n%d;
		      n = temp;
		    }
		    return n;
		  }
		  public int compareTo(Fraction other){
			  if((this.getValue() - other.getValue()) ==0)
				  return 0;
			  else if((this.getValue() - other.getValue())<0)
				  return -1;
			  else 
				  return 1;
			  //return this.getValue() - other.getValue();
		  }
		  public boolean equals(Fraction other){
			  return this.compareTo(other)==0;
		  }
		 
		  

}
