
package ejercicioHerencia2;


public class HerenciaJava {


    public static void main(String[] args) {
        //crear objeto clase padre
      Humano adulto=new Humano();
      adulto.setNombre(" Freddy");
      adulto.comer(adulto.getNombre());
      adulto.dormir();
      
        System.out.println();
        //crear objeto Clase hija->Hombre
        Hombre padre =new Hombre();
        padre.setNombre(" Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarce();
            //crear objeto Clase hija->
            System.out.println();           
            Mujer madre= new Mujer();
            madre.setNombre(" Gloria");
            madre.comer(madre.getNombre());
            madre.dormir();
            madre.maquillarse(madre.getNombre());
                      
      
    }
    
}
