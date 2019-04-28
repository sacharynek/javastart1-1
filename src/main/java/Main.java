public class Main {

    public static void main(String[] args) {
        System.out.println("Uczę się programowania i commitowania");
        printTree();
    }

    private static void printTree(){
        for(int i = 1; i<=4; i++){
            for(int j = 0; j<4-i;j++){
                printSpaces();
            }
            for(int k =1; k<=2*i-1; k++){
                printStars();
            }
            System.out.println();
        }
        //drukowanie pnia wyrzuc do innej metody
        //sparametryzuj drzewko :)

        for(int i = 1; i<=3;i++){
            printSpaces();
        }
        printStars();
        System.out.println();

        for(int i = 1; i<=3;i++){
            printSpaces();
        }
        printStars();
        System.out.println();
    }

    private static void printStars(){
        System.out.print("*");
    }

    private static void printSpaces(){
        System.out.print(" ");
    }
}
