package models;

public class SupermarktField {
    
    private int depth, width;
    
    private Object[][] field;
    
    private String locationtype;
    
    public SupermarktField(int depth, int width)
    {
        this.depth = depth;
        this.width = width;
        field = new Object[depth][width];
    }
    
    public void clear()
    {
        for(int row = 0; row < depth;row++)
        {
            for(int col = 0; col < width;col++)
            {
                field[row][col]=null;
            }
        }
    }
    
    public void placeObject(int row,int col, Object item)
    {
        if(field[row][col] == null)
    }
    private void placeObject()
    

}
