
public class Hw22p129 
{
	public double computerShippingCost(int nJars)
	{
		int nCartons = (nJars +11)/12;
		int totalOunces = 21*nJars + 25*nCartons;
		int lbs = (totalOunces +15)/16;
		return 1.44*nCartons + 0.96*lbs + 3; //fraction of a pound -> 1 pound cost = 1.1 pound?
		
	}
}
