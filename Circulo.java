public class Circulo{
	private double radio;
	private String color="Vacio";
	public static int cantidadCirculos=0;
	public final double PI=3.14;
	public Circulo (double pRadio){
		setRadio(pRadio);
		cantidadCirculos+=1;
	}
	public Circulo	(double pRadio, String pColor){
		setRadio(pRadio);
		setColor(pColor);
		cantidadCirculos+=1;
	}
	public  void  setRadio  (double  pRadio)  {  
	radio  = pRadio;
	
   }
	public double getRadio(){
		return radio;
		
	}
	public void setColor(String pColor){
		color= pColor;
		
	}
	public String getColor(){
		return color;
		}
	public double calcularArea(){
		return PI * (radio*radio);
		
		}
	}

