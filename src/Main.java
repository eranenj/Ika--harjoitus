
public class Main {
    public static void main(String[] args) {

        int ika = 60;

        // Tässä tarkistetaan onko henkilö alaikäinen.
        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");
        // Tässä katsotaan onko henkilö tarpeeksi vanha ajamaan mopolla.    
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }
        // Tämä ohjelma tarkistaa onko henkilö täysi-ikäinen ja tulostaa sen mukaisen viestin. Onnittelee myös tietyn iän saavuttaneita.    
        } else if (ika == 100) {
            System.out.println("Hip");
            System.out.println("Hip");
            System.out.println("Huraa!");

        } else if (ika > 58 && ika < 65) {
            System.out.println("Voit mennä varhaiseläkkeelle");
          }  

         else if (ika >= 40 && ika <=50) {
            System.out.println("Mitä mahtavinta keski-ikää!");
         }

         else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");

            if (ika == 65){
                System.out.println("Hyviä eläkepäiviä!");
            }

        } else if (ika == 18) {
            System.out.println("Olet täysi-ikäinen, saat ajaa autoa");

        } else if (ika > 18) {
            System.out.println("Olet aikuinen");

            if (ika % 10 == 0) {
                System.out.println("Onnittelut pyöreistä!");
            }
        }
    }
}

