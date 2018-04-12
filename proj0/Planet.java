public class Planet {
	public static double G = 6.67e-11;
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public Planet(double xP, double yP, double xV, double yV, double m, String img) {
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass = m;
		imgFileName = img;
	}

	public Planet(Planet p) {
		xxPos = p.xxPos;
		yyPos = p.yyPos;
		xxVel = p.xxVel;
		yyVel = p.yyVel;
		mass = p.mass;
		imgFileName = p.imgFileName;
	}

	public double calcDistance(Planet b) {
		double disSquare;

		disSquare = (this.xxPos - b.xxPos) * (this.xxPos - b.xxPos) + (this.yyPos - b.yyPos) * (this.yyPos - b.yyPos);

		double ans = disSquare;

		while (ans * ans - disSquare > 1e-10) {
			ans = (ans * ans + disSquare) / (2 * ans);
		}
		return ans;
	}

	public double calcForceExertedBy(Planet c) {
		double force;
		double dis = this.calcDistance(c);
		double m1 = this.mass;
		double m2 = c.mass;

		force = (G * m1 * m2)/(dis * dis);
		return force;
	}

	public double calcForceExertedByX(Planet d) {
		double forceX;
		double dis = this.calcDistance(d);
		double disX = d.xxPos - this.xxPos;
		double force = this.calcForceExertedBy(d);

		forceX = force * disX / dis;
		return forceX;
	}

	public double calcForceExertedByY(Planet e) {
		double forceY;
		double dis = this.calcDistance(e);
		double disY = e.yyPos - this.yyPos;
		double force = this.calcForceExertedBy(e);

		forceY = force * disY / dis;
		return forceY;
	}
}