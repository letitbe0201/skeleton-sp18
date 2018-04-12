public class ArgsSum{
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < args.length){
			sum = sum + Integer.parseInt(args[i]);
			i++;
		}
		System.out.println(sum);
	}
}