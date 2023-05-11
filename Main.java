class Main {

    public static void main(String[] args) {
    
    	int a = Integer.parseInt(args[0]); 
    	int b = Integer.parseInt(args[1]);
    
    	SumaDosNumeros obj = new SumaDosNumeros(); 
    	
    	System.out.println(obj.suma(a, b));
    }
}

