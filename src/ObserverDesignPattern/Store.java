package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObervableImpl;
import ObserverDesignPattern.Observable.StocksObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.MobileAlertObserverImpl;

public class Store {

    public static  void main(String[] args){
        StocksObservable iphone = new IphoneObervableImpl();
        EmailAlertObserverImpl O1 = new EmailAlertObserverImpl("xyz@gmail.com" , new IphoneObervableImpl());
        MobileAlertObserverImpl O2 = new MobileAlertObserverImpl("Neha" , new IphoneObervableImpl());
       iphone.add(O1);
       iphone.add(O2);
       iphone.setStockCount(10);
       iphone.setStockCount(0);
       iphone.setStockCount(100);
    }
}
