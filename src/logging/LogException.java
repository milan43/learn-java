package logging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class LogException {

    final static Logger LOGGER = Logger.getLogger(LogException.class.getName());
    static FileWriter writer;
    public static void main(String[] args) throws IOException{
        try {
            try {
                writer = new FileWriter(new File(""));
                writer.append("Hello java");
            }finally {
                writer.close();
            }
        }catch (FileNotFoundException | NullPointerException ex){
            LOGGER.info("NullPOinter" + ex.getCause());
        }
    }
}
