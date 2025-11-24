public class Main {
    
    public static void main(String[] args) {
        // обычный цикл for
        for(int i = 100; i > 0; i--) {
            System.out.println(i);
        }
        
        // обычный цикл while
        int i = 0;
        while (i < 10) {
            System.out.println("Nurbek");
            i++;
        }
        
        // обычный цикл for
        String[] st = "Hello My Cutty Pretty World".split(" ");
        for (String s : st) {
            System.out.println(s);
        }
    }
}