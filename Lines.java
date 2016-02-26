public class Lines{

	public static char [] rowList (char[] board, int startNum, int d){
		//array of each row
		char[] line;
		line = new char[d];
		int stop = d + startNum;
		int pos = startNum-1;
		for (int i=0; i<d; i++){
			pos++;
			line[i]= board[pos];
			}
			return line;
		}
		
		
	public static char [] coloumList (char[] board, int startNum, int d){
		//array for each coloumn
		char[] line;
		line = new char[d];
		int index=0;
		for (int i=0; i<d; i++){
			line[i]= board[index];			
			index+=d;
			}
			return line;
		}
		
		
		
	public static char [] diagonalDownList (char[] board, int d){		
		//array for diagonal down right 
		char[] line;
		line = new char[d];
		int increment=d+1;
		int index=0;
		for (int i=0; i<d; i++){
			line[i]= board[index];
			index+=increment;
			}
			return line;
		}
		
		
		
	public static char [] diagonalUpList (char[] board, int d){
		//array for diagonal up right 
		char[] line;
		line = new char[d];
		int increment=d-1;
		int index = d-1;
		for (int i=0; i<d; i++){
			line[i]= board[index];
			index+=increment;
			}
		return line;
		}			

	public static void main(String[] args){
		char[] board = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
		System.out.println("the rows list: ");
		int startNum= 4;
		int d = 4;
		char [] line = rowList(board, startNum ,d);
		for (int i=0; i<d; i++){
			System.out.print(line[i]);
		}
		System.out.println("");
		char [] line2 = coloumList(board, startNum ,d);
		System.out.println("the coloumn list: ");
		for (int i=0; i<d; i++){
			System.out.print(line2[i]);
		}
		System.out.println("");
		char [] line3 = diagonalDownList(board,d);
		System.out.println("the diagonal down right list: ");
		for (int i=0; i<d; i++){
			System.out.print(line3[i]);
		}
		System.out.println("");
		char [] line4 = diagonalUpList(board,d);
		System.out.println("the diagonal up right list: ");
		for (int i=0; i<d; i++){
			System.out.print(line4[i]);
		}
		System.out.println("");
		
	}
}