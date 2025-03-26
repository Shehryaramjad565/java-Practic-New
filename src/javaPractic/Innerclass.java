package javaPractic;

import javaPractic.SmartWatch.HeartRateSensor;

public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartWatch smart = new SmartWatch();
		HeartRateSensor inner = smart.new HeartRateSensor();
		inner.measureHeartRate();

	}

}


class SmartWatch {
    class HeartRateSensor {
        void measureHeartRate() {
            System.out.println("Measuring heart rate...");
        }
    }
}