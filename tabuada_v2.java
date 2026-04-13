import static java.lang.IO.*;

void main() {
    IO.println("======Tabuada======");
        int num = Integer.parseInt(readln("Digite o número da tabuada: "));

        for (int multi = 1; multi <= 10; multi++) {
            IO.println(num + "X" + multi + "=" + (multi * num));
        }
    IO.println("======Fim da tabuada======");

}