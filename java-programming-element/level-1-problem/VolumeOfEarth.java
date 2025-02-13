// package AssignmentWeek1.Day1;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius=6378;
        double volumekm=(4.0/3.0)*Math.PI*Math.pow(radius, 3);
        double miles=Math.pow(0.621371, 3);
        double volumemile=volumekm*miles;
        System.out.printf("Volume of earth in cubic kilometer is:%.2f  and cubic miles is: %.2f ",volumekm,volumemile);
    }
}
