import java.io.*;
import java.util.*;


public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> vote = new HashMap<>();
		int max = 0;
		String maxName[] = new String[100];
		
		File file = new File("C:\\Vote_testcase\\11.input.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			
			while((str = br.readLine()) != null) {
				if(vote.containsKey(str) == true) {
					vote.put(str, vote.get(str) + 1);
				}
				else if(vote.containsKey(str) == false) {
					vote.put(str, 1);
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
		
		Iterator<String> iterator = vote.keySet().iterator();
		while(iterator.hasNext()) {
			String key = (String)iterator.next();
			
			if(vote.get(key) >= max)
			{
				max = vote.get(key);
			}
		}
		
		int j = 0;
		Iterator<String> iterator2 = vote.keySet().iterator();
		while(iterator2.hasNext()) {
			String key2 = (String)iterator2.next();
			if(vote.get(key2) == max) {
				maxName[j] = key2;
				j++;
			}
		}
		
		Arrays.sort(maxName, 0, j);

		for(int i=0;i<maxName.length;i++) {
			if(maxName[i] != null) {
			System.out.print(maxName[i]);
			}
		}
	}
}
