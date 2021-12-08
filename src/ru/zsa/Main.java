package ru.zsa;

import ru.zsa.halflife3.Progress;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
      //Запуск для первой задачи
        File save = new File("progress.txt");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(save));
        oos.writeObject(new Progress("Gordon", 88, 256, 4));
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(save));
        Progress progress = (Progress) ois.readObject();
        System.out.println(progress);
        ois.close();

        // работа с файлом
        File file = new File((String) null);

        BufferedReader pic = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        File picture = new File(String.valueOf(pic));

        FileOutputStream newPicture = new FileOutputStream(picture, false);

            byte[] myBytes = "New Picture\n".getBytes();

               newPicture.write(myBytes);

               newPicture.close();

        System.out.println(newPicture);
    }
}
