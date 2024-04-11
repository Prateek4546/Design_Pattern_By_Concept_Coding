package StartegyDesignPattern.withStartegyPattern;

import StartegyDesignPattern.WithOutStartegy.OffRoad;

public class Start {
    public static void main(String[] args){
        OffRoad offRoad = new OffRoad();
        System.out.println(offRoad.drive());

        GoodsDrive goodsDrive = new GoodsDrive();

        System.out.println(goodsDrive.drive());
    }
}
