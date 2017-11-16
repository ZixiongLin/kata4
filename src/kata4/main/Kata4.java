
package kata4.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import kata4.view.HistogramDisplay;
import kata4.model.Histogram;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

public class Kata4 {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "emailsfile";
        ArrayList<String> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
      
    
}
