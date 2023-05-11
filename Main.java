class Main {

    public static void main(String[] args) {
    
    	int a = Integer.parseInt(args[0]); //Tomar un string y hacerlo int, (int es variable primitiva, integer es la clase que tiene mètodos) 
    	int b = Integer.parseInt(args[1]);
    
    	SumaDosNumeros obj = new SumaDosNumeros(); //separar el espacio de memoria 
    	
    	System.out.println(obj.suma(a, b));
    }
}

