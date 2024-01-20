package io.github.lgustavogomdam;

/**
 * @author lgustavogomdam
*/
public class Composite {
    public static void main(String[] args) {
        try {
            ComponenteIDE editor1 = new Editor("EditorJava");
            ComponenteIDE terminal1 = new Terminal("TerminalLinux");

            editor1.printNomeDoComponente();
            terminal1.printNomeDoComponente();

            ComponenteIDE ide1 = new IDE("Eclipse");
            ComponenteIDE ide2 = new IDE("IntelliJ");
            ide2.adicionar(editor1);
            ide2.adicionar(terminal1);
            ide2.printNomeDoComponente();

            ide1.adicionar(ide2);
            ide1.printNomeDoComponente();

            editor1.adicionar(terminal1);

        } catch (Exception erro) {
            System.out.println("ERRO: " + erro.getMessage());
        }
    }
}
