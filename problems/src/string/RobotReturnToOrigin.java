package string;

public class RobotReturnToOrigin {
    /*
    Created by danicanacionales on 27/03/2019

    657. Robot Return to Origin

    There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.

    Example 1:
        Input: "UD"
        Output: true
    */

    public static void main(String[] args) {
        String moves = "UD";
        boolean atOrigin = new RobotReturnToOrigin().judgeCircle(moves);

        System.out.println(atOrigin);
    }

    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(Character move : moves.toCharArray()){
            if(move == 'R')
                x++;
            else if (move == 'L')
                x--;
            else if (move == 'U')
                y++;
            else if (move == 'D')
                y--;
        }

        if(x == 0 && y == 0)
            return true;
        else
            return false;
    }
}
