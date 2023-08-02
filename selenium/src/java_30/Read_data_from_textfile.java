package java_30;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_data_from_textfile {

	public static void main(String[] args) throws FileNotFoundException,IOException{
FileReader fr=new FileReader("C:\\new 17.txt");
BufferedReader br=new BufferedReader(fr);
String str;
while((str=br.readLine())!=null) {
	System.out.println(str);
}
br.close();
	}

}
