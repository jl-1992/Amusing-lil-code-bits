import java.lang.Math;
import java.text.DecimalFormat;

public class Test {

	public static double getAngle(int h, int m, int s) {
		double hourAngle =  (360/12.0) * (h + m*(1.0/60) +s*(1.0/3600));
		double minuteAngle = (360/60.0) * (m + s*(1.0/60));

		double angle = Math.abs(hourAngle - minuteAngle);

		if (angle > 180)
			angle = 360 - angle;

		DecimalFormat formatter = new DecimalFormat("###.##");
		return Double.parseDouble(formatter.format(angle));
	}
	
	public static void main(String[] args) {
		System.out.println(getAngle(12,7,38));
	}
}