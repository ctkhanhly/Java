
public class Question07{
	public static final double whatHeNeedstoLearn = 95/100;
	public static int KelvinLearningProgress(){
	double whatHeLearnt = 0;
	int months = 0;
	for (whatHeLearnt=0; whatHeLearnt<= whatHeNeedstoLearn; whatHeLearnt+=10/100)
	{
		months++;
	}
	return months;
	}	
	public static void main(String[] args){
		System.out.print(KelvinLearningProgress()/12 + " years " + (KelvinLearningProgress()-KelvinLearningProgress()/12*12) + " months");
	}
}