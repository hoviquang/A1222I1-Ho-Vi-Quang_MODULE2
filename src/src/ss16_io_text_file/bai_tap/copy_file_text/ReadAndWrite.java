package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class ReadAndWrite {
    public void readFile(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException ioe) {
            System.err.println("Lỗi : Không tìm thấy file");
        }
    }

    public void writeFile(String filePath , String fileDest){

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(fileDest);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bw = new BufferedWriter(fileWriter);
            bw.write(filePath);
            bw.close();
        }catch (IOException ioe ){
            System.err.println("Lỗi : file");
        }





    }
}