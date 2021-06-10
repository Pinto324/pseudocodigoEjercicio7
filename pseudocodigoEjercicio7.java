
public class pseudocodigoEjercicio7 {
    public static void main(String[] args){
        int NoR;
        int cero = 0;
        int Par = 0;
        int Impar = 0;
        for(int i = 0 ; i < 15 ; i++){
            NoR = (int) Math.round((Math.random()*36)-1);
            if(NoR==0){
            cero++;
            }else if (NoR%2==0){
            Par++;
            }else{
            Impar++;
            }
        }
    //Bajando los decimales:
    float p = (float) (Par/0.15);
    float I = (float) (Impar/0.15);
    float c = (float) (cero/0.15);
    System.out.println("El porcentaje de numeros pares es: "+p+"%");
    System.out.println("El porcentaje de numeros impares es: "+I+"%");
    System.out.println("El porcentaje de ceros es: "+c+"%");
    }    
}
