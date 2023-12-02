package data_access;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.*;
import java.util.*;

public class PricesDataAccessObject {
    private static float searchCsvFile(String filePath, String searchTerm) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Read and search the data rows
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(searchTerm)) {
                    // Return the price that matches the search
                    return Float.parseFloat(data[2]);
                }
            }
        }
        return 0; // Row not found
    }
}