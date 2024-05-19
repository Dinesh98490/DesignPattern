public class Notifier{
    public void notify(String message){
        System.out.println("Email: " + message);
    }
}

public class FacebookDecorator extends Notifier{
    private Notifier notifier;
    public FacebookDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    @Override
    public void notify(String message){
        notifier.notify(message);
        System.out.println("FB: " + message);
    }
}

public class SMSDecorator extends  Notifier{
    private Notifier notifier;
    public SMSDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    @Override
    public void notify(String message){
        notifier.notify(message);
        System.out.println("SMS: " + message);
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        Notifier notifier = new Notifier();
        notifier = new FacebookDecorator(notifier); // Wrap with FacebookDecorator
        notifier = new SMSDecorator(notifier); // Wrap with SMSDecorator

        notifier.notify("Hello, world!");
    }
}
