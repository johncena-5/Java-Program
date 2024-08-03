package intellijproject;

public class patternProgram {

    public static void main(String[] args) {


        String s = "java";
        for (int i = 1; i <=4 ; i++) {
            for (int j = i; j <=4 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(s.charAt(j-1));
            }
            System.out.println();
        }
    }
}
