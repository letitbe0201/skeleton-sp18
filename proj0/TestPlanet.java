public class TestPlanet {
	public static void main(String[] args) {
		Planet earth = new Planet(0,0,0,0,10,"earth");
		Planet mars = new Planet(10,20,1,4,2,"mars");
		Planet[] allPlanet = {earth , mars};

		earth.update(5 , earth.calcNetForceExertedByX(allPlanet) , earth.calcNetForceExertedByY(allPlanet));
		mars.update(5 , mars.calcNetForceExertedByX(allPlanet) , mars.calcNetForceExertedByY(allPlanet));

		System.out.println("earth's x net force exerted by mars : " + earth.calcNetForceExertedByX(allPlanet));
		System.out.println("earth's y net force exerted by mars : " + earth.calcNetForceExertedByY(allPlanet));
		System.out.println("mars' x net force exerted by earth : " + mars.calcNetForceExertedByX(allPlanet));
		System.out.println("mars' y net force exerted by earth : " + mars.calcNetForceExertedByY(allPlanet));

		System.out.println("new x position earth : " + earth.xxPos);
		System.out.println("new y position earth : " + earth.yyPos);
		System.out.println("new x position mars : " + mars.xxPos);
		System.out.println("new y position mars : " + mars.yyPos);

		System.out.println("new x velocity earth : " + earth.xxVel);
		System.out.println("new y velocity earth : " + earth.yyVel);
		System.out.println("new x velocity mars : " + mars.xxVel);
		System.out.println("new y velocity mars : " + mars.yyVel);
	}
}