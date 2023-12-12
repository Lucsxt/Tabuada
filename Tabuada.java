public class Tabuada {
    public static void main(String[] args) {
        
        for(int i = 0; i <= 10; i++) { 
        System.out.println("----- Tabuada do: " + i + " -----");
            for(int j = 0; j <= 10; j++) {
                if(i * j == 110) break;
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }
    }
}
