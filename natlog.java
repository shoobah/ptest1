public class natlog {
    public static void main(String [] args) {
        double eNew = 1, eOld = 0;
        int factorial = 1, n = 1;
        do {
            factorial *= n++; 
            eOld = eNew;
            eNew = eOld + 1D / factorial;
            System.out.println(eNew);
        } while (Math.abs(eNew - eOld) > 1E-5);
    }
}
