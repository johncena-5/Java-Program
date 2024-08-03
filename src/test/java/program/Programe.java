package program;

public class Programe {

	public static void main(String[] args) {

		String s = "india";
		for (int i = 0; i < 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j<= i; j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		System.out.println("=====================================");
		m();
	}
	//====i
	//===in
	//==ind
	//=indi
	//india
	
	public static void m() {
		
		String s = "india";
		for (int i = 0; i < 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print(" ");
			}
			for (int j = i; j>= 0; j--) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
	//====i
	//===ni
	//==dni
	//=idni
	//aidni
}


