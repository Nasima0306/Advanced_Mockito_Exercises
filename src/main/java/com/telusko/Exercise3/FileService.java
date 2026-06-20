package com.telusko.Exercise3;

public class FileService {private MyFileReader fileReader;

    private MyFileWriter fileWriter;

    public FileService(
            MyFileReader fileReader,
            MyFileWriter fileWriter
    ) {

        this.fileReader = fileReader;

        this.fileWriter = fileWriter;

    }

    public String processFile() {

        String content =
                fileReader.read();

        return "Processed " + content;

    }

}
