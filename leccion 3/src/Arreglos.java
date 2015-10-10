
public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String modelo[]={"jet", "bora", "golf", "passat", "bettle"};

int año[];
año= new int[5];
año[0]=2007;
año[1]=2009;
año[2]=2011;
año[3]=2013;
año[4]=2015;

String comprador[];
comprador= new String[5];
comprador[0]="Francisco Gerte";
comprador[1]="Alma Madero";
comprador[2]="Monica Galindo";
comprador[3]="Lalo N. Ganiza";
comprador[4]="Susana Horia";

int num_serie;
int malos_num=0;
for (num_serie=0;num_serie<modelo.length;num_serie++){

	if (modelo[num_serie]!="bora"){
		malos_num=num_serie;
			
			if (año[malos_num]>=2009){
System.out.println("El modelo "+modelo[num_serie]+" año "+año[malos_num] +" con número de serie " + num_serie+ " está en mal estado, es necesario llamar al cliente "+comprador[malos_num]);
			}
	}
}
	
	}

}
