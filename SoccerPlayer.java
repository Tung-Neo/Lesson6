package Lesson6;

public class SoccerPlayer {
    private String name;
    private int number;
    private int xLocation, yLocation;

    public SoccerPlayer(){
        name = "Peter";
        number = 10;
        xLocation = 136;
        yLocation = 84;
    }

    public SoccerPlayer(String n){
        name = n;
        number = 10;
        xLocation = 136;
        yLocation = 84;
    }

    public SoccerPlayer(String n, int num){
        name = n;
        number = num;
        xLocation = 136;
        yLocation = 84;
    }

    public SoccerPlayer(String n, int num, int x){
        name = n;
        number = num;
        xLocation = x;
        yLocation = 84;
    }

    public  SoccerPlayer(String n, int num, int x, int y){
        name = n;
        number = num;
        xLocation = x;
        yLocation = y;
    }

    public double run(){
        return number * xLocation;
    }
    public int jupm(){
        return number * yLocation;
    }
    public int kickBall(){
        return number * xLocation * yLocation;
    }
}
