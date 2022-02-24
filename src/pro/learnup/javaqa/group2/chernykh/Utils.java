package pro.learnup.javaqa.group2.chernykh;

public class Utils {

    public static boolean isGreenLight = false;

    public static boolean droppedOut(int speedOfPlayer) {

        if (isGreenLight == false) {

            if (speedOfPlayer > 0) {
                System.out.println("Игрок выбывает");
                return true;
            }

            else {
                System.out.println("Никто не выбыл");
                return false;
            }

        }

        else {
            System.out.println("Никто не выбыл");
            return false;
        }

    }

}
