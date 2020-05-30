import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {

    private static final String SAMPLE_CSV_FILE_PATH = "./src/main/resources/myusers.csv";

    public static void main(String[] args) throws IOException, CsvDataTypeMismatchException,
            CsvRequiredFieldEmptyException {
        try (
                Writer writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE_PATH))
        ) {
            StatefulBeanToCsv<CSVUser> beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build();

            List<CSVUser> users = new ArrayList<>();

            users.add(new CSVUser("Sunder Pichai","sunder.pichai@gmail.com","+1-3333333333",
                    "United States"));
            users.add(new CSVUser("Satya Nadella","satya.nadella@outlook.com","+1-7777777777",
                    "United States"));

            beanToCsv.write(users);
        }
    }
}
