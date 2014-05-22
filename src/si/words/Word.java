/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package si.words;

/**
 *
 * @author Kenzi
 */
public class Word {
    
    private String word;
    private int freq;
    
    Word(String word, int freq){
        this.word = word;
        this.freq = freq;
    }
    
    public int getFreq(){
        return freq;
    }
    
    public String getWord(){
        return word;
    }
    
    
}
