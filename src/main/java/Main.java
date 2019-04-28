public class Main {

    public static void main(String[] args) {
        System.out.println("Uczę się programowania i commitowania");
        printTree();
        //printTree(2,2);
        //printTree(3,2);
        //printTree(10,10);
    }

    private static void printTree() {
        printTree(4, 2);
    }

    private static void printTree(int crownSize, int trunkSize) {

        printCrown(crownSize);
        printTrunk(crownSize, trunkSize);
    }

    private static void printCrown(int crownSize) {

        for (int i = 1; i < crownSize+1; i++) {
            for (int j= 0; j < crownSize - i+1; j++) {
                printSpaces();
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                printStars();
            }
            System.out.println();
        }
    }

    private static void printTrunk(int crownSize, int trunkSize) {
        for (int i = 0; i < trunkSize; i++) {
            for (int j = 1; j < crownSize +1 ; j++) {
                printSpaces();
            }
            printStars();
            System.out.println();
        }
    }

    private static void printStars() {
        System.out.print("*");
    }

    private static void printSpaces() {
        System.out.print(" ");
    }
}
