package prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    public Map<String, Enemy> showcase = new HashMap<String, Enemy>();
    public void register(String name, Enemy enemy) {
        showcase.put(name, enemy);
    }
    public Enemy create(String name) {
        Enemy enemy = showcase.get(name);
        return enemy.createCopy();
    }
}
