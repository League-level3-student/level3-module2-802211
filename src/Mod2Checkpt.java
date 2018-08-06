
public class Mod2Checkpt {
//	1.	Create a new Java class called Checkpoint(Mod2Checkpt)

//    2.	Add a main method to the class
public static void main(String[] args) {
	double[] d = new double[2];
	d[0] = 5;
			d[1] = 66;
			d[2] = 2;
			sorter(d);
}
//    3.	Create a method that takes in an array of doubles and sorts it using any
//        method you choose. Use your main method to test it.
static void sorter(double[] d) {
	for (int i = 0; i < d.length; i++) {
		for (int j = 1; j < d.length; j++) {
			
			if (d[i] > d[j]) {
				double temp = d[j];
				d[j] = d[i];
				d[i] = temp;
			}
				
		}
	}
}

//    4.	Create a method that takes in an array of integers and a single integer. Return true
//        if the single integer is contained in the array. Otherwise, return false.
//        Use your main method to test it.

}
