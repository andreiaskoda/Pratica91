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
        Runtime rt = Runtime.getRuntime();

        // Nome do sistema operacional
        System.out.println("Sistema operacional: " + System.getProperty("os.name"));
        
        // Número de processadores
        System.out.println("Número de processadores: " + rt.availableProcessors());
        
        // Memória total
        System.out.println("Memória total: " + rt.totalMemory()/1048576);
        
        // Memória livre
        if(rt.freeMemory()%1048576 > 524288)
            System.out.println("Memória livre: " + ((rt.freeMemory()/1048576) + 1));
        
        else
            System.out.println("Memória livre: " + rt.freeMemory()/1048576);
                
        // Memória máxima
        System.out.println("Memória máxima: " + rt.maxMemory()/1048576);
    }
}
