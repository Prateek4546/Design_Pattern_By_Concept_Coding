package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements  NotificationAlertObserver{
    String emailId;
    StocksObservable observable ;

    public EmailAlertObserverImpl(String emailId , StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId , "Product in stock hurry Up");
    }
    public void  sendMail(String emailId , String msg){
        System.out.println("Mail Sent to :- " + emailId);
    }
}
