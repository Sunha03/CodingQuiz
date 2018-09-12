import java.io.*;
import java.util.*;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		ArrayList<char[]> arrayList = new ArrayList<>();
		char[] ch;
		
		File file = new File("C:\\Brackets_testcase\\1.input.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			
			int init=0;
			
			while((str = br.readLine()) != null) {
				if(init == 0) {
					num = Integer.parseInt(str);
					init++;
				}
				else {
					ch = str.toCharArray();
					arrayList.add(ch);
				}
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<arrayList.size();i++) {
			char[] c = arrayList.get(i);
			for(int j=0;j<c.length-1;j++) {
				if(c[j] == '(' && c[j+1] == ')') {
					c[j] = '1';
					c[j+1] = ' ';
				}
				else if(c[j] == '{' && c[j+1] == '}') {
					c[j] = '2';
					c[j+1] = ' ';
				}
				else if(c[j] == '[' && c[j+1] == ']') {
					c[j] = '3';
					c[j+1] = ' ';
				}
			}
			System.out.println(c);
		}
	}

}
