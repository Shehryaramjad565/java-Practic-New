package javaPractic;

public class MultiDimentionalArray {

	private static final int Student = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] studentMarks = {{85, 90, 78}, {88, 76, 95}};
//        System.out.println("Marks of Student 1, Subject 2: " + studentMarks[0][1]);
        
//        for (int[] student: studentMarks) {
//        	for(int marks: student) {
//        		System.out.println("Marks of Student"+ student + " , Subject : " + student[marks]);
//        	}
//        }

//      for (int[] student: studentMarks) {
//    	for(int marks: student) {
//    		System.out.println("Marks of Student"+ student + " , Subject : " + student[marks]);
//    	}
//    }

	

		for (int i = 0; i < studentMarks.length; i++) {
		    for (int j = 0; j < studentMarks[i].length; j++) {
		        System.out.println("Marks of Student " + (i + 1) + ", Subject " + (j + 1) + ": " + studentMarks[i][j]);
		    }
		}

}
}