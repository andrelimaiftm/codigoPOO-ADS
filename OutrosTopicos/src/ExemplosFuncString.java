public class ExemplosFuncString {
    public static void main(String[] args) throws Exception {
        
        String original = " abcde FGHIJ ABC abc DEFG   ";

        //toLowerCase coloca todos os caracteres da string em minusculo
        String s01 = original.toLowerCase();

        //toUpperCase coloca todos os caracteres da string em maiusculo
        String s02 = original.toUpperCase();

        //trim tira os espaços em branco no inicio e final da string
        String s03 = original.trim();

        //substring cria uma nova string a partir da posição informada
        String s04 = original.substring(2);

        //substring cria uma nova string começando a partir do primeiro valor e terminando
        // no segundo valor informado
        String s05 = original.substring(2, 9);

        //troca todas as ocorrencias de a para x na string
        String s06 = original.replace('a', 'x');

        //troca todas as ocorrencias de abc para xy na string
        String s07 = original.replace("abc", "xy");
        
        //retorna o indice da posição na string da primeira ocorrencia de bc 
        int i = original.indexOf("bc");

        //retorna o indica da posição na string da ultima ocorrencia de bc
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original +"-");
        System.out.println("toLowerCase: -" + s01 +"-");
        System.out.println("toUpperCase: -" + s02 +"-");
        System.out.println("trim: -" + s03 +"-");
        System.out.println("subString(2): -" + s04 +"-");
        System.out.println("subString(2, 9): -" + s05 +"-");
        System.out.println("replace('a', 'x'): -" + s06 +"-");
        System.out.println("replace(\"abc\", \"xy\"): -" + s07 +"-");
        System.out.println("Index of \"bc\": " + i);
        System.out.println("Last index of \"bc\": " + j);        
    }
}
