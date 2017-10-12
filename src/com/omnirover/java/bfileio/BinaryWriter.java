package com.omnirover.java.bfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BinaryWriter {
	FileOutputStream fs;
	
	public BinaryWriter(File file) throws FileNotFoundException
	{
		fs = new FileOutputStream(file);
	}
	
	public void write(int i) throws IOException
	{
		ByteBuffer bb = ByteBuffer.allocate(Integer.BYTES);
		bb.putInt(i);
		fs.write(bb.array());
	}
	
	public void write(short i) throws IOException
	{
		ByteBuffer bb = ByteBuffer.allocate(Short.BYTES);
		bb.putShort(i);
		fs.write(bb.array());
	}
	
	public void write(long i) throws IOException
	{
		ByteBuffer bb = ByteBuffer.allocate(Long.BYTES);
		bb.putLong(i);
		fs.write(bb.array());
	}
	
	public void write(float i) throws IOException
	{
		ByteBuffer bb = ByteBuffer.allocate(Float.BYTES);
		bb.putFloat(i);
		fs.write(bb.array());
	}
	
	public void write(double i) throws IOException
	{
		ByteBuffer bb = ByteBuffer.allocate(Double.BYTES);
		bb.putDouble(i);
		fs.write(bb.array());
	}
	
	public void write(char i) throws IOException
	{
		write((byte)i);
	}
	
	public void write(byte i) throws IOException
	{
		byte[] b = new byte[1];
		b[0] = i;
		fs.write(b);
	}
	
}
