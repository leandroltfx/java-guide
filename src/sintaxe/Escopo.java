package sintaxe;

public class Escopo {
    // Escopo da Classe

    private int classInnerVariable;
    private static int classInnerVariableTwo;

    private void methodOne() {
        // Escopo do methodOne

        // A variável "classInnerVariable", que está no escopo da Classe, pode ser
        // utilizada nos métodos da Classe, pois está em um escopo que contém o escopo do methodOne
        System.out.println(classInnerVariable);

        // Esta variável declarada dentro do metodo não pode ser utilizada fora dele
        int methodOneInnerVariable = 1;

        System.out.println(methodOneInnerVariable);
    }

    private void methodTwo() {

        // A variável "classInnerVariable", que está no escopo da Classe, pode ser
        // utilizada nos métodos da Classe, pois está em um escopo que contém o escopo do metodo
        System.out.println(classInnerVariable);

        // Ao tentar acessar a variável "methodOneInnerVariable" fora do seu escopo
        // ocorre o erro: "Cannot resolve symbol 'methodOneInnerVariable'"
        // System.out.println(methodOneInnerVariable);

        // Esta variável declarada dentro do metodo não pode ser utilizada fora dele
        int methodTwoInnerVariable = 1;

        System.out.println(methodTwoInnerVariable);
    }

    public static void main(String[] args) {

        // A variável "classInnerVariable" está no contexto da classe, mas para ser utilizada em
        // um escopo "static" ela deve ser modificada também para "static"
        // System.out.println(classInnerVariable);

        // A variável "classInnerVariableTwo" está no contexto da classe e é definida como "static",
        // então pode ser utilizada no main que também é "static" e está dentro do escopo da classe
        System.out.println(classInnerVariableTwo);
    }
}
