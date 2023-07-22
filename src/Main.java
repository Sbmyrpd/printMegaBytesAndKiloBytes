public class Main {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(kiloBytes < 0 ? "Invalid Value" : kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " + (kiloBytes % 1024) + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(4567);
        printMegaBytesAndKiloBytes(-962);
        printMegaBytesAndKiloBytes(7869);
    }
}