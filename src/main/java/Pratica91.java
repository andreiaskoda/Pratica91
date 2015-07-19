/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica91 {
    public static void main(String[] args) {
        /* No método main, exiba as seguintes informações sobre
        o ambiente de execução da máquina virtual: nome do sistema
        operacional, número de processadores, memória total em MB,
        memória livre em MB, máxima quantidade de memória usada pela
        máquina virtual em MB. */
        
        // Nome do sistema operacional
        String os = System.getProperty("os.name");
        System.out.println("Sistema operacional: " + os);
        
        // Número de processadores
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Número de processadores: " + processors);
        
        // Memória total em MB
        double totalMemory = Runtime.getRuntime().totalMemory();
        totalMemory /= 1000000;
        System.out.println("Memória total: " + totalMemory + " MB");
        
        // Memória livre em MB
        double freeMemory = (Runtime.getRuntime().freeMemory());
        freeMemory /= 1000000;
        System.out.println("Memória livre: " + freeMemory + " MB");
        
        // Memória máxima em MB
        double maxMemory = (Runtime.getRuntime().maxMemory());
        maxMemory /= 1000000;
        System.out.println("Memória máxima: " + maxMemory + " MB");
    }
}
