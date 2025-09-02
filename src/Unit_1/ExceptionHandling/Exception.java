package Unit_1.ExceptionHandling;

import java.io.DataInputStream;
import java.io.IOException;

public class Exception {
    public static void main(String[] args) throws IOException {
        int x,y,z = 0;
        DataInputStream dis = new DataInputStream(System.in);
        x = dis.readInt();
        y = dis.readInt();
        z = x/y;
    }
}
