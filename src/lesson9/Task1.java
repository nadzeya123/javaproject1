package lesson9;

public class Task1
{
    public static final String DELIMITER = "-";

    public static void main(String[] args)
    {
        String documentNumber = "3424-Afr-6321-fRf-3e4f";

        String[] blocks = documentNumber.split(DELIMITER);


        String fourDigitBlocks = blocks[0].concat(blocks[2]);
        System.out.println(fourDigitBlocks);


        for (int i = 0; i < blocks.length; i++)
        {
            if (i % 2 != 0)
            {
                documentNumber = documentNumber.replace(blocks[i], "***");
            }
        }
        System.out.println(documentNumber);


        String allLetters = String.join("/", blocks[1], blocks[3], documentNumber.substring(19, 20), documentNumber.substring(21, 22));
        System.out.println(allLetters.toLowerCase());
        System.out.println(allLetters.toUpperCase());


        boolean sequence = documentNumber.contains("abc");
        System.out.println("Doc number contains 'abc' is " + sequence);


        boolean start = documentNumber.startsWith("555");
        System.out.println("Doc number starts with '555' is " + start);

        boolean end = documentNumber.endsWith("1a2b");
        System.out.println("Doc number ends with '1a2b' is " + end);
    }
}