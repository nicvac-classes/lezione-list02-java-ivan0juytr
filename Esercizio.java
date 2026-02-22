//LEGGERE LE ISTRUZIONI NEL FILE README.md
//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;
// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[])
    {
        //Variabili del programma
        String scelta;
        String dato;
        int posizione;

        //Creo la lista e lo Scanner per l'input da tastiera
        Lista<String> lista = new Lista<>();
        Scanner in = new Scanner(System.in);

        System.out.println("=== GESTIONE LISTA CONCATENATA ===");

        // 1. Inserimento in testa
        System.out.print("Inserisci un elemento in TESTA: ");
        dato = in.nextLine();
        lista.aggiungiInTesta(dato);

        // 2. Inserimento in coda
        System.out.print("Inserisci un elemento in CODA: ");
        dato = in.nextLine();
        lista.aggiungiInCoda(dato);

        // 3. Inserimento in coda (secondo elemento)
        System.out.print("Inserisci un secondo elemento in CODA: ");
        dato = in.nextLine();
        lista.aggiungiInCoda(dato);

        // 4. Inserimento in posizione
        System.out.print("Inserisci un elemento da aggiungere in posizione 1: ");
        dato = in.nextLine();
        lista.aggiungiInPosizione(dato, 1);

        // 5. Inserimento in testa (secondo elemento)
        System.out.print("Inserisci un secondo elemento in TESTA: ");
        dato = in.nextLine();
        lista.aggiungiInTesta(dato);

        // Stampa della lista
        System.out.println("\nLista attuale:");
        System.out.println(lista);
        System.out.println("Dimensione: " + lista.size());

        // 6. Ricerca di un elemento
        System.out.print("\nInserisci un nome da cercare nella lista: ");
        dato = in.nextLine();
        int indice = lista.indiceDi(dato);
        if (indice != -1) {
            System.out.println("'" + dato + "' trovato in posizione: " + indice);
        } else {
            System.out.println("'" + dato + "' non trovato nella lista.");
        }

        // 7. Lettura testa e coda
        System.out.println("\nPrimo elemento: " + lista.leggiTesta());
        System.out.println("Ultimo elemento: " + lista.leggiCoda());

        // 8. Rimozione per nome
        System.out.print("\nInserisci il nome dell'elemento da rimuovere: ");
        dato = in.nextLine();
        boolean rimosso = lista.cancella(dato);
        if (rimosso) {
            System.out.println("'" + dato + "' rimosso con successo.");
        } else {
            System.out.println("'" + dato + "' non trovato, nessuna rimozione.");
        }
        System.out.println("Lista dopo rimozione per nome: " + lista);

        // 9. Rimozione per posizione
        System.out.print("\nInserisci la posizione dell'elemento da rimuovere: ");
        posizione = Integer.parseInt(in.nextLine());
        try {
            String elementoRimosso = lista.cancellaInPosizione(posizione);
            System.out.println("Elemento rimosso dalla posizione " + posizione + ": " + elementoRimosso);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posizione non valida: " + e.getMessage());
        }
        System.out.println("Lista dopo rimozione per posizione: " + lista);

        // 10. Verifica presenza e dimensione finale
        System.out.print("\nInserisci un nome da verificare nella lista: ");
        dato = in.nextLine();
        System.out.println("Contiene '" + dato + "'? " + lista.contiene(dato));

        System.out.println("\nDimensione finale: " + lista.size());
        System.out.println("Lista vuota? " + lista.isEmpty());
        System.out.println("Lista finale: " + lista);
    }
}
//LEGGERE LE ISTRUZIONI NEL FILE README.md
