import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FicherosAleatorios {
    public static void main(String[] args) {
        try{
            RandomAccessFile archivoaleatorio = new RandomAccessFile("tararau.txt", "rw");
            double doubleprimero = 2.3;
            double doublesegundo = 4.3;
            archivoaleatorio.seek(0);
            archivoaleatorio.writeDouble(doubleprimero);
            archivoaleatorio.seek(archivoaleatorio.length()-1);
            archivoaleatorio.writeDouble(doublesegundo);
            for (int i = 0; i <= archivoaleatorio.length() - 1; i++) {
                 archivoaleatorio.seek(i);
                 System.out.println(archivoaleatorio.readDouble() + " ");
            }
            archivoaleatorio.close();

        } catch (Exception e) {
            System.out.println("no va");
        }
    }
}
