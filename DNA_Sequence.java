//a program that determines whether there is a protein in a strand of DNA.

public class DNA {
  
  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;        
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    //Check if there is a start
    System.out.println (dna.length());
    int start = dna.indexOf("ATG");
    System.out.println(start);

    //check if there is a stop
    int stop = dna.indexOf("TGA");
    System.out.println(stop);

    boolean mult3 = (stop - start) % 3 == 0;

    if(start != -1 && stop != -1 && mult3 ) {
      String protein = dna.substring(start, stop+3);
      System.out.println("Protein: "+ protein);
    } else {
      System.out.println("No protein");
    }

    //
  }
  
}
