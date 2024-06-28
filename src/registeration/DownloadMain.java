package registeration;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class DownloadMain {
	void Download(LinkedHashMap<String, PartyDo> lhm ){
		boolean flag = false;
		while(true){
			System.out.println("Enter the sequence number of file which you want to dwonload");
			Scanner sc = new Scanner(System.in);
			String partySeq = sc.nextLine();
			if(lhm.containsKey(partySeq)){
				PartyDo user = lhm.get(partySeq);
				String str = user.toString();
				try {
					FileDownload.CreateFile("C:\\Users\\vipul.sutar\\Downloads", "User.txt", str);
					System.out.println("The file is downloading...");
				} catch (Exception e) {
					e.printStackTrace();
				}
				flag = true;
			}
			else {
				System.out.println("The Sequence number is incorrect");
				continue;
			}
			if(flag == true) break;
		}
	}
}
