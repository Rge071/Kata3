
import histogram.Histogram;
import histogram.HistogramDisplay;

public class App {
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
 
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ull.es");
        
        new HistogramDisplay("HISTOGRAM", histogram).execute();
    }
}
