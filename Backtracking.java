import java.util.ArrayList;
import java.util.Arrays;

public class Backtracking {

    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }

        int down=count(r-1, c);
        int right=count(r, c-1);

        return right+down;
    }

    static ArrayList<String> pathset(String s,int r,int c){
        if (r==1 && c==1) {
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(r>1 && c>1){
        list.addAll(pathset(s+'A', r-1, c-1));                //A=Diagonal
        }
        if(r>1){
        list.addAll(pathset(s+'D', r-1, c));
        }
        if (c>1) {
            list.addAll(pathset(s+'R', r, c-1));
        }

        return list;
    }

    static void pathobstacle(String s,boolean maze[][],int r,int c){
        if (r==maze.length-1 && c==maze.length-1) {
            System.out.println(s);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathobstacle(s+'D', maze, r+1, c);
        }
         if(c<maze.length-1){
            pathobstacle(s+'R', maze, r, c+1);
        }

    }
    static void allpaths(String s,boolean board[][],int r,int c){
        if(r==board.length-1 || c==board.length-1){
            System.out.println(s);
            return;
        }
        if(!board[r][c]){
            return;
        }
        board[r][c]=false;
        if (r<board.length-1) {
            allpaths(s+'D', board, r+1, c);
        }
        if (c<board.length-1) {
            allpaths(s+'R', board, r, c+1);
        }
        if (r>0) {
            allpaths(s+'U', board, r-1, c);
        }
        if (c>0) {
            allpaths(s+'L', board, r, c-1);
        }
        board[r][c]=true;
    }
    

    static void allpathprint(String s,boolean[][] board,int r,int c,int[][] path,int step){

         if(r==board.length-1 || c==board.length-1){

            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(s);
            System.out.println();
            return;
        }
        if(!board[r][c]){
            return;
        }
        board[r][c]=false;
        path[r][c]=step;

        if (r<board.length-1) {
            allpathprint(s+'D', board, r+1, c,path,step+1);
        }
        if (c<board.length-1) {
            allpathprint(s+'R', board, r, c+1,path,step+1);
        }
        if (r>0) {
            allpathprint(s+'U', board, r-1, c,path,step+1);
        }
        if (c>0) {
            allpathprint(s+'L', board, r, c-1,path,step+1);
        }
        board[r][c]=true;
        path[r][c]=0;
    }
    
    public static void main(String[] args) {
        System.out.println("The possible combinations are: "+count(3,3));

        System.out.println("The paths are: "+pathset("",3,3));

        boolean maze[][]={
            {true,true,true},
            {true,false,true},
            {true,true,true},  
        };

        boolean board[][]={
            {true,true,true},
            {true,true,true},
            {true,true,true},  
        };

        pathobstacle("", maze, 0, 0);

        allpaths("",board,0,0);

        int[][] path=new int[board.length][board.length];
        allpathprint("", board, 0, 0, path, 1);

    }
}
