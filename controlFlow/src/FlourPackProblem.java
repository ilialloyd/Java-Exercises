/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/6/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class FlourPackProblem {

    public static void main(String[] args) {
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(2, 1, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(0, 5, 6));
        System.out.println(canPack(3, 2, -12)); //false
        System.out.println(canPack(4, 18, 19));//false
        System.out.println(canPack(1, 0, 4));//false
        System.out.println(canPack(2, 2, 12));//true
        System.out.println(canPack(4, 18, 19));//true


    }

    //bigcount vur 5 +smallcount eger kiciydirse goaldan false
    //smallcound eger kifayet qeder varsa goali 5e boldukden sora onda o tamamlayacaq ustunu so return true
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
        if (bigCount * 5 + smallCount < goal) return false;
        return (smallCount >= goal % 5);
    }
}

