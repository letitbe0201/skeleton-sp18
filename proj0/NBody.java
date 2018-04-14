public class NBody {
	public static double readRadius(String filePath) {
		In in = new In(filePath);
		int planetsNum = in.readInt();
		double radius = in.readDouble();

		return radius;
	}

	public static Planet[] readPlanets(String filePath) {
		In in = new In(filePath);

		int planetsNum = in.readInt();
		double radius = in.readDouble();
		Planet[] allPlanet = new Planet[planetsNum];

		for(int i = 0; i < planetsNum ; i++) {
			double xP = in.readDouble();
			double yP = in.readDouble();
			double xV = in.readDouble();
			double yV = in.readDouble();
			double m = in.readDouble();
			String name = in.readString();

			Planet p = new Planet(xP,yP,xV,yV,m,name);
			allPlanet[i] = p;
		}
		return allPlanet;
	}
}