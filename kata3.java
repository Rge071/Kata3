package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histograma = new Histogram<>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.es");
        histogram.increment("hotmail.com");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histograma);
        histogramDisplay.execute();
    }
    
}
