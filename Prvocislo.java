public class Prvocislo {
    public static void main (String[] args) {
        int a =0;
        int b =0;
        String  prvoCisla = "";
        for (a = 1; a <= 100; a++) {
            int counter=0;
            for(b =a; b>=1; a--) {
                if(a%b==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                prvoCisla = prvoCisla + a + " ";
            }
        }
        System.out.println("Prvočísla jsou: " + prvoCisla);
    }
}