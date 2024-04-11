package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;
    StocksObservable observable;
    public MobileAlertObserverImpl(String userName , StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }
    public void update(){
       sendMessage(userName , "Product in Stock HurryUp");
    }
    public void sendMessage(String userName , String msg){
        System.out.println("Message sent to :- "+ userName);
    }
}
