import java.util.*;
import java.io.*;

class ClassThread extends Thread
private String threadName;

{
 public ClassThread(String name)
 {
  threadName = name;
 }
 
 public void run()
 {
  System.out.println("Thread " + threadName " running".);
 }
}

public class Class1
{
 public static void main(String args[])
 {
  ClassThread t = new ClassThread("Thread1");
  t.start();
 }
}



