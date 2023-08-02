package java_30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write_data_in_textfile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
FileWriter fw=new FileWriter("C:\\Users\\hi\\OneDrive\\Documents\\new 17.txt");
BufferedWriter bw=new BufferedWriter(fw);
bw.write("this was  1st timne");
bw.append(" abc ");
bw.write("its edited by Leo");
bw.close();
System.out.println("file is append");
FileReader fr=new FileReader("C:\\Users\\hi\\OneDrive\\Documents\\new 17.txt");
BufferedReader br=new BufferedReader(fr);
String str;
while((str=br.readLine())!=null) {
	System.out.println(str);
}
	}

}
