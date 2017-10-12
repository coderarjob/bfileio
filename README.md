# bfileio
For easily reading and writing binary files in java
------------------------
This project contains two classes:
  * _com.omnirover.java.bfileio.**BinaryReader**_
  * _com.omnirover.java.bfileio.**BinaryWriter**_

The primary use of these classes is to read and write primary types to files. The methods in the classes are very similar to what you get in .Net for doing the same.
* BinaryWriter has only **one** overloaded method called '_**write()**_', that takes every the primary type in java and writes it to a file.
* BinaryReader has simple methods for reading Integer, Floats and every the primary types.
  For example to read Integers you call '_**readInteger()**_' method, and for reading Double just call '_**readDouble()**_' and so on.

Please feel free to cone or make a comment. Contact me at arjobmukherjee@gmail.com
