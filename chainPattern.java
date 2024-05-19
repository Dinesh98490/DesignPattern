public class Chain{
    Processor chain;
    public Chain(){
        buildChain();
    }
    public void buildChain(){
        chain = new NegativeProessor(new ZeroProcessor(new PositiveProcessor(null)));

    }
    public void process(Number request){
        chain.process(request);
    }
}

public class chainPattern {
    public static void main(String[] args) {
        Chain chain = new Chain();

        chain.process(new Number(90));
        chain.process(new Number(-50));
    }
}
