public class DivisionOfDatatypes {
    public static void main(String[] args) {
        double x=5/2;
        System.out.println(x); // If both the numbers are int then the output will be an int

        double y=5.0/2;
        System.out.println(y); //If one of the numbers are double then the output will always on double


        // Char data type

        char vowel='a';
        System.out.println(vowel);

        char consonant='z';
        System.out.println(consonant);

        char number='8';
        System.out.println(number);


        // Typecasting

        char verma='a';
        int f =verma;  //implicit typecastiing
        System.out.println(f);

        char capital_letter='A';
        int cap= (int)capital_letter; //expilicit typecasting
        System.out.println(cap);


        // Integer to character
        int w=43;
        char ch=(char)w;
        System.out.println(ch);
    }
}
