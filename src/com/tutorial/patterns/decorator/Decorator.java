package com.tutorial.patterns.decorator;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public class Decorator {
	public static void main(String[] args) throws IOException{
		OutputStream out = 
				new BufferedOutputStream(
						new GZIPOutputStream(
								new FileOutputStream("~/test.txt")));
	}
}
