package io.github.lgustavogomdam;

public class LocalizacaoObjetos {
    
    double[] coordenadasObservado = new double[2];
    
    double[] coordenadasObservador = new double[2];
    
    public LocalizacaoObjetos(double x1, double y1, double x2, double y2) {
        
        coordenadasObservado[0] = x1;
        coordenadasObservado[1] = y1;
        
        coordenadasObservador[0] = x2;
        coordenadasObservador[1] = y2;
    }
}
