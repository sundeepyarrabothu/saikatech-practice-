package saika_learnings;



class father{
	
	public void dna() {
		
		System.out.println("my dna");
	}
	
}




class son extends father{
	public void dna() {
		
		System.out.println("my bood contains my father dna");
		
	}
}

class inheritance{
	
	public static void main(String args[]) {
		
		son h  = new son();
		father f = new father();
		
		
		f.dna();
		
		
		h.dna();
	}
}