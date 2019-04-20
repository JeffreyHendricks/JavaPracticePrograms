/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counterclass;

/**
 *
 * @author jeff
 */
public class Counter {
    int count;
    
    public Counter()
    {
        count = 0;
    }
    
    public void setToZero()
    {
        count = 0;
    }
    
    public void countIncrease()
    {
        count += 1; 
    }
    
    public void countDecrease()
    {
        if(count > 0)
        {
            count -= 1;
        }
    }
    
    public int getCount()
    {
        return count;
    }
    
    public boolean equals(Counter otherCounter)
    {
        return (count == otherCounter.count);
    }
    
    public String printCount()
    {
        return "Count = " + count;
    }
    
    public String toString()
    {
        return "The count is: " + count;
    }
    
}
