package WorkTask13;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("test.txt");
            fileWriter = new FileWriter("fileCopyReader.txt");
            int a;
            while ((a = fileReader.read()) != -1) {
                fileWriter.write(a);
                System.out.print((char) a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }


    public void test() throws IOException {


        InputStreamReader fis = null;
        FileOutputStream fos = null;
        String str = "";

        try {
            fis = new InputStreamReader(new FileInputStream("test.txt"), "UTF-8");
            fos = new FileOutputStream("copyfile.txt");

            int a;
            while ((a = fis.read()) != -1) {
                str += (char) a;
                fos.write(a);
            }
        } catch (IOException e) {
            System.out.println("Пипец! Файла нет");
        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
        printPeople(str);
    }

    private static void printPeople(String str) {
        String[] massStr = str.split("\n");
        for (String st : massStr) {
            String massss[] = st.split(" ");
            int age = Integer.parseInt(massss[2]);
            System.out.println("Имя: " + massss[0] + ", фамилия: " + massss[1] + ", возраст: " + age);
        }


    }

}