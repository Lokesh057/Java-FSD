package com.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingProject {

public static void main(String[] args) {
		        
		        String inputFile = "input.txt";
		        String outputFile = "output.txt";

		        // Read data from  file
		        String inputData = readFile(inputFile);

		        // Process the data and converting to uppercase
		        String processedData = processData(inputData);

		        // Write the processed data to the output file
		        writeFile(outputFile, processedData);

		        System.out.println("File_handling project completed successfully.");
		    }

		    // Read data from a file 
		    private static String readFile(String filePath) {
		        StringBuilder content = new StringBuilder();

		        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
		            String line;
		            while ((line = reader.readLine()) != null) {
		                content.append(line).append("\n");
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		        return content.toString();
		    }

		    private static String processData(String data) {
		        return data.toUpperCase();
		    }
		    private static void writeFile(String filePath, String data) {
		        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
		            writer.write(data);
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		

	}


