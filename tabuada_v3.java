import static java.lang.IO.*;

void main() {
    IO.println("======Tabuada======");
        int num = Integer.parseInt(readln("Digite o número da tabuada: "));
        int i = 1;
        do {
            IO.println(num + "X" + i + "=" + (i * num));
            i++;
        } while (i <= 10);
    IO.println("=======Fim da tabuada======");
}