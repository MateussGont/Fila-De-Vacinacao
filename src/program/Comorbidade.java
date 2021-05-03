package program;

public enum Comorbidade
{
	obesidade(1),
	diabetes(2),
	pressao_alta(3),
	bronquite(4);
	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	private Comorbidade(int value)
	{
		this.value=value;
	}
	private int value;
	public static void print() 
	{
		System.out.println(YELLOW+"Lista de Comorbidades:"+RESET);
        for (Comorbidade i : Comorbidade.values()) 
		{
			System.out.println(i.value+"\t: "+i.name());
		}
    }
	public static Comorbidade get(int value) throws Exception
	{
		for (Comorbidade i : Comorbidade.values()) 
		{
			if(i.value==value)
				return i;
		}
		throw new Exception("Valor invalido.");
	}
}