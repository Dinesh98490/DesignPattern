public class AdapterPattern {
    private String data;

    public AdapterPattern(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
    public class Main {
        public static <StockChart> void main(String[] args) {
            AdapterPattern dataProvider = new AdapterPattern("Stock data");
            StockChart stockChart = new StockChart(dataProvider);
            stockChart.hashCode();
        }
    }

}
