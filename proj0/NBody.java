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

	public static void main(String[] args) {
		double T = Double.parseDouble(arg[0]);
		double dt = Double.parseDouble(arg[1]);
		String filename = arg[2];
		double radius = NBody.readRadius(filename);
		Planet[] allPlanet = NBody.readPlanets(filename);

		
	}
}