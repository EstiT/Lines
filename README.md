# Lines

The Parameters:
char[] board = the 1D array 
int startNum = the row or coloumn that you want combined //only applies to the row and coloumn
int d = the dimension of the board if d = 3 the board is 3 by 3 with 9 elements

Given a square of the following:

a b c d 
e f g h
i j k l
m n o p

Its 2 dimensional array would be {{'a', 'b', 'c', 'd'}, {'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'}, {'m', 'n', 'o', 'p'}}
Its 1 dimensional array would be {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'}

The methods rowList, coloumList, diagonalDownList and diagonalUpList create and return charecter arrays containing 
the elements in a single line of the square

For the above example,
rowList(square, 3, 4) would return  {'i','j','k','l'}
coloumnList(square, 3, 4) would return {'c','g','k','o'}
diagonalDownList(square, 4) would return {'a','f','k','p'}
diagonalUpList(square, 4) would return {'m','j','g','d'}
