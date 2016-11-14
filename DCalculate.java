public class DCalculate{
	public static void main(String[] arg) {
		System.out.println("...Calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double div = first / second;
		System.out.println("div " + div);
	}
}