public class Interfaces {
    public static void main(String[] args) {

        Queen q = new Queen();

        q.moves();

        Night n = new Night();
        n.moves();

        Rook r = new Rook();
        r.moves();

    }
}

interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {

        System.out.println("Up Down Left Right Diagnoal in all four direction");
    }
}

class King implements chessPlayer {
    public void moves() {

        System.out.println("In all direction but only one block ");
    }
}

class Night implements chessPlayer {
    public void moves() {

        System.out.println("2.5 Block move kar skata hai kisi bhi direction main ");
    }
}

class Bishop implements chessPlayer {
    public void moves() {

        System.out.println("Digonal Main move karta hai");
    }
}

class Rook implements chessPlayer {
    public void moves() {

        System.out.println("Up down left right ");
    }
}

class Pawn implements chessPlayer {
    public void moves() {

        System.out.println(
                "Only ak kadam chal skta hai suru bat main do kadam bhi chal skta hai dignol main agr koi oppent ka piece hai to dignal chal skta hai ");
    }
}