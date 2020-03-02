package edu.nchansenfgcu;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException, CsvValidationException {
    CsvParser csvP = new CsvParser("src/Data/SEOExample-1.csv");
    csvP.printCsv();

    // load json
    Gson gson = new Gson();
    JsonReader jread = new JsonReader(new FileReader("src/Data/authors.json"));
    JsonParser[] authors = gson.fromJson(jread, JsonParser.class);

    for (var element : authors) {
      System.out.println(element);
    }
  }
}
