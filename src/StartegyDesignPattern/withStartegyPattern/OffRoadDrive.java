package StartegyDesignPattern.withStartegyPattern;

import StartegyDesignPattern.withStartegyPattern.Startegy.ExtraDrive;

public class OffRoadDrive extends Drive{
      public OffRoadDrive(){
          super(new ExtraDrive());
      }
}
