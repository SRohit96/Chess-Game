
package javaapplication8;
public class rook extends piece {
    rook(int cl,int x,int y ,int t)
  {
	super(cl,x,y,t);
  }
  
 public int move(piece p,int r,int c, boolean es ) // check validity 
  {
    // System.out.println("THE ENEMY STATUS IS"+es);
     if((p.x==r&&p.y!=c)&&es==true)
         return 1;
        else if((p.y==c&&p.x!=r)&&es==true)
	return 1;
	else if((p.x==r&&p.y!=c)&&es==false)
            return 0;
        else if((p.y==c&&p.x!=r)&&es==false)
	return 0;
	else return -1;

  }
  public void set(piece p,int r,int c)
  {
  p.x=r;
  p.y=c;
  }
    
    
}
