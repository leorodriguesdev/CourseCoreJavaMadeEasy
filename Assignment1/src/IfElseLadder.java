
public class IfElseLadder {
	
	public static void main(String[] args) {
		int math=45;

		int physics=60;

		int chem=70;

		if ( math<35 && physics<35 && chem<35){

		System.out.println("Result: Reprovad");

		}else{

		System.out.println("Result: Pass");

		int avg= (math+physics+chem)/3;

		if (avg>35 && avg<=59){

		System.out.println("C");

		}else if(avg>59 && avg<=69){

		System.out.println("B");

		}else{

		System.out.println("A");

		}
	}
}
}
