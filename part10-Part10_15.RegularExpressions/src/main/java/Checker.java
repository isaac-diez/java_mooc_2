

public class Checker {
    
        public boolean isDayOfWeek(String string) {
        
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        
        if (string.matches(regex)) {
        
            return true;
            
        } else return false;        
        
        
    }

}
