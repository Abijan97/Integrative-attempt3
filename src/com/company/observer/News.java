package com.company.observer;
        import java.io.File;
        import java.io.FilenameFilter;
public class News {
    FilenameFilter filter = new FilenameFilter() {
        public boolean accept(File dir, String name) {
            return name.endsWith(".txt");
        }
    };

    File folder = new File("/path/to/files");
    File[] listOfFiles = folder.listFiles(filter);

for (int i = 0; i < listOfFiles.length; i++) {
        File file = listOfFiles[i];
        String content = FileUtils.readFileToString(file);
        // do something with the file
    }

}
