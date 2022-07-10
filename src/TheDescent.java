import java.util.Scanner;

public class TheDescent {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        while (true) {
            int maxMountainHeight = 0;
            int maxIndex = 0;
            for (int i = 0; i < 8; i++) {
                int mountainHeight = in.nextInt();
                if(maxMountainHeight < mountainHeight){
                    maxMountainHeight = mountainHeight;
                    maxIndex = i;
                }
            }

            System.out.println(maxIndex);
        }
    }

}
