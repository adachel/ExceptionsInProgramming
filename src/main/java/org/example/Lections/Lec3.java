package org.example.Lections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lec3 {
    public Lec3() {
    }

    public void fileRead1(){
        try (FileReader test = new FileReader("TestLec3.txt")){
            test.read();
        }catch (RuntimeException | IOException e){
            System.out.println("catch exception" + e.getClass().getSimpleName());
        }
    }

    public void fileRead2(){                // копируем из reader в writer
        try (
                FileReader reader = new FileReader("TestLec3.txt");
                FileWriter writer = new FileWriter("TestTask2.txt")
        ){
            while (reader.ready()){
                writer.write(reader.read());
            }
        }catch (RuntimeException | IOException e){
            System.out.println("catch exception" + e.getClass().getSimpleName());
        }
        System.out.println("copy successfully");
    }
}
