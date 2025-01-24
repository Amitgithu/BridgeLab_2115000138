public class DistributePens{
	public static void main(String[] args){
		int totalPens = 14;
		int totalStudent = 3;
		int pensPerStudent = totalPens / totalStudent;
		int remainingPens = totalPens - (totalStudent * pensPerStudent);
		System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}
}

