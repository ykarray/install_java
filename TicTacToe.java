import java.util.*;

public class TicTacToe {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main (String[] args) {
        char [][] mat = {{' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}
        };
        printGameBoard(mat);
        System.out.println("");


        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement(1-9)");
            int playerPos = scan.nextInt();
            while(playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                System.out.println("position taken ! Enter a correct Position");
                playerPos = scan.nextInt();
            }
            placePiece(mat,playerPos,"player");
            System.out.println("");
            String result=checkWinner();

            if ( result != "") {
                System.out.println(result);
                break ;
            }
            Random rand = new Random();
            int cpuPos= rand.nextInt(9)+1;
            System.out.println("");
            System.out.println(cpuPos);
             System.out.println("");
            while(playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos= rand.nextInt(9)+1;
            }
            placePiece(mat,cpuPos,"cpu");
            result=checkWinner();

            if ( result != "") {
                System.out.println(result);
                break ;
            }


        }



    }

    public static String checkWinner() {
        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> midRow = Arrays.asList(4,5,6);
        List<Integer> botRow = Arrays.asList(7,8,9);
        List<Integer> leftCol = Arrays.asList(1,4,7);
        List<Integer> midCol = Arrays.asList(2,5,8);
        List<Integer> rightCol = Arrays.asList(3,6,9);
        List<Integer> diag1 = Arrays.asList(1,5,9);
        List<Integer> diag2 = Arrays.asList(3,5,7);
        List<List> winning = new ArrayList <List> ();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(diag1);
        winning.add(diag2);
        for ( List l : winning) {
            if (playerPositions.containsAll(l)) {
                return"congratulations you won!";
            } else if (cpuPositions.containsAll(l)) {
                return "CPU wins!Sorry " ;
            } else if (playerPositions.size()+cpuPositions.size()==9) {
                return "CAT!";
            }


        }
        return "";
    }






    public static void placePiece(char[][] mat , int pos , String user) {
        char symbole =' ';
        if (user.equals("player")) {
            symbole = 'X';
            playerPositions.add(pos);


        } else if(user.equals("cpu")) {
            symbole = 'O';
            cpuPositions.add(pos);

        }

        switch(pos) {

        case 1 :
            mat[0][0]=symbole;
            break;
        case 2 :
            mat[0][2]=symbole;
            break;
        case 3 :
            mat[0][4]=symbole;
            break;
        case 4 :
            mat[2][0]=symbole;
            break;
        case 5 :
            mat[2][2]=symbole;
            break;
        case 6 :
            mat[2][4]=symbole;
            break;
        case 7 :
            mat[4][0]=symbole;
            break;
        case 8 :
            mat[4][2]=symbole;
            break;
        case 9 :
            mat[4][4]=symbole;
            break;

        }
        printGameBoard(mat);
    }







    public static void printGameBoard (char [][] mat) {
        for (char[] row : mat ) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();

        }


    }



}
