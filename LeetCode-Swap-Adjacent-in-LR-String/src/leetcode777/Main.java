package leetcode777;

public class Main {
	public static void main(String[] args){
		String start = "RXXLRXRX";
		
		String end = "XRLXXRXR";
		
		System.out.println("start: " + start + " end: " + end);
		
		CheckIfCanTranform solution = new CheckIfCanTranform();
		
		System.out.println("Solutoin: " + solution.canTransform(start, end));
	}
	
}
