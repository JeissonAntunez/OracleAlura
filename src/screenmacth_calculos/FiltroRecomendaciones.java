package screenmacth_calculos;

public class FiltroRecomendaciones {

     public void filtra(Clasificacion clasificacion){
         System.out.println(clasificacion.getClasificacion());

         if(clasificacion.getClasificacion() >= 9){
            System.out.println("Muy bien evaluado en el momento");
        } else if(clasificacion.getClasificacion() >= 2){
            System.out.println("popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para verlo después");
        }
    }
}
