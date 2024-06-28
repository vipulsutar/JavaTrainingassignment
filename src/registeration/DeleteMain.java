package registeration;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class DeleteMain {
	void Delete(LinkedHashMap<String, PartyDo> lhm ){
		boolean flag = false;
		while(true){
			DisplayMain.Display(lhm);
			System.out.println("Enter the Sequence Number of user which you want to delete");
			Scanner sc = new Scanner(System.in);
			String partySeq  = sc.nextLine();
			if(lhm.containsKey(partySeq)){
				lhm.remove(partySeq);
				DisplayMain.Display(lhm);
				flag = true;
			}
			else {
				System.out.println("Enter the valid Sequence number");
				continue;
			}
			if(flag == true) break;
		}
	}
}
