package facade;

import java.util.Properties;

public class Database {
    public Database() {
    }
    public Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(getClass().getResourceAsStream(filename));
        } catch (Exception e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
