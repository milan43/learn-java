package serializabe;

import javalang.Employee;

import java.io.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SerializationDemo {
    public static void main(String[] args) throws IOException{
       // DateFormat format = new SimpleDateFormat("EEE:dd:MM:yyyy");
        Student student= new Student(1,"Akash",10, new Date());
        Student student1= new Student(2,"Asha",12, new Date());
        List<Student> s = new ArrayList<>();
        s.add(student);
        s.add(student1);
       // System.out.println(student);
        try {
            //FileWriter fw = new FileWriter(new File("hello"));
           // fw.append("Hello World");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("serial")));

            oos.writeObject(s);

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serial")));
            System.out.println(ois.readObject());
        } catch (NotSerializableException | EOFException | ClassNotFoundException e) {
           // e.printStackTrace();
            System.err.println("NotSeralizable Student");
        }
    }
}


