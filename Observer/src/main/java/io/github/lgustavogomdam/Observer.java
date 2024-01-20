package io.github.lgustavogomdam;

public class Observer {
    public static void main(String[] args) {
        LocalizacaoObjtSubject coordOBJTS = new LocalizacaoObjtSubject();
        
        coordOBJTS.attach(new ElementoObservador(coordOBJTS));
        
        coordOBJTS.attach(new ElementoObservado(coordOBJTS));

        coordOBJTS.setState(new LocalizacaoObjetos(1.56,2.78,4.55,5.85));
        
        System.out.println("\n___________________Mudança de Pontos___________________\n");
        
        coordOBJTS.setState(new LocalizacaoObjetos(0.56,1.78,3.55,4.85));
    }
}
