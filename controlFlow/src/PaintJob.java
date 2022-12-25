/**
 * Created by IntelliJ IDEA.
 * User: ilialloyd
 * Date: 12/23/2022
 * Leave your comment below if you have
 * --------------------------------------------------------
 */
public class PaintJob {

    public static void main(String[] args) {
        int area = getBucketCount(3.26, 0.75);
        System.out.println(area);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if ((width <= 0 || height <= 0 || areaPerBucket <= 0) || extraBuckets < 0)
            return -1;

        double area = height*width;
        System.out.println("Area is: "+area);

        double canPaintWithExtra = areaPerBucket*extraBuckets;
        System.out.println("With extra "+(int)extraBuckets+" buckets, Bob can paint "+(int)canPaintWithExtra+"m2");

        double leftArea = area-canPaintWithExtra;
        System.out.println("Area that need to paint: "+leftArea+"m2");

        //yerde qalan areani 1.5 e bolerek neche bucket lazim olduqun tapiriq
        int needToBuy = (int)(Math.ceil(leftArea/areaPerBucket));
        System.out.println("Needed bucket for these area: "+needToBuy);
        return needToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;

        double area = height*width;
        System.out.println("Area is: "+area);

        return (int)(Math.ceil(area/areaPerBucket));
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0)
            return -1;
        return (int)(Math.ceil(area/areaPerBucket));
    }

}
