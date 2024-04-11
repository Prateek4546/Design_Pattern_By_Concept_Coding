package StartegyDesignPattern.withStartegyPattern;

import StartegyDesignPattern.withStartegyPattern.Startegy.DriveStartegy;

public class Drive {

      DriveStartegy driveStartegy;

     public Drive(DriveStartegy driveStartegy){
         this.driveStartegy = driveStartegy;
     }
     public Drive(){
     }
     public String drive(){
         return driveStartegy.Drive();
     }


}
