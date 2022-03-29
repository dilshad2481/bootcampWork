package com.lwl.cj.day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFile {
	public static void main(String[] args) {
		
		try {
			Files.readAllLines(Paths.get("C:\\Users\\dilshad\\Documents\\java-code\\my work\\java-playground\\java-playground\\src\\note.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
