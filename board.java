
package javaapplication8;
import java.util.*;
import java.io.*;
public class board {
    public static piece a[][] = new piece[8][8];
	board()
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				a[i][j] = null;
				
			}
		}
	}
    
}
