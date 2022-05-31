package com.ibm.microservicoprova.utils;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Component
public class CSVReader {

    public CSVReader() throws IOException {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("TA_PRECO_MEDICAMENTO.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        }
        try (Scanner scanner = new Scanner(new File("TA_PRECO_MEDICAMENTO.csv"))) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }
    }

    private List<String> getRecordFromLine(String nextLine) {
        List<String> values = new ArrayList<>();
        File line = null;
        try {
            assert false;
            try (Scanner rowScanner = new Scanner(line)) {
                rowScanner.useDelimiter(",");
                while (rowScanner.hasNext()) {
                    values.add(rowScanner.next());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return values;
    }
}
