package clasecasa;

public class Casa {
    private float ancho;
    private float largo;
    private int canCuartos;
    private String direccion;
    private boolean piscina;

public Casa(float a, float l, int c, String d, boolean p) {
        ancho = a;
        largo = l;
        canCuartos = c;
        direccion = d;
        piscina = p;
    }

    public float getancho() {
        return ancho;
    }

    public void setancho(float a) {
        ancho = a;
    }

    public float getlargo() {
        return largo;
    }

    public void setlargo(float l) {
        largo = l;
    }

    public int getcanCuartos() {
        return canCuartos;
    }

    public void setcanCuartos(int c) {
        canCuartos = c;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String d) {
        direccion = d;
    }

    public boolean getpiscina() {
        return piscina;
    }

    public void setpiscina(boolean p) {
        piscina = p;
    }

    public float area() {
        return ancho * largo;
    }
    public String ficha() {
    	return 
    			"DIRECCION: \t\t" + direccion + "\n" + 
    			"Cantidad de cuartos: \t" + canCuartos + "\n" +
    			"Dimencion: \t\t" + ancho + "X \t" + largo + "\n" +
    	        "Area: \t\t\t" + area() + "\n" +
    			(piscina? "Tiene piscina":"");
    			
    			
    }
}
