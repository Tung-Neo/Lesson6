package Lesson6;

public class TestSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer s1 = new SoccerPlayer("Long", 9, 172, 428);
        System.out.println("Run: " + s1.run());
        System.out.println("Jupm: " + s1.jupm());
        System.out.println("Kick Ball: " + s1.kickBall());

        SoccerPlayer s2 = new SoccerPlayer("Long", 9, 172);
        System.out.println("Run: " + s2.run());
        System.out.println("Jupm: " + s2.jupm());
        System.out.println("Kick Ball: " + s2.kickBall());

        SoccerPlayer s3 = new SoccerPlayer("Long", 9);
        System.out.println("Run: " + s3.run());
        System.out.println("Jupm: " + s3.jupm());
        System.out.println("Kick Ball: " + s3.kickBall());

        SoccerPlayer s4 = new SoccerPlayer("Long");
        System.out.println("Run: " + s4.run());
        System.out.println("Jupm: " + s4.jupm());
        System.out.println("Kick Ball: " + s4.kickBall());

        SoccerPlayer s5 = new SoccerPlayer();
        System.out.println("Run: " + s5.run());
        System.out.println("Jupm: " + s5.jupm());
        System.out.println("Kick Ball: " + s5.kickBall());
    }
}
