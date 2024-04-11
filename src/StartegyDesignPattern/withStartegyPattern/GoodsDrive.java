package StartegyDesignPattern.withStartegyPattern;

import StartegyDesignPattern.withStartegyPattern.Startegy.Normal;

public class GoodsDrive extends Drive{
    public GoodsDrive(){
        super(new Normal());
    }
}
