public abstract class TempletePattern{
    abstract void intialize();
    abstract void startPlay();
    abstract void endPlay();

    //temeplete methods
    public final void play(){
        intialize();

        startPlay();

        endPlay();
    }
}


public class Cricket extends TempletePattern {
    @Override
    void intialize() {
        System.out.println("Cricket is finished");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket is starting");

    }

    @Override
    void endPlay() {
        System.out.println("Cricket is finished");

    }
}
