package ru.zsa;

import ru.zsa.halflife3.Progress;

import java.io.*;

public class Main {

    public static void main(String[] args){

      //Запуск для первой задачи
        File save = new File("progress.txt");
        try  (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(save))) {
            oos.writeObject(new Progress("Gordon", 88, 256, 4));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(save))){
            Progress progress = (Progress) ois.readObject();
            System.out.println(progress);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        // работа с файлом
        File file = new File((String) null);

        try (BufferedReader pic = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
            File picture = new File(String.valueOf(pic));
            FileOutputStream newPicture = new FileOutputStream(picture, false);
            byte[] myBytes = "New Picture\n".getBytes();
            newPicture.write(myBytes);
            System.out.println(newPicture);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
