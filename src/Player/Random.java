/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player;

import Logic.Board;
import Util.Point;
import java.util.Vector;
import javafx.util.Pair;


/**
 *
 * @author heri
 */
public class Random implements Player {
    public String name()
    {
        return "Random";      
    }
    
    public Pair<Point, Integer> movement(Board t, int color){
        //Board ha de tener movimientos, los pasamos calculados o los recalculamos en player, los ponemos como atributo de board?
        Vector<Pair<Point, Integer>> list = t.getMovements(color);
        //Jelp to quitar this shit joder, me deja hacer import por que me dice que ya esta importado, y si no lo import no lo understend pa nah
        java.util.Random rnd = new java.util.Random();
        return list.get(rnd.nextInt(list.size()-1));
    }   
}