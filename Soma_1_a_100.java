import static java.lang.IO.*;

void main() {
    int i = 0;
    int q = 0;
    while( i <= 100) {
        q += i;
        i ++;
    }
    IO.println ("Soma = " + q);

}