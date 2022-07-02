package korara.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Utils {

    //////////
    // File //
    //////////
    public static String readFile(Reader reader) {
        try  {
            BufferedReader br = new BufferedReader(reader);
            String temp;
            StringBuilder stringBuilder = new StringBuilder();
            temp = br.readLine();
            while (temp != null) {
                if (stringBuilder.length() != 0)
                    stringBuilder.append("\n");
                stringBuilder.append(temp);
                temp = br.readLine();
            }
            br.close();
            return stringBuilder.toString();
        } catch (IOException e) {
            return Common.STR_NULL;
        }
    }

    public static String readFile(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        String fileValue = readFile(inputStreamReader);
        inputStreamReader.close();
        return fileValue;
    }

    public static String readFile(File file) throws IOException {
        if (!file.exists() || file.isDirectory())
            throw new FileNotFoundException();
        return readFile(new FileInputStream(file));
    }

    public static String readFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists() || file.isDirectory())
            throw new FileNotFoundException();
        return readFile(new FileInputStream(file));
    }
}
