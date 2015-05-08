package Intento;

public class QuickSort{
private void QuickSortFloatArray(float[] ArrayNumeros, int Inicio, int Fin) {
    int InicioLocal= Inicio, FinLocal=Fin;
    float Temp, Pivote;
    if(Fin>Inicio)
    {
        Pivote= ArrayNumeros[(Inicio+Fin)/2];
        while(InicioLocal<FinLocal)
        {
            while((InicioLocal<Fin) && (ArrayNumeros[InicioLocal]<Pivote))  ++InicioLocal;
            while((FinLocal>Inicio) && (ArrayNumeros[FinLocal]>Pivote))  --FinLocal;
            if(InicioLocal<=FinLocal)
            {
                Temp=ArrayNumeros[InicioLocal];
                ArrayNumeros[InicioLocal]=ArrayNumeros[FinLocal];
                ArrayNumeros[FinLocal]=Temp;
                ++InicioLocal;
                --FinLocal;
            }
        }
        if(Inicio<FinLocal) QuickSortFloatArray(ArrayNumeros,Inicio,FinLocal);
        if(InicioLocal<Fin) QuickSortFloatArray(ArrayNumeros,InicioLocal,Fin);
    }

//QuickSortFloatArray( ArrayNumerosFloat, 0, ArrayNumerosFloat.length-1);
}
}