package ru.zsa;

import ru.zsa.halflife3.Progress;

import java.io.*;

public class Main {

    public static void main(String[] args) {
      //Запуск для первой задачи
        File save = new File("progress.txt");

        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(save));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (oos != null) {
                oos.writeObject(new Progress("Gordon", 88, 256, 4));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (oos != null) {
                oos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(save));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Progress progress = null;
        try {
            if (ois != null) {
                progress = (Progress) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(progress);
        try {
            if (ois != null) {
                ois.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // работа с файлом
        File file = new File((String) null);

        BufferedReader pic = null;
        try {
            pic = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File picture = new File(String.valueOf(pic));

        FileOutputStream newPicture = null;
        try {
            newPicture = new FileOutputStream(picture, false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        byte[] myBytes = "New Picture\n".getBytes();

        try {
            if (newPicture != null) {
                newPicture.write(myBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            if (newPicture != null) {
                newPicture.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(newPicture);
    }
}
