package main;

public class world {
	int size=10;
	String[][] fnames=new String[size][size];
	
	world() {
		for(int i=0;i<fnames.length;i++) {
			for(int e=0;e<fnames[i].length;e++) {
				String fname=i+"_"+e+".tmx";
				fnames[i][e]=fname;
//				System.out.println(fname);
			}
			
		}
	}
}
