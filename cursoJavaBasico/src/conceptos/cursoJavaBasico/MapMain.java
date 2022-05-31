package conceptos.cursoJavaBasico;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("14568565", "Nombre Apellido 1");
        personas.put("54464645466", "Nombre Apellido 1");
        personas.put("14554668565", "Nombre Apellido 1");
        personas.put("14554868565", "Nombre Apellido 1");

        System.out.println(personas);

        for(String key :personas.keySet()){
            System.out.println(key);
        }
        for(String value: personas.values()){
            System.out.println(value);
        }

        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " "+ pair.getValue());
        }
    }
}
