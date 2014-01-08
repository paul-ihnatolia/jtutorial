package com.tutorial.patterns.decorator;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Adapter {
	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream(new File("~/test.txt"));
		DataOutput dataOutput = new DataOutputStream(fos);
		
		dataOutput.writeDouble(0.1);
		fos.flush();
		fos.close();
	}
}
