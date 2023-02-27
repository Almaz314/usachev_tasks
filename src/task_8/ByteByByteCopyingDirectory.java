package task_8;

import java.io.*;

public class ByteByByteCopyingDirectory {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileCopy <source directory> <destination directory>");
            System.exit(0);
        }

        String sourceDir = args[0];
        String destDir = args[1];

        File sourceFile = new File(sourceDir);
        File destFile = new File(destDir);

        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream out = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
