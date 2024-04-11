package StartegyDesignPattern.WithOutStartegy;

public class Start {
    public static void main(String[] args){
        Normal n = new Normal();
        System.out.println(n.drive());
        OffRoad o = new OffRoad();
        System.out.println(o.drive());
        Sport s = new Sport();
        System.out.println(s.drive());
    }
}
