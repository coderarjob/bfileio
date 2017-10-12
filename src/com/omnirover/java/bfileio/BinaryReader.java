package com.omnirover.java.bfileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BinaryReader {
	FileInputStream fs;
	
	public BinaryReader(File file) throws FileNotFoundException
	{
		fs = new FileInputStream(file);
	}
	
	public int readInt() throws IOException
	{
		byte[] b = new byte[Integer.BYTES];
		fs.read(b);
		return ByteBuffer.wrap(b).getInt();
	}
	
	public short readShort() throws IOException
	{
		byte[] b = new byte[Short.BYTES];
		fs.read(b);
		return ByteBuffer.wrap(b).getShort();
	}
	
	public long readLong() throws IOException
	{
		byte[] b = new byte[Long.BYTES];
		fs.read(b);
		return ByteBuffer.wrap(b).getLong();
	}
	
	public float readFloat() throws IOException
	{
		byte[] b = new byte[Float.BYTES];
		fs.read(b);
		return ByteBuffer.wrap(b).getFloat();
	}
	
	public double readDouble() throws IOException
	{
		byte[] b = new byte[Double.BYTES];
		fs.read(b);
		return ByteBuffer.wrap(b).getDouble();
	}
	
	public char readChar() throws IOException
	{
		byte[] b = new byte[1];
		fs.read(b);
		return ByteBuffer.wrap(b).getChar();
	}
	
	public byte readByte() throws IOException
	{
		byte[] b = new byte[1];
		fs.read(b);
		return b[0];
	}
}
