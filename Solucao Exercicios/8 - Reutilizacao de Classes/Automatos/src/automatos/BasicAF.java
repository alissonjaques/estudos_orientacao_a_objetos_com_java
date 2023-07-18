package automatos;

// Fonte Java
public class BasicAF {

    public static void main(String a) {
        int p = 0;
        int state = 0;
        while (p < a.length()) {
            switch (state) {
                case 0:
                    switch (a.charAt(p)) {
                        case '0':
                            state = 0;
                            break;
                        case '1':
                            state = 1;
                            break;
                    }
                    break;
                case 1:
                    switch (a.charAt(p)) {
                        case '0':
                            state = 0;
                            break;
                        case '1':
                            state = 1;
                            break;
                    }
                    break;
            }
            p++;
        }
        if (state == 1) {
            System.out.println("Aceita");
        }
        else{
            System.out.println("Nao aceita");
        }
    }
}

