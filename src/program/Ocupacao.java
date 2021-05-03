package program;
public enum Ocupacao 
{
	medico(1),
	infermeiro(2),
	policial(3),
	carcereiro(4),
	presidiario(5),
	professor(6),
	advogado(7),
	programador(8),
	estudante(9),
	engenheiro(10),
	aposentado(11),
	faxineiro(12),
	tester(13),
	mecanico(14),
	dentista(15);
	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";
	private Ocupacao(int value)
	{
		this.value=value;
	}
	private int value;
	public static void print() 
	{
		System.out.println(YELLOW+"Lista de Ocupações:"+RESET);
        for (Ocupacao i : Ocupacao.values()) 
		{
			System.out.println(i.value+"\t: "+i.name());
		}
    }
	public static Ocupacao get(int value) throws Exception
	{
		for (Ocupacao i : Ocupacao.values()) 
		{
			if(i.value==value)
				return i;
		}
		throw new Exception("Valor invalido.");
	}
}