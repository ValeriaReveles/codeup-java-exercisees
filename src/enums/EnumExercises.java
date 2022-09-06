package enums;

public class EnumExercises {
    public static void makeDrivingDecision(TrafficLightColor color) {
        switch (color) {
            case RED:
                System.out.println("Light is RED: STOP!!");
                break;
            case YELLOW:
                System.out.println("Light is Yellow: Put some peppin\' in your steppin\' ");
                break;
            case GREEN:
                System.out.println("Light is GREEN: Go ahead big dog!");
                break;
            default:
                System.out.println("When in doubt, speed it out!");
        }
    }


    public static void main(String[] args) {
//        TrafficLightColor red = TrafficLightColor.RED;
//        makeDrivingDecision(red);
        makeDrivingDecision(TrafficLightColor.RED);
//        TrafficLightColor yellow = TrafficLightColor.YELLOW;
//        makeDrivingDecision(yellow);
        makeDrivingDecision(TrafficLightColor.YELLOW);
//        TrafficLightColor green = TrafficLightColor.GREEN;
//        makeDrivingDecision(green);
        makeDrivingDecision(TrafficLightColor.GREEN);

    }

}
