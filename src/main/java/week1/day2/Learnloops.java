package week1.day2;

public class Learnloops {

	public static void main(String[] args) {
		String []txt= new String[6];
		txt[0]="Ram";
		txt[1]="Lax";
		txt[2]="Jai";
		txt[3]="Vinayak";
		txt[4]="Muruga";
		txt[5]="Shiv";
		
		for(int i=0;i<txt.length;i++) {
			if(i%2!=0)
			{
			System.out.println("Array values are:"+txt[i]);
			}
		}
		for(int i=0;i<txt.length;i++) {
			if(i%2==0)
			{
			System.out.println("Array values are:"+txt[i]);
			}
		}

	}

}
