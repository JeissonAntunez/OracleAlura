package practic;

public class main {

    public static void main(String[] args) {
        ParImpar dato = new ParImpar();
        dato.setNumero(7);
        System.out.println("Verificado de Aprobación \n");

        Aprobacion aprobacion = new Aprobacion();
        aprobacion.setNota(11);
        aprobacion.setNota(0);
        aprobacion.setNota(2);
        aprobacion.promedio();

//        Contra contra = new Contra();
//        contra.validar();


        DiaHabil dia = new DiaHabil();
        dia.verifica();

    }
}
