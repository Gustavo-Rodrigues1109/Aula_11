import static java.lang.IO.*;

void main() {
    IO.println("========Tabuada========");
        int num = Integer.parseInt(readln("Digite o número da tabuada: "));
       //cria a variavel na mesma linha que pede o valor da variavel^

        //loop while = enquanto
        //valor inicial do loop

        int i = 1;
        while(i <= 10) {
            IO.println(i + "x" + num + "=" + (i * num));
            i++;
        }

    IO.println("======Fim da tabuada======");

}
