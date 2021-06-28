import java.io.*;

public class copy {

    public static void main(String[] args)
    {
        try{
            BufferedWriter wr = new BufferedWriter( new FileWriter("ggggggs.txt"));
            BufferedReader rd = new BufferedReader( new FileReader("test.txt"));

            String s;
            while ((s = rd.readLine()) != null){
            wr.write(s + "\n");
            }
            wr.close();
            rd.close();
        }catch (Exception ex){
            return;
        }

    }
}
