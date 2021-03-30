public class swaptwoval {
    public static void main(String[] args) {
        int A=6,B=8;
        System.out.println("A: "+ A+", B:"+B);
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("A: "+ A+", B:"+B);
    }
}
