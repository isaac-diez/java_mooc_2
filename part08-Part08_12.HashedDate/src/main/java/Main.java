
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        // make test programs here
        
        ArrayList<SimpleDate> dates = new ArrayList<>();
        
        for (int i=1900; i<2101; i++) {
            
            int day = (int)(Math.random() * 30) + 1; // Genera un número entre 1 y 30
            int month = (int)(Math.random() * 12) + 1; // Genera un número entre 1 y 30
            
            SimpleDate date = new SimpleDate(day,month,i);
            
            if (!dates.contains(date.hashCode())) {
                dates.add(date);
                System.out.println(date.hashCode());
            } 
                      
            i++;
            
        }
        System.out.println(dates.size()); 
        
        boolean allUnique = areAllObjectsUnique(dates);
        System.out.println("¿Todos los objetos son únicos? " + allUnique);

    }
    
    public static boolean areAllObjectsUnique(ArrayList<SimpleDate> list) {
        Set<Integer> hashCodes = new HashSet<>();

        for (Object obj : list) {
            // Comprobar si el hashCode ya existe en el Set
            if (!hashCodes.add(obj.hashCode())) {
                return false; // Hay duplicados, ya que el hashCode no se pudo añadir
            }
        }
        return true; // Todos son únicos
    }
}
