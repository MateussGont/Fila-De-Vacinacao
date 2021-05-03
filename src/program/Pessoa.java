package program;
import priority.*;

public class Pessoa implements prioritized{
	int idade;
	String nome;
	
	
	Ocupacao ocupacao;
	Comorbidade[] comorbidade;
	public Pessoa(String nome,int idade,Ocupacao ocupacao,Comorbidade... comorbidade)
	{
		this.nome=nome;
		this.idade=idade;
		this.ocupacao=ocupacao;
		this.comorbidade=comorbidade;
		
	}
	public int get_priority()
	{
		int prioridade=4;
		if(idade>=75||ocupacao==Ocupacao.medico||ocupacao==Ocupacao.infermeiro)
		{
			prioridade=0;
		}
		else
		if(idade>60)
		{
			prioridade=1;
		}
		else
		if(comorbidade.length!=0)
		{
			prioridade=2;
		}
		else
		if
		(
			ocupacao==Ocupacao.policial||
			ocupacao==Ocupacao.carcereiro||
			ocupacao==Ocupacao.presidiario||
			ocupacao==Ocupacao.professor
		)
		{
			prioridade=3;
		}
		return prioridade;
	}
	
	public String toString() {
		String comorbidade="";
		if(this.comorbidade.length==0)comorbidade="[\"nehuma\"]";
		else
		{
			for(Comorbidade i:this.comorbidade)comorbidade+="\""+i+"\", ";
			comorbidade="["+comorbidade.substring(0,comorbidade.length()-2)+"]";
		}
		return String.format("{\n\t\"Nome\" :  \"%s\", \n\t\"Idade\" :  \"%d\", \n\t\"Ocupação\" :  \"%s\", \n\t\"Comorbidade\" :  %s\n}",
				nome,
				idade,
				ocupacao,
				comorbidade
				
		);
	}
}
