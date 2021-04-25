public class Octocode {
    public static void main(String[] args) {        
        int tickles = 10;                
        laughingOctopus(tickles);     
    }
    
    public static boolean laughingOctopus(int tickles) {     
        if(tickles == 10) {
            System.out.println("How many tickles does it take to make an octopus laugh?");
            System.out.println(tickles + " tickles.");
            return true;
        }
        return false;            
    }
}


