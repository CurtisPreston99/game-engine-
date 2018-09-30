package main;

public class Keys {
	Boolean[] keys=new Boolean[256];
	Keys(){
		for(int i=0;i<256;i++) {
			keys[i]=false;
		}
	};
	
	public String toString() {
		String r="";
		for(int i=0;i<keys.length;i++) {
			String n="";
			n+=i;
			n+="	";
			n+=(char)i;
			n+="	";
			n+=keys[i].toString();
			n+="\n";
			r+=n;
		}
		return r;
	}
	
	
	void printTrue() {
		for(int i=0;i<256;i++) {
			if(keys[i]) {
				System.out.printf("value:%d key:%c pressed:%b \n",i,(char)i,keys[i]);
				
			}
		}
	}
	void setKey(int i,boolean t) {
		if(i>0 && i<keys.length) {
			keys[i]=t;
		}
	}
	
	void setKey(char c,boolean t) {
		int i=(int)c;
		setKey(i,t);
	}
	Boolean getKey(int i) {
		if(i>0 && i<keys.length) {
			return keys[i];
		}else {
			return null;
		}
		
	}
	
	Boolean getKey(char c) {
		int i=(int)c;
		return getKey(i);
	}
}
