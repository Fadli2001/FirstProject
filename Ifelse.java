public class Percabanganelse {
    public static void main(String[] args) {
        System.out.println(" Masukan Umur Anda : ");
        Scanner scanner = new Scanner(System.in);
        int umur = scanner.nextInt();
        if (umur > 15) {
            System.out.println("Anda boleh masuk");
        } else {
            System.out.println(" Dilarang masuk ");
    }
  }
}
