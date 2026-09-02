import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char[] board = {'1','2','3','4','5','6','7','8','9'};

        String p1, p2;
        char again;

        System.out.println("Welcome to Tic Tac Toe Game");

        System.out.print("Enter Player1 name: ");
        p1 = input.nextLine();

        System.out.print("Enter Player2 name: ");
        p2 = input.nextLine();

        do {

            int move = 0;
            boolean win = false;

            board = new char[]{'1','2','3','4','5','6','7','8','9'};

            while(move < 9 && !win)
            {

                System.out.println();
                System.out.println(board[0]+" | "+board[1]+" | "+board[2]);
                System.out.println("--|---|--");
                System.out.println(board[3]+" | "+board[4]+" | "+board[5]);
                System.out.println("--|---|--");
                System.out.println(board[6]+" | "+board[7]+" | "+board[8]);

                System.out.print(p1+" choose box (1-9): ");
                int pos = input.nextInt();

                if(board[pos-1] != 'X' && board[pos-1] != 'O')
                {
                    board[pos-1] = 'X';
                    move++;
                }

                if(
                (board[0]=='X'&&board[1]=='X'&&board[2]=='X') ||
                (board[3]=='X'&&board[4]=='X'&&board[5]=='X') ||
                (board[6]=='X'&&board[7]=='X'&&board[8]=='X') ||
                (board[0]=='X'&&board[3]=='X'&&board[6]=='X') ||
                (board[1]=='X'&&board[4]=='X'&&board[7]=='X') ||
                (board[2]=='X'&&board[5]=='X'&&board[8]=='X') ||
                (board[0]=='X'&&board[4]=='X'&&board[8]=='X') ||
                (board[2]=='X'&&board[4]=='X'&&board[6]=='X')
                )
                {
                    win = true;
                    System.out.println(p1+" wins!");
                    break;
                }

                if(move==9) break;

                System.out.print(p2+" choose box (1-9): ");
                pos = input.nextInt();

                if(board[pos-1] != 'X' && board[pos-1] != 'O')
                {
                    board[pos-1] = 'O';
                    move++;
                }

                if(
                (board[0]=='O'&&board[1]=='O'&&board[2]=='O') ||
                (board[3]=='O'&&board[4]=='O'&&board[5]=='O') ||
                (board[6]=='O'&&board[7]=='O'&&board[8]=='O') ||
                (board[0]=='O'&&board[3]=='O'&&board[6]=='O') ||
                (board[1]=='O'&&board[4]=='O'&&board[7]=='O') ||
                (board[2]=='O'&&board[5]=='O'&&board[8]=='O') ||
                (board[0]=='O'&&board[4]=='O'&&board[8]=='O') ||
                (board[2]=='O'&&board[4]=='O'&&board[6]=='O')
                )
                {
                    win = true;
                    System.out.println(p2+" wins!");
                }

            }

            if(!win)
                System.out.println("Game Draw!");

            System.out.print("Play again? (Y/N): ");
            again = input.next().charAt(0);

        } while(again=='Y' || again=='y');

        System.out.println("Thank you for playing the game");
    }
}