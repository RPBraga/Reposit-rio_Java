// * @author: Rodrigo Braga

//tabela verdade para operadores lógicos

class LogicalOpTable {
    public static void main(String[] args) {
        boolean p , q ;
        System.out.println("P \t\t Q \t\t AND \t OR \t XOR \t NOT");

        p = true; q = true;
        System.out.println(p + " \t " + q + " \t " + (p&q) + " \t " + (p|q) + " \t " + (p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.println(p + " \t " + q + " \t " + (p&q) + " \t " + (p|q) + " \t " + (p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.println(p + " \t " + q + " \t " + (p&q) + " \t " + (p|q) + " \t " + (p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.println(p + " \t " + q + " \t " + (p&q) + " \t " + (p|q) + " \t " + (p^q) + "\t" + (!p));
    }
}
