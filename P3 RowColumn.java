import java.util.*;

class RowColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine().replace(" ", "");
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int r = (int)Math.ceil((double)s.length()/c);
        char[][] a = new char[r][c];
        int k=0;

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = k<s.length()?s.charAt(k++):'X';

        // Encryption
        String e="";
        for(int j=0;j<c;j++)
            for(int i=0;i<r;i++)
                e += a[i][j];
        System.out.println("Encrypted: "+e);

        // Decryption
        String d="";
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                d += e.charAt(j*r+i);
        System.out.println("Decrypted: "+d);
    }
}
