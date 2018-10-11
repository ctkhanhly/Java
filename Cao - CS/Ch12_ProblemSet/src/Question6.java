
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//a: Triangle, Equilateral Triangle, RightTriangle
		
		//b:
		//area = perimeter*radius/2;
		//=> radius = 2*area/perimeter
		//equilateral: radius = 2* root(3) /4 * (side)^2/(3*side)
		//equilateral : radius = side/(2*root(3))
		//right: radius = 2* side^2/2 /(2+ root(2))/side
		//right: radius = side/(2+root(2));
		//2*root(3)>2+root(2)
//		=>side/(2*root(3))<side/(2+root(2))
//				=> radius(equilateral triangle)< radius(right triangle)
//				=> isosceles right triangle holds bigger inscribed circle than eauilateral triangle
		EquilateralTriangle e = new EquilateralTriangle(12);
		RightTriangle r = new RightTriangle(12);
		
		//test
		System.out.println(2*e.getRatio());
		System.out.println(2*r.getRatio());//radius of right triangle- bigger
		
		System.out.println("Equilateral" + e.getRatio());
		System.out.println("Right" + r.getRatio());
	}

}
